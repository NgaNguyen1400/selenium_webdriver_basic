package api_learning;
/*
-ngoại lệ NoSuchElementException
- Ko tim thay va dinh vi phan tu
*/

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElementDisplaying {
    public static void main(String[] args) throws IllegalAccessException {
        //Get a chrome section
        WebDriver driver= DriverFactory.getChromeDriver();
        //cách 1: try-catch
       /* Exception e= null;
        try {
            //Navigate
            driver.get("https://the-internet.herokuapp.com/login");
            //Define selector values
            By usernameSel = By.id("username");
            //FindElement Interaction
            WebElement usernameElem= driver.findElement(usernameSel);
        }catch (NoSuchElementException noSuchElementException){
            e = noSuchElementException;
        }
        if(e==null) {
            Assert.fail("The element abc still displaying on the page");
        }*/


        //cách2: List
        List<WebElement> elementList= driver.findElements(By.tagName("taolao"));
        if (!elementList.isEmpty())



            //Quit the browser
            driver.quit();

    }
}