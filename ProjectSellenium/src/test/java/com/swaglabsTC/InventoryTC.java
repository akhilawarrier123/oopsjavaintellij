package com.swaglabsTC;

import com.swaglabs.pages.InventoryPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;


/*public static void main(String[] args) throws InterruptedException {
    InventoryTC inventoryTC = new InventoryTC();
    //inventoryTC.TC_addProducts_to_the_cart();


    inventoryTC.TCSort_item();
    // inventoryTC.TC_remove_Item_from_cart();

}*/
public class InventoryTC {



        WebDriver driver;
        ThreadLocal<WebDriver>webDriverThreadLocal=new ThreadLocal<>();
        @Parameters({"browser"})
        @BeforeMethod
        public void initBrowser(@Optional(value = "chrome") String browserName) {
            if (browserName.equals("chrome")) {
                webDriverThreadLocal.set(new ChromeDriver());
                webDriverThreadLocal.get();
                webDriverThreadLocal.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            }
        }
@Test
            public void TC_addProducts_to_the_cart() {

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
@Test
            public void TC_remove_Item_from_cart () {
                WebDriver driver = new ChromeDriver();
                InventoryPage inventoryPage = new InventoryPage(driver);
                inventoryPage.Remove_Product(InventoryPage.removeItem_backpack);
                inventoryPage.Remove_Product(InventoryPage.removeItem_bikelight);
                // inventoryPage.Remove  _Product(InventoryPage.removeItem_boltTshirt);
                inventoryPage.Remove_Product(InventoryPage.removeItem_fleeceJacket);


            }

@Test
            public void TCSort_item () {

                WebDriver driver = new ChromeDriver();
                InventoryPage inventoryPage = new InventoryPage(driver);

                inventoryPage.sortProducts("lohi", "Price(low-high)");
                inventoryPage.sortProducts("lohi", "Price(high-low)");

                inventoryPage.VerifyAscending_order();
                inventoryPage.Verifydescending_order();

            }
    @AfterMethod
    public void closeBrowser(){

        webDriverThreadLocal.get().quit();
    }

        }

