package Team03.pages;

import Team03.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SellerPage {
    public SellerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Become a Seller']")
    public WebElement Become_Seller;

    @FindBy(id = "name")
    public WebElement seller_name;

    @FindBy(id = "email")
    public WebElement seller_email;

    @FindBy(id = "password")
    public WebElement seller_password;

    @FindBy(xpath = "//button[.='Register']")
    public WebElement Seller_register;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement Login_Seller;

    @FindBy(tagName = "h3")
    public WebElement check_name;

    @FindBy(xpath = "//div[.='Enabled']")
    public WebElement check_enable;

    @FindBy(xpath = "//a[.='Profile']")
    public WebElement profile;

    @FindBy(id = "headlessui-menu-button-1")
    public WebElement avatar_seller;

    @FindBy(id = "headlessui-menu-item-20")
    public WebElement avatar_profil;

    @FindBy(id = "headlessui-menu-item-21")
    public WebElement avatar_logout;

    @FindBy(xpath = "//a[.='Create Shop']")
    public WebElement create_shop;

    @FindAll({
            @FindBy(xpath = "//section[@class='upload'][1]"),
            @FindBy(xpath = "//section[@class='upload'][2]"),
            @FindBy(id = "name"),
            @FindBy(id = "description"),
            @FindBy(xpath = "//input[@name='balance.payment_info.name']"),
            @FindBy(xpath = "//input[@name='balance.payment_info.bank']"),
            @FindBy(xpath = "//input[@name='balance.payment_info.account']"),
            @FindBy(xpath = "//input[@name='address.country']"),
            @FindBy(xpath = "///input[@name='address.city']"),
            @FindBy(xpath = "//input[@name='address.zip']"),
            @FindBy(xpath = "//textarea[@name='address.street_address']"),
            @FindBy(xpath = "//input[@placeholder='Search location form here']"),
            @FindBy(xpath = "//input[@name='settings.contact']"),
            @FindBy(xpath = "//input[@name='settings.website']")
    })
    public List<WebElement> set_information;

    @FindBy(xpath = "//button[.='Add New Social Profile']")
    public WebElement Add_Social_Profil;

    @FindBy(xpath = "//button[.='Save']")
    public WebElement Save_Profil;

    @FindBy(xpath = "//span[.='Inactive']/child::span")
    public WebElement show_shops;

    //Dashboard --------------------------------------------------------

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashboard;

    @FindBy(xpath = "//span[.='Attributes']")
    public WebElement attributes;

    @FindBy(xpath = "//span[.='Products']")
    public WebElement products;

    @FindBy(xpath = "//span[.='Manufacturers/Publications']")
    public WebElement authors;

    @FindBy(xpath = "//span[.='Orders']")
    public WebElement orders;

    @FindBy(xpath = "//span[.='Refunds']")
    public WebElement refunds;

    @FindBy(xpath = "//span[.='Staff']")
    public WebElement staff;

    @FindBy(xpath = "//span[.='Withdrawals']")
    public WebElement withdrawals;

    @FindBy(xpath = "//span[.='Reviews']")
    public WebElement reviews;

    @FindBy(xpath = "//span[.='Questions']")
    public WebElement questions;

    @FindBy(xpath = "//a[.='Visit Shop']")
    public WebElement visit_shop;

    //Attribute---------------------------------------------------------------------------


    @FindBy(xpath = "//span[.='+ Add Attribute']")
    public WebElement add_attribute;

    @FindBy(xpath = "//*[name()='svg']//*[name()='path'][@d='m128 256c0 35.347656-28.652344 64-64 64s-64-28.652344-64-64 28.652344-64 64-64 64 28.652344 64 64zm0 0']")
    public WebElement ex_im;

    @FindBy(xpath = "//div[@role='button']")
    public WebElement import_file;

    @FindBy(xpath = "//a[@target='_blank']")
    public WebElement export_file;

    //add atribute---------------------------------------------------------

    @FindBy(id = "name")
    public WebElement attribute_name;

    @FindBy(xpath = "//button[.='Add Value']")
    public WebElement add_value;

    @FindBy(xpath = "//button[.='Add Attribute']")
    public WebElement add_attribute2;

    @FindBy(xpath = "//input[@name='values.0.value']")
    public WebElement add_attribute_value;

    @FindBy(xpath = "//input[@name='values.0.meta']")
    public WebElement add_meta;

    @FindBy(xpath = "//button[.='Remove']")
    public WebElement attribute_remove;



}