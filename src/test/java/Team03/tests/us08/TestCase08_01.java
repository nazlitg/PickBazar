package Team03.tests.us08;

import Team03.pages.PickBazarHomePage;
import Team03.utilities.ConfigReader;
import Team03.utilities.Driver;
import Team03.utilities.TestBaseReports;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase08_01 extends TestBaseReports {
//1-Kullanıcı URL gider.
//2-Kullanıcı Grocery kategorisini seçince, grocery ürünlerini görmelidir.
//3-Kullanıcı Bakery kategorisini seçince, bakery ürünlerini görmelidir.
//4-Kullanıcı Make up kategorisini seçince, make up ürünlerini görmelidir.
//5-Kullanıcı Bags kategorisini seçince, bags ürünlerini görmelidir.
//6-Kullanıcı Clothing kategorisini seçince, clothing ürünlerini görmelidir.
//7-Kullanıcı Furniture kategorisini seçince, furniture ürünlerini görmelidir.
//8-Kullanıcı Daily Needs kategorisini seçince, daily needs ürünlerini görmelidir.
//9-Kullanıcı Books kategorisini seçince, books ürünlerini görmelidir.

    @Test
    public void categoryTest() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Actions actions = new Actions(Driver.getDriver());
        PickBazarHomePage hp = new PickBazarHomePage();

        actions.moveToElement(hp.categoryDropDown).click().perform();
        actions.moveToElement(hp.groceryCategory).click().perform();
        Assert.assertTrue(hp.categoryTitle.getText().contains("Groceries"), "Grocery category is not displayed.");

        actions.moveToElement(hp.bakeryCategory).click().perform();
        Thread.sleep(2000);
        Assert.assertTrue(hp.categoryTitle.getText().toLowerCase().contains("bakery"), "Bakery category is not displayed.");

        actions.moveToElement(hp.makeUpCategory).click().perform();
        Assert.assertTrue(hp.categoryTitle.getText().toLowerCase().contains("makeup"), "Makeup category is not displayed.");

        actions.moveToElement(hp.bagsCategory).click().perform();
        Assert.assertTrue(hp.categoryTitle.getText().toLowerCase().contains("bags"), "Bags category is not displayed.");

        actions.moveToElement(hp.clothingCategory).click().perform();
        Assert.assertTrue(hp.categoryTitle.getText().toLowerCase().contains("dress"), "Clothing category is not displayed.");

        actions.moveToElement(hp.furnitureCategory).click().perform();
        Assert.assertTrue(hp.chairButton.isDisplayed(), "Furniture category is not displayed.");

        actions.moveToElement(hp.dailyNeedsCategory).click().perform();
        Assert.assertTrue(hp.nextCategoryTitle.getText().toLowerCase().contains("eat"), "Daily Needs category is not displayed.");

        actions.moveToElement(hp.newCategoryDropDown).click().perform();
        actions.moveToElement(hp.booksCategory).click().perform();
        Assert.assertTrue(hp.booksPopular.isDisplayed(), "Books category is not displayed.");
    }
}
