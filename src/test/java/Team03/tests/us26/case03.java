package Team03.tests.us26;

import Team03.utilities.Driver;
import Team03.utilities.TestBaseReports;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class case03 extends TestBaseReports {
    /*
    1-Kullanıcı URL gider.
    2-Kullanıcı "Grocery" tıklar
    3-Kullanıcı açılan sekmede books a tıklamalıdır
    4-Kullanıcı Top Manufacturers a kadar ekranı aşağıya kaydırır
    5-kullanıcı "See All" a tıklar
    6-kullanıcı tüm üreticilerin göründüğünü kontrol eder
    7-driverı kapatır
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

        Thread.sleep(3000);

        WebElement seeAll = Driver.getDriver().findElement(By.xpath(" //a[@href='/manufacturers']"));
        seeAll.click();

        List<WebElement> Manufacturers=Driver.getDriver().findElements(By.xpath("//a[@class=\"relative flex cursor-pointer items-center rounded border border-gray-200 bg-white p-5 shadow-md\"]"));
        int sayac=0;
        for (WebElement w:Manufacturers){
            if (w.isDisplayed()){
                sayac++;
            }
        }

        Assert.assertTrue(sayac==9);


        // Thread.sleep(3000);


    }
}