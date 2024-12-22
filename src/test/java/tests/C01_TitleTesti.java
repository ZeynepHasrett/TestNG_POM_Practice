package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_TitleTesti {

    @Test
    public void titleTesti() {

        // https://www.babayigit.net/test sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("babayigitUrl"));

        // sayfanin title'inin BABAYIGIT.NET içerdigini dogrulayin
        String expectedTitleIcerik = "BABAYIGIT.NET";
        String actualTitle = Driver.getDriver().getTitle();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(actualTitle.contains(expectedTitleIcerik));

        softAssert.assertAll();

        Driver.quitDriver();

    }

}
