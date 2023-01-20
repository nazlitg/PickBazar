package Team03.tests.us01;

import Team03.pages.SellerPage;
import Team03.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T_01_14 {@Test
public void task14() throws InterruptedException {

    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    SellerPage sp = new SellerPage();

    //1-Kullanıcı URL gider.
    sp.goURL();

    //2-Kullanıcı seller olarak giriş yapar.
    sp.Login();

    // 3-Kullanıcı Users bölümüne girer.
    actions.moveToElement(sp.user).click().perform();
    // 4-Kullanıcı Actions bölümünden soldaki butonu seçerbilmel

    sp.costumer_act_per.click();
    sp.costumer_cancel.click();
    // 7-Kullanıcı değişikliği onaylamazsa değişiklik olmadığını onaylar.
    sp.costumer_act_per.click();
    // 5-Kullanıcı işlemi onaylarsa Permisions sekmesindeki değişiklikleri kontrol eder.
    sp.costumer_red_btn.click();
    // 6-Kullanıcı update mesajını görüntülendiğini onaylar
    Assert.assertTrue(sp.costumer_updated.isDisplayed());


    // 4,1-Kullanıcı Actions bölümünden ortadaki butonu seçerbilmeli
    actions.moveToElement(sp.costumer_act_wallet).click().perform();

    // 5,1-Kullanıcı işlemi onaylarsa Avaible Waller points sekmesindeki değişiklikleri kontrol eder.
    sp.costumer_wallet_edit.sendKeys("12" + Keys.ENTER);
    // 6,1-Kullanıcı update mesajını görüntülendiğini onaylar
    Assert.assertTrue(sp.costumer_updated.isDisplayed());
    Thread.sleep(5000);

    // 7,2-Kullanıcı değişikliği onaylamazsa değişiklik olmadığını onaylar.
    sp.costumer_act_status.click();
    sp.costumer_cancel.click();

    // 4,2-Kullanıcı Actions bölümünden sağdaki butonu seçebilmeli
    sp.costumer_act_status.click();
    // 5,2-Kullanıcı işlemi onaylarsa Status'da değişiklikleri kontrol eder.
    sp.costumer_red_btn.click();
    Thread.sleep(3000);
    // 6,2-Kullanıcı update mesajını görüntülendiğini onaylar
    Assert.assertTrue(sp.costumer_remove.isDisplayed());

}
}
