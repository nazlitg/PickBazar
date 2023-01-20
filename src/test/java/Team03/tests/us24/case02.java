package Team03.tests.us24;

import Team03.pages.Books;
import Team03.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class case02 {
    /*
        1-Kulanıcı URL gider.
        2-login olur
        3-Kullanıcı "Grocery" tıklar
        4-Kullanıcı açılan sekmede books a tıklamalıdır
        5-Kullanıcı sectiği ürüne tıklar
        6-Kullanıcı acılan sayfada sectiği kitabın sayısını arttırmak için gerektiği kadar  "+" ya basar
        7-Kullanıcı acılan sayfada sectiği kitabın sayısını azaltmak  için gerektiği kadar  "-" ya basar
        8-Kullanıcı acılan sayfada sectiği kitab hakkında yorum yazmak için "Ask seller a question" butonuna basar
        9-çıkan ekranda yorum kısmına tıklar yorumunu yazar
        10-Yorum yazdıktan sonra "Submit" butonuna basar
        11-driverı kapatır
         */

    @Test
    public void test02() throws InterruptedException {

        Books books= new Books(Driver.getDriver());
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");

        books.Login();

        wait.until(ExpectedConditions.visibilityOf(Driver.getDriver().findElement(By.xpath("//button[@class=\"flex h-11 shrink-0 items-center text-sm font-semibold text-heading focus:outline-none md:text-base xl:px-4 rounded border-border-200 bg-light xl:min-w-150 xl:border xl:text-accent\"]"))));

        WebElement Grocery = Driver.getDriver().findElement(By.xpath(" //button[@class=\"flex h-11 shrink-0 items-center text-sm font-semibold text-heading focus:outline-none md:text-base xl:px-4 rounded border-border-200 bg-light xl:min-w-150 xl:border xl:text-accent\"]"));
        Grocery.click();

        WebElement Books = Driver.getDriver().findElement(By.xpath(" //a[@href='/books']"));
        Books.click();

        WebElement img1 = Driver.getDriver().findElement(By.xpath(" //img[@alt='The Children Story 2']"));
        img1.click();

        WebElement arttir=Driver.getDriver().findElement(By.xpath("//button[@class=\"cursor-pointer p-2 transition-colors duration-200 hover:bg-accent-hover focus:outline-none border border-gray-300 px-5 hover:border-accent hover:!bg-transparent hover:!text-accent ltr:rounded-r rtl:rounded-l\"]"));
        arttir.click();
        Assert.assertTrue(arttir.isEnabled());

        WebElement azalt=Driver.getDriver().findElement(By.xpath("//button[@class=\"cursor-pointer p-2 transition-colors duration-200 hover:bg-accent-hover focus:outline-none border border-gray-300 px-5 hover:border-accent hover:!bg-transparent ltr:rounded-l rtl:rounded-r\"]"));
        azalt.click();

        Assert.assertTrue(azalt.isEnabled());

        WebElement askSeller=Driver.getDriver().findElement(By.xpath("//button[@class=\"rounded-full bg-accent px-5 py-3 text-xs font-bold text-white transition-colors hover:border-accent hover:bg-accent-hover\"]"));
        askSeller.click();

        WebElement yorum=Driver.getDriver().findElement(By.xpath("//textarea[@class=\"px-4 py-3 flex items-center w-full rounded appearance-none transition duration-300 ease-in-out text-heading text-sm focus:outline-none focus:ring-0 border border-border-base focus:border-accent\"]"));
        yorum.sendKeys("hocam yaktınız bizi");

        WebElement submit=Driver.getDriver().findElement(By.xpath("//button[@class=\"inline-flex items-center justify-center shrink-0 font-semibold leading-none rounded outline-none transition duration-300 ease-in-out focus:outline-none focus:shadow focus:ring-1 focus:ring-accent-700 bg-accent text-light border border-transparent hover:bg-accent-hover px-5 py-0 h-12 h-11 w-auto sm:h-12\"]"));
        submit.click();


    }

}
