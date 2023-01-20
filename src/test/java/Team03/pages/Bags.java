package Team03.pages;

import Team03.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Bags {

    private WebDriver driver;

    public Bags(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    public void textControl(){
        Assert.assertTrue(productList.get(0).getText().contains("Armani"));
        Assert.assertTrue(productList.get(1).getText().contains("Armani"));
        Assert.assertTrue(productList.get(2).getText().contains("Armani"));
        Assert.assertTrue(productList.get(3).getText().contains("Armani"));

    }


    @FindBy(xpath = "(//button[@data-variant='normal'])[1]")
    private WebElement joinButton;

    @FindBy(id = "email")
    private WebElement emailButton;

    @FindBy(id = "password")
    private WebElement passwordButton;

    @FindBy(xpath = "(//button[@data-variant='normal'])[3]")
    private WebElement loginButton;

    @FindBy(xpath = "//img[@alt='user name']")
    private WebElement loginImage;


    public void Login(){

        joinButton.click();
        emailButton.clear();
        emailButton.sendKeys("testngprojectteam03@gmail.com");
        passwordButton.clear();
        passwordButton.sendKeys("Projeteam03-2022");
        loginButton.click();
        Assert.assertTrue(loginImage.isDisplayed());
    }

    //
    @FindBy(id = "headlessui-menu-button-1")
    private WebElement groceryDropdown;


    @FindBy(id = "headlessui-menu-item-14")
    private WebElement selectBags;

    public void SelectBags(){
        groceryDropdown.click();
        selectBags.click();
        groceryDropdown.click();
    }


    @FindBy(xpath = "//input[@id='search']")
    private WebElement searchBox;

    public void search(){
        searchBox.sendKeys("armani"+ Keys.ENTER);
    }

    //-------------US_15----------------







    @FindBy(xpath = "//button[@class='mt-0.5 flex h-10 w-10 shrink-0 items-center justify-center rounded-full border border-gray-300 transition-colors']")
    private WebElement favoriteButton;

    @FindAll({

            @FindBy(xpath = "(//h3[@role='button'])[1]"),
            @FindBy(xpath = "(//h3[@role='button'])[2]"),
            @FindBy(xpath = "(//h3[@role='button'])[3]"),
            @FindBy(xpath = "(//h3[@role='button'])[4]"),
            @FindBy(xpath = "(//h3[@role='button'])[5]"),
            @FindBy(xpath = "(//h3[@role='button'])[6]"),
            @FindBy(xpath = "(//h3[@role='button'])[7]"),
            @FindBy(xpath = "(//h3[@role='button'])[8]"),
            @FindBy(xpath = "(//h3[@role='button'])[9]"),
            @FindBy(xpath = "(//h3[@role='button'])[10]"),
            @FindBy(xpath = "(//h3[@role='button'])[11]"),
            @FindBy(xpath = "(//h3[@role='button'])[12]"),
            @FindBy(xpath = "(//h3[@role='button'])[13]"),
            @FindBy(xpath = "(//h3[@role='button'])[14]"),
            @FindBy(xpath = "(//h3[@role='button'])[15]"),
    })
    private List<WebElement>productList;
    public void addToFavorite() {

        for (int i = 0; i <= productList.size(); i++) {

            productList.get(i).click();
            favoriteButton.click();
            break;
        }

    }

    @FindBy(xpath = "//img[@alt='user name']")
    private WebElement profile;


    @FindBy(xpath = "(//h1)[2]")
    private WebElement productDetails;

    @FindBy(xpath ="(//h1)[1]" )
    private WebElement detailsControl;

    @FindBy(xpath = "//button[text()='My Wishlists']")
    private WebElement myWhishlist;

    @FindBy(xpath = "//div//a[contains(text(),'Armani')]")
    private WebElement myWhishlistProduct;

    @FindBy(xpath = "(//div//ul[@class='text-xs xl:py-8'])[1]")
    public WebElement sawCategory;

    public void control() throws InterruptedException {
        productList.get(1).click();
        productDetails.click();
        favoriteButton.click();
        profile.click();
        myWhishlist.click();
        Assert.assertTrue(myWhishlistProduct.isDisplayed());
    }


    @FindBy(xpath = "(//button[@class='flex w-full items-center py-2 font-semibold text-body-dark outline-none transition-all ease-in-expo  focus:text-accent focus:outline-none focus:ring-0 ltr:text-left rtl:text-right text-body-dark text-sm'])[6]")
    private WebElement filterPurse;

    @FindBy(xpath = "//div[@class='w-full']")
    private WebElement seeDetails;


    @FindBy(xpath = "//div[@class='grid grid-cols-[repeat(auto-fill,minmax(250px,1fr))] gap-3']")
    private WebElement productPicture;

    @FindBy(xpath = "//div[@class='rounded-full bg-yellow-500 px-3 text-xs font-semibold leading-6 text-light ltr:ml-auto rtl:mr-auto']")
    private WebElement indirim;

    @FindBy(xpath = "//ins[@class='text-2xl font-semibold text-accent no-underline md:text-3xl']")
    private WebElement güncelFiyat;

    @FindBy(xpath = "//del[@class='text-sm font-normal text-muted ltr:ml-2 rtl:mr-2 md:text-base']")
    private WebElement eskiFiyat;

    @FindBy(xpath = "//button[@class='text-sm tracking-wider text-accent underline transition hover:text-accent-hover hover:no-underline']")
    private WebElement linkTest;

    @FindBy(xpath = "//div[@class='flex min-h-screen flex-col bg-gray-100 transition-colors duration-150']")
    private WebElement linkTestSee;

    @FindBy(xpath = "(//div[text()='Out Of Stock'])[5]")
    private WebElement stoktaOlmayan;

    @FindBy(xpath = "//div[text()='1']")
    private WebElement sayi;

    public void outOfStockControl(){
        productList.get(2).click();
        addToshoppingCart.click();
        Assert.assertEquals(stoktaOlmayan,sayi);
    }
    public void setSeeDetailsControl(){
        productList.get(1).click();
        productDetails.click();
        Actions actions = new Actions(Driver.getDriver());
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        Assert.assertTrue(detailsControl.isDisplayed());
    }
    public void scroll(){
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(productPicture.isDisplayed());
    }
    public void indirimKontrol(){
        productList.get(1).click();
        Assert.assertTrue(indirim.isDisplayed());
        Assert.assertTrue(güncelFiyat.isDisplayed());
        Assert.assertTrue(eskiFiyat.isDisplayed());
    }
    public void linkTest(){
        productList.get(1).click();
        productDetails.click();
        Assert.assertTrue(seeDetails.isDisplayed());
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://shop-pickbazar-rest.vercel.app/products/armani-purse"));
    }

    //------------------------US_16---------------------------


    @FindBy(xpath = "//div[@class='mb-3 w-full lg:mb-0 lg:max-w-[400px]']")
    private WebElement addToshoppingCart;

    @FindBy(xpath = "(//button[@class='cursor-pointer p-2 transition-colors duration-200 hover:bg-accent-hover focus:outline-none px-5'])[4]")
    private WebElement plusProduct;

    @FindBy(xpath = "(//button[@class='cursor-pointer p-2 transition-colors duration-200 hover:bg-accent-hover focus:outline-none px-5'])[3]")
    private WebElement minusProduct;

    @FindBy(xpath = "//button[@class='hidden product-cart lg:flex flex-col items-center justify-center p-3 pt-3.5 fixed top-1/2 -mt-12 ltr:right-0 rtl:left-0 z-40 shadow-900 rounded ltr:rounded-tr-none rtl:rounded-tl-none ltr:rounded-br-none rtl:rounded-bl-none bg-accent text-light text-sm font-semibold transition-colors duration-200 focus:outline-none hover:bg-accent-hover']")

    private WebElement box;

    @FindBy(xpath = "//h1[@class='text-lg font-semibold tracking-tight text-heading md:text-xl xl:text-2xl cursor-pointer transition-colors hover:text-accent']")
    private WebElement detailsProduct;

    @FindBy(xpath = "(//button[@class='cursor-pointer p-2 transition-colors duration-200 hover:bg-accent-hover focus:outline-none hover:!bg-gray-100'])[2]")
    private WebElement boxPlus;

    @FindBy(xpath = "(//button[@class='cursor-pointer p-2 transition-colors duration-200 hover:bg-accent-hover focus:outline-none hover:!bg-gray-100'])[1]")
    private WebElement boxMinus;

    public void sayfadaArtAzlt(){
        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        productList.get(3).click();
        addToshoppingCart.click();
        plusProduct.click();
        plusProduct.click();
        Assert.assertTrue(plusProduct.isEnabled());
        minusProduct.click();
        Assert.assertTrue(minusProduct.isEnabled());
    }

    public void sepetteArtAzlt(){
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        productList.get(3).click();
        addToshoppingCart.click();
        plusProduct.click();
        actions.keyDown(Keys.ESCAPE).perform();
        box.click();
        boxPlus.click();
        Assert.assertTrue(boxPlus.isEnabled());
        boxMinus.click();
        Assert.assertTrue(boxMinus.isEnabled());
    }


    //--------------------us17--------------------//

    @FindBy(xpath = "(//div[@style='opacity: 1;'])[2]")
    private WebElement boxProductSee;

    @FindBy(xpath = "(//div[@style='opacity: 1;'])[2]")
    private WebElement brFiyat;

    @FindBy(xpath = "//div//footer[@class='fixed bottom-0 z-10 w-full max-w-md bg-light py-5 px-6']")
    private WebElement tplmFiyat;

    @FindBy(xpath = "(//div[@class='flex flex-1 items-center justify-center px-3 text-sm font-semibold'])[3]")
    private WebElement alinanUrun;

    @FindBy(xpath = "//span[@class='whitespace-nowrap text-base text-body ltr:lg:ml-7 rtl:lg:mr-7']")
    private WebElement stoktakiUrun;

    @FindBy(xpath = "//button[@class='flex h-7 w-7 shrink-0 items-center justify-center rounded-full text-muted transition-all duration-200 hover:bg-gray-100 hover:text-red-600 focus:bg-gray-100 focus:text-red-600 focus:outline-none ltr:ml-3 ltr:-mr-2 rtl:mr-3 rtl:-ml-2']")
    private WebElement boxClose;

    @FindBy(xpath = "//h4[@class='mt-6 text-base font-semibold']")
    private WebElement noProductSee;

    public void urunStokKadarEkleme(){
        productList.get(3).click();
        addToshoppingCart.click();
        for (int i = 0; i <50 ; i++) {
            plusProduct.click();

        }

        Assert.assertEquals(alinanUrun.getText(),stoktakiUrun.getText());
    }

    public void sepeteEkle(){
        Actions actions = new Actions(Driver.getDriver());
        productList.get(3).click();
        addToshoppingCart.click();
        actions.keyDown(Keys.ESCAPE).perform();
        box.click();
        Assert.assertTrue(boxProductSee.isDisplayed());
    }

    public void sepetteArtAzltCikar(){
        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        productList.get(3).click();
        addToshoppingCart.click();
        plusProduct.click();
        actions.keyDown(Keys.ESCAPE).perform();
        box.click();
        for (int i = 0; i <4 ; i++) {
            boxPlus.click();
            break;
        }
        Assert.assertTrue(boxPlus.isEnabled());
        for (int i = 0; i < 3; i++) {
            boxMinus.click();
            break;
        }
        Assert.assertTrue(boxMinus.isEnabled());
        boxClose.click();
        Assert.assertTrue(noProductSee.isDisplayed());

    }

    public void sepetteUruniyatToplamFiyat(){
        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        productList.get(3).click();
        addToshoppingCart.click();
        plusProduct.click();

        actions.keyDown(Keys.ESCAPE).perform();
        box.click();
        Assert.assertTrue(brFiyat.isDisplayed());
        Assert.assertTrue(tplmFiyat.isDisplayed());
    }

}
