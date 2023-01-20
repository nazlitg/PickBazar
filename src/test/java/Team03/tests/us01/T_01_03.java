package Team03.tests.us01;

import Team03.pages.SellerPage;
import Team03.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class T_01_03 {
    @Test
    public void task3() throws InterruptedException {

        Faker faker = new Faker();
        Actions actions = new Actions(Driver.getDriver());
        SellerPage sp = new SellerPage();

        //1-Kullanıcı URL gider.
        sp.goURL();

        //2-Kullanıcı seller olarak giriş yapar.
        sp.Login();

        //3-Kullanıcı create shop ile mağaza oluşturma adımına başlayabilmeli.(Sağ üstte).
        sp.create_shop.click();

        //4-Kullanıcı istenilen belgeleri yüklemeli bilgileri girmeli ve kaydetmeli.
        String filepath = "C:\\Users\\tekin\\IdeaProjects\\ProjectTeam03\\src\\test\\java\\Team03\\resources\\Avatar-Free-PNG-Image.png";
        sp.set_img.forEach(s -> s.sendKeys(filepath));
        sp.set_information.forEach(s -> actions.moveToElement(s).click().sendKeys("123").perform());
        actions.moveToElement(sp.add_holder_email).click().sendKeys(faker.name().firstName() + "@gmail.com");
        sp.Add_Social_Profil.click();
        sp.Save_Profil.click();

        //5-Kullanıcı dashboard'tan My shops 'a girebilmeli ve oluşturduğu mağazayı görmeli
        //Assert.assertTrue(sp.show_shops.getText().contains("123"));

        //main//a

        List<WebElement> store = Driver.getDriver().findElements(By.xpath("//main//a"));

        boolean check = false;
        for (int i = 0; i < store.size() - 1; i++) {
            actions.moveToElement(store.get(i));
            if (store.get(i).getText().contains("123")){
                check=true;
                break;

            }
            else check=false;
            System.out.println(check);
        }
        Assert.assertTrue(check);
        Driver.closeDriver();
    }
}
