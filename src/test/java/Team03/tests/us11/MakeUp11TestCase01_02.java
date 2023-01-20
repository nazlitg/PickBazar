package Team03.tests.us11;

import Team03.pages.PickBazarMakeUpPage;
import Team03.utilities.Driver;
import Team03.utilities.ReusableMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MakeUp11TestCase01_02 {

    PickBazarMakeUpPage pickBazarMakeUpPage = new PickBazarMakeUpPage(Driver.getDriver());

    @Test
    public void UseranChangeOrderAmountAtTheProductPageTC01(){
        // Kullanıcı URL gider
        // Kullanıcı URL gider
        // Kullanıcı siteye Log in olur
        pickBazarMakeUpPage.Login();
        // Kullanıcı Grocery yazılı dropdown menüye gelir ve click yapar
        // Kulanıcı dropdown menüye gelir ve clic yapar.
        // Kullanıcı Makeup'ı seçtiğinde dropdown tıklar(açılan listenin kapanması için )
        pickBazarMakeUpPage.GroceryDropdownSelectMakeup();
        // Seçilen kateğori ile ilğili urunleri görene kadar scroll yapılır
        pickBazarMakeUpPage.miniScroll();
        // Ürüne tıklanır
        // Sayfada iken seçilen ürün miktarı değiştirilmelidir
        // Ürün miktarı tabında " - " ve " + " butonlarına tıklayarak urun miktarı değiştirilir
        pickBazarMakeUpPage.IncreasAndDecreaseTheProductAmount();
        // Ürün miktarının değiştirilebildiği verify edilir.
        pickBazarMakeUpPage.VerifyThatUseranChangeOrderAmountAtTheProductPageTC01();
    }

    @Test
    public void UseranChangeOrderAmountAtTheCartTC02() throws InterruptedException {
        // Kullanıcı URL gider
        // Kullanıcı URL gider
        // Kullanıcı siteye Log in olur
        pickBazarMakeUpPage.Login();
        // Kullanıcı Grocery yazılı dropdown menüye gelir ve click yapar
        // Kulanıcı dropdown menüye gelir ve clic yapar.
        // Kullanıcı Makeup'ı seçtiğinde dropdown tıklar(açılan listenin kapanması için )
        pickBazarMakeUpPage.GroceryDropdownSelectMakeup();
        // Ürüne tıklanır
        // İlğili ürün sepete eklenir
        // Ürün penceresi kapatılır
        // Item ( sepet ) tab'ına tıklanır
        // Sepetteki urun miktarı tabına " - " ve " + " butonlarına tıklayarak urun miktarı değiştirilir
        pickBazarMakeUpPage.UseranChangeOrderAmountAtTheCart();
        // Sepete ürün miktarının değişebidiği verify edilir
        pickBazarMakeUpPage.VerifyThatUseranChangeOrderAmountAtTheCartTC02();
    }


}
