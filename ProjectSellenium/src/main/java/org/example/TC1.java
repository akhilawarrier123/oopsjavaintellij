package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
public class TC1 {
    public void login_with_validdata(){

        WebDriver driver =new ChromeDriver();//launch the chrome browser

        //enter UrL
        driver.get("https://www.saucedemo.com/v1/");

        driver.manage().window().maximize(); // to maximize

        //enter username

        WebElement  UsernameElement= driver.findElement(By.id("user-name"));
        UsernameElement.sendKeys("standard_user");

        //enter passoword


        WebElement  Password= driver.findElement(By.id("password"));
        Password.sendKeys("secret_sauce");
        //hit login button

        WebElement  loginButton= driver.findElement(By.id("login-button"));
        loginButton.click();
        driver.quit();


    }

    public static void main(String[] args) {
        TC1  test1=new TC1();
        test1.login_with_validdata();

    }
}
