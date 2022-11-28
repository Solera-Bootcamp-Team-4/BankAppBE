package com.solera.BankApp.Selenium.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class LoginPage {

    @BeforeAll
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void loginTest() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://localhost:3000/LoginUser"); //Taking the url

        String actual = webDriver.getTitle();
        String expected = "React App";

        assertEquals(expected, actual);
        webDriver.close();
    }
}
