package Team03.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class Bags {

    private WebDriver driver;

    public Bags(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }


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
        emailButton.sendKeys("testngprojectteam03@gmail.com");
        passwordButton.clear();
        passwordButton.sendKeys("Projeteam03-2022");
        loginButton.click();
    }

    //
    @FindBy(id = "headlessui-menu-button-1")
    private WebElement groceryDropdown;


    @FindBy(id = "headlessui-menu-item-14")
    private WebElement selectBags;

    public void SelectBags(){
        groceryDropdown.click();
        selectBags.click();
        groceryDropdown.click();
    }


    @FindBy(xpath = "//input[@id='search']")
    private WebElement searchBox;

    public void search(){
        searchBox.sendKeys("armani"+ Keys.ENTER);
    }
    public void seeTest() {
        List<WebElement> seeSearch = driver.findElements(By.xpath("//div[@class='grid grid-cols-[repeat(auto-fill,minmax(250px,1fr))] gap-3']"));
        seeSearch.get(1);
        seeSearch.get(2);
        seeSearch.get(3);
        Assert.assertTrue(seeSearch.contains("Armani"));
    }

}
