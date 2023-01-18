package Team03.tests.us06;

import Team03.pages.PickBazarHomePage;
import Team03.utilities.ConfigReader;
import Team03.utilities.Driver;
import Team03.utilities.TestBaseReports;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase06_02 extends TestBaseReports {
    //1-Kulanıcı URL gider.
    //2-Kullanıcı invalid credentials ile join tıklar
    //3-Kullanıcı "The credentials was wrong!" görmelidir.
    @Test
    public void login(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        PickBazarHomePage hp = new PickBazarHomePage();

        hp.join.click();
        hp.emailBox.clear();
        hp.emailBox.sendKeys("badmin@abcd.com");
        hp.passwordBox.clear();
        hp.passwordBox.sendKeys("badmin1234");
        hp.loginButton.click();

        Assert.assertTrue(hp.invalidLogin.isDisplayed());
    }
}
