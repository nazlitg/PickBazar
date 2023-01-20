package Team03.tests.us01;

import Team03.pages.SellerPage;
import Team03.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T_01_06 {
    @Test
    public void task6() throws InterruptedException {

        //1-Kullanıcı URL gider.
        Faker faker = new Faker();
        Actions actions = new Actions(Driver.getDriver());
        SellerPage sp = new SellerPage();

        //1-Kullanıcı URL gider.
        sp.goURL();

        //2-Kullanıcı seller olarak giriş yapar.
        sp.Login();

        //3-Kullanıcı Groups kategorisini açar.
        sp.show_shops.click();
        sp.WaitUntil(sp.dashboard);
        sp.dashboard.click();
        sp.WaitUntil(sp.products);
        sp.groups.click();

        //4-Kullanıcı grup eklemek için butona basar.
        sp.groups_add_group.click();
        //5-Kullanıcı gerekli bilgileri doldurur ve grubu oluşturur.
        String filepath = "C:\\Users\\tekin\\IdeaProjects\\ProjectTeam03\\src\\test\\java\\Team03\\resources\\Avatar-Free-PNG-Image.png";
        Thread.sleep(5000);
        actions.moveToElement(sp.groups_addBanner).click().perform();
        sp.groups_SelectLoyout.forEach(s -> actions.moveToElement(s).click().perform());
        sp.groups_SelectCard.forEach(s -> actions.moveToElement(s).click().perform());
        sp.groups_img.sendKeys(filepath);
        sp.groups_information.forEach(s -> actions
                .moveToElement(s)
                .click()
                .keyDown(Keys.CLEAR)
                .keyUp(Keys.CLEAR)
                .sendKeys("12")
                .perform());
        sp.groups_addGroup_last.click();

        //6-Kullanıcı oluşturduğu grubu doğrular.
        Assert.assertTrue(sp.groups_success.isDisplayed());

        //7-Kullanıcı group sekmesinde edit simgesine tıklayabilmeli
        sp.groups_edit.click();
        //8-Kullanıcı grekli bilgileri doldurur ve grubu editler.
        sp.groups_SelectLoyout.forEach(s -> actions.moveToElement(s).click().perform());
        sp.groups_SelectCard.forEach(s -> actions.moveToElement(s).click().perform());
        sp.groups_img.sendKeys(filepath);
        sp.groups_information.forEach(s -> actions
                .moveToElement(s)
                .click()
                .keyDown(Keys.CLEAR)
                .keyUp(Keys.CLEAR)
                .sendKeys("12")
                .perform());

        actions.moveToElement(sp.groups_update).click().perform();

        //9-Kullanıcı bilgilerin güncelliğini kontrol eder.

        Assert.assertTrue(sp.groups_updated.isDisplayed());
        //10-Kullanıcı groups kategorisinde group silmek için butona tıklayabilmeli.
        Driver.getDriver().navigate().back();
        sp.groups_cop.click();
        sp.WaitUntil(sp.groups_delete);
        sp.groups_delete.click();
        //11-Kullanıcı group'u sildiğini doğrular.
        Assert.assertFalse(sp.groups_delete.isDisplayed());

        Driver.closeDriver();
    }
}
