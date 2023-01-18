package Team03.tests.us06;

import Team03.pages.PickBazarHomePage;
import Team03.utilities.ConfigReader;
import Team03.utilities.Driver;
import Team03.utilities.TestBaseReports;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestCase06_01 extends TestBaseReports {
    //1-Kullanıcı URL gider.
    //2-Kullanıcı valid credentials ile join olur
    //3-Kullanıcı profile image görmelidir.
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

        Assert.assertTrue(hp.profileImg.isDisplayed());
    }
}
