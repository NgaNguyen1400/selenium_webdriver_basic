package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import support.ui.SelectEx;
import url.Urls;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

public class MouseHoverAndNarrowDownSearchingScope implements Urls {

    private final  static By figureSel= By.className("figure");
    private final  static By profileNameSel= By.cssSelector(".figcaption h5");
    private final  static By profileLinkSel= By.cssSelector(".figcaption a");

    public static void main(String[] args)  throws IllegalAccessException {
        WebDriver driver=  DriverFactory.getChromeDriver();
        try{
            //navigate to target base
            driver.get(baseUrl.concat(hoverSlug));

           /* //cach cũ di tim tung element: Normal findElement
            List<WebElement> figcaptionNamesElem= driver.findElements(By.cssSelector(".figcaption h5"));
            List<WebElement>figcaptionHrefsElem= driver.findElements(By.cssSelector(".figcaption a"));*/

            //Target parent elements
            List<WebElement> figuresElem = driver.findElements(figureSel);
            if (figuresElem.isEmpty())
                throw  new RuntimeException("There is no profile image displayed"); // task co bug

            //Define actions object
            Actions actions= new Actions(driver);

            //--Loop tung phan cha tim tung phan con: ki thuatj narrodown

            for(WebElement figureElem : figuresElem ){
                WebElement profileNameElem= figureElem.findElement(profileNameSel); //element findElement ko phai la driverfindElement
                WebElement profileLinkElem= figureElem.findElement(profileLinkSel);
               /* System.out.println("Is the profile name displaying:"+ profileNameElem.isDisplayed());
                System.out.println("Is the profile link displaying:"+ profileLinkElem.isDisplayed());*/

                //Before mouse hover

                System.out.println(profileNameElem.getText()+":"+  profileNameElem.isDisplayed());
                System.out.println(profileLinkElem.getText()+":"+  profileLinkElem.isDisplayed());

                //Mouse hover
                actions.moveToElement(figureElem).perform();

                // After mouse hover
                System.out.println(profileNameElem.getText()+":"+  profileNameElem.isDisplayed());
                System.out.println(profileLinkElem.getText()+":"+  profileLinkElem.isDisplayed());


            }


        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
