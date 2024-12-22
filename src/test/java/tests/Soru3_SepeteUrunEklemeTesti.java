package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Soru3_SepeteUrunEklemeTesti {

    @Test
    public void sepeteUrunEklemeTesti() {

        // 1. Tarayıcıyı başlatın
        // 2. 'http://automationexercise.com' adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("aeUrl"));

        // 3. Ana sayfanın başarıyla göründüğünü doğrulayın
        AutomationExercisePage automationExercisePage = new AutomationExercisePage();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(automationExercisePage.logoElementi.isDisplayed());

        // 4. 'Ürünler' düğmesine tıklayın
        automationExercisePage.urunlerLinki.click();

        // 5. İlk ürünün üzerine gelin ve 'Sepete ekle' düğmesine tıklayın
        Actions actions = new Actions(Driver.getDriver());
        ReusableMethods.bekle(1);

        actions.sendKeys(Keys.PAGE_DOWN)
               .moveToElement(automationExercisePage.ilkUrunElementi)
               .click(automationExercisePage.ilkUrunSepeteEkleButonu).perform();

        // 6. 'Alışverişe Devam Et' düğmesine tıklayın
        automationExercisePage.alisveriseDevamButonu.click();

        // 7. İkinci ürünün üzerine gelin ve 'Sepete ekle' düğmesine tıklayın
        actions.moveToElement(automationExercisePage.ikinciUrunElementi)
               .click(automationExercisePage.ikinciUrunSepeteEkleButonu).perform();

        // 8. 'Sepeti Görüntüle' düğmesine tıklayın
        automationExercisePage.sepetiGoruntuleButonu.click();

        // 9. Her iki ürünün de sepete eklendiğini doğrulayın
        String expectedIlkUrunIsmi = automationExercisePage.eklenenIlkUrunIsmi.getText();
        String actualIlkUrunIsmi = automationExercisePage.sepettekiIlkUrunIsmi.getText();

        softAssert.assertEquals(actualIlkUrunIsmi, expectedIlkUrunIsmi);

        // 10. Ürünlerin fiyatlarını, miktarlarını ve toplam fiyatlarını doğrulayın
        String expectedIlkUrunFiyati = automationExercisePage.eklenenIlkUrunFiyati.getText();
        String actualIlkUrunFiyati = automationExercisePage.sepettekiIlkUrunFiyati.getText();
        softAssert.assertEquals(actualIlkUrunFiyati, expectedIlkUrunFiyati);

        String expectedIkinciUrunFiyati = automationExercisePage.eklenenIkinciUrunFiyati.getText();
        String actualIkinciUrunFiyati = automationExercisePage.sepettekiIkinciUrunFiyati.getText();
        softAssert.assertEquals(actualIkinciUrunFiyati, expectedIkinciUrunFiyati);

        String actualIlkUrunMiktari = automationExercisePage.ilkUrunMiktari.getText();
        softAssert.assertEquals(actualIlkUrunMiktari, "1");

        String actualIkinciUrunMiktari = automationExercisePage.ikinciUrunMiktari.getText();
        softAssert.assertEquals(actualIkinciUrunMiktari, "1");

        softAssert.assertEquals(automationExercisePage.ilkUrunToplamFiyati.getText(), expectedIlkUrunFiyati);
        softAssert.assertEquals(automationExercisePage.ikinciUrunToplamFiyati.getText(), expectedIkinciUrunFiyati);

        softAssert.assertAll();

        Driver.quitDriver();

    }

}
