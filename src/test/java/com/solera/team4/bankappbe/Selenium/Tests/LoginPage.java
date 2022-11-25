package com.solera.team4.bankappbe.Selenium.Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.solera.team4.bankappbe.Selenium.Configurations.BrowserType;
import com.solera.team4.bankappbe.Selenium.Configurations.DriverFactory;

public class LoginPage {
    
    @Test
    void loginTest(){
        WebDriver webDriver = DriverFactory.getInstance().getDriver(BrowserType.CHROME); //Taking the driver
        webDriver.get("http://localhost:3000/LoginUser"); //Taking the url

        WebElement userEmail = webDriver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div/div[1]/input"));
        WebElement userPass = webDriver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div/div[2]/input"));

        userEmail.sendKeys("Andrea.Colucci@soler.com");
        userPass.sendKeys("ForTestingPurpose123");

        WebElement result; //To check if we are getting the right result

        //Write the assertion here!
    }
}
