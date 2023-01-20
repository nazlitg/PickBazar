package Team03.tests.us17;

import Team03.pages.Bags;
import Team03.utilities.ConfigReader;
import Team03.utilities.Driver;
import org.testng.annotations.Test;

public class case1 {

    @Test
    public void addBox(){

        //Kullanıcı url e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Bags bg = new Bags(Driver.getDriver());
        //Kullanıcı bilgilerini girerek siteye login olur
        bg.Login();
        //Kullanıcı bags kategorisini açar
        bg.SelectBags();
        //Kullanıcı ürünü seçer
        //sepete gider
        //sepette seçtiği ürünü görüntüler
        bg.sepeteEkle();

    }

}
