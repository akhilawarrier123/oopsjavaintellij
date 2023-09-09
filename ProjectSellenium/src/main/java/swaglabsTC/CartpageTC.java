package swaglabsTC;

import Swaglabs.Cartpage;
import Swaglabs.InventoryPage;
//import com.swaglabs.pages.CartPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CartpageTC {


    public static void main(String[] args) {
        CartpageTC cartpagetc=new CartpageTC();
        cartpagetc.Verify_item_added_or_not();
        cartpagetc.Check_continuebutton();
        cartpagetc.
                Test_for_checkout_pages();
    }

    public void Verify_item_added_or_not(){
        WebDriver driver = new ChromeDriver();
        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.Add_Product(InventoryPage.backpackAddToCart);
        inventoryPage.Add_Product(InventoryPage.BikelightAddtoCart);
        inventoryPage.Add_Product(InventoryPage.BolttShirtAddtoCart);
        inventoryPage.Add_Product(InventoryPage.FleeceJacketAddtoCart);


        Cartpage CartPage=new Cartpage(driver);
        CartPage.Verify_product_Added(CartPage.Backpack_locator);
        CartPage.Verify_product_Added(CartPage.Bikelight_locator);
        //CartPage.Verify_product_Added(CartPage.)
   }


    public void Check_continuebutton()
    {
        WebDriver driver = new ChromeDriver();
        InventoryPage inventoryPage1 = new InventoryPage(driver);
        inventoryPage1.Add_Product(InventoryPage.backpackAddToCart);
        inventoryPage1.Add_Product(InventoryPage.BikelightAddtoCart);
        Cartpage CartPage=new Cartpage(driver);
        CartPage.Verify_product_Added(CartPage.Backpack_locator);
        CartPage.Check_continueButton();
    }
    public void Test_for_checkout_pages()
    {
        WebDriver driver = new ChromeDriver();
        InventoryPage inventoryPage1 = new InventoryPage(driver);
        inventoryPage1.Add_Product(InventoryPage.backpackAddToCart);
        inventoryPage1.Add_Product(InventoryPage.BikelightAddtoCart);


        Cartpage CartPage=new Cartpage(driver);
        CartPage.Verify_product_Added(CartPage.Backpack_locator);

        CartPage.Check_checkoutButton();

    }

}
