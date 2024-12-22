package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BabayigitNetPage {

    public BabayigitNetPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



}
