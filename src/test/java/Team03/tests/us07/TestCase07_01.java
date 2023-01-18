package Team03.tests.us07;

import Team03.pages.PickBazarHomePage;
import Team03.pages.PickBazarUserMenuPage;
import Team03.utilities.ConfigReader;
import Team03.utilities.Driver;
import Team03.utilities.TestBaseReports;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase07_01 extends TestBaseReports {
//1-Kullanıcı URL gider.
//2-Kullanıcı valid credentials ile join olur
//3-Kullanıcı profil fotosuna tıklayarak kullanıcı menüsünü görür.
//4-Kullanıcı profile sekmesine tıklayarak profile sayfasına gider.
//5-Kullanıcı profil sayfasındaki bilgilerinde değişiklikler yapabilmelidir.
//"6-Kullanıcı Save veya Update butonuna bastığında ""Profile Updated Successfully"" mesaji
//gorulmelidir"
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

        PickBazarUserMenuPage ump = new PickBazarUserMenuPage();
        ump.profileImg.click();
        ump.profileButton.click();

        //Assert.assertTrue(hp.profileImg.isDisplayed());
    }
}
