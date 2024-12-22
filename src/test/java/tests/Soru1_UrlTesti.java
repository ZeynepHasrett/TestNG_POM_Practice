package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

public class Soru1_UrlTesti {

    @Test
    public void urlTesti(){

        // https://www.babayigit.net/test sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("babayigitUrl"));

        // sayfanin url'inin https://www.babayigit.net/test/
        // adresine esit olduğunu dogrulayin
        String expectedUrl = "https://www.babayigit.net/test/";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(actualUrl, expectedUrl);

        softAssert.assertAll();

        Driver.quitDriver();

    }

}
