package Team03.tests.us41;

import Team03.pages.PickBazarFurniturePage;
import Team03.utilities.ConfigReader;
import Team03.utilities.Driver;
import org.testng.annotations.Test;

public class us41_03 {


    @Test
    public void test03() {

        //01- Kullanıcı URL "https://shop-pickbazar-rest.vercel.app/"  ye gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        PickBazarFurniturePage fp1 = new PickBazarFurniturePage();

        //02- Kategorilerin bulunduğu dropdown a tıklar
        fp1.Dropdown.click();

        //03- Kategorilerden "Furniture" a tıklar
        fp1.Furniture.click();


    }

}
