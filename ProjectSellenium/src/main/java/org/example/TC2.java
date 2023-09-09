package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
public class TC2 {
    public void login_with_validusername_invalidpassword(){

        WebDriver driver =new ChromeDriver();//launch the chrome browser

        //enter UrL
        driver.get("https://www.saucedemo.com/v1/");

        driver.manage().window().maximize(); // to maximize

        //enter username

        WebElement  UsernameElement= driver.findElement(By.id("user-name"));
        UsernameElement.sendKeys("standard_user");

        //enter passoword


        WebElement  Password= driver.findElement(By.id("password"));
        Password.sendKeys("akhila123");
        //hit login button

        WebElement  loginButton= driver.findElement(By.id("login_button"));
        loginButton.click();
        driver.quit();


    }

    public static void main(String[] args) {
        TC2 test2=new TC2();
        test2.login_with_validusername_invalidpassword();

    }
}

