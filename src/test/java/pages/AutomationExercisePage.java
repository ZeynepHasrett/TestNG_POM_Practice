package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage {

    public AutomationExercisePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='logo pull-left']")
    public WebElement logoElementi;

    @FindBy(xpath = " //*[text()=' Signup / Login']")
    public WebElement signupLoginButonu;

    @FindBy(xpath = "//*[text()='New User Signup!']")
    public WebElement yeniKullaniciKaydiYazisi;

    @FindBy(xpath = "//*[@*='text']")
    public WebElement isimButonu;

    @FindBy(xpath = "(//*[@type='email'])[2]")
    public WebElement emailButonu;

    @FindBy(xpath = "(//*[@type='submit'])[2]")
    public WebElement signupButonu;

    @FindBy(xpath = "//*[text()='Enter Account Information']")
    public WebElement hesapBilgileriniGirinYazisi;

    @FindBy(id = "id_gender2")
    public WebElement mrsRadioButonu;

    @FindBy(xpath = "//input[@*='password']")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//*[@id='newsletter']")
    public WebElement bultenKutusu;

    @FindBy(xpath = "//*[@id='optin']")
    public WebElement ozelTeklifKutusu;

    @FindBy(id = "first_name")
    public WebElement firstNameKutusu;

    @FindBy(xpath = "(//*[@type='submit'])[1]")
    public WebElement hesapOlusturButonu;

    @FindBy(xpath = "//h2[.='Account Created!']")
    public WebElement hesapOlusturmaYazisi;

    @FindBy(xpath = "//*[@*='btn btn-primary']")
    public WebElement devamButonu;

    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement girisYazisi;

    @FindBy(xpath = "//*[text()=' Delete Account']")
    public WebElement hesapSilmeButonu;

    @FindBy(xpath = "//*[text()='Account Deleted!']")
    public WebElement hesapSilindiYazisi;

    @FindBy(xpath = "//*[text()=' Products']")
    public WebElement urunlerLinki;

    @FindBy(xpath = "(//*[@class='product-image-wrapper'])[1]")
    public WebElement ilkUrunElementi;

    @FindBy(xpath = "(//*[@*='btn btn-default add-to-cart'])[1]")
    public WebElement ilkUrunSepeteEkleButonu;

    @FindBy(xpath = "//*[.='Continue Shopping']")
    public WebElement alisveriseDevamButonu;

    @FindBy(xpath = "(//*[@class='product-image-wrapper'])[2]")
    public WebElement ikinciUrunElementi;

    @FindBy(xpath = "(//*[@class='btn btn-default add-to-cart'])[3]")
    public WebElement ikinciUrunSepeteEkleButonu;

    @FindBy(xpath = "//*[text()='View Cart']")
    public WebElement sepetiGoruntuleButonu;

    @FindBy(xpath = "(//*[text()='Blue Top'])[1]")
    public WebElement eklenenIlkUrunIsmi;

    @FindBy(xpath = "//td//a[text()='Blue Top']")
    public WebElement sepettekiIlkUrunIsmi;

    @FindBy(xpath = "(//*[text()='Rs. 500'])[1]")
    public WebElement eklenenIlkUrunFiyati;

    @FindBy(xpath = "//td//p[text()='Rs. 500']")
    public WebElement sepettekiIlkUrunFiyati;

    @FindBy(xpath = "(//*[text()='Rs. 400'])")
    public WebElement eklenenIkinciUrunFiyati;

    @FindBy(xpath = "//td//p[text()='Rs. 400']")
    public WebElement sepettekiIkinciUrunFiyati;

    @FindBy(xpath = "(//td[@class='cart_quantity'])[1]")
    public WebElement ilkUrunMiktari;

    @FindBy(xpath = "(//td[@class='cart_quantity'])[2]")
    public WebElement ikinciUrunMiktari;

    @FindBy(xpath = "(//td[@class='cart_total'])[1]")
    public WebElement ilkUrunToplamFiyati;

    @FindBy(xpath = "(//td[@class='cart_total'])[2]")
    public WebElement ikinciUrunToplamFiyati;

}
