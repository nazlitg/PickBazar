package Team03.tests.us01;

import Team03.pages.SellerPage;
import Team03.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class T_01_09 {@Test
public void task9() throws InterruptedException {
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    SellerPage sp = new SellerPage();

    //1-Kullanıcı URL gider.
    sp.goURL();

    //2-Kullanıcı seller olarak giriş yapar.
    sp.Login();

    //3-Kullanıcı Manufacturers/Publications bölümüne girer.
    actions.moveToElement(sp.man_au).click().perform();

    //4-Kullanıcı Add Manufacturers/Publications butonuna basar.
    actions.moveToElement(sp.m_add_mp).click().perform();
    //5-Kullanıcı gerekli bilgileri doldurur ve Manufacturers/Publications oluşturur.
    actions.moveToElement(sp.m_social_add).click().perform();
    String filepath = "C:\\Users\\tekin\\IdeaProjects\\ProjectTeam03\\src\\test\\java\\Team03\\resources\\Avatar-Free-PNG-Image.png";
    sp.m_img.forEach(s -> s.sendKeys(filepath));
    sp.m_information.forEach(s -> actions
            .moveToElement(s)
            .click()
            .keyDown(Keys.CLEAR)
            .keyUp(Keys.CLEAR)
            .sendKeys("12")
            .perform());

    sp.m_select_group.forEach(s -> actions
            .moveToElement(s)
            .click()
            .click()
            .pause(Duration.ofSeconds(2))
            .keyDown(Keys.ARROW_DOWN)
            .keyUp(Keys.ARROW_DOWN)
            .keyDown(Keys.ENTER)
            .keyUp(Keys.ENTER)
            .perform());
    actions.moveToElement(sp.m_add_mp_last).click().perform();

    //6-Kullanıcı oluşturduğu Manufacturers/Publications'ı doğrular.
    Assert.assertTrue(sp.m_success.isDisplayed());

    //7-Kullanıcı Manufacturers/Publications sekmesinde edit simgesine tıklayabilmeli
    actions.moveToElement(sp.m_edit).click().perform();

    //8-Kullanıcı gerekli bilgileri doldurur ve Manufacturers/Publications'ı editler.
    sp.m_img.forEach(s -> s.sendKeys(filepath));
    sp.m_information.forEach(s -> actions
            .moveToElement(s)
            .click()
            .keyDown(Keys.CLEAR)
            .keyUp(Keys.CLEAR)
            .sendKeys("12")
            .perform());

    sp.m_select_group.forEach(s -> actions
            .moveToElement(s)
            .click()
            .pause(Duration.ofSeconds(2))
            .keyDown(Keys.ARROW_DOWN)
            .keyUp(Keys.ARROW_DOWN)
            .keyDown(Keys.ENTER)
            .keyUp(Keys.ENTER)
            .perform());
    actions.moveToElement(sp.m_add_mp_update).pause(Duration.ofSeconds(3)).click().perform();
    //9-Kullanıcı bilgilerin güncelliğini kontrol eder.
    Assert.assertTrue(sp.m_updated.isDisplayed());
    //10-Kullanıcı Manufacturers/Publications bölümünden Manufacturers/Publications silmek için butona tıklayabilmeli.
    Driver.getDriver().navigate().back();
    actions.moveToElement(sp.m_cop).click().perform();
    actions.moveToElement(sp.m_delete).click().perform();

    //11-Kullanıcı  Manufacturers/Publications'ı sildiğini doğrular.
    Assert.assertTrue(sp.m_updated.isDisplayed());
    //12-Kullanıcı approval action işlemi için butona tıklar.
    actions.moveToElement(sp.m_aproval_btn).click().perform();
    //13-Kullanıcı approval action işleminin gerçekleştiğini doğrular
    Assert.assertTrue(sp.m_aproval_chck.isDisplayed());
}

}
