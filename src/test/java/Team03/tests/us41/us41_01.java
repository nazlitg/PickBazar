package Team03.tests.us41;



import Team03.pages.PickBazarFurniturePage;
import Team03.pages.PickBazarHomePage;
import Team03.utilities.ConfigReader;
import Team03.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class us41_01 {

        @Test
        public void test01() {
                // Kullanıcı URL e gider

                Driver.getDriver().get(ConfigReader.getProperty("url"));
                PickBazarHomePage hp = new PickBazarHomePage();
                PickBazarFurniturePage fp2 = new PickBazarFurniturePage();

                // kullanıcı login olur
                hp.join.click();

                hp.loginButton.click();

                // kullanıcı categories dropdown a tıklar
                hp.categoryDropDown.click();

                // kullanıcı "Furniture" category sini seçer
                fp2.FurnitureFilter.click();

                //  Kullanıcı çıkan ilk ürüne tıklar
                fp2.IlkUrun.click();

                // Kullanıcı favori butonuna tıklar
                fp2.FavoriButton.click();

                // kullanıcı ürünü My Wishlists e ekler
                fp2.WishList.click();

                // Kullanıcı ürünün My Wishlists de olduğunu doğrular
                WebElement wishlists = Driver.getDriver().findElement(By.xpath("(//div[@class='relative flex h-48 w-auto items-center justify-center sm:h-64'])[1]"));
                if (wishlists.isDisplayed()) {
                        System.out.println("ürün fovorilere eklenmiştir");
                } else {
                        System.out.println("ürün eklenemedi");

                }
        }
}
