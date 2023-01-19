package Team03.pages;

import Team03.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PickBazarUserMenuPage {

    public PickBazarUserMenuPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//img[@alt='user name']")
    public WebElement profileImg;

    @FindBy(xpath = "//ul[@class='absolute mt-1 w-48 rounded bg-white pb-4 shadow-700 focus:outline-none ltr:right-0 ltr:origin-top-right rtl:left-0 rtl:origin-top-left transform opacity-100 scale-100']")
    public WebElement userMenu;

    @FindBy(id = "headlessui-menu-item-14")
    public WebElement points;

    @FindBy(xpath = "//button[.='Profile']")
    public WebElement profileButton;

    @FindBy(xpath = "//a[.='Profile']")
    public WebElement profileSekmesi;

    @FindBy(id = "name")
    public WebElement profileNameBox;

    @FindBy(xpath = "//textarea[@id='profile.bio']")
    public WebElement profileBio;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    public WebElement profileSaveButton;

    @FindBy(xpath = "(//button[.='Add'])[1]")
    public WebElement phoneAddButton; //input[@type='tel']

    @FindBy(xpath = "(//input[@type='tel'])[2]")
    public WebElement addContactButton;

    @FindBy(xpath = "(//button[.='Add'])[2]")
    public WebElement adressAddButton;

    @FindBy(xpath = "//button[.='My Orders']")
    public WebElement myOrdersButton;

    @FindBy(xpath = "//a[.='My Orders']")
    public WebElement myOrdersSekmesi;

    @FindBy(xpath = "//button[.='My Wishlists']")
    public WebElement myWishlistButton;

    @FindBy(xpath = "//a[.='My Wishlists']")
    public WebElement myWishlistSekmesi;

    @FindBy(xpath = "//button[.='Checkout']")
    public WebElement checkout;

    @FindBy(xpath = "//button[.='Check Availability']")
    public WebElement checkAvailability;


    @FindBy(xpath = "//button[.='Logout']")
    public WebElement logout;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;

}
