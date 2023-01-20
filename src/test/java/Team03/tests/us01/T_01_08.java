package Team03.tests.us01;

import Team03.pages.SellerPage;
import Team03.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class T_01_08 { @Test
public void task8() throws InterruptedException {
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    SellerPage sp = new SellerPage();

    //1-Kullanıcı URL gider.
    sp.goURL();

    //2-Kullanıcı seller olarak giriş yapar.
    sp.Login();

    //  3-Kullanıcı tag bölümüne girer.
    sp.tag.click();
    //  4-Kullanıcı Add Tag butonuna basar.
    actions.moveToElement(sp.tag_addCategories).click().perform();
    //  5-Kullanıcı gerekli bilgileri doldurur ve Tag oluşturur.
    String filepath = "C:\\Users\\tekin\\IdeaProjects\\ProjectTeam03\\src\\test\\java\\Team03\\resources\\Avatar-Free-PNG-Image.png";
    sp.tag_img.sendKeys(filepath);
    sp.tag_information.forEach(s -> actions
            .moveToElement(s)
            .click()
            .keyDown(Keys.CLEAR)
            .keyUp(Keys.CLEAR)
            .sendKeys("12")
            .perform());
    sp.tag_select.forEach(s -> actions
            .moveToElement(s)
            .click()
            .keyDown(Keys.ARROW_DOWN)
            .keyUp(Keys.ARROW_DOWN)
            .keyDown(Keys.ENTER)
            .keyUp(Keys.ENTER)
            .pause(Duration.ofSeconds(2))
            .perform());
    actions.moveToElement(sp.tag_addTag).click().perform();
    //  6-Kullanıcı oluşturduğu Tag'ı doğrular.
    Assert.assertTrue(sp.tag_success.isDisplayed());
    //  7-Kullanıcı Tag sekmesinde edit simgesine tıklayabilmeli
    actions.moveToElement(sp.tag_edit).click().perform();
    //  8-Kullanıcı gerekli bilgileri doldurur ve Tag'ı editler
    sp.tag_img.sendKeys(filepath);
    sp.tag_information.forEach(s -> actions
            .moveToElement(s)
            .click()
            .keyDown(Keys.CLEAR)
            .keyUp(Keys.CLEAR)
            .sendKeys("12")
            .perform());
    sp.tag_select.forEach(s -> actions
            .moveToElement(s)
            .click()
            .keyDown(Keys.ARROW_DOWN)
            .keyUp(Keys.ARROW_DOWN)
            .keyDown(Keys.ENTER)
            .keyUp(Keys.ENTER)
            .perform());
    actions.moveToElement(sp.tag_updateTag).click().perform();
    //  9-Kullanıcı bilgilerin güncelliğini kontrol eder.
    Assert.assertTrue(sp.tag_updated.isDisplayed());
    //  10-Kullanıcı Tag bölümünden Tag silmek için butona tıklayabilmeli.
    Driver.getDriver().navigate().back();
    actions.moveToElement(sp.tag_cop).click().perform();
    actions.moveToElement(sp.tag_delete).click().perform();
    //  11-Kullanıcı Tag'ı sildiğini doğrular.
    Assert.assertFalse(sp.tag_deleted.isDisplayed());

}
}
