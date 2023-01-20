package Team03.tests.us01;

import Team03.pages.SellerPage;
import Team03.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

public class T_01_11 {@Test
public void task11() throws InterruptedException {

    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    SellerPage sp = new SellerPage();

    //1-Kullanıcı URL gider.
    sp.goURL();

    //2-Kullanıcı seller olarak giriş yapar.
    sp.Login();

    //3-Kullanıcı Orders bölümüne girer.
    actions.moveToElement(sp.orders).click().perform();

    //4-Satıcı  sipariş bilgilerini ekranda görüntülendiğini doğrular
    String trackId = sp.order_tracking_number.getText();
    Assert.assertTrue(sp.order_tracking_number.isDisplayed());

    //5-Satıcı sipariş bilgilerini görüntülemek için Actions butonuna basar(göz)
    actions.moveToElement(sp.order_eye).click().perform();
    //6-Satıcı sipraiş bilgilerini bir kez daha bu sayfada görünürlüğünü doğrular.
    sp.WaitUntil(sp.order_Change_status);
    String orderId = sp.order_id.getText();
    Assert.assertTrue(sp.order_id.getText().contains(trackId));
    //7-Satıcı sipraişin durumunu değiştirebilmeli.
    actions.moveToElement(sp.order_status_select)
            .click()
            .pause(Duration.ofSeconds(1))
            .keyDown(Keys.ARROW_DOWN)
            .keyUp(Keys.ARROW_DOWN)
            .keyDown(Keys.ENTER)
            .keyUp(Keys.ENTER)
            .perform();
    actions.moveToElement(sp.order_Change_status).click().perform();
    Assert.assertTrue(sp.order_success.isDisplayed());

    //8-Satıcı faturayı görüntüleyebilmeli.
    actions.moveToElement(sp.order_download).click().perform();
    String downloadPath = "C:\\Users\\tekin\\Downloads\\invoice-order-104.pdf";
    Thread.sleep(5000);
    Assert.assertTrue(Files.exists(Paths.get(downloadPath)), "Indirilen dosya bulunamadi");
    //9-Kullanıcı Orders bölümüne döner.
    Driver.getDriver().navigate().back();
    //10-Satıcı ürün id 'si ile ürünü bulduğunu ve sipariş takibi yaptığını doğrular.
    sp.WaitUntil(sp.order_tracking_number);
    Assert.assertTrue(orderId.contains(sp.order_tracking_number.getText()));
}

}
