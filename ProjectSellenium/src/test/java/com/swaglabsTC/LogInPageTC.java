package com.swaglabsTC;

import Listner.Retry;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.swaglabs.pages.InventoryPage;
import com.swaglabs.pages.LogInPage; // while writing driver always. it is difficult to write it.. so we are using this thread local.get
                                     // so instead of driver we have to write  thread local.get instead of driver in every method
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.time.Duration;

public class LogInPageTC extends BaseClass{

    //ThreadLocal<WebDriver>webDriverThreadLocal=new ThreadLocal<>()

    ThreadLocal<WebDriver>webDriverThreadLocal=new ThreadLocal<>();
ThreadLocal<ExtentTest>extentTest=new ThreadLocal<>();

    WebDriver driver;

    @Parameters({"browser"})
    @BeforeMethod
    public void initBrowser(@Optional(value = "chrome") String browserName) {
        if (browserName.equals("chrome")) {
            webDriverThreadLocal.set(new ChromeDriver());
            // webDriverThreadLocal.get();
            webDriverThreadLocal.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        }
    }

 @Test                        (dataProvider = "validCred")                                                                          //, retryAnalyzer = Retry.class)
    public void TC1_login_with_valid_username_and_password(String username,String password) {
        //WebDriver driver = new ChromeDriver();
     extentTest.set(extentReports.createTest("TC1_login_with_valid_username_and_password"));
     extentTest.get().info("TC1 started");
        LogInPage loginPage = new LogInPage(webDriverThreadLocal.get());
        extentTest.get().info("Login page", MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot((webDriverThreadLocal.get()))).build());
      //  captureScreenshot((webDriverThreadLocal.get()));
        loginPage.login(username,password);

     extentTest.get().info("Login Successfully");
     extentTest.get().info("Login Successfully", MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot((webDriverThreadLocal.get()))).build());
     //captureScreenshot((webDriverThreadLocal.get()));

     InventoryPage inventoryPage = new InventoryPage(webDriverThreadLocal.get());
     extentTest.get().info("Inventory page");
     inventoryPage.Verify_inventory_Page_title();
     extentTest.get().info("TC1 completed");
     extentTest.get().pass("TC1_login_with_valid_username_and_password passed");
    // Assert.fail();
 }



@Test                      (dataProvider = "invalidCred")
    public void TC2_login_with_valid_username_and_invalid_password(String username, String password) {
       // WebDriver driver = new ChromeDriver();
    extentTest.set(extentReports.createTest("TC2_login_with_valid_username_and_invalid_password"));
    extentTest.get().info("TC2 started");
        LogInPage loginPage = new LogInPage(webDriverThreadLocal.get());
        loginPage.login(username,password);
   // loginPage.login("standard_user", "secret_sauce");
    extentTest.get().info("Login Successfully");
        loginPage.verifyErrorMsg();
    extentTest.get().info("TC2 completed");
    extentTest.get().pass("TC2_login_with_valid_username_and_invalid_password passed");



}

@Test                          (dataProvider = "invalidCred")
    public void TC3_login_with_invalid_username_and_valid_password(String username, String password) {
       // WebDriver driver = new ChromeDriver();

        LogInPage loginPage = new LogInPage(webDriverThreadLocal.get());
        loginPage.login(username,password);
   // loginPage.login("standard_user", "secret_sauce");
        loginPage.verifyErrorMsg();



    }
@Test                   (dataProvider = "invalidCred")
    public void TC4_login_with_invalid_username_and_invalid_password(String username, String password) {
       // WebDriver driver = new ChromeDriver();

        LogInPage loginPage = new LogInPage(webDriverThreadLocal.get());
        loginPage.login(username,password);
    //loginPage.login("standard_user", "secret_sauce");
        loginPage.verifyErrorMsg();

    }
    @AfterMethod
    public void closeBrowser(ITestResult Result){
        if(Result.getStatus()==ITestResult.FAILURE){
            extentTest.get().fail("TC failed");
        }

        webDriverThreadLocal.get().quit();
    }
}