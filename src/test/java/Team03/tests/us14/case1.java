package Team03.tests.us14;

import Team03.pages.Bags;
import Team03.utilities.Driver;
import org.testng.annotations.Test;

public class case1 {
    @Test
    public void searchTest() throws InterruptedException {
        Bags bg= new Bags(Driver.getDriver());
        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");


        bg.Login();

        bg.SelectBags();

        // WebDriverWait wait=new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(8));
        bg.search();

        bg.seeTest();
    }
}
