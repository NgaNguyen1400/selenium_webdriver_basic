package lesson_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDependencies {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Nga\\Java\\chromedriver_win32\\chromedriver.exe");


    }
}
