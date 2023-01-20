package Team03.tests.us01;

import Team03.pages.SellerPage;
import Team03.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T_01_15 { @Test
public void task15() throws InterruptedException {
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    SellerPage sp = new SellerPage();

    //1-Kullanıcı URL gider.
    sp.goURL();

    //2-Kullanıcı seller olarak giriş yapar.
    sp.Login();

    //3-Kullanıcı Coupons bölümüne girer.
    sp.coupons.click();
    //4-Kullanıcı Add Coupon butonuna tıklar
    sp.coupons_add_coupon.click();
    //5-Kullanıcı gerekli bilgileri girebilmelidir.
    String filepath = "C:\\Users\\tekin\\IdeaProjects\\ProjectTeam03\\src\\test\\java\\Team03\\resources\\Avatar-Free-PNG-Image.png";
    sp.coupons_img.sendKeys(filepath);
    sp.coupons_information.forEach(s -> actions.moveToElement(s).click().sendKeys("123").perform());
    actions.moveToElement(sp.coupons_add_coupon_last).click().perform();
    //6-Kullanıcı kupon oluşturma işlemini tamaladığında Coupons bölümünde görünürlüğünü doğrular
    Assert.assertTrue(sp.coupons_success.isDisplayed());
    //7-Kullanıcı kupon kodu ile arama yaptığında kuponu görüntüleyebilmeli.
    actions.moveToElement(sp.coupons_search).click().sendKeys("123").perform();
    Assert.assertTrue(sp.coupons_name.getText().contains("123"));
    //8-Kullanıcı Actions bölümünden kalem simgesinine tıklar
    Driver.getDriver().navigate().back();
    sp.coupons_edit.click();
    //9-Kullanıcı herbir bilgi için güncelleme yapabilmeli
    sp.coupons_img.sendKeys(filepath);
    sp.coupons_information.forEach(s -> actions.moveToElement(s).click().sendKeys("123").perform());
    actions.moveToElement(sp.coupons_update_c).perform();
    //10-Kullanıcı yaptığı güncellemelerin güncelliğini kontrol eder.
    Assert.assertTrue(sp.tax_update.isDisplayed());
    //11-Kullanıcı Actions bölümünden çöpkutusu simgesinine tıklar
    Driver.getDriver().navigate().back();
    sp.coupons_cop.click();
    //12-Kullanıcı işlemi reddeder.Değişiklik olmadığını doğrular
    sp.coupons_cancel.click();
    Assert.assertFalse(sp.coupons_d_m.isDisplayed());
    //13-Kullanıcı işlemi onaylar ve kuponun silindiğini onaylar.
    sp.coupons_delete.click();
    Assert.assertTrue(sp.coupons_d_m.isDisplayed());

}
}
