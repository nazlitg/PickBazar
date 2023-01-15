package Team03.tests.us24;

import Team03.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Books {
    /*
    Ürünün üzerine tıklayarak ürün detayına gidebilmeli
    1-Kullanıcı URL gider.
    2-Kullanıcı "Grocery" tıklar
    3-Kullanıcı açılan sekmede "Books" a tıklamalıdır
    4-Kullanıcı  ilk ürüne tıklar(tüm ürünleri tıklar) datayları sayfasına gider
    5-Detay görünürlüğünü kontrol eder

     */
    @Test
    public void test01() throws InterruptedException {
        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");

        WebElement Grocery = Driver.getDriver().findElement(By.xpath(" //span[@class=\"whitespace-nowrap\"]"));
        Grocery.click();

        WebElement Books = Driver.getDriver().findElement(By.xpath(" //a[@href='/books']"));
        Books.click();

        WebElement İmg1 = Driver.getDriver().findElement(By.xpath(" //img[@alt='The Children Story 2']"));
        İmg1.click();


        Driver.closeDriver();

    }


}
