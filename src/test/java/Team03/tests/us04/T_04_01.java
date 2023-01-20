package Team03.tests.us04;

import Team03.pages.SellerPage;
import Team03.utilities.Driver;
import Team03.utilities.ReusableMethods;
import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class T_04_01 {
    @Test
    public void task1() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();
        SellerPage sp = new SellerPage();

        //1-Kullanıcı url'ye gider.
        sp.goURL();
        //2-Kullanıcı müşteri olarak giriş yapar.
        sp.Login2();
        //3-Kullanıcı Offer Sekmesine girer.
        sp.WaitUntil(sp.offer_buton);
        sp.offer_buton.click();
        //4-Kullanıcı Offer bilgilerini görebilmelidir.
        Assert.assertTrue(sp.coupon_card_1.isDisplayed());
        //5-Kullanıcı herbir offer altındaki copy linkini kullanabilmelidir.
        ArrayList<String> a = (ArrayList<String>) sp.coupon_kayit();
        System.out.println(a.toString());
        sp.coupuncard();
        //6-Kullanıcı sepete ürün ekler.
        Driver.getDriver().navigate().back();
        actions.moveToElement(sp.urun_add).click().perform();
        //7-Kullanıcı sepeti açar
        ReusableMethods.scrollDown(sp.urun_add);
        sp.WaitUntil(sp.urun_add);
        actions.moveToElement(sp.sepet).click().perform();
        //8-Kullanıcı Checkout butonuna basarak checkout ekranına gelir.
        sp.WaitUntil(sp.checkout);
        actions.moveToElement(sp.checkout).click().perform();
        sp.WaitUntil(sp.checkout_avaible);
        //9-Kullanıcı Check Availabilty butonuna basarak stok kontrolü yapar.
        sp.WaitUntil(sp.checkout_avaible);
        actions.moveToElement(sp.checkout_avaible).click().perform();
        //10-Kullanıcı 'Do you have coupon?' ifadesine tıkalar
        sp.WaitUntil(sp.do_you_have_coupon);
        //10-Kullanıcı herbir kuponu girerek indirim yapıldığını doğrular.
        //sp.coupon_try(a);
        actions.moveToElement(sp.checkout_avaible).click().perform();
        Thread.sleep(5000);
        Assert.assertTrue(sp.cod.isDisplayed());
        actions.moveToElement(sp.cod).click().perform();
        actions.moveToElement(sp.do_you_have_coupon).click().perform();

        actions.moveToElement(sp.code).click().sendKeys(a.get(0).toString()).perform();
        actions.moveToElement(sp.apply).click().perform();
        Assert.assertTrue(sp.is_visible.isDisplayed());
        actions.moveToElement(sp.esc).click().perform();


    }
}
