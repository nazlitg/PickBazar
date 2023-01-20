package Team03.tests.us26;

import Team03.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class case05 {
    /*
    1-Kullanıcı URL gider.
    2-Kullanıcı "Grocery" tıklar
    3-Kullanıcı açılan sekmede books a tıklamalıdır
    4-Kullanıcı Top Manufacturers a kadar ekranı aşağıya kaydırır
    5-kullanıcı üretici seçer
    6-Üretici sayfasında sorting categori search tags seçbilmeli. (Categoriler yazılacaktır,
        Sorting 0-1950 arasında olmalı slider ve yazarak gidebilmelidir, tags verielcektir.
    7-eğer ürün yoksa  "Sorry, No Product Found :(" şeklinde mesaj gelmelidir.
    8-Filtrelemede "Clear" butonuna basar
    9-Tüm seçimlerin temizlendiğini kontrol eder
   10-driverı kapatır

     */
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");

        WebElement Grocery = Driver.getDriver().findElement(By.xpath(" //span[@class=\"whitespace-nowrap\"]"));
        Grocery.click();

        WebElement Books = Driver.getDriver().findElement(By.xpath(" //a[@href='/books']"));
        Books.click();

        WebElement kaydir = Driver.getDriver().findElement(By.xpath("(//h3[@class=\"text-2xl lg:text-[27px] 3xl:text-3xl font-semibold\"])[3]"));

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();", kaydir);

        WebElement manuFacturers=Driver.getDriver().findElement(By.xpath("(//div[@class=\"flex flex-col overflow-hidden ltr:ml-4 rtl:mr-4\"])[1]"));
        manuFacturers.click();

        Assert.assertTrue(manuFacturers.isDisplayed());





    }
}
