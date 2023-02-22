package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import url.Urls;


public class IFrame implements Urls {
    public static void main(String[] args)  throws IllegalAccessException {
        WebDriver driver=  DriverFactory.getChromeDriver();
        try{
            //navigate to target base
            driver.get(baseUrl.concat(iframeSlug));

            //Locator the iframe
            By iFrameSel= By.cssSelector("[id$='ifr']");
            WebElement iFrameElem= driver.findElement(iFrameSel);

            //Switch tho the iframe
            driver.switchTo().frame(iFrameElem);

            //Locator element inside the iframe
            WebElement editorInputElem= driver.findElement(By.id("tinymce"));
            editorInputElem.click();
            editorInputElem.clear();
            editorInputElem.sendKeys("This is new text");
            Thread.sleep(1000);
            // Switch back parent frame
            driver.switchTo().defaultContent();
            driver.findElement(By.linkText("Elemental Selenium")).click();



        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
