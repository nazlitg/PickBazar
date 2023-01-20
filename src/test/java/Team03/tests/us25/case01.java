package Team03.tests.us25;

import Team03.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class case01 {
    @Test
    public void test01() throws InterruptedException {
        /*
        1-Kullanıcı URL gider.
        2-Kullanıcı "Grocery" tıklar
        3-Kullanıcı açılan sekmede "Books" a tıklamalıdır
        4-Yazarları görene kadar ekranı aşağıya kaydırır
        5-Yazarların göründüğünü kontrol eder
        6-Ana ekranda 7 yazar oldugunu kontrol eder
        7-driverı kapatır

         */

        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");

        WebElement Grocery = Driver.getDriver().findElement(By.xpath(" //span[@class=\"whitespace-nowrap\"]"));
        Grocery.click();

        WebElement Books = Driver.getDriver().findElement(By.xpath(" //a[@href='/books']"));
        Books.click();

        WebElement topArturs=Driver.getDriver().findElement(By.xpath("(//a[@class=\"text-base font-semibold justify-end transition-colors hover:text-orange-500\"])[1]"));

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();", topArturs);


        Thread.sleep(2000);

        List<WebElement> yazarlar = Driver.getDriver().findElements(By.xpath("//span[@class='block text-center font-semibold text-heading transition-colors group-hover:text-orange-500']"));
        int sayac = 0;
        for (WebElement w : yazarlar) {

            if (w.isDisplayed()) {
                sayac++;

            }
        }

        Assert.assertTrue(sayac == 7);


    }
}




