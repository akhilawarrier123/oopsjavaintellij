package com.swaglabsTC;

//import Swaglabs.*;
import com.swaglabs.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


    /*public static void main(String[] args) {
        Negetive_testingTC NTC=new Negetive_testingTC();
        NTC.testing1_negetive_conditions();
        NTC.testing2_negetive_conditions();
    }*/

public class Negetive_testingTC {

    WebDriver driver;

    @Parameters({"browser"})
    @BeforeMethod
    public void initBrowser(@Optional(value = "chrome") String browserName){
        if(browserName.equals("chrome")) {
            driver = new ChromeDriver();
        }
    }
    public void testing1_negetive_conditions(){

        WebDriver driver = new ChromeDriver();
        LogInPage loginPage = new LogInPage(driver);
        loginPage.login("standard_user", "secret_sauce");


        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.clickOnCart();

        Cartpage cartPage = new Cartpage(driver);
        cartPage.Verify_product_Added(Cartpage.Backpack_locator);
        cartPage.Check_checkoutButton();


        CheckoutPage checkOutPage = new CheckoutPage(driver);
        checkOutPage.fillDetails("Akhila", "Warrier", "560087");



    }

    public void testing2_negetive_conditions(){

        WebDriver driver = new ChromeDriver();
        LogInPage loginPage = new LogInPage(driver);
        loginPage.login("standard_user", "secret_sauce");


        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.clickOnCart();

        Cartpage cartPage = new Cartpage(driver);
        cartPage.Verify_product_Added(Cartpage.Backpack_locator);
        cartPage.Check_checkoutButton();


        CheckoutPage checkOutPage = new CheckoutPage(driver);
        checkOutPage.fillDetails("Akhila", "Warrier", "560087");

        Negetive_testing Negetivetesting=new Negetive_testing(driver);
        Negetivetesting.null_taxtesting();
        Negetivetesting.null_calculateTotal();
    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }


}
