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
import java.util.List;

public class case03 extends TestBaseReports {
    @Test
    public void tet03(){
     /*
     1-Kullanıcı URL gider.
     2-Kullanıcı "Grocery" tıklar
     3-Kullanıcı açılan sekmede "Books" a tıklamalıdır
     4-Yazarları görene kadar ekranı aşağıya kaydırır
     5- "See All" a tıklar
     6-bütün yazarların göründüğünü kontrol eder
     7-driverı kapatır

      */
        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

        WebElement Grocery = Driver.getDriver().findElement(By.xpath(" //span[@class=\"whitespace-nowrap\"]"));
        Grocery.click();

        WebElement Books = Driver.getDriver().findElement(By.xpath(" //a[@href='/books']"));
        Books.click();

        //WebElement topArturs=Driver.getDriver().findElement(By.xpath("(//a[@class=\"text-base font-semibold justify-end transition-colors hover:text-orange-500\"])[1]"));
        WebElement topArturs=Driver.getDriver().findElement(By.xpath("//div[@class=\"mt-8 flex justify-center lg:mt-12\"]"));

        Assert.assertTrue(topArturs.isEnabled());

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();" ,topArturs);

        WebElement seeAll = Driver.getDriver().findElement(By.xpath(" //a[@href='/authors']"));
        seeAll.click();

        WebElement As=Driver.getDriver().findElement(By.xpath("//h1[@class=\"mb-4 text-2xl font-bold sm:text-3xl lg:text-4xl text-accent\"]"));

        Assert.assertTrue(As.isEnabled());

        List<WebElement> yazarlar=Driver.getDriver().findElements(By.xpath("//span[@class='block text-center font-semibold text-heading transition-colors group-hover:text-orange-500']"));
        int sayac=0;
        for (WebElement w:yazarlar){
            if (w.isDisplayed()){
                sayac++;
            }
        }

        Assert.assertTrue(sayac==11);


    }
}
