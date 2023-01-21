package Team03.tests.us26;

import Team03.utilities.Driver;
import Team03.utilities.TestBaseReports;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class case01  extends TestBaseReports {
    /*
  1-Kullanıcı URL gider.
  2-Kullanıcı "Grocery" tıklar
  3-Kullanıcı açılan sekmede books a tıklamalıdır
  4-Kullanıcı Top Manufacturers a kadar ekranı aşağıya kaydırır
  5-Slider ile manufactures da swipe yapabilmeli
  6-driverı kapatır
     */
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");

        WebElement Grocery = Driver.getDriver().findElement(By.xpath(" //span[@class=\"whitespace-nowrap\"]"));
        Grocery.click();

        WebElement Books = Driver.getDriver().findElement(By.xpath(" //a[@href='/books']"));
        Books.click();

        WebElement kaydir=Driver.getDriver().findElement(By.xpath("(//h3[@class=\"text-2xl lg:text-[27px] 3xl:text-3xl font-semibold\"])[3]"));

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();" ,kaydir);

        Thread.sleep(3000);

        WebElement scroll=Driver.getDriver().findElement(By.xpath("(//div[@class=\"author-slider-next w-8 h-8 flex items-center justify-center text-heading bg-light shadow-300 outline-none rounded-full absolute top-1/2 -mt-4 z-[5] cursor-pointer ltr:-right-3 rtl:-left-3 ltr:lg:-right-4 rtl:lg:-left-4 focus:outline-none transition-colors hover:text-orange-500\"])[2]"));
        scroll.click();
        Thread.sleep(3000);

        WebElement scroll1=Driver.getDriver().findElement(By.xpath("(//div[@class=\"author-slider-prev w-8 h-8 flex items-center justify-center text-heading bg-light shadow-300 outline-none rounded-full absolute top-1/2 -mt-4 z-[5] cursor-pointer ltr:-left-3 rtl:-right-3 ltr:lg:-left-4 rtl:lg:-right-4 focus:outline-none transition-colors hover:text-orange-500\"]) "));
        scroll1.click();
        Thread.sleep(3000);


      //  WebElement seeAll = Driver.getDriver().findElement(By.xpath(" //a[@href='/manufacturers']"));
      //  seeAll.click();


       // Thread.sleep(3000);



    }
}
