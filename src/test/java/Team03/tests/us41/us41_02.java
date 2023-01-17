package Team03.tests.us41;


import Team03.pages.PickBazarFurniturePage;
import Team03.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class us41_02 {

    WebDriver driver;

    @Test
    public void test03() {

        // Navigate to the URL
        driver = new ChromeDriver();
        driver.get("https://shop-pickbazar-rest.vercel.app/");

        PickBazarFurniturePage fp = new PickBazarFurniturePage();

        //  Click on the category dropdown
        fp.Dropdown.click();

        // Click on the "Furniture" category
        driver.findElement(By.id("headlessui-menu-item-22")).click();
        fp.Furniture.click();


    }

}
/*
            // Search for each subcategory in the "Furniture" category
        String[] subcategories = {"Chairs", "Tables", "Sofas", "Bed"};
        for (String subcategory : subcategories) {
            fp.FurnitureFilter.sendKeys(subcategory);
            fp.FurnitureFilter.click();

            // Verify that the search results contain the subcategory
            String searchResults = fp.Categories.getText();
            assert searchResults.contains(subcategory);
        }
 */