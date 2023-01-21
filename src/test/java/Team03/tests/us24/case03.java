package Team03.tests.us24;

import Team03.pages.Books;
import Team03.utilities.Driver;
import Team03.utilities.TestBaseReports;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class case03 extends TestBaseReports {
     /*
    1-Kulanıcı URL gider.
    2-login olur
    3-Kullanıcı "Grocery" tıklar
    4-Kullanıcı açılan sekmede books a tıklamalıdır
    5-Kullanıcı sectiği ürüne tıklar
    6-kullanıcı seçili ürünü beğeni tuşuna basar
    7-beğeni tuşunun doğrulugunu kontrol eder
    8-driverı kapatır


     */
     @Test
     public void test03() throws InterruptedException {
         Books books = new Books(Driver.getDriver());
         JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

         WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

         Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");

         books.Login();

         WebElement Grocery = Driver.getDriver().findElement(By.xpath(" //button[@class=\"flex h-11 shrink-0 items-center text-sm font-semibold text-heading focus:outline-none md:text-base xl:px-4 rounded border-border-200 bg-light xl:min-w-150 xl:border xl:text-accent\"]"));
         Grocery.click();

         WebElement Books = Driver.getDriver().findElement(By.xpath(" //a[@href='/books']"));
         Books.click();

         WebElement img1 = Driver.getDriver().findElement(By.xpath(" //img[@alt='The Children Story 2']"));

         jse.executeScript("arguments[0].scrollIntoView();" ,img1);
         img1.click();

         WebElement say=Driver.getDriver().findElement(By.xpath("//div[@class=\"flex flex-col items-start\"]"));
         jse.executeScript("arguments[0].scrollIntoView();" ,say);

        // Thread.sleep(2000);

         //WebElement like=Driver.getDriver().findElement(By.xpath("//button[contains(@class,'items center justifycenter rounded full border border gray']"));
         WebElement like=Driver.getDriver().findElement(By.xpath("(//button[@type=\"button\"])[3]"));

         like.click();





     }
}
