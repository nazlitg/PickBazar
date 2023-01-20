package Team03.tests.us16;

import Team03.pages.Bags;
import Team03.utilities.ConfigReader;
import Team03.utilities.Driver;
import org.testng.annotations.Test;

public class case1 {

    @Test
    public void addProduct() {
        Bags bg = new Bags(Driver.getDriver());
        //Kullanıcı url e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        //Kullanıcı bilgilerini girerek siteye login olur
        bg.Login();
        //Kullanıcı bags kategorisini açar
        bg.SelectBags();
        //Kullanıcı istediği ürünü seçer
        //Açılan ürün sayfasında arttırma azaltma yapabilir
        bg.sayfadaArtAzlt();


    }
}
