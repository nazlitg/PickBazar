package Team03.tests.us06;

import Team03.pages.PickBazarHomePage;
import Team03.pages.PickBazarUserMenuPage;
import Team03.utilities.ConfigReader;
import Team03.utilities.Driver;
import Team03.utilities.TestBaseReports;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase06_03 extends TestBaseReports {
    //1-Kullanıcı URL gider.
    //2-Kullanıcı valid credentials ile join olur
    //3-Kullanıcı profil fotosuna tıklar
    //4-Kullanıcı kullanıcı menüsünü görmelidir.
    //5-Kullanıcı kullanıcı menüsündeki seçeneklere erişebilmelidir.
    @Test
    public void login(){

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        PickBazarHomePage hp = new PickBazarHomePage();

        hp.join.click();
        hp.emailBox.clear();
        hp.emailBox.sendKeys(ConfigReader.getProperty("email"));
        hp.passwordBox.clear();
        hp.passwordBox.sendKeys(ConfigReader.getProperty("password"));
        hp.loginButton.click();

        Actions actions = new Actions(Driver.getDriver());
        PickBazarUserMenuPage ump = new PickBazarUserMenuPage();

        actions.moveToElement(ump.profileImg).click().perform();

        Assert.assertTrue(ump.userMenu.isDisplayed());

        ump.profileButton.click();
        Assert.assertTrue(ump.profileSekmesi.isDisplayed());

        actions.moveToElement(ump.profileImg).click().perform();
        ump.myOrdersButton.click();
        Assert.assertTrue(ump.myOrdersSekmesi.isDisplayed());

        actions.moveToElement(ump.profileImg).click().perform();
        ump.myWishlistButton.click();
        Assert.assertTrue(ump.myWishlistSekmesi.isDisplayed());

        actions.moveToElement(ump.profileImg).click().perform();
        ump.checkout.click();
        Assert.assertTrue(ump.checkAvailability.isDisplayed());

        actions.moveToElement(ump.profileImg).click().perform();
        ump.logout.click();
        Assert.assertTrue(ump.loginButton.isDisplayed());
    }
}
