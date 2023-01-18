package Team03.pages;


import Team03.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PickBazarFAQPage {
    public PickBazarFAQPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='FAQ']")
    public WebElement FAQ;

    @FindBy(xpath = "//h2[@class='text-sm md:text-base font-semibold leading-relaxed text-heading']")
    public List<WebElement>  sorular;

    @FindBy(xpath = "//*[@class='flex-shrink-0 stroke-2']")
    public List<WebElement> artıIsaretleri;


    @FindBy(xpath = "//div[@style='opacity: 1; height: auto;']")

    public WebElement cevap;
}





