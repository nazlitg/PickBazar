package Team03.tests.us25;

import Team03.utilities.Driver;
import Team03.utilities.TestBaseReports;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class case05 extends TestBaseReports {
    @Test(dataProvider = "keyData")
    public void tet05(String key){
        /*
        1-Kullanıcı URL gider.
        2-Kullanıcı "Grocery" tıklar
        3-Kullanıcı açılan sekmede "Books" a tıklamalıdır
        4-Yazarları görene kadar ekranı aşağıya kaydırır
        5-kullanıcı yazarları tıklar
        6-Kullanıcı sadece o yazara ait kitapların gelip gelmediğini kontrol eder
        7-driverı kapatır

         */
        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");

        WebElement Grocery = Driver.getDriver().findElement(By.xpath(" //span[@class=\"whitespace-nowrap\"]"));
        Grocery.click();

        WebElement Books = Driver.getDriver().findElement(By.xpath(" //a[@href='/books']"));
        Books.click();

        WebElement topArturs=Driver.getDriver().findElement(By.xpath("//h3[@class=\"text-2xl lg:text-[27px] 3xl:text-3xl font-semibold\"]"));

        Assert.assertTrue(topArturs.isEnabled());

        WebElement seeAll = Driver.getDriver().findElement(By.xpath(" //a[@href='/authors']"));
        seeAll.click();

        WebElement As=Driver.getDriver().findElement(By.xpath("//h1[@class=\"mb-4 text-2xl font-bold sm:text-3xl lg:text-4xl text-accent\"]"));

        Assert.assertTrue(As.isEnabled());

        WebElement searchBox=Driver.getDriver().findElement(By.xpath("//input[@class=\"search item-center flex h-full w-full appearance-none overflow-hidden truncate rounded-lg text-sm text-heading placeholder-gray-500 transition duration-300 ease-in-out focus:outline-none focus:ring-0 search-minimal bg-gray-100 ltr:pl-10 rtl:pr-10 ltr:pr-4 rtl:pl-4 ltr:md:pl-14 rtl:md:pr-14 border border-transparent focus:border-accent focus:bg-light\"]"));
        searchBox.click();
        searchBox.sendKeys(key+ Keys.ENTER);

        WebElement picture=Driver.getDriver().findElement(By.xpath("//img[@alt=\"James N. Almeida\"]"));
        picture.click();

        WebElement topArtur=Driver.getDriver().findElement(By.xpath("//h2[@class=\"mb-8 text-2xl font-semibold tracking-tight text-heading lg:text-3xl\"]"));

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();" ,topArtur);

        List<WebElement> yazarlar=Driver.getDriver().findElements(By.xpath("//span[@class=\"text-xs text-gray-400 md:text-sm\"]"));

        for (WebElement w:yazarlar){
            Assert.assertTrue(w.getText().toLowerCase().contains("almeida"));
            }


    }



    @DataProvider
    public Object[][] keyData(){
        return new Object[][]{
                {"JAMES N. ALMEIDA"} //, {"EARNESTINE N. PACE"},
                //{"BRANDON T. TRIGG"}, {"JIMMY P BULLARD"},
                //{"KELTON BENJAMIN"}, {"SHARONE C STONE"},
                //{"JENIFER WICKHAM"},{"KELLY WHITE"},
                //{"DORIAN P PRICE"},{"JAKOB DILLON"},{"KAITY LERRY"}
        };
    }
}
