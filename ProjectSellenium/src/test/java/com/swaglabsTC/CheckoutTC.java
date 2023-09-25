package com.swaglabsTC;

//import Swaglabs.*;
import com.swaglabs.pages.Cartpage;
import com.swaglabs.pages.CheckoutPage;
import com.swaglabs.pages.InventoryPage;
import com.swaglabs.pages.LogInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;



    /*public static void main(String[] args) {
        CheckoutTC checkOutTC = new CheckoutTC();
        checkOutTC.TC1_enter_Details();

        checkOutTC.Tc2_CheckTotalPrice();

    }*/

    public class CheckoutTC {

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
    public void TC1_enter_Details(){

        WebDriver driver = new ChromeDriver();
        LogInPage loginPage = new LogInPage(webDriverThreadLocal.get());
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.Add_Product(InventoryPage.backpackAddToCart);
        inventoryPage.Add_Product(InventoryPage.BikelightAddtoCart);
        inventoryPage.Add_Product(InventoryPage.FleeceJacketAddtoCart);
        inventoryPage.Add_Product(InventoryPage.BolttShirtAddtoCart);


        inventoryPage.clickOnCart();



        Cartpage cartPage = new Cartpage(webDriverThreadLocal.get());

        cartPage.Verify_product_Added(Cartpage.Backpack_locator);
        cartPage.Check_checkoutButton();

        CheckoutPage checkOutPage = new CheckoutPage(webDriverThreadLocal.get());
        checkOutPage.fillDetails("Akhila", "Warrier", "560087");



        checkOutPage.calculatePrice();




    }
@Test
public void Tc2_CheckTotalPrice(){
    WebDriver driver = new ChromeDriver();
    LogInPage loginPage = new LogInPage(webDriverThreadLocal.get());
    loginPage.login("standard_user", "secret_sauce");

    InventoryPage inventoryPage = new InventoryPage(driver);
    inventoryPage.Add_Product(InventoryPage.backpackAddToCart);
    inventoryPage.Add_Product(InventoryPage.BikelightAddtoCart);
    inventoryPage.Add_Product(InventoryPage.FleeceJacketAddtoCart);
    inventoryPage.Add_Product(InventoryPage.BolttShirtAddtoCart);


    inventoryPage.clickOnCart();



    Cartpage cartPage = new Cartpage(webDriverThreadLocal.get());

    cartPage.Verify_product_Added(Cartpage.Backpack_locator);
    cartPage.Check_checkoutButton();

    CheckoutPage checkOutPage = new CheckoutPage(webDriverThreadLocal.get());
    checkOutPage.fillDetails("Akhila", "Warrier", "560087");
    checkOutPage.calculateTotal();

     checkOutPage.check_finishbutton();
    checkOutPage.check_backtohome();

}
        @AfterMethod
        public void closeBrowser(){

            webDriverThreadLocal.get().quit();
        }


}
