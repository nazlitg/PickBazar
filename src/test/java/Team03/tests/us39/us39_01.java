package Team03.tests.us39;

import Team03.pages.PickBazarFurniturePage;
import Team03.utilities.ConfigReader;
import Team03.utilities.Driver;
import org.testng.annotations.Test;

public class us39_01 {


    @Test
    public void test01(){

        //01- Kullanıcı URL "https://shop-pickbazar-rest.vercel.app/"  ye gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        PickBazarFurniturePage fp1 = new PickBazarFurniturePage();

        //02- Kategorilerin bulunduğu dropdown a tıklar
        fp1.Dropdown.click();

        //03- Kategorilerden "Furniture" a tıklar
        fp1.Furniture.click();

        //04- kullanıcı arama çubuğuna "bed" yazarak arama yapar
        fp1.FurnitureSearchBox.click();
        fp1.FurnitureSearchBox.sendKeys("Bed");
        fp1.FurnitureSearchBox.click();

        //05-kullanıcı çıkan tüm sonuçlarda "bed" kelimesinin olduğunu doğrular




    }
}
