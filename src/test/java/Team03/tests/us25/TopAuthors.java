package Team03.tests.us25;

import Team03.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TopAuthors {
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");

        WebElement Grocery = Driver.getDriver().findElement(By.xpath(" //span[@class=\"whitespace-nowrap\"]"));
        Grocery.click();

        WebElement Books = Driver.getDriver().findElement(By.xpath(" //a[@href='/books']"));
        Books.click();


        WebElement seeAll = Driver.getDriver().findElement(By.xpath(" //a[@href='/authors']"));
        seeAll.click();






    }
}

