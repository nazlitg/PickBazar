package Team03.tests.us01;

import Team03.pages.SellerPage;
import Team03.utilities.ConfigReader;
import Team03.utilities.Driver;
import Team03.utilities.ReusableMethods;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

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
        ReusableMethods.dataSend(sp.seller_name,"123");
        sp.seller_email.click();
        ReusableMethods.dataSend(sp.seller_email,e_mail + "@gmail.com");
        sp.seller_password.click();
        ReusableMethods.dataSend(sp.seller_password,"123");

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
        sp.Become_Seller.click();
        Driver.getDriver().switchTo().window((String) Driver.getDriver().getWindowHandles().toArray()[1]);

        //3-Kullanıcı Login linkine gider
        sp.Login_Seller. click();
        Thread.sleep(100);

        //4-Kullanıcı e-mail ve password bilgilerini girer.
        sp.seller_email.click();
        Thread.sleep(500);
        sp.seller_email.clear();
        ReusableMethods.dataSend(sp.seller_email,"testngprojectteam03@gmail.com");
        sp.seller_password.click();
        sp.seller_password.clear();
        Thread.sleep(1000);
        ReusableMethods.dataSend(sp.seller_password,"Projeteam03-2022" +Keys.ENTER);

        //5-Kullanıcı Login olduğunu doğrular.
        sp.check_enable.click();
        ReusableMethods.gorunuyorMU(sp.check_enable);

        Driver.closeDriver();
    }

    @Test
    public void task3(){
        SellerPage sp = new SellerPage();


    }

}
