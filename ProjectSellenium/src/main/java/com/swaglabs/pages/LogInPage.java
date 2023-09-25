package com.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
    WebDriver driver;
    public static String usernamelocator="user-name";
    public static String Passwordlocator="password";
    public static String loginlocator="login-button";
    public static String ErrorMsglocator="//div[@class='error-message-container error']";





    public LogInPage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().window().maximize();
        this.driver.get("https://www.saucedemo.com/");
    }

public void login(String username,String password) {
    WebElement UsernameElement = driver.findElement(By.id(usernamelocator));
    UsernameElement.sendKeys(username);

    WebElement Password = driver.findElement(By.id(Passwordlocator));
    Password.sendKeys(password);
    //hit login button

    WebElement loginButton = driver.findElement(By.id(loginlocator));
    loginButton.click();
    //driver.quit();

}
    public void verifyErrorMsg(){
        WebElement errorMsgElement = driver.findElement(By.xpath(ErrorMsglocator));
        String expectedErrorMsg = "Epic sadface: Username and password do not match any user in this service";
        String actualErrorMsg = errorMsgElement.getText();

        //Verification
        if(expectedErrorMsg.equals(actualErrorMsg)){
            System.out.println("unable to login beacuse of wrong credentials "+ "TC passed");
        }else{
            System.out.println("Expected error msg as per requirement "+ expectedErrorMsg);
            System.out.println("but incorrect msg displayed:" + actualErrorMsg);
        }

    }


}






