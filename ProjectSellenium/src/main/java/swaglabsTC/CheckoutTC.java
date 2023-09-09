package swaglabsTC;

import Swaglabs.*;
import Swaglabs.Cartpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckoutTC {

    public static void main(String[] args) {
        CheckoutTC checkOutTC = new CheckoutTC();
        checkOutTC.TC1_enter_Details();

        checkOutTC.Tc2_CheckTotalPrice();

    }


    public void TC1_enter_Details(){

        WebDriver driver = new ChromeDriver();
        LogInPage loginPage = new LogInPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.Add_Product(InventoryPage.backpackAddToCart);
        inventoryPage.Add_Product(InventoryPage.BikelightAddtoCart);
        inventoryPage.Add_Product(InventoryPage.FleeceJacketAddtoCart);
        inventoryPage.Add_Product(InventoryPage.BolttShirtAddtoCart);


        inventoryPage.clickOnCart();



        Cartpage cartPage = new Cartpage(driver);

        cartPage.Verify_product_Added(Cartpage.Backpack_locator);
        cartPage.Check_checkoutButton();

        CheckoutPage checkOutPage = new CheckoutPage(driver);
        checkOutPage.fillDetails("Akhila", "Warrier", "560087");



        checkOutPage.calculatePrice();




    }

public void Tc2_CheckTotalPrice(){
    WebDriver driver = new ChromeDriver();
    LogInPage loginPage = new LogInPage(driver);
    loginPage.login("standard_user", "secret_sauce");

    InventoryPage inventoryPage = new InventoryPage(driver);
    inventoryPage.Add_Product(InventoryPage.backpackAddToCart);
    inventoryPage.Add_Product(InventoryPage.BikelightAddtoCart);
    inventoryPage.Add_Product(InventoryPage.FleeceJacketAddtoCart);
    inventoryPage.Add_Product(InventoryPage.BolttShirtAddtoCart);


    inventoryPage.clickOnCart();



    Cartpage cartPage = new Cartpage(driver);

    cartPage.Verify_product_Added(Cartpage.Backpack_locator);
    cartPage.Check_checkoutButton();

    CheckoutPage checkOutPage = new CheckoutPage(driver);
    checkOutPage.fillDetails("Akhila", "Warrier", "560087");
    checkOutPage.calculateTotal();

     checkOutPage.check_finishbutton();
    checkOutPage.check_backtohome();

}

}
