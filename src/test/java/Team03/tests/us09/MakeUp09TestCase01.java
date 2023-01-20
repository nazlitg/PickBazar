package Team03.tests.us09;

import Team03.pages.PickBazarMakeUpPage;
import Team03.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeUp09TestCase01 {

    PickBazarMakeUpPage pickBazarMakeUpPage = new PickBazarMakeUpPage(Driver.getDriver());

    @Test
    public void UserCanSearchProductInTheMakeUpCategory(){
        // Kullanıcı URL gider
        // Kullanıcı URL gider
        // Kullanıcı siteye Log in olur
        pickBazarMakeUpPage.Login();
        // Kullanıcı Grocery yazılı dropdown menüye gelir ve click yapar
        // Kulanıcı dropdown menüye gelir ve clic yapar.
        // Kullanıcı Makeup'ı seçtiğinde dropdown tıklar(açılan listenin kapanması için )
        pickBazarMakeUpPage.GroceryDropdownSelectMakeup();
        // Search alanına "Foundation" yazılır ve arama yapılır
        pickBazarMakeUpPage.search("Foundation");
        // Arama yapıldığı kontrol edilir ve aranan keyworde dair urun listede verify edilir
        pickBazarMakeUpPage.VerifyTheKeywordAtTheSearchBox();
    }

}
