package api_learning;
//Check browser mac, win,và khởi chạy
import org.apache.commons.exec.OS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser {
    public static  void main(String[] args) throws IllegalAccessException {
        String currentProjectLocation = System.getProperty("user.dir");
        String chromedriverLocation= "";
        OS Os = null;
        if(Os.isFamilyMac()){
            chromedriverLocation= currentProjectLocation+ "src/test/resources/drivers/chromedriver";
        }
        if(Os.isFamilyWindows()){
            chromedriverLocation= currentProjectLocation+ "\\src\\test\\resources\\drivers\\chromedriver";

        }
        if(chromedriverLocation.isEmpty()){
            throw new IllegalAccessException("Cant't detect os type");
        }

        System.setProperty("webdriver.chrome.driver",chromedriverLocation);

        ChromeOptions chromeOptions= new ChromeOptions();
        chromeOptions.addArguments("--incognito");

        WebDriver driver= new ChromeDriver(chromeOptions);
    //    driver.manage().window().maximize();

        /*// DEBUG PURPOSE ONLY( ngoai le)
        try{
            Thread.sleep(3000);

        }catch(exception e){
            e.printStackTrace();
        }*/

        driver.get("https://sdetpro.com/");
        driver.quit();

    }

}
