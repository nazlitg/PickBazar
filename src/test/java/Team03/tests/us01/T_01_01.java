package Team03.tests.us01;

import Team03.pages.SellerPage;
import Team03.utilities.Driver;
import Team03.utilities.ReusableMethods;
import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T_01_01 {
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
}
