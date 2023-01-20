package Team03.tests.us10;

import Team03.pages.PickBazarMakeUpPage;
import Team03.utilities.Driver;
import Team03.utilities.ReusableMethods;
import Team03.utilities.TestBaseReports;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MakeUp10TestCase01_07 extends TestBaseReports {

    PickBazarMakeUpPage pickBazarMakeUpPage = new PickBazarMakeUpPage(Driver.getDriver());
    @Test
    public void UserCanAddProductToWishlistTC01() {
        // Kullanıcı URL gider
        // Kullanıcı URL gider
        // Kullanıcı siteye Log in olur
        pickBazarMakeUpPage.Login();
        // Kullanıcı Grocery yazılı dropdown menüye gelir ve click yapar
        // Kulanıcı dropdown menüye gelir ve clic yapar.
        // Kullanıcı Makeup'ı seçtiğinde dropdown tıklar(açılan listenin kapanması için )
        pickBazarMakeUpPage.GroceryDropdownSelectMakeup();
        // Sayfanin 1. urunu favorilere eklenir
        // Profil iconuna tıklanarak dropdown menü açılır
        // Menuden My Wishlists seçilir
        pickBazarMakeUpPage.addToMyWishlists();
        // Listenin 1. urunu favorilere eklendiği kontrol edilir
        pickBazarMakeUpPage.VerifyThatUserCanAddProductToWishlistTC01();
    }

    @Test
    public void UserCanDisplayProductCategoriesTC02() {
      // Kullanıcı URL gider
      // Kullanıcı URL gider
      // Kullanıcı siteye Log in olur
      pickBazarMakeUpPage.Login();
      // Kullanıcı Grocery yazılı dropdown menüye gelir ve click yapar
      // Kulanıcı dropdown menüye gelir ve clic yapar.
      // Kullanıcı Makeup'ı seçtiğinde dropdown tıklar(açılan listenin kapanması için )
      pickBazarMakeUpPage.GroceryDropdownSelectMakeup();
      // Seçilen kategori ile ilgili urunu görene kadar scroll yapılır
      ReusableMethods.scrollDown(pickBazarMakeUpPage.urunKategorileriGorunuyormu);
      // Seçilen makeup kategorilerinin ve içindeki alt kategorilerinin görüntülendiği verify edilir
      pickBazarMakeUpPage.VerifyThatUserCanDisplayProductCategoriesTC02();
    }

    @Test
    public void UserCannotAddProductMoreThanStockCapacityTC03(){
      // Kullanıcı URL gider
      // Kullanıcı URL gider
      // Kullanıcı siteye Log in olur
      pickBazarMakeUpPage.Login();
      // Kullanıcı Grocery yazılı dropdown menüye gelir ve click yapar
      // Kulanıcı dropdown menüye gelir ve clic yapar.
      // Kullanıcı Makeup'ı seçtiğinde dropdown tıklar(açılan listenin kapanması için )
      pickBazarMakeUpPage.GroceryDropdownSelectMakeup();
      // İlk ürüne click yapılır
      pickBazarMakeUpPage.GoToFirstProduct();
      // Açılan pencereden ürün stogu miktarına kadar ekleme yapılmalıdır(pieces available)
      pickBazarMakeUpPage.UrunSiniriTesti();
      // Stok miktarından (pieces available) fazla ürün seçilmediğine dair verify edilir(pieces available ile seçilen miktarın karşılaştırılması)
      pickBazarMakeUpPage.VerifyThatUserCannotAddProductMoreThanStockCapacityTC03();
    }

    @Test
    public void UserCanSeeTheDetailedInfoAboutProductInTheDetailsTC04(){
        // Kullanıcı URL gider
        // Kullanıcı URL gider
        // Kullanıcı siteye Log in olur
        pickBazarMakeUpPage.Login();
        // Kullanıcı Grocery yazılı dropdown menüye gelir ve click yapar
        // Kulanıcı dropdown menüye gelir ve clic yapar.
        // Kullanıcı Makeup'ı seçtiğinde dropdown tıklar(açılan listenin kapanması için )
        pickBazarMakeUpPage.GroceryDropdownSelectMakeup();
        // Kullanıcı Grocery yazılı dropdown menüye gelir ve click yapar
        // ilk ürüne click yapılır
        // Açılan pencerede urun detayları görenekadar scroll yapılmalı
        pickBazarMakeUpPage.GoToFirstProduct();
        // Kullanıcı tarafından details bölümünde ürünle ilğili detayların göründüğü verify edilir
        pickBazarMakeUpPage.VerifyThatUserCanSeeTheDetailedInfoAboutProductInTheDetailsTC04();
    }

    @Test
    public void UserCanScrollToSeeMoreProdutsTC06()  {
        // Kullanıcı Grocery yazılı dropdown menüye gelir ve click yapar
        // Kulanıcı dropdown menüye gelir ve clic yapar.
        // Kullanıcı Makeup'ı seçtiğinde dropdown tıklar(açılan listenin kapanması için )
        pickBazarMakeUpPage.GroceryDropdownSelectMakeup();
        // Seçilen kategori ile ilğil urunu görene kadar scroll yapılır
        pickBazarMakeUpPage.scrollPageUpDown();
    }

    @Test
    public void UserCanSeeNormalPriceAndDiscountedPriceIfThereIsOneTC07(){
        // Kullanıcı Grocery yazılı dropdown menüye gelir ve click yapar
        // Kulanıcı dropdown menüye gelir ve clic yapar.
        // Kullanıcı Makeup'ı seçtiğinde dropdown tıklar(açılan listenin kapanması için )
        pickBazarMakeUpPage.GroceryDropdownSelectMakeup();
        // Kullanıcı ilk ürüne clic yapar
        pickBazarMakeUpPage.GoToFirstProduct();
        // Açılan pencerenin urun fotografının sag ust köşesinde button içinde indirim oranı verify edilir
        // Fiyatın göründüğü verify edilir
        // Fiyatın yanında indirimli fiyatın göründüğü verify edilir
        pickBazarMakeUpPage.VerifyThatUserCanSeeNormalPriceAndDiscountedPriceIfThereIsOneTC07();
    }

    @Test
    public void UserCanGoToProductPageThroughLinkTC08(){
        // Kullanıcı URL gider
        // Kullanıcı URL gider
        // Kullanıcı siteye Log in olur
        pickBazarMakeUpPage.Login();
        // Kullanıcı Grocery yazılı dropdown menüye gelir ve click yapar
        // Kulanıcı dropdown menüye gelir ve clic yapar.
        // Kullanıcı Makeup'ı seçtiğinde dropdown tıklar(açılan listenin kapanması için )
        pickBazarMakeUpPage.GroceryDropdownSelectMakeup();
        // İlk ürüne click yapılır
        pickBazarMakeUpPage.GoToFirstProduct();
        // Açılan pencerede urun title'ına tıklanır
        pickBazarMakeUpPage.UserGoesToProductPage();
        // Title'a tıklandığında urun sayfasına girildiği kontrol edilir
        pickBazarMakeUpPage.VerifyThatUserCanGoToProductPageThroughLinkTC08();
    }

    @Test
    public void bugTest(){
        pickBazarMakeUpPage.GroceryDropdownSelectMakeup();
        pickBazarMakeUpPage.BagOfOutOfStock();
    }

}
