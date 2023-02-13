package driver;

import org.apache.commons.exec.OS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DriverFactory {
    public static WebDriver getChromeDriver() throws IllegalAccessException {
        String currentProjectLocation = System.getProperty("user.dir");
        String chromedriverLocation = "";
        OS Os = null;
        if (Os.isFamilyMac()) {
            chromedriverLocation = currentProjectLocation + "src/test/resources/drivers/chromedriver";
        }
        if (Os.isFamilyWindows()) {
            chromedriverLocation = currentProjectLocation + "\\src\\test\\resources\\drivers\\chromedriver";

        }
        if (chromedriverLocation.isEmpty()) {
            throw new IllegalAccessException("Cant't detect os type");
        }

        System.setProperty("webdriver.chrome.driver", chromedriverLocation);

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");

        //TH element load cham, cho doi xuat hien
        WebDriver driver= new ChromeDriver(chromeOptions);
        //Interval time|500 mili second= 0.5 sec
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //trong vong 15 ko co nem ra exception


        return driver;



    }
}
