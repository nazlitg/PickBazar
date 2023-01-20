package Team03.tests.us01;

import Team03.pages.SellerPage;
import Team03.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class T_01_13 {
    @Test
    public void task13() throws InterruptedException {

        Faker faker = new Faker();
        Actions actions = new Actions(Driver.getDriver());
        SellerPage sp = new SellerPage();

        //1-Kullanıcı URL gider.
        sp.goURL();

        //2-Kullanıcı seller olarak giriş yapar.
        sp.Login();


        //3-Kullanıcı Users bölümüne girer.
        actions.moveToElement(sp.user).click().perform();
        //4-Kullanıcı Add Customer butonuna basar
        actions.moveToElement(sp.costumer_add_costumer).click().perform();
        //5-Kullanıcı gerekli bilgileri ekleyebilmelidir ve create customer butonuyla onaylayabilmeli
        sp.costumer_information.forEach(s -> actions
                .moveToElement(s)
                .click()
                .keyDown(Keys.CLEAR)
                .keyUp(Keys.CLEAR)
                .sendKeys("123")
                .perform());
        sp.WaitUntil(sp.costumer_email);
        actions.moveToElement(sp.costumer_email).click()
                .keyDown(Keys.CLEAR)
                .keyUp(Keys.CLEAR)
                .sendKeys(faker.name().firstName() + "@gmail.com").pause(Duration.ofSeconds(2)).perform();
        sp.costumer_last.click();
        //6- Kullanıcı oluşturuduğu kullanıcıyı Users bölümünden check eder.
        Driver.getDriver().navigate().back();
        Thread.sleep(3000);
        Assert.assertTrue(sp.costumer_name.getText().contains("123"));
    }
}
