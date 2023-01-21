package Team03.tests.us25;

import Team03.utilities.Driver;
import Team03.utilities.TestBaseReports;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class case04 extends TestBaseReports {
    @Test(dataProvider = "keyData")
    public void tet04(String key){
        /*
        1-Kullanıcı URL gider.
        2-Kullanıcı "Grocery" tıklar
        3-Kullanıcı açılan sekmede "Books" a tıklamalıdır
        4-Yazarları görene kadar ekranı aşağıya kaydırır
        5- "See All" a tıklar
        6-yazarlar arasında rama yapar
        7 arama yapıldığını kontrol eder
        8-driverı kapatır

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
        Assert.assertTrue(searchBox.isEnabled());
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
