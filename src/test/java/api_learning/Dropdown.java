package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import url.Urls;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Dropdown implements Urls {
    public static void main(String[] args)  throws IllegalAccessException {
        WebDriver driver=  DriverFactory.getChromeDriver();
        try{
            //navigate to target base
            driver.get(baseUrl.concat(dropdownSlug));

            //Dropdown locator and element
            By dropdownSel= By.id("dropdown");
            WebElement dropdownElem= driver.findElement(dropdownSel);

            // Select dropdown
            Select select =new Select(dropdownElem);

            //C1.select by visible text| Option1
            select.selectByVisibleText("Option 1");
            Thread.sleep(1000);

            //C2.Select by index| Option2
            select.selectByIndex(2);
            Thread.sleep(1000);
            //C3.Select by value| Option 1
            select.selectByValue("1");
            Thread.sleep(1000);

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
