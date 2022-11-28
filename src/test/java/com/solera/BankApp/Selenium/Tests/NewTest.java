package com.solera.BankApp.Selenium.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class NewTest {

    @Test
    public void testing() {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        assertTrue(true);
    }

}
