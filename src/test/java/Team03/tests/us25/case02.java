package Team03.tests.us25;

import Team03.utilities.Driver;
import Team03.utilities.TestBaseReports;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class case02  extends TestBaseReports {
    /*
    1-Kullanıcı URL gider.
    2-Kullanıcı "Grocery" tıklar
    3-Kullanıcı açılan sekmede "Books" a tıklamalıdır
    4-Yazarları görene kadar ekranı aşağıya kaydırır
    5-Yazarların göründüğünü kontrol eder
    6-yazarlarda swipe yar
    7-swipe yaptığını kontrol eder
    8-driverı kapatır

     */
    @Test
    public void test02() throws InterruptedException {
        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

        WebElement Grocery = Driver.getDriver().findElement(By.xpath(" //span[@class=\"whitespace-nowrap\"]"));
        Grocery.click();

        WebElement Books = Driver.getDriver().findElement(By.xpath(" //a[@href='/books']"));
        Books.click();

        WebElement topArturs=Driver.getDriver().findElement(By.xpath("(//a[@class=\"text-base font-semibold justify-end transition-colors hover:text-orange-500\"])[1]"));

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();" ,topArturs);
        Thread.sleep(3000);

        WebElement scroll=Driver.getDriver().findElement(By.xpath("(//div[@class=\"author-slider-next w-8 h-8 flex items-center justify-center text-heading bg-light shadow-300 outline-none rounded-full absolute top-1/2 -mt-4 z-[5] cursor-pointer ltr:-right-3 rtl:-left-3 ltr:lg:-right-4 rtl:lg:-left-4 focus:outline-none transition-colors hover:text-orange-500\"])[1]"));

        scroll.click();

        Thread.sleep(3000);

        WebElement scroll1=Driver.getDriver().findElement(By.xpath("//div[@class=\"author-slider-prev w-8 h-8 flex items-center justify-center text-heading bg-light shadow-300 outline-none rounded-full absolute top-1/2 -mt-4 z-[5] cursor-pointer ltr:-left-3 rtl:-right-3 ltr:lg:-left-4 rtl:lg:-right-4 focus:outline-none transition-colors hover:text-orange-500\"]"));

        scroll1.click();

        Assert.assertTrue(scroll.isEnabled());
        Assert.assertTrue(scroll1.isEnabled());


    }
}
