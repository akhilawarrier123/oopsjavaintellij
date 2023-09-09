package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
public class TC3 {
    public void login_with_invalidusername_valid_password(){

        WebDriver driver =new ChromeDriver();//launch the chrome browser

        //enter UrL
        driver.get("https://www.saucedemo.com/v1/");

        driver.manage().window().maximize(); // to maximize

        //enter username

        WebElement  UsernameElement= driver.findElement(By.id("user-name"));
        UsernameElement.sendKeys("myaccount");

        //enter passoword


        WebElement  Password= driver.findElement(By.id("password"));
        Password.sendKeys("secret_sauce");
        //hit login button

        WebElement  loginButton= driver.findElement(By.id("login_button"));
        loginButton.click();
        driver.quit();


    }

    public static void main(String[] args) {
        TC3  test2=new TC3();
        test2.login_with_invalidusername_valid_password();

    }

}
