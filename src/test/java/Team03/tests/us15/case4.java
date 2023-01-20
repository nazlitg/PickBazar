package Team03.tests.us15;

import Team03.pages.Bags;
import Team03.utilities.ConfigReader;
import Team03.utilities.Driver;
import org.testng.annotations.Test;

public class case4 {

    @Test
    public void detailTest() {
        //Kullanıcı url e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Bags bg = new Bags(Driver.getDriver());
        //Kullanıcı bilgilerini girerek siteye login olur
        bg.Login();
        //Kullanıcı bags kategorisini açar
        bg.SelectBags();
        //Kullanıcı istediği ürünü seçer
        //Detaylar bölümüne tıklar
        //Açılan pencerede ürün detaylarını görüntüler
        bg.setSeeDetailsControl();



    }
}
