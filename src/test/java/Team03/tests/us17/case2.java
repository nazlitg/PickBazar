package Team03.tests.us17;

import Team03.pages.Bags;
import Team03.utilities.ConfigReader;
import Team03.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class case2 {

    @Test
    public void test(){

        Actions actions = new Actions(Driver.getDriver());

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Bags bg = new Bags(Driver.getDriver());
        bg.Login();
        bg.SelectBags();
        bg.urunStokKadarEkleme();



    }
}
