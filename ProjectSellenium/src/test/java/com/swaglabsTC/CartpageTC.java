package com.swaglabsTC;

import com.swaglabs.pages.Cartpage;
import com.swaglabs.pages.InventoryPage;
//import com.swaglabs.pages.CartPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;






    /*public static void main(String[] args) {
        CartpageTC cartpagetc=new CartpageTC();
        cartpagetc.Verify_item_added_or_not();
        cartpagetc.Check_continuebutton();
        cartpagetc.Test_for_checkout_pages();
    }*/


    public class CartpageTC {
        ThreadLocal<WebDriver>webDriverThreadLocal=new ThreadLocal<>();
        WebDriver driver;

        @Parameters({"browser"})
        @BeforeMethod
        public void initBrowser(@Optional(value = "chrome") String browserName){
            if(browserName.equals("chrome")) {
                webDriverThreadLocal.set(new ChromeDriver());
                webDriverThreadLocal.get();
                webDriverThreadLocal.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            }
        }
@Test
        public void Verify_item_added_or_not(){
        WebDriver driver = new ChromeDriver();
        InventoryPage inventoryPage = new InventoryPage(webDriverThreadLocal.get());
        inventoryPage.Add_Product(InventoryPage.backpackAddToCart);
        inventoryPage.Add_Product(InventoryPage.BikelightAddtoCart);
        inventoryPage.Add_Product(InventoryPage.BolttShirtAddtoCart);
        inventoryPage.Add_Product(InventoryPage.FleeceJacketAddtoCart);


        Cartpage CartPage=new Cartpage(webDriverThreadLocal.get());
        CartPage.Verify_product_Added(CartPage.Backpack_locator);
        CartPage.Verify_product_Added(CartPage.Bikelight_locator);
        //CartPage.Verify_product_Added(CartPage.)
   }

@Test
    public void Check_continuebutton()
    {
        WebDriver driver = new ChromeDriver();
        InventoryPage inventoryPage1 = new InventoryPage(webDriverThreadLocal.get());
        inventoryPage1.Add_Product(InventoryPage.backpackAddToCart);
        inventoryPage1.Add_Product(InventoryPage.BikelightAddtoCart);
        Cartpage CartPage=new Cartpage(driver);
        CartPage.Verify_product_Added(CartPage.Backpack_locator);
        CartPage.Check_continueButton();
    }
  @Test
    public void Test_for_checkout_pages()
    {
        WebDriver driver = new ChromeDriver();
        InventoryPage inventoryPage1 = new InventoryPage(webDriverThreadLocal.get());
        inventoryPage1.Add_Product(InventoryPage.backpackAddToCart);
        inventoryPage1.Add_Product(InventoryPage.BikelightAddtoCart);


        Cartpage CartPage=new Cartpage(webDriverThreadLocal.get());
        CartPage.Verify_product_Added(CartPage.Backpack_locator);

        CartPage.Check_checkoutButton();

    }
        @AfterMethod
        public void closeBrowser()
        {
            webDriverThreadLocal.get() .quit();
        }




    }
