package Team03.tests.us03;


import Team03.pages.PickBazarFAQPage;
import Team03.utilities.ConfigReader;
import Team03.utilities.Driver;
import Team03.utilities.ReusableMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FAQTestleri {

    @Test
    public void test01() {
        //1 kullanıcı url ye gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.linkKontrol("pickbazar");
        //2    kullanıcı FAQ kısmına tıklar
        PickBazarFAQPage pickBazarFAQPage = new PickBazarFAQPage();
        pickBazarFAQPage.FAQ.click();
        ReusableMethods.linkKontrol("help");
        //3    4 soru ve 4 cvp görüntülenebilmeli
        int s = pickBazarFAQPage.sorular.size();
        Assert.assertEquals(s, 4);
        int count = 0;
        pickBazarFAQPage.artıIsaretleri.get(0).click();
        for (int i = 0; i < pickBazarFAQPage.artıIsaretleri.size(); i++) {
            count++;
            pickBazarFAQPage.artıIsaretleri.get(i).click();
            Assert.assertTrue(pickBazarFAQPage.cevap.isDisplayed());

        }
        Assert.assertEquals(count, 4);

    }//PASS

    @Test
    public void test02() {
        //1 kullanıcı url ye gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.linkKontrol("pickbazar");
        //2    kullanıcı FAQ kısmına tıklar
        PickBazarFAQPage pickBazarFAQPage = new PickBazarFAQPage();
        pickBazarFAQPage.FAQ.click();
        ReusableMethods.linkKontrol("help");
        //3    kullanıcı Sıkca sorulan sorularda + işaretine tıklar
        //4    kullanıcı + işaretini tıklanınca – işaretine dönüştüğünü görür.

        pickBazarFAQPage.artıIsaretleri.get(0).click();
        for (int i = 0; i < pickBazarFAQPage.artıIsaretleri.size(); i++) {

            pickBazarFAQPage.artıIsaretleri.get(i).click();
            Assert.assertTrue(pickBazarFAQPage.cevap.isDisplayed());

        }//PASS

    }
}


