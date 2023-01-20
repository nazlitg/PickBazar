package Team03.pages;

import Team03.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    @FindBy(xpath = "(//button[contains(@class,'text-sm font-semibold text-accent transition-colors duration')])[1]")
    public WebElement phoneAddButton;

    @FindBy(xpath = "(//input[@type='tel'])[2]")
    public WebElement addContactBox;

    @FindBy(xpath = "(//button[contains(@class,'ease-in-out focus:outline-none focus:shadow focus:ring')])[2]")
    public WebElement addContactButton;

    @FindBy(xpath = "(//button[contains(@class,'text-sm font-semibold text-accent transition-colors duration')])[2]")
    public WebElement newAdressAddButton;

    @FindBy(xpath = "//div[@class='col-span-2']//input[@id='title']")
    public WebElement newAdressTitleBox;

    @FindBy(xpath = "//div[@class='group relative cursor-pointer rounded border p-4 hover:border-accent border-transparent bg-gray-100']")
    public List<WebElement> adressBoxes;

    @FindBy(xpath = "//div[contains(@class,'Toastify')]")
    public WebElement profileUpdatedSuccessfully;


    @FindBy(xpath = "//a[.='Change Password']")
    public WebElement changePasswordSekmesi;

    @FindBy(id = "oldPassword")
    public WebElement oldPasswordBox;

    @FindBy(id = "newPassword")
    public WebElement newPasswordBox;

    @FindBy(id = "passwordConfirmation")
    public WebElement confirmPasswordBox;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement passwordSubmitButton;

    @FindBy(xpath = "//button[.='My Orders']")
    public WebElement myOrdersButton;

    @FindBy(xpath = "//a[.='My Orders']")
    public WebElement myOrdersSekmesi;

    @FindBy(xpath = "(//h3[contains(text(),'My Orders')])[1]")
    public WebElement myOrdersHeader;

    @FindBy(xpath = "//h2[contains(@class,'flex text-sm font-semibold text-heading md:text-lg')]")
    public WebElement orderDetailsHeader;

    @FindBy(xpath = "//button[.='My Wishlists']")
    public WebElement myWishlistButton;

    @FindBy(xpath = "//button[.='Remove']")
    public List<WebElement> removeButtonList;

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
