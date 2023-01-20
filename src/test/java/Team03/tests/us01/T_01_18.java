package Team03.tests.us01;

import Team03.pages.SellerPage;
import Team03.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T_01_18 {
    @Test

    public void task18() throws InterruptedException {
        Faker faker = new Faker();
        Actions actions = new Actions(Driver.getDriver());
        SellerPage sp = new SellerPage();

        //1-Kullanıcı URL gider.
        sp.goURL();

        //2-Kullanıcı seller olarak giriş yapar.
        sp.Login();

        //3-Kullanıcı Questions bölümüne girer.
        sp.questions.click();
        //4-Kullanıcı müşterinin bilgilerini gördüğünü doğrular
        sp.WaitUntil(sp.question_show);
        Assert.assertTrue(sp.question_show.isDisplayed());
        //5-Kullanıcı Actions bölümünden kalem simgesinine tıklar
        sp.question_edit.click();
        //6-Kullanıcı müşteriye yanıt verebilmeli
        sp.box.sendKeys("123");
        sp.costumer_reply.click();

        //7-Kullanıcı yaptığı güncellemelerin güncelliğini kontrol eder.
        Assert.assertTrue(sp.product_success.isDisplayed());
        //8-Kullanıcı Actions bölümünden çöpkutusu simgesinine tıklar

        //9-Kullanıcı işlemi reddeder.Değişiklik olmadığını doğrular
        sp.question_cop.click();
        sp.question_cancel.click();

        //10-Kullanıcı işlemi onaylar ve yorumun silindiğini onaylar.
        Thread.sleep(5000);
        sp.question_cop.click();
        sp.question_delete.click();
        sp.WaitUntil(sp.deleted_1);
        Assert.assertTrue(sp.deleted_1.isDisplayed());


    }
}
