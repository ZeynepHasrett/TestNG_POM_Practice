package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_GoogleAramaTesti {

    @Test
    public void aramaTesti(){

        // google ana sayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));

        // arama kutusuna nutella yazip aratin
        GooglePage googlePage = new GooglePage();

        googlePage.aramaKutusu.sendKeys("nutella" + Keys.ENTER);

        // arama sonucunun dogru oldugunu test edin
        String expectedTitleIcerik = "nutella";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitleIcerik));

        // sayfayi kapatin
        Driver.quitDriver();
    }

    /*

    public class GoogleSearchTest {
        private WebDriver driver;
        @BeforeTest
        public void setUp() {
            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
            driver = new ChromeDriver();
            driver.get("https://www.google.com");
        }
        @Test
        public void testGoogleSearch() {
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("Selenium WebDriver");
            searchBox.submit();
            WebElement resultStats = driver.findElement(By.id("result-stats"));
            Assert.assertTrue(resultStats.isDisplayed());
        }
        @AfterTest
        public void tearDown() {
            driver.quit();
        }
    }
*/
}
