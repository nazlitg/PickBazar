package Team03.tests.us01;

import Team03.pages.SellerPage;
import Team03.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T_01_17 {
    @Test
    public void task17() throws InterruptedException {
        Faker faker = new Faker();
        Actions actions = new Actions(Driver.getDriver());
        SellerPage sp = new SellerPage();

        //1-Kullanıcı URL gider.
        sp.goURL();

        //2-Kullanıcı seller olarak giriş yapar.
        sp.Login();

        //3-Kullanıcı Shipping bölümüne girer.
        sp.shipping.click();

        //4-Kullanıcı Add Shipping butonuna tıklar
        sp.shp_add.click();
        //5-Kullanıcı gerekli bilgileri girebilmelidir.
        sp.shp_information.forEach(s -> actions.moveToElement(s).click().sendKeys("123").perform());
        //6-Kullanıcı Type'ı Free , Fixed, Percentage seçebilmeli
        sp.shp_type.forEach(s -> actions
                .moveToElement(s)
                .click()
                .perform());
        sp.shp_add2.click();


        //7-Kullanıcı ürünü eklediğinde bilgilerin doğruluğunu kontrol eder.
        Assert.assertTrue(sp.coupons_success.isDisplayed());
        //8-Kullanıcı Shipping name ile arama yaptığında Shipping'i görüntüleyebilmeli.
        sp.products_search.sendKeys("123" + Keys.ENTER);
        Assert.assertTrue(sp.shp_check.getText().contains("123"));


    }
}
