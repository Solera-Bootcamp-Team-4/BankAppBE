package com.solera.BankApp.Selenium.Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.boot.test.context.SpringBootTest;
import com.solera.BankApp.Selenium.Configurations.BrowserType;
import com.solera.BankApp.Selenium.Configurations.DriverFactory;

@SpringBootTest
public class SignUp {
    
    @BeforeAll
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver",
        "C:\\Users\\Andrea.Colucci\\selenium-java-4.6.0\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
    }
    
    @Test
    public void signUpTest(){
         WebDriver webDriver = DriverFactory.getInstance().getDriver(BrowserType.CHROME); //Taking the driver
         webDriver.get("http://localhost:3000/SignUpForm"); //Taking the url

         WebElement firstName = webDriver.findElement(By.id("floatingInputFirstName"));
         WebElement lastName = webDriver.findElement(By.id("floatingInputLastName"));
         WebElement email = webDriver.findElement(By.id("floatingInputEmail"));
         WebElement pass = webDriver.findElement(By.id("floatingPassword"));
         WebElement confirmPass = webDriver.findElement(By.id("floatingPasswordConfirm"));
         WebElement button = webDriver.findElement(By.id("button-id"));

         firstName.sendKeys("Andrea");
         lastName.sendKeys("Colucci");
         email.sendKeys("Andrea.Colucci@solera.com");
         pass.sendKeys("BankTest123");
         confirmPass.sendKeys("BankTest123");
         button.click();
         
         String resultUrl = webDriver.getCurrentUrl();
         String resultName = webDriver.findElement(By.className("userCol__rowName")).getText();
         String resultEmail = webDriver.findElement(By.className("userCol__rowUser")).getText();

         assertEquals("http://localhost:3000/Home", resultUrl);
         assertEquals("Andrea Colucci", resultName);
         assertEquals("Andrea.Colucci@solera.com", resultEmail);

         webDriver.quit();
    }
}
