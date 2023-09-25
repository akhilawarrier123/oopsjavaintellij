package com.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Cartpage {


    WebDriver driver;
   // public static String cartbuttonlocator="shopping_cart_link";
public  static String Backpack_locator="//div[@class='inventory_item_name']";
    public  static String Bikelight_locator="//div[@class='inventory_item_name']";
    public  static String Boltshirt_locator="//div[@class='inventory_item_name']";
    public  static String fleecejacket_locator="//div[@class='inventory_item_name']";
    public static String cartbuttonlocator="shopping_cart_link";

public static  String Continue_locator="continue-shopping";
public  static String Checkout_locator="checkout";
    public Cartpage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().window().maximize();
        this.driver.get("https://www.saucedemo.com");
        LogInPage logpage=new LogInPage(driver);
        logpage.login("standard_user","secret_sauce");
    }
    public void Verify_inventory_Page_title() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/cart.html"));
    }

        public void Verify_product_Added(String locator)

    {
        WebElement CartButton=driver.findElement(By.className(cartbuttonlocator));
        CartButton.click();

      /*  WebElement productElement=driver.findElement(By.xpath(locator));
        boolean isdisplayedActual=productElement.isDisplayed();
        boolean expectedValue=true;
        Assert.assertEquals(isdisplayedActual,expectedValue,"Element not displayed in cart");
        System.out.println("products are added the cart Successfully");*/
    }
    public void Check_continueButton(){
        WebElement checkContinue= driver.findElement(By.id( Continue_locator));
        checkContinue.click();
        System.out.println("checked continue button");
    }

    public void Check_checkoutButton(){
        WebElement checkCheckout=driver.findElement(By.id(Checkout_locator));
        checkCheckout.click();
        System.out.println("checked checkout button");
    }




}
