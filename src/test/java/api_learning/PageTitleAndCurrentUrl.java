package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageTitleAndCurrentUrl {
    public static void main(String[] args) throws IllegalAccessException {
        //Get a chrome section
        WebDriver driver= DriverFactory.getChromeDriver();
        try {
            //Navigate
            driver.get("https://the-internet.herokuapp.com/login");
            System.out.println(driver.getTitle());
            System.out.println(driver.getCurrentUrl());


            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }

        //Quit the browser
        driver.quit();

        //Implicit wait, explicit wait, fluent wait
    }
}
