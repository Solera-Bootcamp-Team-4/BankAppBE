package com.solera.team4.bankappbe.Selenium;

import org.openga.selenium.WebDriver;

public class DriverFactory {
    
    private static DriverFactory driverFactory = null;

    private DriverFactory(){}

    public static void getInstance(){
         if(driverFactory.equals(null)){
            driverFactory = new DriverFactory(); 
        }
    }

    private static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<WebDriver>();

    public static WebDriver getDriver(BrowserType type){

        switch(type){
            case CHROME:
                threadLocal.set(new ChromeDriver());
                break;
            case FIREFOX:
                threadLocal.set(new FirefoxDriver());
                break;
            default://By default we choose chrome
                threadLocal.set(new ChromeDriver());
                break;
        }
    }
}
