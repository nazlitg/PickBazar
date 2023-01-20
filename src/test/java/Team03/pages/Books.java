package Team03.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Books {
    private WebDriver driver;

    public Books(WebDriver driver) {
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

    @FindBy(id = "headlessui-menu-item-12")
    private WebElement selectBooks;

    @FindBy(id = "headlessui-menu-button-1")
    private WebElement groceryDropdown;

    public void SelectBooks(){
        groceryDropdown.click();
        selectBooks.click();

    }


}
