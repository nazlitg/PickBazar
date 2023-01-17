package Team03.pages;

import Team03.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

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
            @FindBy(xpath = "//h4[.='Logo']//following::section[1]"),
            @FindBy(xpath = "//section[@class='upload']//following::section"),
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

    //Products---------------------------------------------------------------

    @FindBy(id = "search")
    public WebElement products_search;

    @FindBy(xpath = "//span[.='+ Add Product']")
    public WebElement add_product;

    @FindBy(id = "path[data-name='Path 2462']")
    public WebElement product_filter;

    @FindBy(id = "react-select-11-placeholder")
    public WebElement product_filter_group;

    @FindBy(id = "#react-select-12-placeholder")
    public WebElement product_filter_category;

    //!!!!! ------- Üç nokta locate alinmıyor----------

    @FindAll({
            @FindBy(xpath = "//h4[.='Featured Image']//following::section[1]"),
            @FindBy(xpath = "//section[@class='upload']//following::section"),

    })
    public List<WebElement> product_information_img;

    @FindAll({
            @FindBy(xpath = "(//div[@class=' css-b62m3t-container'])[1]"),
            @FindBy(xpath = "(//div[@class=' css-b62m3t-container'])[2]"),
            @FindBy(xpath = "(//div[@class=' css-b62m3t-container'])[3]"),
            @FindBy(xpath = "(//div[@class=' css-b62m3t-container'])[4]"),
            @FindBy(xpath = "(//div[@class=' css-b62m3t-container'])[5]"),
            @FindBy(xpath = "(//div[@class=' css-b62m3t-container'])[6]")

    })
    public List<WebElement> product_information_select;
    @FindAll({
            @FindBy(id = "name"),
            @FindBy(id = "slug"),
            @FindBy(id = "unit"),
            @FindBy(id = "description"),
            @FindBy(id = "price"),
            @FindBy(id = "sale_price"),
            @FindBy(id = "quantity"),
            @FindBy(id = "sku"),
            @FindBy(id = "width"),
            @FindBy(id = "height"),
            @FindBy(id = "length")
    })
    public List<WebElement> product_information;

    @FindAll({
            @FindBy(id = "is_digital"),
            @FindBy(id = "is_external"),
            @FindBy(xpath = "//label[@for='published']"),
            @FindBy(xpath = "//label[@for='draft']"),

    })
    public List<WebElement> product_information_check;


    @FindBy(xpath = "//button[.='Add Produt']")
    public WebElement Add_product;

    //Authors-------------------------------------------------------------

    @FindBy(xpath = "//tbody[@class='rc-table-tbody']")
    public WebElement author_table;

    @FindBy(id = "search")
    public WebElement author_search;

    @FindBy(xpath = "//span[.='+ Add Author']")
    public WebElement Author_add;

    @FindAll({
            @FindBy(xpath = "//h4[.='Image']//following::section[1]"),
            @FindBy(xpath = "//section[@class='upload']//following::section"),

    })
    public List<WebElement> author_img;

    @FindAll({
            @FindBy(id = "name"),
            @FindBy(id = "languages"),
            @FindBy(id = "bio"),
            @FindBy(id = "quote"),

    })
    public List<WebElement> author_information;

    @FindAll({
            @FindBy(xpath = "(//div[@class='react-datepicker-wrapper'])[1]"),
            @FindBy(xpath = "(//div[@class='react-datepicker-wrapper'])[2]"),

    })
    public List<WebElement> author_calender;

    @FindBy(xpath = "//button[.='Add New Social Profile']")
    public WebElement author_add_social;

    @FindBy(xpath = " css-b62m3t-container")
    public WebElement author_select_platform;

    @FindBy(xpath = "//input[@name='socials.0.url']")
    public WebElement author_social_link;

    @FindBy(xpath = "(//button[@type='button'])[2]")
    public WebElement author_remove;

    @FindBy(xpath = "//button[.='Add Author']")
    public WebElement author_add_last;

    //Manufacturers/Publications-------------------------------------------------------------

    @FindBy(id = "search")
    public WebElement m_search;

    @FindBy(xpath = "//span[.='+ Add Manufacturer/Publication']")
    public WebElement m_add_mp;

    @FindAll({
            @FindBy(xpath = "//h4[.='Logo']//following::section[1]"),
            @FindBy(xpath = "//section[@class='upload']//following::section"),

    })
    public List<WebElement> m_img;

    @FindAll({
            @FindBy(id = "name"),
            @FindBy(id = "website"),
            @FindBy(id = "website"),
    })
    public List<WebElement> m_information;

    @FindBy(xpath = "//div[@class=' css-15aq8md']")
    public WebElement m_select_group;

    @FindBy(xpath = "//button[.='Add New Social Profile']")
    public WebElement m_social_add;

    @FindBy(xpath = "(//div[@class=' css-1n58n78'])[2]")
    public WebElement m_select_social;

    @FindBy(xpath = "//input[@name='socials.0.url']")
    public WebElement m_socialUrl;

    //My shops---------------------

    @FindBy(tagName = "//main//a")
    public WebElement myShops;

    //Groups-------------------------------------------

    @FindBy(id = "search")
    public WebElement groups_search;

    @FindBy(xpath = "//span[.='+ Add Group']")
    public WebElement groups_add_group;

    @FindBy(xpath = "//div[@class='rc-table-container']")
    public WebElement groups_table;

    @FindAll({
            @FindBy(xpath = "//label[@for='classic']"),
            @FindBy(xpath = "//label[@for='compact']"),
            @FindBy(xpath = "//label[@for='minimal']"),
            @FindBy(xpath = "//label[@for='modern']"),
            @FindBy(xpath = "//label[@for='standard']"),
    })
    public List<WebElement> groups_SelectLoyout;
    @FindAll({
            @FindBy(xpath = "//label[@for='product-card-0']"),
            @FindBy(xpath = "//label[@for='product-card-1']"),
            @FindBy(xpath = "//label[@for='product-card-2']"),
            @FindBy(xpath = "//label[@for='product-card-3']"),
            @FindBy(xpath = "//label[@for='product-card-4']"),
            @FindBy(xpath = "//label[@for='product-card-5']"),
            @FindBy(xpath = "//label[@for='product-card-6']"),
    })
    public List<WebElement> groups_SelectCard;

    @FindBy(id = "name")
    public WebElement groups_name;

    @FindBy(xpath = "(//div[@class=' css-1n58n78'])[1]")
    public WebElement groups_selectIcon;

    @FindBy(xpath = "//h4[.='Promotional Sliders']//following::section[1]")
    public WebElement groups_img;

    @FindBy(xpath = "//button[.='Add Banner']")
    public WebElement groups_addBanner;

    @FindBy(xpath = "//label[@for='banners.0.title']")
    public WebElement groups_title;

    @FindBy(xpath = "//textarea[@id='banners.0.description']")
    public WebElement groups_description;

    @FindBy(xpath = "//button[.='Remove']")
    public WebElement groups_remove;

    @FindBy(xpath = "//button[.='Add Group']")
    public WebElement groups_addGroup_last;

    //Categories-------------------------------

    @FindBy(id = "search")
    public WebElement ctg_search;

    @FindBy(xpath = "//span[.='+ Add Categories']")
    public WebElement ctg_addCategories;

    @FindBy(xpath = "//div[.='Filter by Group']")
    public WebElement ctg_filter;

    @FindBy(xpath = "//h4[.='Image']//following::section[1]")
    public WebElement ctg_img;

    @FindAll({
            @FindBy(id = "name"),
            @FindBy(id = "details"),
    })
    public List<WebElement> ctg_information;

    @FindAll({
            @FindBy(xpath = "(//div[@class=' css-15aq8md'])[1]"),
            @FindBy(xpath = "(//div[@class=' css-15aq8md'])[2]"),
            @FindBy(xpath = "(//div[@class=' css-15aq8md'])[3]"),
    })
    public List<WebElement> groups_SelectLoctg_selectyout;

    @FindBy(xpath = "//button[.='Add Category']")
    public WebElement getCtg_addCategories_last;

    //Tags---------------------------------------------------------------------------

    @FindBy(id = "search")
    public WebElement tag_search;

    @FindBy(xpath = "//span[.='+ Add Tag']")
    public WebElement tag_addCategories;

    @FindBy(xpath = "(//button[@title='Delete'])[1]'] ")
    public WebElement tag_delete;

    @FindBy(xpath = "(//button[@title='Delete'])[1]/following-sibling::a")
    public WebElement tag_edit;

    @FindAll({
            @FindBy(id = "name"),
            @FindBy(id = "details"),
    })
    public List<WebElement> tag_information;

    @FindAll({
            @FindBy(xpath = "(//div[@class=' css-ackcql'])[1]"),
            @FindBy(xpath = "(//div[@class=' css-ackcql'])[2]"),

    })
    public List<WebElement> tag_select;

    @FindBy(xpath = "(//div[.='Add Tag'])[2]")
    public WebElement tag_addTag;

    //Orders----------------------------------------------------------------

    @FindBy(id = "search")
    public WebElement order_search;

    @FindBy(id = "headlessui-menu-button-2")
    public WebElement order_options;

    @FindBy(id = "//tbody//tr[2]//td[1]//span")
    public WebElement order_show;

    @FindBy(xpath = "(//tbody//tr[2]//td[8]//a] ")
    public WebElement order_eye;

    @FindBy(xpath = "//tbody//tr[2]//td[2]")
    public WebElement order_tracking_number;

    @FindBy(partialLinkText = "Order ID")
    public WebElement order_id;

    @FindBy(xpath = "//span[.='Change Status']")
    public WebElement order_Change_status;

    @FindBy(xpath = "(//main//div)[7]//span[2]")
    public WebElement ordes_status;
    //Create Order -----------------------------------------------------------

    @FindBy(id = "search")
    public WebElement c_order_search;

    @FindBy(xpath = "path[data-name='Path 2462']")
    public WebElement c_filter;

    @FindBy(xpath = "(//span[.='text-product-image'])[1]")
    public WebElement c_order_selectOrder;

    @FindBy(xpath = "(//span[.='Add'])[1]")
    public WebElement c_order_add;

    @FindBy(xpath = "(//span[@class='flex pb-0.5']")
    public WebElement c_order_sepet;

    @FindBy(xpath = "(//span[.='Checkout']")
    public WebElement c_order_checkout;

    @FindBy (xpath = "//button[.='Update']")//index al
    public WebElement c_order_update;

    @FindBy (xpath = "(//button[.='Add'])")//index al
    public WebElement c_order_adds;

    @FindBy (xpath = "(//div[@class=' css-ackcql'])")//index al
    public WebElement c_order_costumer;

    @FindBy (xpath = "(//button[.='Add'])")//index al
    public WebElement c_order_adds;

    @FindBy (xpath = "(//button[.='Add'])")//index al
    public WebElement c_order_adds;

    @FindBy (xpath = "(//button[.='Add'])")//index al
    public WebElement c_order_adds;

    @FindBy (xpath = "(//button[.='Add'])")//index al
    public WebElement c_order_adds;

    @FindBy (xpath = "(//button[.='Add'])")//index al
    public WebElement c_order_adds;

    @FindBy (xpath = "(//button[.='Add'])")//index al
    public WebElement c_order_adds;

    @FindBy (xpath = "(//button[.='Add'])")//index al
    public WebElement c_order_adds;

    @FindBy (xpath = "(//button[.='Add'])")//index al
    public WebElement c_order_adds;

    @FindBy (xpath = "(//button[.='Add'])")//index al
    public WebElement c_order_adds;

    @FindBy (xpath = "(//button[.='Add'])")//index al
    public WebElement c_order_adds;

    @FindBy (xpath = "(//button[.='Add'])")//index al
    public WebElement c_order_adds;

    @FindBy (xpath = "(//button[.='Add'])")//index al
    public WebElement c_order_adds;

    @FindBy (xpath = "(//button[.='Add'])")//index al
    public WebElement c_order_adds;




}