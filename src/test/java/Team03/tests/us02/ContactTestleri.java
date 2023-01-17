package Team03.tests.us02;

import Team03.pages.PickBazarContactPage;
import Team03.utilities.ConfigReader;
import Team03.utilities.Driver;
import Team03.utilities.ReusableMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class ContactTestleri {
    @Test
    public void concat() {
        PickBazarContactPage pickBazarContactPage = new PickBazarContactPage();
        //1    kullanıcı url ye gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.linkKontrol("pickbazar");

        //2    kullanıcı contact kısmına tıklar
        pickBazarContactPage.contact.click();
        ReusableMethods.linkKontrol("contact");
        //3    kullanıcı Address, Phone, Website(visit this Site) bilgilerinin görünür olduğunu kontrol eder
        ReusableMethods.gorunuyorMU(pickBazarContactPage.adress);
        ReusableMethods.gorunuyorMU(pickBazarContactPage.phone);
        ReusableMethods.gorunuyorMU(pickBazarContactPage.website);

        //4    kullanıcı visit this Site kısmına tıklar, Yeni  Sayfaya geçti mi kontrol eder
        String bazar = Driver.getDriver().getWindowHandle();
        pickBazarContactPage.visitThisSite.click();
        Assert.assertFalse(Driver.getDriver().getCurrentUrl().contains("Bazar"));
        Driver.getDriver().switchTo().window(bazar);


        //5    kullanıcı Follow Us seçeneklerinde bulunan facabook a tıklar
        pickBazarContactPage.facebook.click();
        //6    kullanıcı facebook sayfasının açıldığını kontrol eder
        String face = "";
        Set<String> listFece = Driver.getDriver().getWindowHandles();
        for (String each : listFece) {
            if (!each.equals(bazar)) {
                face = each;
            }
        }
        Driver.getDriver().switchTo().window(face);
        ReusableMethods.linkKontrol("facebook");

        Driver.getDriver().switchTo().window(bazar);

        //7    kullanıcı Follow Us seçeneklerinde bulunan twitter a tıklar
        pickBazarContactPage.twitter.click();
        String twitter = "";
        Set<String> listTwitter = Driver.getDriver().getWindowHandles();
        for (String each2 : listTwitter) {
            if (!each2.equals(bazar)) {
                twitter = each2;
            }
        }
        Driver.getDriver().switchTo().window(twitter);

        //8    kullanıcı twitter sayfasının açıldığını kontrol eder
        ReusableMethods.linkKontrol("twitter");
        Driver.getDriver().switchTo().window(bazar);

        //9    kullanıcı Follow Us seçeneklerinde bulunan instagram a tıklar
        pickBazarContactPage.instagram.click();

        //10   kullanıcı instagram sayfasının açıldığını kontrol eder
        ReusableMethods.linkKontrol("instagram");
        Driver.getDriver().switchTo().window(bazar);
    }//BUG İNSTAGRAM TIKLANMIYOR


    @Test
    public void test02() {
        PickBazarContactPage pickBazarContactPage = new PickBazarContactPage();
        //1    kullanıcı url ye gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.linkKontrol("pickbazar");

        //2    kullanıcı contact kısmına tıklar
        pickBazarContactPage.contact.click();
        ReusableMethods.linkKontrol("contact");

        //3    kullanıcı Questions, Comments, Or Concerns? Name email Subject ve Description doldurur
        pickBazarContactPage.searchName.sendKeys("endiyy");
        pickBazarContactPage.searchEmail.sendKeys(ConfigReader.getProperty("email"));
        pickBazarContactPage.searchSubject.sendKeys("eeee");
        pickBazarContactPage.searchDescription.sendKeys("asdnduy h");

//4    kullanıcı Submit bottuna tıklar
        pickBazarContactPage.submit.click();//PASS
    }

    @Test
    public void test03() {
        PickBazarContactPage pickBazarContactPage = new PickBazarContactPage();
        //1    kullanıcı url ye gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.linkKontrol("pickbazar");

        //2    kullanıcı contact kısmına tıklar
        pickBazarContactPage.contact.click();
        ReusableMethods.linkKontrol("contact");

        //3    kullanıcı Questions, Comments, Or Concerns? Name email Subject ve Description doldurur
        pickBazarContactPage.searchName.sendKeys("endiyy");
        pickBazarContactPage.searchEmail.sendKeys("jsad eu");
        pickBazarContactPage.searchSubject.sendKeys("eeee");
        pickBazarContactPage.searchDescription.sendKeys("asdnduy h");

//4    kullanıcı Submit bottuna tıklar
        pickBazarContactPage.submit.click();

        ReusableMethods.includeText(pickBazarContactPage.gecersiz, "The provided email address format is not valid");
    }//PASS

    @Test
    public void test04() {
        PickBazarContactPage pickBazarContactPage = new PickBazarContactPage();
        //1    kullanıcı url ye gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.linkKontrol("pickbazar");

        //2    kullanıcı contact kısmına tıklar
        pickBazarContactPage.contact.click();
        ReusableMethods.linkKontrol("contact");

        //3    kullanıcı Questions, Comments, Or Concerns? Name email Subject ve Description doldurur

        pickBazarContactPage.searchEmail.sendKeys(ConfigReader.getProperty("url"));
        pickBazarContactPage.searchSubject.sendKeys("eeee");
        pickBazarContactPage.searchDescription.sendKeys("asdnduy h");

//4    kullanıcı Submit bottuna tıklar
        pickBazarContactPage.submit.click();

        //4    kullanıcı  Bir tanesi bos kalınca işlemin devam etmediği görümelidir

        ReusableMethods.gorunuyorMU(pickBazarContactPage.nameYok);
    }//PASS

    @Test
    public void test05() {
        PickBazarContactPage pickBazarContactPage = new PickBazarContactPage();
        //1    kullanıcı url ye gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.linkKontrol("pickbazar");

        //2    kullanıcı contact kısmına tıklar
        pickBazarContactPage.contact.click();
        ReusableMethods.linkKontrol("contact");

        //3    Description bölümün yazılan yazinin icerigi ile ilgil
        // bir sinirlandirma olmalidir(karakter boyutu, sayi-harf icermesi)
        for (int i = 0; i < 100000000; i++) {
            pickBazarContactPage.searchDescription.sendKeys("a3-23ds");
        }


    }//BUG VAR.    Description HİÇ BİR SINIRLANDIRMA YOK
}

