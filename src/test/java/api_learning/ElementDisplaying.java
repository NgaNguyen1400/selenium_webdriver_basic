package api_learning;

import dev.failsafe.internal.util.Assert;
import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementDisplaying {
    public static void main(String[] args) throws IllegalAccessException {
        //Get a chrome section
        WebDriver driver= DriverFactory.getChromeDriver();
        Exception e= null;

        if(e==null)
            Assert.fail("The element abc still displaying on the page");


        //Quit the browser
        driver.quit();

        //Implicit wait, explicit wait, fluent wait
    }
}
