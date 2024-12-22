package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C02_FilmAramaTesti {

    /*
          https://www.google.com.tr sayfasina gidin
              "12 kızgın adam"
              "er ryan'ı kurtarmak"
              "vizontele"

          filmlerini aratarak arama sonuc sayilarini yazdiriniz
     */

    @Test
    public void filmAramaTesti01() {

        // https://www.google.com.tr sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));

        // "12 kızgın adam" filmini aratarak
        GooglePage googlePage = new GooglePage();

        googlePage.aramaKutusu.sendKeys("12 kızgın adam" + Keys.ENTER);

        // arama sonuc sayilarini yazdiriniz
        googlePage.araclarLinki.click();
        ReusableMethods.bekle(3);
        String aramaSonucYazisi = googlePage.aramaSonucYaziElementi.getText();

        String[] aramaSonucuArr = aramaSonucYazisi.split(" ");

        System.out.println("12 Kızgın Adam filmi arama sonuc sayisi : " + aramaSonucuArr[1]);

        Driver.quitDriver();

    }

    @Test
    public void filmAramaTesti02() {

        // https://www.google.com.tr sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));

        // "er ryan'ı kurtarmak" filmini aratarak
        GooglePage googlePage = new GooglePage();

        googlePage.aramaKutusu.sendKeys("er ryan'ı kurtarmak" + Keys.ENTER);

        // arama sonuc sayilarini yazdiriniz
        googlePage.araclarLinki.click();
        ReusableMethods.bekle(3);
        String aramaSonucYazisi = googlePage.aramaSonucYaziElementi.getText();

        String[] aramaSonucuArr = aramaSonucYazisi.split(" ");

        System.out.println("Er Ryan'ı Kurtarmak filmi arama sonuc sayisi : " + aramaSonucuArr[1]);

        Driver.quitDriver();

    }

    @Test
    public void filmAramaTesti03() {

        // https://www.google.com.tr sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));

        // "vizontele" filmini aratarak
        GooglePage googlePage = new GooglePage();

        googlePage.aramaKutusu.sendKeys("vizontele" + Keys.ENTER);

        // arama sonuc sayilarini yazdiriniz
        googlePage.araclarLinki.click();
        ReusableMethods.bekle(3);
        String aramaSonucYazisi = googlePage.aramaSonucYaziElementi.getText();

        String[] aramaSonucuArr = aramaSonucYazisi.split(" ");

        System.out.println("Vizontele filmi arama sonuc sayisi : " + aramaSonucuArr[1]);

        Driver.quitDriver();

    }


}
