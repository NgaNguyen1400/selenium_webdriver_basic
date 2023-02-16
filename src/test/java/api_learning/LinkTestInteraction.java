package api_learning;
/*-By Linktext*/
import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTestInteraction {
    public static void main(String[] args) throws IllegalAccessException {
        //Get a chrome section
        WebDriver driver= DriverFactory.getChromeDriver();
        try {

            //Navigate
            driver.get("https://the-internet.herokuapp.com/login");

            //C1:Define selector values
            //    By poweredByLinkTextSel= By.linkText("Elemental Selenium");
            By poweredByLinkTextSel= By.partialLinkText("Elemental ");


            //Find elements
            WebElement poweredByLinktextElem = driver.findElement(poweredByLinkTextSel);

            //Interaction
            poweredByLinktextElem.click();
            //DEBUG PURPOSE ONLY
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }

        //Quit the browser
        driver.quit();

        //Implicit wait, explicit wait, fluent wait
    }
}