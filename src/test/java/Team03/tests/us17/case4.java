package Team03.tests.us17;

import Team03.pages.Bags;
import Team03.utilities.ConfigReader;
import Team03.utilities.Driver;
import org.testng.annotations.Test;

public class case4 {

    @Test
    public void test(){

        Bags bg = new Bags(Driver.getDriver());
        //Kullanıcı url e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        //Kullanıcı bilgilerini girerek siteye login olur
        bg.Login();
        //Kullanıcı bags kategorisini açar
        bg.SelectBags();
        //Kullanıcı istediği ürünü seçer
        //Sepete gider
        //Sepette ürün birim fiyatını ve toplam fiyatı görüntüler
        bg.sepetteUruniyatToplamFiyat();

    }
}
