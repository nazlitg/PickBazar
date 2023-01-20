package Team03.tests.us15;

import Team03.pages.Bags;
import Team03.utilities.ConfigReader;
import Team03.utilities.Driver;
import org.testng.annotations.Test;

public class case7 {

@Test
    public void fiyat(){
    //Kullanıcı url e gider
    Driver.getDriver().get(ConfigReader.getProperty("url"));
    Bags bg =new Bags(Driver.getDriver());
    //Kullanıcı bilgilerini girerek siteye login olur
    bg.Login();
    //Kullanıcı bags kategorisini açar
    bg.SelectBags();
    //Kullanıcı ürünü secer
    //Açılan panoda eski fiyat,indirim oranı ve güncel fiyat görüntülenir
    bg.indirimKontrol();

}

}
