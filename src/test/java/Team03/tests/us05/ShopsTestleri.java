package Team03.tests.us05;

import Team03.pages.PickBazarHomePage;
import Team03.pages.PickBazarShopsPage;
import Team03.utilities.ConfigReader;
import Team03.utilities.Driver;
import Team03.utilities.TestBaseReports;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShopsTestleri extends TestBaseReports {
    @Test
    public void test01() {
        extentTest = extentReports.createTest("5. us 1. case");
        //1 kullanıcı url ye gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //2    kullanıcı shops  bölümüne tıklar
        PickBazarShopsPage pickBazarShopsPage = new PickBazarShopsPage();
        pickBazarShopsPage.shops.click();

        //3    kullanıcı bütün alışverş seçeneklerini görür
        for (int i = 0; i < pickBazarShopsPage.alısVerisSecenekleri.size(); i++) {
            Assert.assertTrue(pickBazarShopsPage.alısVerisSecenekleri.get(i).isDisplayed());

        }
        //4    kullanıcı alışveriş seçeneklerini tek tek tıklar ve
        // acılan sayfada Address, Phone ve Website (visit this Site) bilgilerini görür
        for (int i = 0; i < pickBazarShopsPage.alısVerisSecenekleri.size(); i++) {
            pickBazarShopsPage.alısVerisSecenekleri.get(i).click();
            Assert.assertTrue(pickBazarShopsPage.adress.isDisplayed());
            Assert.assertTrue(pickBazarShopsPage.phone.isDisplayed());
            Assert.assertTrue(pickBazarShopsPage.website.isDisplayed());
            Driver.getDriver().navigate().back();
        }
    }
    //BUG Books Shop seceneginde website görüntülenemedi


@Test
    public void test02(){
    extentTest = extentReports.createTest("5. us 2. case");
    //1 kullanıcı url ye gider
    Driver.getDriver().get(ConfigReader.getProperty("url"));

    //2    kullanıcı shops  bölümüne tıklar
    PickBazarShopsPage pickBazarShopsPage = new PickBazarShopsPage();
    pickBazarShopsPage.shops.click();

    //3 kullanıcı herhangi bir alışveriş seçeneğine tıklar
    //4 kullanıcı herhangi bir ürünü tıklar
    //5  kullanıcı ürünü sepete ekler
    //6  kullanıcı sepette ürünün miktarının güncellene bileceğini görür
    //7  kullanıcı ödemeyi sonlandırır
    PickBazarHomePage pickBazarHomePage=new PickBazarHomePage();
    pickBazarHomePage.join.click();
    pickBazarHomePage.emailBox.clear();
    pickBazarHomePage.emailBox.sendKeys(ConfigReader.getProperty("email"));
    pickBazarHomePage.passwordBox.clear();
    pickBazarHomePage.passwordBox.sendKeys(ConfigReader.getProperty("password"));
    pickBazarHomePage.loginButton.click();

    pickBazarShopsPage.furniture.click();
    pickBazarShopsPage.resimler.get(0).click();
    pickBazarShopsPage.sepeteEkle.click();
    pickBazarShopsPage.sepeteGit.click();
    pickBazarShopsPage.checkout.click();
    pickBazarShopsPage.checkAvailability.click();

  pickBazarShopsPage.place.click();
    Assert.assertTrue(pickBazarShopsPage.card.isDisplayed());
    //faild  ödeme buttonu calısmıyor



    //nxcvlşf

 /*   pickBazarShopsPage.alısVerisSecenekleri.get(2).click();
    for (int i = 0; i < pickBazarShopsPage.resimler.size(); i++) {
       pickBazarShopsPage.resimler.get(i).click();
       pickBazarShopsPage.sepeteEkle.click();
       Assert.assertTrue(pickBazarShopsPage.artıIsareti.isDisplayed());
       pickBazarShopsPage.sepeteGit.click();
       pickBazarShopsPage.checkout.click();
       pickBazarShopsPage.checkAvailability.click();
       Driver.getDriver().navigate().back();
       Driver.getDriver().navigate().back();

    }
    pickBazarShopsPage.alısVerisSecenekleri.get(1).click();
    for (int i = 0; i < pickBazarShopsPage.resimler.size(); i++) {
        pickBazarShopsPage.resimler.get(i).click();
        pickBazarShopsPage.sepeteEkle.click();
        Assert.assertTrue(pickBazarShopsPage.artıIsareti.isDisplayed());
        pickBazarShopsPage.sepeteGit.click();
        pickBazarShopsPage.checkout.click();
        pickBazarShopsPage.checkAvailability.click();
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();

    }*/


    //BUG VAR ÜRÜNLERİN SEPETE EKLEME BUTTONU AKTİF DEGİL


}
}

