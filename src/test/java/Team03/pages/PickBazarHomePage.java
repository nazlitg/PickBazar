package Team03.pages;

import Team03.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PickBazarHomePage {

    public PickBazarHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[.='Join']")
    public WebElement join;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//img[@alt='user name']")
    public WebElement profileImg;

    @FindBy(xpath = "//p[.='The credentials was wrong!']")
    public WebElement invalidLogin;

    @FindBy(xpath = "(//div[.='Grocery'])[1]//div[contains(@class,'relative')]")
    public WebElement categoryDropDown;

    @FindBy(xpath = "//button[.='Daily Needs']")
    public WebElement newCategoryDropDown;

    @FindBy(xpath = "//div[contains(@id,'headlessui-menu')]//span[contains(text(),'Grocery')]")
    public WebElement groceryCategory;

    @FindBy(xpath = "//div[contains(@id,'headlessui-menu')]//span[contains(text(),'Bakery')]")
    public WebElement bakeryCategory;

    @FindBy(xpath = "//div[contains(@id,'headlessui-menu')]//span[contains(text(),'Makeup')]")
    public WebElement makeUpCategory;

    @FindBy(xpath = "//div[contains(@id,'headlessui-menu')]//span[contains(text(),'Bags')]")
    public WebElement bagsCategory;

    @FindBy(xpath = "//div[contains(@id,'headlessui-menu')]//span[contains(text(),'Clothing')]")
    public WebElement clothingCategory;

    @FindBy(xpath = "//div[contains(@id,'headlessui-menu')]//span[contains(text(),'Furniture')]")
    public WebElement furnitureCategory;

    @FindBy(xpath = "//div[contains(@id,'headlessui-menu')]//span[contains(text(),'Daily')]")
    public WebElement dailyNeedsCategory;

    @FindBy(xpath = "//div[contains(@id,'headlessui-menu')]//span[contains(text(),'Books')]")
    public WebElement booksCategory;

    @FindBy(xpath = "//h1[@class='text-2xl font-bold tracking-tight text-heading lg:text-4xl xl:text-5xl']")
    public WebElement categoryTitle;

    @FindBy(xpath = "//h1[@class='text-2xl font-bold tracking-tight text-heading md:text-3xl lg:text-4xl xl:text-5xl !text-accent']")
    public WebElement nextCategoryTitle;

    @FindBy(xpath = "//span[contains(text(),'Chair')]")
    public WebElement chairButton;

    @FindBy(xpath = "//h3[contains(text(),'Popular')]")
    public WebElement booksPopular;
}
