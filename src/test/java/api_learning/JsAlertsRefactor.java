package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import url.Urls;

import java.time.Duration;

public class JsAlertsRefactor implements Urls {

    private final  static By jsAlertSel= By.cssSelector("[onclick=\"jsAlert()\"]");
    private final  static By jsAlertConfirmSel= By.cssSelector("[onclick=\"jsConfirm()\"]");
    private final  static By jsAlertPromptSel= By.cssSelector("[onclick=\"jsPrompt()\"]");
    private final  static By resultSel= By.cssSelector("#result");

    public static void main(String[] args)  throws IllegalAccessException {
        WebDriver driver=  DriverFactory.getChromeDriver();
        try{
            //navigate to target base
            driver.get(baseUrl.concat(jsAlertSlug));
            WebElement triggerJsAlertBtnElem; // dat bien chung
            Alert alert;
            WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(3));

            //js_alert
            triggerJsAlertBtnElem= driver.findElement(jsAlertSel);
            triggerJsAlertBtnElem.click();
            alert= wait.until(ExpectedConditions.alertIsPresent());  // doi cho den khi alert xuat hien
            handleAlert(alert, true);
            System.out.println("Result: "+ driver.findElement(resultSel).getText());


            //js_confirm
            triggerJsAlertBtnElem= driver.findElement(jsAlertConfirmSel);
            triggerJsAlertBtnElem.click();
            alert= wait.until(ExpectedConditions.alertIsPresent());  // doi cho den khi alert xuat hien
            handleAlert(alert, false);
            System.out.println("Result: "+ driver.findElement(resultSel).getText());

            //js_prompt
            triggerJsAlertBtnElem= driver.findElement(jsAlertPromptSel);
            triggerJsAlertBtnElem.click();
            alert= wait.until(ExpectedConditions.alertIsPresent());  // doi cho den khi alert xuat hien
            handleAlert(alert, "My name is Nga");
            System.out.println("Result: "+ driver.findElement(resultSel).getText());


        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void handleAlert(Alert alert, boolean isAccepting){
        System.out.println("alert content: "+ alert.getText());
        if(isAccepting) alert.accept();
        else alert.dismiss();

    }
    public static void handleAlert( Alert alert, String contenToEnter){
        System.out.println("alert content: "+ alert.getText());
        alert.sendKeys("My name is Nga");
        alert.accept();

    }


}
