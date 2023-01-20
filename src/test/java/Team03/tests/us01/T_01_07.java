package Team03.tests.us01;

import Team03.pages.SellerPage;
import Team03.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T_01_07 {
    @Test
    public void task7() throws InterruptedException {

        Faker faker = new Faker();
        Actions actions = new Actions(Driver.getDriver());
        SellerPage sp = new SellerPage();

        //1-Kullanıcı URL gider.
        sp.goURL();

        //2-Kullanıcı seller olarak giriş yapar.
        sp.Login();

        //3-Kullanıcı categories bölümüne girer.
        sp.categories.click();

        //4-Kullanıcı Add Categories butonuna basar.
        sp.ctg_addCategories.click();

        //5-Kullanıcı gerekli bilgileri doldurur ve Categories oluşturur.
        String filepath = "C:\\Users\\tekin\\IdeaProjects\\ProjectTeam03\\src\\test\\java\\Team03\\resources\\Avatar-Free-PNG-Image.png";
        sp.ctg_img.sendKeys(filepath);
        sp.ctg_information.forEach(s -> actions
                .moveToElement(s)
                .click()
                .keyDown(Keys.CLEAR)
                .keyUp(Keys.CLEAR)
                .sendKeys("12")
                .perform());
        sp.ctg_selectyout.forEach(s -> actions
                .moveToElement(s)
                .click()
                .keyDown(Keys.ARROW_DOWN)
                .keyUp(Keys.ARROW_DOWN)
                .keyDown(Keys.ENTER)
                .keyUp(Keys.ENTER)
                .perform());


        //6-Kullanıcı oluşturduğu Categories'i doğrular.
        Assert.assertTrue(sp.ctg_success.isDisplayed());

        //7-Kullanıcı categories sekmesinde edit simgesine tıklayabilmeli
        actions.moveToElement(sp.ctg_edit).click().perform();
        //8-Kullanıcı gerekli bilgileri doldurur ve grubu editler.
        sp.ctg_img.sendKeys(filepath);
        sp.ctg_information.forEach(s -> actions
                .moveToElement(s)
                .click()
                .keyDown(Keys.CLEAR)
                .keyUp(Keys.CLEAR)
                .sendKeys("12")
                .perform());
        sp.ctg_selectyout.forEach(s -> actions
                .moveToElement(s)
                .click()
                .keyDown(Keys.ARROW_DOWN)
                .keyUp(Keys.ARROW_DOWN)
                .keyDown(Keys.ENTER)
                .keyUp(Keys.ENTER)
                .perform());
        actions.moveToElement(sp.ctg_update).click().perform();

        //9-Kullanıcı bilgilerin güncelliğini kontrol eder.
        Assert.assertTrue(sp.ctg_updated.isDisplayed());

        //10-Kullanıcı kategori bölümünden kategori silmek için butona tıklayabilmeli.
        Driver.getDriver().navigate().back();
        Thread.sleep(3000);
        sp.ctg_cop.click();
        sp.groups_delete.click();
        //11-Kullanıcı categorie'yi sildiğini doğrular.
        Assert.assertTrue(sp.ctg_deleted.isDisplayed());
        Driver.closeDriver();
    }
}
