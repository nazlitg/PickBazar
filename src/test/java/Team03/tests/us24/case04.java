package Team03.tests.us24;


import Team03.pages.Books;
import Team03.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class case04  {
    /*
    1-Kulanıcı URL gider.
    2-login olur
    2-Kullanıcı "Grocery" tıklar
    3-Kullanıcı açılan sekmede books a tıklamalıdır
    4-Kullanıcı sectiği ürüne tıklar
    5-Kullanıcı acılan sayfada sectiği kitaın sayısını arttırmak için gerektiği kadar  "+" ya basar
    6-kullanıcı add to card butonuna basar
    7-kullanıcı siparişi tamalamak için sepet imgesine tıklar
    9-kullanıcı kendine uygun olan seçeneği seçer giriş yapar
   10-kullanıcı ödeme seçeneklerini secer
   11-driverı kapatır

     */

    @Test
    public void test04() throws InterruptedException {
        Books books= new Books(Driver.getDriver());

        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");

        books.Login();

        WebElement Grocery = Driver.getDriver().findElement(By.xpath(" //button[@class=\"flex h-11 shrink-0 items-center text-sm font-semibold text-heading focus:outline-none md:text-base xl:px-4 rounded border-border-200 bg-light xl:min-w-150 xl:border xl:text-accent\"]"));
        Grocery.click();

        WebElement Books = Driver.getDriver().findElement(By.xpath(" //a[@href='/books']"));
        Books.click();

        WebElement İmg1 = Driver.getDriver().findElement(By.xpath(" //img[@alt='The Children Story 2']"));
        İmg1.click();

        WebElement addCard = Driver.getDriver().findElement(By.xpath("//button[@class=\"inline-flex items-center justify-center shrink-0 font-semibold leading-none rounded outline-none transition duration-300 ease-in-out focus:outline-none focus:shadow focus:ring-1 focus:ring-accent-700 bg-accent text-light border border-transparent hover:bg-accent-hover px-5 py-0 h-12 h-14 w-full max-w-sm !shrink\"]"));
        addCard.click();

        WebElement sepet=Driver.getDriver().findElement(By.xpath("//span[contains(@class,'flex pb')]"));
        sepet.click();

        WebElement checkout=Driver.getDriver().findElement(By.xpath("//button[@class=\"flex h-12 w-full justify-between rounded-full bg-accent p-1 text-sm font-bold shadow-700 transition-colors hover:bg-accent-hover focus:bg-accent-hover focus:outline-none md:h-14\"]"));
        checkout.click();

        WebElement add1=Driver.getDriver().findElement(By.xpath("//button[@class=\"flex items-center text-sm font-semibold transition-colors duration-200 text-accent hover:text-accent-hover focus:text-accent-hover focus:outline-none\"]"));
        add1.click();

        WebElement num=Driver.getDriver().findElement(By.xpath("//input[@class=\"form-control !p-0 ltr:!pr-4 rtl:!pl-4 ltr:!pl-14 rtl:!pr-14 !flex !items-center !w-full !appearance-none !transition !duration-300 !ease-in-out !text-heading !text-sm focus:!outline-none focus:!ring-0 !border !border-border-base ltr:!border-r-0 rtl:!border-l-0 !rounded ltr:!rounded-r-none rtl:!rounded-l-none focus:!border-accent !h-12\"]"));
        num.sendKeys("2125555555");

        WebElement addContack=Driver.getDriver().findElement(By.xpath("//button[@class=\"inline-flex items-center justify-center shrink-0 font-semibold leading-none rounded outline-none transition duration-300 ease-in-out focus:outline-none focus:shadow focus:ring-1 focus:ring-accent-700 bg-accent text-light border border-transparent hover:bg-accent-hover px-5 py-0 h-12 !text-sm ltr:!rounded-l-none rtl:!rounded-r-none\"]"));
        addContack.click();

        WebElement checkAvaibilitiy=Driver.getDriver().findElement(By.xpath("//button[@class=\"inline-flex items-center justify-center shrink-0 font-semibold leading-none rounded outline-none transition duration-300 ease-in-out focus:outline-none focus:shadow focus:ring-1 focus:ring-accent-700 bg-accent text-light border border-transparent hover:bg-accent-hover px-5 py-0 h-12 mt-5 w-full\"]"));
        checkAvaibilitiy.click();

        WebElement cash=Driver.getDriver().findElement(By.xpath("//div[@class=\"relative flex h-full w-full cursor-pointer items-center justify-center rounded border border-gray-200 bg-light py-3 text-center\"]"));
        cash.click();

        WebElement placeOrdder=Driver.getDriver().findElement(By.xpath("//button[@class=\"inline-flex items-center justify-center shrink-0 font-semibold leading-none rounded outline-none transition duration-300 ease-in-out focus:outline-none focus:shadow focus:ring-1 focus:ring-accent-700 bg-accent text-light border border-transparent hover:bg-accent-hover px-5 py-0 h-12 mt-5 w-full\"]"));
        placeOrdder.click();

        WebElement orderPresesing=Driver.getDriver().findElement(By.xpath("//span[@class=\"px-3 py-1 rounded-full text-sm text-light bg-[#F59E0B] min-h-[2rem] items-center justify-center text-[9px] !leading-none xs:text-sm inline-flex\"]"));

        Assert.assertTrue(orderPresesing.isEnabled());





    }

}
