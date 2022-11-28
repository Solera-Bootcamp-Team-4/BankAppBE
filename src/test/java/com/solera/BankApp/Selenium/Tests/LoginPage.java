package com.solera.BankApp.Selenium.Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

import com.solera.BankApp.Selenium.Configurations.BrowserType;
import com.solera.BankApp.Selenium.Configurations.DriverFactory;

@SpringBootTest
public class LoginPage {
    
    @BeforeAll
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver",
        "C:\\Users\\Andrea.Colucci\\selenium-java-4.6.0\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
    }
    
    @Test
    public void loginTest(){
         WebDriver webDriver = DriverFactory.getInstance().getDriver(BrowserType.CHROME); //Taking the driver
         webDriver.get("http://localhost:3000/LoginUser"); //Taking the url

         WebElement userEmail = webDriver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div/div[1]/input"));
         WebElement userPass = webDriver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div/div[2]/input"));

         userEmail.sendKeys("Andrea.Colucci@solera.com");
         userPass.sendKeys("ForTestingPurpose123");

         String result = webDriver.getCurrentUrl();

         assertEquals("http://localhost:3000/", result);
    }
}
