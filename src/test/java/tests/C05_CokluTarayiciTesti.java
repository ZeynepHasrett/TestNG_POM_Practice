package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseCross;

public class C05_CokluTarayiciTesti extends TestBaseCross {

    @Test
    public void cokluTarayiciTesti(){

        // http://automationexercise.com anasayfasina gidin
        driver.get("http://automationexercise.com");

        // Title'in case sensitive olmadan "automation exercise" oldugunu test edin
        String expectedTitle = "automation exercise";
        String actualTitle = driver.getTitle().toLowerCase();

        Assert.assertEquals(actualTitle, expectedTitle);
        
        // Products linkine tiklayin
        driver.findElement(By.xpath("//*[text()=' Products']"))
                .click();

        // Category bolumunden Women'a tiklayip Dress secimi yapin
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        driver.findElement(By.xpath("(//*[@*='collapse'])[1]"))
                .click();

        driver.findElement(By.xpath("(//*[text()='Dress '])[1]"))
                .click();

        // ilk urunun uzerine gelip Sepete Ekle butonuna tiklayin
        WebElement ilkDressElementi = driver.findElement(By.xpath("(//*[@class='col-sm-4'])[2]"));
        actions.moveToElement(ilkDressElementi).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        driver.findElement(By.xpath("(//*[text()='Add to cart'])[1]"))
                .click();

        driver.findElement(By.linkText("View Cart"))
                .click();
        ReusableMethods.bekle(3);

        // urunun sepete eklendigini dogrulayin
        String expectedUrunIsmi = driver.findElement(By.xpath("(//*[text()='Sleeveless Dress'])[1]")).getText();
        String actualUrunIsmi = driver.findElement(By.xpath("//tbody/tr/td[@class='cart_description']")).getText();

        Assert.assertTrue(actualUrunIsmi.contains(expectedUrunIsmi));

    }

}
