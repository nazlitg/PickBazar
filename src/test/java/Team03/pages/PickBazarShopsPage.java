package Team03.pages;

import Team03.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

public class PickBazarShopsPage {
    public PickBazarShopsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Shops']")
    public WebElement shops;

    @FindBy(xpath = "//*[@class='flex text-xs text-body']")
    public List<WebElement> alısVerisSecenekleri;

    @FindBy(xpath = "//*[text()='Address']")
    public WebElement adress;


    @FindBy(xpath = "//*[text()='Phone']")
    public WebElement phone;


    @FindBy(xpath = "//*[text()='Website']")
    public WebElement website;


    @FindBy(xpath = "//header[@class='p-3 text-center md:p-6']")
    public List<WebElement> resimler;

    @FindBy(xpath = "//*[text()='Add To Shopping Cart']")
    public WebElement sepeteEkle;

    @FindBy(xpath = "//span[@class='flex pb-0.5']")
    public WebElement sepeteGit;

    @FindBy(xpath = "(//*[@class='cursor-pointer p-2 transition-colors duration-200 hover:bg-accent-hover focus:outline-none px-5'])[2]")
    public WebElement artıIsareti;

    @FindBy(xpath = "//*[text()='Back']")
    public WebElement back;

    @FindBy(xpath = "//*[text()='Checkout']")
    public WebElement checkout;


    @FindBy(xpath = "//button[text()='Check Availability']")
    public WebElement checkAvailability;
}