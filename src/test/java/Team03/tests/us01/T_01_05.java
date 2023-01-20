package Team03.tests.us01;

import Team03.pages.SellerPage;
import Team03.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T_01_05 {@Test
public void task5() throws InterruptedException {

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

    //4-Kullanıcı edit product simgesini kullanabilmeli.
    sp.product_edit.click();

    //5-Kullanıcı edit sayfasındaki herbir bilgiyi güncelleyebilmeli.
    String filepath = "C:\\Users\\tekin\\IdeaProjects\\ProjectTeam03\\src\\test\\java\\Team03\\resources\\Avatar-Free-PNG-Image.png";
    sp.product_information.forEach(s -> actions
            .moveToElement(s)
            .click()
            .keyDown(Keys.CLEAR)
            .keyUp(Keys.CLEAR)
            .sendKeys("12")
            .perform());
    actions.moveToElement(sp.sale_price).click().sendKeys("");
    sp.product_information_check.forEach(s -> actions.moveToElement(s).click().perform());
    sp.product_information_img.forEach(s -> s.sendKeys(filepath));
    Thread.sleep(3000);
    actions.moveToElement(sp.edit_product).click().perform();

    Assert.assertTrue(sp.product_success.isDisplayed());

    //7-Kullanıcı products kategorisindeki ürün için silme butonuna tıklayabilmeli.
    Driver.getDriver().navigate().back();
    sp.product_cop.click();
    actions.moveToElement(sp.product_delete_red).click().perform();

    //8-Kullanıcı ürünün silindiğini doğrular.
    Assert.assertTrue(sp.product_delete.isDisplayed());


    // Driver.closeDriver();
}
}
