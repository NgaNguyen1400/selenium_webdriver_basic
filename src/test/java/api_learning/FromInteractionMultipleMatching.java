package api_learning;
// FindElements: tìm nhiều ptu, liệt kê dưới dạng list
import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FromInteractionMultipleMatching {
    public static void main(String[] args) throws IllegalAccessException {
        //Get a chrome section
        WebDriver driver= DriverFactory.getChromeDriver();
        try {

            //Navigate
            driver.get("https://the-internet.herokuapp.com/login");

            //Define selector values
            By loginInputFiedledSel = By.tagName("input_1111");

            //Interaction
            List<WebElement> loginFromFieledsElem = driver.findElements(loginInputFiedledSel);
            final int USERNAME_INDEX=0;
            final int PASSWORD_INDEX=1;
            loginFromFieledsElem.get(USERNAME_INDEX).sendKeys("teo@sth.com");
            loginFromFieledsElem.get(PASSWORD_INDEX).sendKeys("12345678");

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
