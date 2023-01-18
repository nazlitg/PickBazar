package Team03.tests.us01;

import Team03.pages.SellerPage;

import Team03.utilities.Driver;
import Team03.utilities.ReusableMethods;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.nio.file.Paths;


public class SellerPage_Tests {

    @Test
    public void task1() {
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();
        SellerPage sp = new SellerPage();

        //1-Kullanıcı url'ye gider.
        sp.goURL();

        //2-Kullanıcı Become a Seller buttonuna tıklar.
        sp.Become_Seller.click();
        Driver.getDriver().switchTo().window((String) Driver.getDriver().getWindowHandles().toArray()[1]);

        //3-Kullanıcı name , e-mail, password belirler.
        String e_mail = faker.name().firstName();
        ReusableMethods.dataSend(sp.seller_name, "123");
        sp.seller_email.click();
        ReusableMethods.dataSend(sp.seller_email, e_mail + "@gmail.com");
        sp.seller_password.click();
        ReusableMethods.dataSend(sp.seller_password, "123");

        //4-Kullanıcı şifreyi gizli ya da açık görebilir.
        sp.password_show.click();
        ReusableMethods.gorunuyorMU(sp.password_show);

        //5-Kullanıcı kayıt olma işlemini gerçekleştirdiği doğrulanır
        sp.seller_register.click();
        ReusableMethods.gorunuyorMU(sp.seller_register);

        Driver.closeDriver();
    }

    @Test
    public void task2() throws InterruptedException {
        SellerPage sp = new SellerPage();
        //1-Kulanıcı URL gider.
        sp.goURL();
        //2-Kullanıcı Become a Seller buttonuna tıklar.
        //3-Kullanıcı Login linkine gider
        //4-Kullanıcı e-mail ve password bilgilerini girer
        sp.Login();
        //5-Kullanıcı Login olduğunu doğrular.
        sp.check_enable.click();
        ReusableMethods.gorunuyorMU(sp.check_enable);

        Driver.closeDriver();
    }

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
        Assert.assertTrue(sp.show_shops.getText().contains("123"));

        Driver.closeDriver();
    }

    @Test
    public void task4() throws InterruptedException {

        Faker faker = new Faker();
        Actions actions = new Actions(Driver.getDriver());
        SellerPage sp = new SellerPage();

        //1-Kullanıcı URL gider.
        sp.goURL();

        //2-Kullanıcı seller olarak giriş yapar.
        sp.Login();

        //3-Kullanıcı product sekmesini açar(sağda dashboardda).
        sp.show_shops.click();
        sp.WaitUntil(sp.dashboard);
        sp.dashboard.click();
        sp.WaitUntil(sp.products);
        sp.products.click();


        //4-Kullanıcı 'Doğal Kozalak Reçeli ' keyword'ünü arar ve istenilen sonucu doğrular.
        sp.WaitUntil(sp.products_search);
        sp.products_search.click();
        sp.products_search.sendKeys("Doğal Kozalak Reçeli" + Keys.ENTER);

    }

}
