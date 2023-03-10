package Team03.tests.us15;

import Team03.pages.Bags;
import Team03.utilities.ConfigReader;
import Team03.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class case1 {

    @Test
    public void favorite() throws InterruptedException {
        //Kullanıcı url e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Bags bg = new Bags(Driver.getDriver());
        //Kullanıcı bilgilerini girerek siteye login olur
        bg.Login();
        //Kullanıcı bags kategorisini açar
        bg.SelectBags();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //Kullanıcı ürünü seçer
        //Ürün detaylarına tıkalr
        //favorilere alır
        //profilinden favori listesine gider ve ürünü görüntüler
        bg.control();

        actions.keyDown(Keys.ESCAPE).perform();

    }
}
