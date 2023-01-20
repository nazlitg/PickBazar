package Team03.tests.us15;

import Team03.pages.Bags;
import Team03.utilities.ConfigReader;
import Team03.utilities.Driver;
import Team03.utilities.TestBaseReports;
import org.testng.annotations.Test;

public class case3 extends TestBaseReports {
    @Test
    public void addLimitedProduct() {
        //Kullanıcı url e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Bags bg = new Bags(Driver.getDriver());
        //Kullanıcı bilgilerini girerek siteye login olur
        bg.Login();
        //Kullanıcı bags kategorisini açar
        bg.SelectBags();
        //kullanıcı istediği ürünü seçer
        //stokta olmayan ürüne tıklar ve sepete ekler (bug)
        //stok taki ürün ve eklenen ürün sayısı eşit edğildir fail verir
        bg.outOfStockControl();

    }
}