package tests;

import org.apache.commons.io.filefilter.ConditionalFileFilter;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Soru2_HesapOlusturmaTesti {

    @Test
    public void hesapOlusturmaTesti() {

        // 1. Tarayıcıyı başlatın
        // 2. 'http://automationexercise.com' adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("aeUrl"));

        // 3. Ana sayfanın başarıyla göründüğünü doğrulayın
        AutomationExercisePage automationExercisePage = new AutomationExercisePage();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(automationExercisePage.logoElementi.isDisplayed());

        // 4. 'Kayıt Ol / Giriş Yap' düğmesine tıklayın
        automationExercisePage.signupLoginButonu.click();

        // 5. 'Yeni Kullanıcı Kaydı!' yazısının göründüğünü doğrulayın
        softAssert.assertTrue(automationExercisePage.yeniKullaniciKaydiYazisi.isDisplayed());

        // 6. İsim ve e-posta adresini girin
        automationExercisePage.isimButonu.sendKeys(ConfigReader.getProperty("aeIsim"));
        automationExercisePage.emailButonu.sendKeys(ConfigReader.getProperty("aeEmail"));

        // 7. 'Kayıt Ol' düğmesine tıklayın
        automationExercisePage.signupButonu.click();

        // 8. 'HESAP BİLGİLERİNİ GİRİN' yazısının göründüğünü doğrulayın
        softAssert.assertTrue(automationExercisePage.hesapBilgileriniGirinYazisi.isDisplayed());

        // 9. Detayları doldurun: Başlık, İsim, E-posta, Şifre, Doğum tarihi
        Actions actions = new Actions(Driver.getDriver());
        ReusableMethods.bekle(1);

        actions.click(automationExercisePage.mrsRadioButonu)
                .click(automationExercisePage.passwordKutusu)
                .sendKeys(ConfigReader.getProperty("aePassword"))
                .sendKeys(Keys.TAB)
                .sendKeys("1")
                .sendKeys(Keys.TAB)
                .sendKeys("January")
                .sendKeys(Keys.TAB)
                .sendKeys("2000")
                .perform();

        // 10. 'Bültenimize kayıt olun!' seçeneğini işaretleyin
        automationExercisePage.bultenKutusu.click();

        // 11. 'Ortaklarımızdan özel teklifleri alın!' seçeneğini işaretleyin
        automationExercisePage.ozelTeklifKutusu.click();

        // 12. Detayları doldurun: Ad, Soyad, Şirket, Adres, Adres2, Ülke, Eyalet, Şehir, Posta Kodu, Cep Telefonu Numarası
        actions.click(automationExercisePage.firstNameKutusu)
                .sendKeys("Wise")
                .sendKeys(Keys.TAB)
                .sendKeys("Quarter")
                .sendKeys(Keys.TAB)
                .sendKeys("WiseQuarter")
                .sendKeys(Keys.TAB)
                .sendKeys("ABD")
                .sendKeys(Keys.TAB)
                .sendKeys("Türkiye")
                .sendKeys(Keys.TAB)
                .sendKeys("United States")
                .sendKeys(Keys.TAB)
                .sendKeys("Oklahoma")
                .sendKeys(Keys.TAB)
                .sendKeys("Edmond")
                .sendKeys(Keys.TAB)
                .sendKeys("73013")
                .sendKeys(Keys.TAB)
                .sendKeys("+1 918-876-0483").perform();

        ReusableMethods.bekle(3);

        // 13. 'Hesap Oluştur' düğmesine tıklayın
        automationExercisePage.hesapOlusturButonu.click();

        // 14. 'HESAP OLUŞTURULDU!' yazısının göründüğünü doğrulayın
        softAssert.assertTrue(automationExercisePage.hesapOlusturmaYazisi.isDisplayed());

        // 15. 'Devam Et' düğmesine tıklayın
        automationExercisePage.devamButonu.click();

        // 16. 'Kullanıcı adıyla giriş yapıldı' yazısının göründüğünü doğrulayın
        softAssert.assertTrue(automationExercisePage.girisYazisi.isDisplayed());

        // 17. 'Hesabı Sil' düğmesine tıklayın
        automationExercisePage.hesapSilmeButonu.click();

        // 18. 'HESAP SİLİNDİ!' yazısının göründüğünü dogrulayin ve 'Devam Et' düğmesine tıklayın.
        softAssert.assertTrue(automationExercisePage.hesapSilindiYazisi.isDisplayed());
        automationExercisePage.devamButonu.click();

        softAssert.assertAll();

        Driver.quitDriver();

    }

}
