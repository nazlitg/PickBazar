package Team03.tests.us14;

import Team03.pages.Bags;
import Team03.utilities.ConfigReader;
import Team03.utilities.Driver;
import org.testng.annotations.Test;

public class case1 {
    @Test
    public void searchTest() throws InterruptedException {
        Bags bg = new Bags(Driver.getDriver());

        //Kullanıcı url e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Kullanıcı bilgilerini girerek siteye login olur
        bg.Login();

        //Kullanıcı bags kategorisini açar
        bg.SelectBags();

        //Arama kutusuna aranmak istenen ürün yazılır
        bg.search();

        //Aranan ürün ile eşleşen ürünlerin isimlerinin aynı olduğu kontrol eilir
        bg.textControl();
    }
    }
