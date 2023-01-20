package Team03.tests.us01;

import Team03.pages.SellerPage;
import Team03.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T_01_19 {
    @Test
    public void task19() throws InterruptedException {
        Faker faker = new Faker();
        Actions actions = new Actions(Driver.getDriver());
        SellerPage sp = new SellerPage();

        //1-Kullanıcı URL gider.
        sp.goURL();

        //2-Kullanıcı seller olarak giriş yapar.
        sp.Login();

        //3-Kullanıcı Reviews bölümüne girer.
        sp.reviews.click();
        String URL = Driver.getDriver().getCurrentUrl();
        String a = sp.reviews_Products.getText();
        String c = sp.m_y2.getText();
        //System.out.println(c);

        //4-Kullanıcı kullanıcı yorumunu görebilmeli.
        Assert.assertTrue(sp.reviews_show.isDisplayed());
        //5-Kullanıcı yorum yapılan ürüne erişim sağlamak için products bölümünden ilgili linke tıklar.
        sp.reviews_Products.click();
        Driver.getDriver().switchTo().window((String) Driver.getDriver().getWindowHandles().toArray()[2]);
        //6-Kullanıcı müşterinin yorumunu içeren ürünü görüntüleyebildiğini doğrular.
        Assert.assertTrue(sp.reviews_check_name.getText().contains(a));
        //7-Kullanıcı ürünün müşterinin yorumunu içerdiği doğrulanır.
        actions.moveToElement(sp.m_y).perform();
        Thread.sleep(3000);
        String b = sp.m_y.getText();
        System.out.println(b);
        Assert.assertTrue(b.contains(c));
        //8-Kullanıcı Reviews bölümüne geri döner.
        Driver.getDriver().switchTo().window((String) Driver.getDriver().getWindowHandles().toArray()[1]);
        //9-Kullanıcı yapılan yorumu silebilmelidir.Actins'ta bulunan çöp kutusuna tıklar
        sp.question_cop.click();
        //10-Kullanıcı yorumun silindiğini onaylar.
        sp.question_delete.click();
        Assert.assertTrue(sp.deleted_2.isDisplayed());
    }
}
