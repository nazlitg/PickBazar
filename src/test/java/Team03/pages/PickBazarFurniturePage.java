package Team03.pages;

import Team03.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


    public class PickBazarFurniturePage {

        public WebDriver Driver;

        public PickBazarFurniturePage(){
            this.Driver= Driver;

            PageFactory.initElements(Driver, this);
        }


////////////////////////////////////////////////////////////////////////

        @FindBy(xpath = "(//div[.='Grocery'])[1]//div[contains(@class,'relative')]")
        public WebElement Dropdown;


        @FindBy(xpath = "(//div[@role='menuitem'])[6]")
        public WebElement Furniture;


        @FindBy (xpath = "//div[@class='relative flex rounded md:rounded-lg h-11 md:h-12']")
        public WebElement FurnitureSearchBox;


        @FindBy(xpath = "(//div[@class='relative inline-block ltr:text-left rtl:text-right'])[1]")
        public WebElement FurnitureFilter;


        @FindBy(xpath = "//div[@class='relative flex h-48 w-auto items-center justify-center sm:h-64']")
        public WebElement AllProducts;


        @FindBy(xpath = "//button[@class='mt-0.5 flex h-10 w-10 shrink-0 items-center justify-center rounded-full border border-gray-300 transition-colors']")
        public WebElement FavoriButton;


        @FindBy(xpath = "//div[@class='relative cursor-pointer overflow-hidden rounded-full border border-border-100 h-10 w-10']")
        public WebElement Profilim;

        @FindBy(xpath = "(//li[@role='menuitem'])[4]")
        public WebElement WishList;


        @FindBy(xpath = "(//div[@class='relative flex h-48 w-auto items-center justify-center sm:h-64'])[1]")
        public WebElement IlkUrun;


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


        @FindBy(xpath = "//h3[@class='mb-2 truncate text-sm font-semibold text-heading']")
        public WebElement AllBeds;


        @FindBy(xpath = "//h3[@class='mb-2 truncate text-sm font-semibold text-heading']")
        public WebElement AllChairs;


        @FindBy(xpath = "//h3[@class='mb-2 truncate text-sm font-semibold text-heading']")
        public WebElement AllSofas;

///////////////////////////////////////////////////////////////////////////


    @FindBy(xpath = "//span[@class='flex pb-0.5']")
    public WebElement Sepet;


    @FindBy(xpath = "mb-3 w-full lg:mb-0 lg:max-w-[400px]")
    public WebElement AddtoShoppingCart;


    @FindBy(xpath = "//button[@title='Out Of Stock']")
    public WebElement UrunArttır;


    @FindBy(xpath = "(//button[@class='cursor-pointer p-2 transition-colors duration-200 hover:bg-accent-hover focus:outline-none px-5'])[1]")
    public WebElement UrunAzalt;


   @FindBy(xpath = "//span[@class='whitespace-nowrap text-base text-body ltr:lg:ml-7 rtl:lg:mr-7']")
   public WebElement StokText;


   @FindBy(partialLinkText = "ltr:-mr-2 rtl:mr-3 rtl:-ml-2") // 2,sini alıcaz
   public WebElement SepettenSil;


   @FindBy(xpath = "//button[@title='Out Of Stock']")
   public WebElement SepetteMiktarArttir;


   @FindBy(xpath = "(//button[@class='cursor-pointer p-2 transition-colors duration-200 hover:bg-accent-hover focus:outline-none hover:!bg-gray-100'])[1]")
   public WebElement SepetteMiktarAzalt;


   @FindBy(xpath = "(//span[@class='font-bold text-heading ltr:ml-auto rtl:mr-auto'])[1]")
   public WebElement Urun1Fiyat;


   @FindBy(xpath = "(//span[@class='font-bold text-heading ltr:ml-auto rtl:mr-auto'])[2]")
   public WebElement Urun2Fiyat;

   @FindBy(xpath = "//span[@class='flex h-full shrink-0 items-center rounded-full bg-light px-5 text-accent']")
   public WebElement ToplamFiyat;




  }
