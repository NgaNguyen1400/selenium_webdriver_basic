package lesson_01;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestBrowserChrome {

  //  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\Nga\\Java\\chromedriver_win32\\chromedriver.exe");

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Nga\\Java\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //1 - Maximize browser của mình
        driver.manage().window().maximize();

        //2 - Đi đến 1 url

        driver.navigate().to("https://anhtester.com");

        //3 - Lấy Title và in ra console

        System.out.println(driver.getTitle());

        // Thoát hẳn Browser

    //    driver.quit();


    }



}
