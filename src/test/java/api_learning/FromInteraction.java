package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FromInteraction {
    public static void main(String[] args) throws IllegalAccessException {
        //Get a chrome section
        WebDriver driver= DriverFactory.getChromeDriver();
        try {

            //Navigate
            driver.get("https://the-internet.herokuapp.com/login");

            //C1:Define selector values
            By usernameSel= By.id("username");
            By passwordSel=By.cssSelector("#password");
            By loginSel= By.cssSelector("[type='submit']");

            WebElement usernameElem= driver.findElement(usernameSel);
            WebElement passwordElem = driver.findElement(passwordSel);
            WebElement loginBtnElem = driver.findElement(loginSel);

            /*////C2: Find element
            WebElement usernameElem = driver.findElement(By.id("username"));
            WebElement passwordElem = driver.findElement(By.cssSelector("#password"));
            WebElement loginBtnElem = driver.findElement(By.cssSelector("[type='submit']"));
*/

            //Interaction
            usernameElem.sendKeys("tomsmith");
            passwordElem.sendKeys("SuperSecretPassword!");
            loginBtnElem.click();

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
