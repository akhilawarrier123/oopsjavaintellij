package swaglabsTC;

import Swaglabs.InventoryPage;
//import com.swaglabs.pages.LoginPage;
import Swaglabs.LogInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InventoryTC {
    public static void main(String[] args) throws InterruptedException {
        InventoryTC inventoryTC = new InventoryTC();
        inventoryTC.TC_addProducts_to_the_cart();
        inventoryTC.TC_remove_Item_from_cart();

        inventoryTC.TCSort_item();

    }
@Test(groups = "smoke",priority = 3)
    public void TC_addProducts_to_the_cart() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        InventoryPage inventoryPage = new InventoryPage(driver);
        // inventoryPage.verify_title();
        inventoryPage.Add_Product(InventoryPage.backpackAddToCart);
        inventoryPage.Add_Product(InventoryPage.BikelightAddtoCart);
        inventoryPage.Add_Product(InventoryPage.BolttShirtAddtoCart);
        inventoryPage.Add_Product(InventoryPage.FleeceJacketAddtoCart);
        inventoryPage.clickOnCart();

        System.out.println("products added succesfully to cart=passed");
    }

    public void TC_remove_Item_from_cart() {
        WebDriver driver = new ChromeDriver();
        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.Remove_Product(InventoryPage.removeItem_backpack);
        inventoryPage.Remove_Product(InventoryPage.removeItem_bikelight);
        //inventoryPage.Remove  _Product(InventoryPage.removeItem_boltTshirt);
        inventoryPage.Remove_Product(InventoryPage. removeItem_fleeceJacket);


    }



    public void TCSort_item(){
        WebDriver driver = new ChromeDriver();
        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.sortProducts("lohi","Price(low-high)");
        inventoryPage.sortProducts("lohi","Price(high-low)");

        inventoryPage.VerifyAscending_order();
        inventoryPage.Verifydescending_order();

    }

    }

