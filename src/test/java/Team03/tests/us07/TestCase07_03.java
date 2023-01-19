package Team03.tests.us07;

import Team03.pages.PickBazarHomePage;
import Team03.pages.PickBazarUserMenuPage;
import Team03.utilities.ConfigReader;
import Team03.utilities.Driver;
import Team03.utilities.TestBaseReports;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestCase07_03 extends TestBaseReports {
//1-Kullanıcı URL gider.
//2-Kullanıcı valid credentials ile join olur
//3-Kullanıcı profil fotosuna tıklayarak kullanıcı menüsünü görür.
//4-Kullanıcı MyOrders sekmesine tıkladığında Order Received butonu ile Order Details
//gorulmelidir
    @Test
    public void login() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Actions actions = new Actions(Driver.getDriver());
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        PickBazarHomePage hp = new PickBazarHomePage();

        hp.join.click();
        hp.emailBox.clear();
        hp.emailBox.sendKeys(ConfigReader.getProperty("email"));
        hp.passwordBox.clear();
        hp.passwordBox.sendKeys(ConfigReader.getProperty("password"));
        hp.loginButton.click();

        PickBazarUserMenuPage ump = new PickBazarUserMenuPage();
        ump.profileImg.click();
        ump.profileButton.click();
        ump.myOrdersButton.click();

        wait.until(ExpectedConditions.visibilityOf(ump.orderDetailsHeader));
        Assert.assertTrue(ump.orderDetailsHeader.isDisplayed());

        System.out.println(ump.myOrdersHeader.getText());
        Assert.assertEquals(ump.myOrdersHeader.getText(), "Order Received");
    }
}
