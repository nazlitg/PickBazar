package Team03.tests.us16;

import Team03.pages.Bags;
import Team03.utilities.ConfigReader;
import Team03.utilities.Driver;
import org.testng.annotations.Test;

public class case2 {

    @Test
    public void boxTest() throws InterruptedException {
        Bags bg = new Bags(Driver.getDriver());
        //Kullanıcı url e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        //Kullanıcı bilgilerini girerek siteye login olur
        bg.Login();
        //Kullanıcı bags kategorisini açar
        bg.SelectBags();
        //Kullanıcı ürünü seçer
        //Sepete gider
        //Sepette arttırır ve azaltır
        bg.sepetteArtAzlt();

    }
}
