package Team03.tests.us07;

import Team03.pages.PickBazarHomePage;
import Team03.pages.PickBazarUserMenuPage;
import Team03.utilities.ConfigReader;
import Team03.utilities.Driver;
import Team03.utilities.TestBaseReports;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
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
    public void login() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Actions actions = new Actions(Driver.getDriver());
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
        ump.profileSekmesi.click();
        ump.profileNameBox.clear();

        actions.moveToElement(ump.profileNameBox).click().perform();
        actions.sendKeys("newName").build().perform();
        actions.click(ump.profileBio).sendKeys("new biography").build().perform();
        actions.click(ump.profileSaveButton).perform();
        //Assert.assertTrue(ump.profileUpdatedSuccessfully.isDisplayed());

        Driver.getDriver().switchTo().alert().accept();
        JavascriptExecutor jse = (JavascriptExecutor)Driver.getDriver();
        jse.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);
        actions.moveToElement(ump.phoneAddButton).click().perform();
        actions.click(ump.addContactBox).sendKeys("5555555555").perform();
        actions.click(ump.addContactButton).perform();
        //Assert.assertTrue(ump.profileUpdatedSuccessfully.isDisplayed());


        actions.moveToElement(ump.newAdressAddButton).click().perform();
        ump.newAdressAddButton.click();
        actions.click(ump.newAdressTitleBox).sendKeys("home")
                .sendKeys(Keys.TAB).sendKeys("Türkiye").sendKeys(Keys.TAB)
                .sendKeys("BİGA").sendKeys(Keys.TAB)
                .sendKeys("ÇANAKKALE").sendKeys(Keys.TAB)
                .sendKeys("17000").sendKeys(Keys.TAB)
                .sendKeys("Nemelazım sokak herkese lazım apartmanı").sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();

        //Driver.getDriver().switchTo().alert().accept();
        Thread.sleep(2000);
        Assert.assertTrue(ump.profileUpdatedSuccessfully.isDisplayed());
    }
}
