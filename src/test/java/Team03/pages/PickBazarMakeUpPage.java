package Team03.pages;

import Team03.utilities.ConfigReader;
import Team03.utilities.Driver;
import Team03.utilities.ReusableMethods;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class PickBazarMakeUpPage {

    private WebDriver driver;

    public Actions actions = new Actions(Driver.getDriver());

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));


    public PickBazarMakeUpPage(WebDriver driver) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // MakeUp09TestCase01
    @FindBy(xpath = "(//button[@data-variant='normal'])[1]")
    private WebElement joinButton;

    @FindBy(id = "email")
    private WebElement emailButton;

    @FindBy(id = "password")
    private WebElement passwordButton;

    @FindBy(xpath = "(//button[@data-variant='normal'])[3]")
    private WebElement loginButton;

    public void Login(){
        joinButton.click();
        emailButton.clear();
        emailButton.sendKeys(ConfigReader.getProperty("email"));
        passwordButton.clear();
        passwordButton.sendKeys(ConfigReader.getProperty("password"));
        loginButton.click();
    }

    @FindBy(xpath = "(//div[.='Grocery'])[1]//div[contains(@class,'relative')]")
    private WebElement groceryDropdownAlternatifXp;

    @FindBy(xpath = "(//div[@class='relative inline-block ltr:text-left rtl:text-right'])[1]")
    private WebElement groceryDropdown;

    @FindBy(xpath = "(//div//a[@href='/makeup'])[1]")
    private WebElement selectMakeup;

    public void GroceryDropdownSelectMakeup(){
        try {
            groceryDropdownAlternatifXp.click();
        }catch (Exception e){
            groceryDropdown.click();
        }
        selectMakeup.click();
        groceryDropdown.click();
    }

    @FindBy(xpath = "//input[@id='search']")
    private WebElement searchBox;

    public void search(String key){
        searchBox.sendKeys(key + Keys.ENTER);
    }


    @FindBy(xpath = "//header//h3[contains(text(),'Foundation')]")
    private WebElement aramaSonuclari;

    public void VerifyTheKeywordAtTheSearchBox(){
        Assert.assertTrue(aramaSonuclari.isDisplayed());
    }

    @FindBy(xpath = "//div[@class='mt-8 flex justify-center lg:mt-12']")
    public WebElement loadMore;

    @FindBy(xpath = "(//div//button[contains(@class,'inline-flex items-center justify-center shrink-0 font-semibold leading-none rounded outline-none transition')])[2]")
    private WebElement loadMore2;

    @FindBy(xpath = "(//div[contains(@class,'relative flex h-48 w-auto items-center justify-center')])[81]")
    private WebElement sonUrun;

    public void scrollPageUpDown(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        loadMore.click();
        wait.until(ExpectedConditions.visibilityOf(loadMore));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


    }

    /**
    ************  MakeUp10TestCase01_07 *************
     */

    // //div//a[contains(text(),' Palette')]
    @FindBy(xpath = "//div[@class='p-5 md:p-8 bg-light shadow rounded w-full shadow-none sm:shadow']")
    private WebElement myWishlistsIsDispley;
    @FindBy(xpath = "//div//h1[@class='text-lg font-semibold tracking-tight " +
            "text-heading md:text-xl xl:text-2xl cursor-pointer transition-colors hover:text-accent']")
    private WebElement productInNowWindow ;

    @FindBy(xpath = "//span//button[@type='button']")
    private WebElement myWishlists;

    @FindBy(xpath = "(//header//h3[@role='button'])[3]")
    public WebElement firstProductTitle;

    @FindBy(xpath = "//img[@alt='user name']")
    private WebElement goToMyProfile;

    @FindBy(xpath = "//button[text()='My Wishlists']")
    private WebElement checkTheMyWishlist;

    public void addToMyWishlists(){
        firstProductTitle.click();
        productInNowWindow.click();
        myWishlists.click();
        goToMyProfile.click();
        checkTheMyWishlist.click();
    }

    @FindBy(xpath = "//div[@class='os-content']")
    public WebElement urunKategorileriGorunuyormu;

    @FindBy(xpath = "(//button//span[@class='sr-only'])[14]")
    private WebElement buttonArti;

    @FindBy(xpath = "(//button[@class='flex w-full items-center justify-center rounded bg-accent " +
            "py-4 px-5 text-sm font-light text-light transition-colors duration-300 hover:bg-accent-hover " +
            "focus:bg-accent-hover focus:outline-none lg:text-base'])[2]")
    private WebElement addToShoppingCart;

    @FindBy(xpath = "//span[@class='whitespace-nowrap text-base text-body ltr:lg:ml-7 rtl:lg:mr-7']")
    private WebElement piecesAvailable;

    public void UrunSiniriTesti(){
        addToShoppingCart.click();
        for (int i = 0; i <= 14; i++) {
            actions.moveToElement(buttonArti).click().perform();
        }
    }

    @FindBy(xpath = "//div[@name='details']")
    private WebElement details;

    @FindBy(xpath = "//div[@class='mb-8 flex items-center justify-between lg:mb-10']")
    private WebElement indirimOrani;

    @FindBy(xpath = "//span//ins[@class='text-2xl font-semibold text-accent no-underline md:text-3xl']")
    private WebElement indirimliFiyat;

    @FindBy(xpath = "//del[@class='text-sm font-normal text-muted ltr:ml-2 rtl:mr-2 md:text-base']")
    private WebElement fiyat;

    public void UserGoesToProductPage(){
        actions.moveToElement(firstProductTitle).click(firstProductTitle).click(productInNowWindow).perform();
    }

    public void VerifyThatUserCanAddProductToWishlistTC01(){
        Assert.assertTrue(myWishlistsIsDispley.isEnabled());
    }

    public void VerifyThatUserCanDisplayProductCategoriesTC02(){
        Assert.assertTrue(urunKategorileriGorunuyormu.isDisplayed());
    }

    public void VerifyThatUserCannotAddProductMoreThanStockCapacityTC03(){
        Assert.assertTrue(piecesAvailable.isEnabled());
    }

    public void VerifyThatUserCanSeeTheDetailedInfoAboutProductInTheDetailsTC04(){
        Assert.assertTrue(details.isDisplayed());
    }

    public void VerifyThatUserCanSeeNormalPriceAndDiscountedPriceIfThereIsOneTC07(){
        Assert.assertTrue(indirimOrani.isDisplayed());
        Assert.assertTrue(indirimliFiyat.isDisplayed());
        Assert.assertTrue(fiyat.isDisplayed());
    }

    public void VerifyThatUserCanGoToProductPageThroughLinkTC08(){
        String url = "https://shop-pickbazar-rest.vercel.app/products/smashbox-the-cali-contour-palette";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assert.assertTrue(url.contains("https://shop-pickbazar-rest.vercel.app/products/smashbox-the-cali-contour-palette"));
    }

    public void GoToFirstProduct(){
        firstProductTitle.click();
    }

    @FindBy(xpath = "(//article[contains(@class,'product-card cart-type-helium h-full overflow-hidden rounded border border-border')])[1]")
    private WebElement outOfStockProduct1;
    @FindBy(xpath = "(//article[contains(@class,'product-card cart-type-helium h-full overflow-hidden rounded border border-border')])[4]")
    private WebElement outOfStockProduct2;
    @FindBy(xpath = "(//article[contains(@class,'product-card cart-type-helium h-full overflow-hidden rounded border border-border')])[6]")
    private WebElement outOfStockProduct3;
    @FindBy(xpath = "(//article[contains(@class,'product-card cart-type-helium h-full overflow-hidden rounded border border-border')])[7]")
    private WebElement outOfStockProduct4;
    @FindBy(xpath = "(//article[contains(@class,'product-card cart-type-helium h-full overflow-hidden rounded border border-border')])[23]")
    private WebElement outOfStockProduct5;
    @FindBy(xpath = "(//article[contains(@class,'product-card cart-type-helium h-full overflow-hidden rounded border border-border')])[24]")
    private WebElement outOfStockProduct6;
    @FindBy(xpath = "(//article[contains(@class,'product-card cart-type-helium h-full overflow-hidden rounded border border-border')])[25]")
    private WebElement outOfStockProduct7;
    @FindBy(xpath = "(//article[contains(@class,'product-card cart-type-helium h-full overflow-hidden rounded border border-border')])[26]")
    private WebElement outOfStockProduct8;
    @FindBy(xpath = "(//article[contains(@class,'product-card cart-type-helium h-full overflow-hidden rounded border border-border')])[27]")
    private WebElement outOfStockProduct9;
    @FindBy(xpath = "(//article[contains(@class,'product-card cart-type-helium h-full overflow-hidden rounded border border-border')])[45]")
    private WebElement outOfStockProduct10;
    @FindBy(xpath = "(//article[contains(@class,'product-card cart-type-helium h-full overflow-hidden rounded border border-border')])[47]")
    private WebElement outOfStockProduct11;
    @FindBy(xpath = "(//article[contains(@class,'product-card cart-type-helium h-full overflow-hidden rounded border border-border')])[55]")
    private WebElement outOfStockProduct12;
    @FindBy(xpath = "(//article[contains(@class,'product-card cart-type-helium h-full overflow-hidden rounded border border-border')])[61]")
    private WebElement outOfStockProduct13;
    @FindBy(xpath = "(//article[contains(@class,'product-card cart-type-helium h-full overflow-hidden rounded border border-border')])[79]")
    private WebElement outOfStockProduct14;

    @FindBy(xpath ="//div//button[contains(@class,'flex w-full items-center justify-center rounded bg-accent py')]")
    private WebElement outOfStockAddToCard;

    @FindBy(xpath = "//div//span[contains(text(),'0 Item')]")
    private WebElement outOfStockSepetVerifyBeklenenDurum;

    @FindBy(xpath = "//div//span[contains(text(),'14 Items')]")
    private WebElement outOfStockSepetVerifyOlanDurum;
    public void BagOfOutOfStock(){
        // 1 ürün
       ReusableMethods.scrollDown(outOfStockProduct1);
       outOfStockProduct1.click();
       outOfStockAddToCard.click();
       actions.keyDown(Keys.ESCAPE).perform();
        // 2 ürün
        ReusableMethods.scrollDown(outOfStockProduct2);
        outOfStockProduct2.click();
        outOfStockAddToCard.click();
        actions.keyDown(Keys.ESCAPE).perform();
        // 3. ürün
        ReusableMethods.scrollDown(outOfStockProduct3);
        outOfStockProduct3.click();
        outOfStockAddToCard.click();
        actions.keyDown(Keys.ESCAPE).perform();
        // 4. ürün
        ReusableMethods.scrollDown(outOfStockProduct4);
        outOfStockProduct4.click();
        outOfStockAddToCard.click();
        actions.keyDown(Keys.ESCAPE).perform();
        // 5. ürün
        ReusableMethods.scrollDown(outOfStockProduct5);
        outOfStockProduct5.click();
        outOfStockAddToCard.click();
        actions.keyDown(Keys.ESCAPE).perform();
        // 6. ürün
        ReusableMethods.scrollDown(outOfStockProduct6);
        outOfStockProduct6.click();
        outOfStockAddToCard.click();
        actions.keyDown(Keys.ESCAPE).perform();
        // 7. ürün
        ReusableMethods.scrollDown(outOfStockProduct7);
        outOfStockProduct7.click();
        outOfStockAddToCard.click();
        actions.keyDown(Keys.ESCAPE).perform();
        // 8. ürün
        ReusableMethods.scrollDown(outOfStockProduct8);
        outOfStockProduct8.click();
        outOfStockAddToCard.click();
        actions.keyDown(Keys.ESCAPE).perform();
        // 9. ürün
        ReusableMethods.scrollDown(outOfStockProduct9);
        outOfStockProduct9.click();
        outOfStockAddToCard.click();
        actions.keyDown(Keys.ESCAPE).perform();
        // 10. ürün
        ReusableMethods.scrollDown(loadMore);
        loadMore.click();
        ReusableMethods.scrollDown(outOfStockProduct10);
        outOfStockProduct10.click();
        outOfStockAddToCard.click();
        actions.keyDown(Keys.ESCAPE).perform();
        // 11. ürün
        ReusableMethods.scrollDown(outOfStockProduct11);
        outOfStockProduct11.click();
        outOfStockAddToCard.click();
        actions.keyDown(Keys.ESCAPE).perform();
        // 12. ürün
        ReusableMethods.scrollDown(outOfStockProduct12);
        outOfStockProduct12.click();
        outOfStockAddToCard.click();
        actions.keyDown(Keys.ESCAPE).perform();
        // 13. ürün
        ReusableMethods.scrollDown(loadMore2);
        loadMore2.click();
        ReusableMethods.scrollDown(outOfStockProduct13);
        outOfStockProduct13.click();
        outOfStockAddToCard.click();
        actions.keyDown(Keys.ESCAPE).perform();
        // 14. ürün
        ReusableMethods.scrollDown(outOfStockProduct14);
        outOfStockProduct14.click();
        outOfStockAddToCard.click();
        actions.keyDown(Keys.ESCAPE).perform();
        Assert.assertEquals(outOfStockSepetVerifyBeklenenDurum,outOfStockSepetVerifyOlanDurum);
    }

    /**
     ************** MakeUp11TestCase01_02 *****************
     */

    @FindBy(xpath = "(//div[@class='relative mt-7 flex min-h-6 items-center justify-between md:mt-8'])[2]//span[contains(text(),'Cart')]")
    public WebElement ekrandakiCardButton;

    @FindBy(xpath = "(//button[@class='cursor-pointer p-2 transition-colors duration-200 hover:bg-accent-hover focus:outline-none px-3 py-3 sm:px-2'])[1]//span[contains(text(),'minus')]")
    private WebElement buttonEksi;

    @FindBy(xpath = "(//button[@class='cursor-pointer p-2 transition-colors duration-200 hover:bg-accent-hover focus:outline-none px-3 py-3 sm:px-2'])[2]//span[contains(text(),'plus')]")
    private WebElement alternatifButtonArti;

    public void IncreasAndDecreaseTheProductAmount(){
       ekrandakiCardButton.click();
        for (int i = 0; i <= 4; i++) {
            actions.moveToElement(alternatifButtonArti).click().perform();
        }
        for (int i = 0; i <= 2; i++) {
            actions.moveToElement(buttonEksi).click().perform();
        }
    }

    public void miniScroll(){
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @FindBy(xpath = "//button//span[@class='flex pb-0.5']")
    private WebElement sepet;

    @FindBy(xpath = "(//button//span[@class='sr-only'])[11]")
    private WebElement sepetEksi;

    @FindBy(xpath = "(//button//span[@class='sr-only'])[12]")
    private WebElement sepetArti;

    public void  UseranChangeOrderAmountAtTheCart(){
        actions.moveToElement(ekrandakiCardButton).doubleClick().doubleClick().perform();
        sepet.click();
        for (int i = 0; i <= 4; i++) {
            actions.moveToElement(sepetArti).click().perform();
        }
        for (int i = 0; i <= 2; i++) {
            actions.moveToElement(sepetEksi).click().perform();
        }

    }

    public void VerifyThatUseranChangeOrderAmountAtTheProductPageTC01(){
        Assert.assertTrue(alternatifButtonArti.isEnabled());
        Assert.assertTrue(buttonEksi.isEnabled());
    }

    public void VerifyThatUseranChangeOrderAmountAtTheCartTC02(){
        Assert.assertTrue(sepetArti.isEnabled());
        Assert.assertTrue(sepetEksi.isEnabled());
    }


}
