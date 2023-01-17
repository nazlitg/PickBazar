package Team03.pages;

import Team03.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PickBazarContactPage {


    public PickBazarContactPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Contact']")
    public WebElement contact;


    @FindBy(xpath = "(//span[@class='mb-3 font-semibold text-heading'])[1]")
    public WebElement adress;


    @FindBy(xpath = "(//span[@class='mb-3 font-semibold text-heading'])[2]")
    public WebElement phone;


    @FindBy(xpath = "(//span[@class='mb-3 font-semibold text-heading'])[3]")
    public WebElement website;

    @FindBy(xpath = "(//a[@target='_blank'])[2]")
    public WebElement visitThisSite;


    @FindBy(xpath = "(//a[@target='_blank'])[3]")
    public WebElement facebook;

    @FindBy(xpath = "(//a[@target='_blank'])[4]")
    public WebElement twitter;

    @FindBy(xpath = "(//a[@target='_blank'])[5]")
    public WebElement instagram;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement searchName;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement searchEmail;

    @FindBy(xpath = "//input[@id='subject']")
    public WebElement searchSubject;


    @FindBy(xpath = "//textarea[@id='description']")
    public WebElement searchDescription;

    @FindBy(xpath = "(//button[@data-variant='normal'])[2]")
    public WebElement submit;


    @FindBy(xpath = "(//p[@class='mt-2 text-xs text-red-500'])[1]")
    public WebElement gecersiz;


    @FindBy(xpath = "//p[@class='mt-2 text-xs text-red-500']")
    public WebElement nameYok;

}
