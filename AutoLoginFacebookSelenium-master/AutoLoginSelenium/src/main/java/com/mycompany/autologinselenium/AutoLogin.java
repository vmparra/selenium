package com.mycompany.autologinselenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoLogin {

    public static void main(String[] args) {
//      Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
//      Navigating to the intended url
        driver.get("https://www.facebook.com/");
//      Maximizing the window
        driver.manage().window().maximize();
//        Waiting for browser to load page
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        Finding the username textbox element and entering the repective username
        driver.findElement(By.name("email")).sendKeys("username");
//        Finding the password textbox element and entering the repective password
        driver.findElement(By.name("pass")).sendKeys("password");
//        Waiting for browser to load page
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        Clicking Log in button
        driver.findElement(By.id("u_0_x")).click();
//        closing the driver instance
        driver.close();
    }
}
