package Team03.tests.us07;

import Team03.pages.PickBazarHomePage;
import Team03.pages.PickBazarUserMenuPage;
import Team03.utilities.ConfigReader;
import Team03.utilities.Driver;
import Team03.utilities.TestBaseReports;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestCase07_02 extends TestBaseReports {
//1-Kullanıcı URL gider.
//2-Kullanıcı valid credentials ile join olur
//3-Kullanıcı profil fotosuna tıklayarak kullanıcı menüsünü görür.
//4-Kullanıcı profile sekmesine tıklayarak profile sayfasına gider.
//5-Kullanıcı cjhange password sekmesine tıklar.
//6-Kullanıcı açılan pencerede şifre değiştirme adımlarını uygular
//7-"Password changed succesfully" mesaji gorulmelidir
    @Test
    public void login() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Actions actions = new Actions(Driver.getDriver());
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
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
        ump.changePasswordSekmesi.click();
        wait.until(ExpectedConditions.visibilityOf(ump.oldPasswordBox));
        ump.oldPasswordBox.sendKeys("Projeteam03-2022");
        ump.newPasswordBox.sendKeys("Projeteam03-2022");
        ump.confirmPasswordBox.sendKeys("Projeteam03-2022");
        ump.passwordSubmitButton.click();

        Thread.sleep(3000);
        //Assert.assertTrue(ump.profileUpdatedSuccessfully.isDisplayed());
    }
}
