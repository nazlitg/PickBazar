package Team03.tests.us01;

import Team03.pages.SellerPage;
import Team03.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T_01_04 {@Test
public void task4() throws InterruptedException {

    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    SellerPage sp = new SellerPage();

    //1-Kullanıcı URL gider.
    sp.goURL();

    //2-Kullanıcı seller olarak giriş yapar.
    sp.Login();

    //3-Kullanıcı product sekmesini açar(sağda dashboardda).
    sp.show_shops.click();
    sp.WaitUntil(sp.dashboard);
    sp.dashboard.click();
    sp.WaitUntil(sp.products);
    sp.products.click();


    //4-Kullanıcı 'Doğal Kozalak Reçeli ' keyword'ünü arar ve istenilen sonucu doğrular.
    sp.WaitUntil(sp.products_search);
    String a = sp.product_name2.getText();
    sp.products_search.click();
    sp.products_search.sendKeys(a + Keys.ENTER);
    Assert.assertEquals(sp.product_name.getText(), a);

    //5-Kullanıcı sayfayı yeniler ve Filtreleri açar.
    Driver.getDriver().navigate().refresh();
    sp.WaitUntil(sp.product_filter);
    sp.product_filter.click();

    // //6-Kullanıcı grup ve category 'den filtre seçer ve ürün aratır

    sp.product_filter_group.click();
    Thread.sleep(5000);
    sp.scfrom();

    Thread.sleep(5000);
    String b = sp.product_filter_text.getText();
    String c = sp.product_filter_text_check.getText();
    Assert.assertEquals(b,c);

    Driver.closeDriver();
}

}

