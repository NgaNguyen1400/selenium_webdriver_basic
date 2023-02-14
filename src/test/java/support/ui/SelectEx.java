package support.ui;

import org.openqa.selenium.WebElement;


public class SelectEx {
    private final String OPTION_01= "Option 1";
    public SlectEx (WebElement element){
        super(element);
    }
    public void selectOption1(){
        selectByVisibleText(OPTION_01);
    }


}
