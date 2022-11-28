package com.solera.BankApp.Selenium.Tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

import com.solera.BankApp.Selenium.Configurations.BrowserType;
import com.solera.BankApp.Selenium.Configurations.DriverFactory;

@SpringBootTest
public class NewTest {
    

    @Test
    public void testing(){
        System.setProperty("webdriver.chrome.driver",
        "C:\\Users\\Andrea.Colucci\\selenium-java-4.6.0\\chromeDriver\\chromedriver_win32");

        WebDriver webDriver = new ChromeDriver();
        assertTrue(true);
    }
}
