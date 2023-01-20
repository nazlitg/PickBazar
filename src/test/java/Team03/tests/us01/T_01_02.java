package Team03.tests.us01;

import Team03.pages.SellerPage;
import Team03.utilities.Driver;
import Team03.utilities.ReusableMethods;
import org.testng.annotations.Test;

public class T_01_02 {
    @Test
    public void task2() throws InterruptedException {
        SellerPage sp = new SellerPage();
        //1-Kulanıcı URL gider.
        sp.goURL();
        //2-Kullanıcı Become a Seller buttonuna tıklar.
        //3-Kullanıcı Login linkine gider
        //4-Kullanıcı e-mail ve password bilgilerini girer
        sp.Login();
        //5-Kullanıcı Login olduğunu doğrular.
        sp.WaitUntil(sp.avatar_seller);
        sp.avatar_seller.click();
        sp.profile.click();
        ReusableMethods.gorunuyorMU(sp.check_enable);

        Driver.closeDriver();
    }
}
