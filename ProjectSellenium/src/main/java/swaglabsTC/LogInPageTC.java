package swaglabsTC;

import Swaglabs.LogInPage;
//import com.swaglabs.pages.InventoryPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogInPageTC {


    public static void main(String[] args) {
        LogInPageTC loginTC = new LogInPageTC();
        loginTC.TC1_login_with_valid_username_and_password();
        loginTC.TC2_login_with_valid_username_and_invalid_password();
        loginTC.TC3_login_with_invalid_username_and_valid_password();
        loginTC.TC4_login_with_invalid_username_and_invalid_password();
    }
@Test(groups="smoke",priority=2)
    public void TC1_login_with_valid_username_and_password() {
        WebDriver driver = new ChromeDriver();
        LogInPage loginPage = new LogInPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        /*InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.verifyInventoryPage();*/
        driver.quit();
    }
@Test(groups="smoke",priority=1)//(enabled = false)//it won't execute the particular test case
    public void TC2_login_with_valid_username_and_invalid_password() {
        WebDriver driver = new ChromeDriver();

        LogInPage loginPage = new LogInPage(driver);
        loginPage.login("standard_user", "@#!@qwe123");
        loginPage.verifyErrorMsg();
        driver.quit();

    }

@Test
    public void TC3_login_with_invalid_username_and_valid_password() {
        WebDriver driver = new ChromeDriver();

        LogInPage loginPage = new LogInPage(driver);
        loginPage.login("akhila", "secret_sauce");
        loginPage.verifyErrorMsg();
        driver.quit();


    }
@Test
    public void TC4_login_with_invalid_username_and_invalid_password() {
        WebDriver driver = new ChromeDriver();

        LogInPage loginPage = new LogInPage(driver);
        loginPage.login("akhila","123rtyo");
        loginPage.verifyErrorMsg();
        driver.quit();
    }
}