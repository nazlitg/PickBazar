package Team03.pages;

import Team03.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.util.List;

    public class PickBazarFurniturePage {

        public PickBazarFurniturePage(){
            PageFactory.initElements(Driver.getDriver() , this);
        }


////////////////////////////////////////////////////////////////////////

        @FindBy(id = "headlessui-menu-button-14")
        public WebElement Dropdown;


        @FindBy(id = "headlessui-menu-item-22")
        public WebElement Furniture;


        @FindBy (id = "headlessui-menu-button-2")
        public WebElement FurnitureSearchBox;


        @FindBy(xpath = "(//div[@class='relative inline-block ltr:text-left rtl:text-right'])[1]")
        public WebElement FurnitureFilter;


        @FindBy(xpath = "//div[@class='w-full h-20 flex items-center justify-center']")
        public WebElement Categories;


        @FindBy(xpath = "//*[@class='rounded-md py-1'][1]")
        public WebElement BedCategories;


        @FindBy(xpath = "//*[@class='rounded-md py-1'][2]")
        public WebElement ChairCategories;


        @FindBy(xpath = "//*[@class='rounded-md py-1'][3]")
        public WebElement SofaCategories;


        @FindBy(xpath = "//*[@class='rounded-md py-1'][4]")
        public WebElement TableCategories;


        @FindBy(xpath = "//div[@class='relative flex h-48 w-auto items-center justify-center sm:h-64']")
        public WebElement AllProducts;


        @FindBy(className = "mt-0.5 flex h-10 w-10 shrink-0 items-center justify-center " +
                "rounded-full border border-gray-300 transition-colors")
        public WebElement FavoriButton;


        @FindBy(id = "headlessui-menu-item-9")
        public WebElement WishList;


        @FindBy(xpath = "//h3[@class='mb-2 truncate text-sm font-semibold text-heading']")
        public WebElement AllBeds;


        @FindBy(xpath = "//h3[@class='mb-2 truncate text-sm font-semibold text-heading']")
        public WebElement AllChairs;


        @FindBy(xpath = "//h3[@class='mb-2 truncate text-sm font-semibold text-heading']")
        public WebElement AllSofas;

///////////////////////////////////////////////////////////////////////////

/*
    @FindBy()
    public WebElement


    @FindBy()
    public WebElement


    @FindBy()
    public WebElement


    @FindBy()
    public WebElement


    @FindBy()
    public WebElement


  }
 */

}
