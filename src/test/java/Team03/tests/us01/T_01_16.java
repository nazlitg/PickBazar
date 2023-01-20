package Team03.tests.us01;

import Team03.pages.SellerPage;
import Team03.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T_01_16 { @Test
public void task16() throws InterruptedException {

    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    SellerPage sp = new SellerPage();

    //1-Kullanıcı URL gider.
    sp.goURL();

    //2-Kullanıcı seller olarak giriş yapar.
    sp.Login();

    //3-Kullanıcı Taxes bölümüne girer.
    sp.taxes.click();
    //4-Kullanıcı Add Tax butonuna tıklar
    sp.coupons_add_tax.click();
    //5-Kullanıcı gerekli bilgileri girebilmelidir.
    sp.tax_information.forEach(s -> actions.moveToElement(s).click().sendKeys("123").perform());
    actions.moveToElement(sp.tax_add_coupon_last).click().perform();
    //6-Kullanıcı Tax oluşturma işlemini tamaladığında Tax bölümünde görünürlüğünü doğrular
    Assert.assertTrue(sp.coupons_success.isDisplayed());
    //7-Kullanıcı Tax kodu ile arama yaptığında kuponu görüntüleyebilmeli.
    actions.moveToElement(sp.coupons_search).click().sendKeys("123").perform();
    Assert.assertTrue(sp.coupons_name.getText().contains("123"));
    //8-Kullanıcı Actions bölümünden kalem simgesinine tıklar
    sp.coupons_edit.click();
    //9-Kullanıcı herbir bilgi için güncelleme yapabilmeli
    sp.tax_information.forEach(s -> actions.moveToElement(s).click().sendKeys("123").perform());
    sp.WaitUntil(sp.tax_update_c);
    sp.tax_update_c.click();
    //10-Kullanıcı yaptığı güncellemelerin güncelliğini kontrol eder.
    Thread.sleep(3000);
    Assert.assertTrue(sp.tax_update.isDisplayed());
    //11-Kullanıcı Actions bölümünden çöpkutusu simgesinine tıklar
    Driver.getDriver().navigate().back();
    sp.coupons_cop.click();
    //12-Kullanıcı işlemi reddeder.Değişiklik olmadığını doğrular
    sp.coupons_cancel.click();
    Thread.sleep(3000);
    sp.coupons_cop.click();
    //13-Kullanıcı işlemi onaylar ve Tax'ın silindiğini onaylar.
    sp.coupons_delete.click();
    Thread.sleep(3000);
    Assert.assertTrue(sp.coupons_d_m.isDisplayed());


}
}
