package Team03.tests.us24;

import Team03.pages.Books;
import Team03.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class case01 {
    public void Books(WebDriver driver) {

    }
    /*
       Ürünün üzerine tıklayarak ürün detayına gidebilmeli
       1-Kullanıcı URL gider.
       2-Kullanıcı "Grocery" tıklar
       3-Kullanıcı açılan sekmede "Books" a tıklamalıdır
       4-Kullanıcı  ilk ürüne tıklar(tüm ürünleri tıklar) datayları sayfasına gider
       5-Detay görünürlüğünü kontrol eder
       6-Driverı kapatır

        */
    @Test
    public void test01() throws InterruptedException {
        Books bg= new Books(Driver.getDriver());

        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");


        WebElement Grocery = Driver.getDriver().findElement(By.xpath(" //span[@class=\"whitespace-nowrap\"]"));
        Grocery.click();

        WebElement Books = Driver.getDriver().findElement(By.xpath(" //a[@href='/books']"));
        Books.click();

        WebElement popular=Driver.getDriver().findElement(By.xpath("(//div[@class='flex items-center justify-between mb-7 '])[1]"));

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",popular);

        WebElement İmg1 = Driver.getDriver().findElement(By.xpath(" //img[@alt='The Children Story 2']"));
        İmg1.click();

        Assert.assertTrue(İmg1.isEnabled());

        WebElement seeMore=Driver.getDriver().findElement(By.xpath("//button[@class=\"mt-1 inline-block font-bold text-accent \"]"));
        seeMore.click();

        Assert.assertTrue(seeMore.isEnabled());


    }
}
