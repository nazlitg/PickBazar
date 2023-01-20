package Team03.tests.us01;

import Team03.pages.SellerPage;
import Team03.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class T_01_10 {@Test
public void task10() throws InterruptedException {
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    SellerPage sp = new SellerPage();

    //1-Kullanıcı URL gider.
    sp.goURL();

    //2-Kullanıcı seller olarak giriş yapar.
    sp.Login();

    //3-Kullanıcı Authors bölümüne girer.
    actions.moveToElement(sp.authors).click().perform();

    //4-Kullanıcı Add Authors butonuna basar.
    actions.moveToElement(sp.Author_add).click().perform();

    //5-Kullanıcı gerekli bilgileri doldurur ve Authors oluşturur.
    actions.moveToElement(sp.author_add_social).click().perform();
    String filepath = "C:\\Users\\tekin\\IdeaProjects\\ProjectTeam03\\src\\test\\java\\Team03\\resources\\Avatar-Free-PNG-Image.png";
    sp.author_img.forEach(s -> s.sendKeys(filepath));
    sp.author_information.forEach(s -> actions
            .moveToElement(s)
            .click()
            .keyDown(Keys.CLEAR)
            .keyUp(Keys.CLEAR)
            .sendKeys("12")
            .perform());

    // actions.moveToElement(sp.author_select_platform)
    //         .pause(Duration.ofSeconds(1))
    //         .click()
    //         .keyDown(Keys.ARROW_DOWN)
    //         .keyUp(Keys.ARROW_DOWN)
    //         .keyDown(Keys.ENTER)
    //         .keyUp(Keys.ENTER)
    //         .perform();

    actions.moveToElement(sp.author_add_last).pause(Duration.ofSeconds(1)).click().perform();

    //6-Kullanıcı oluşturduğu Authors'ı doğrular
    Assert.assertTrue(sp.author_success.isDisplayed());

    //7-Kullanıcı Authors sekmesinde edit simgesine tıklayabilmeli
    actions.moveToElement(sp.author_edit).click().perform();

    //8-Kullanıcı gerekli bilgileri doldurur ve Authors'ı editler.
    sp.author_img.forEach(s -> s.sendKeys(filepath));
    sp.author_information.forEach(s -> actions
            .moveToElement(s)
            .click()
            .keyDown(Keys.CLEAR)
            .keyUp(Keys.CLEAR)
            .sendKeys("12")
            .perform());

    actions.moveToElement(sp.author_update_last).pause(Duration.ofSeconds(3)).click().perform();
    //9-Kullanıcı bilgilerin güncelliğini kontrol eder.
    Assert.assertTrue(sp.author_updated.isDisplayed());
    //10-Kullanıcı Authors bölümünden Authors silmek için butona tıklayabilmeli.
    Driver.getDriver().navigate().back();
    actions.moveToElement(sp.author_cop).click().perform();
    actions.moveToElement(sp.author_delete).click().perform();

    //11-Kullanıcı Authors'ı sildiğini doğrular.
    Assert.assertTrue(sp.author_updated.isDisplayed());
    //12-Kullanıcı approval action işlemi için butona tıklar.
    actions.moveToElement(sp.author_aproval_btn).click().perform();
    //13-Kullanıcı approval action işleminin gerçekleştiğini doğrular
    Assert.assertTrue(sp.author_aproval_chck.isDisplayed());
}
}
