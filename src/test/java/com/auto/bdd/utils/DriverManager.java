package com.auto.bdd.utils;

import org.openqa.selenium.WebDriver;

public class DriverManager {
    private static DriverManager INSTANCE;
    private static WebDriver driver;
    private DriverManager() {
    }

    public static WebDriver getDriver(){
        if (null == INSTANCE) {
            INSTANCE = new DriverManager();
            driver = new DriverFactory().getDriver();
            return driver;
        }
        return driver;
    }

    public static void closeBrowser(){
        driver.quit();
        dispose();
    }

    private static void dispose(){
        INSTANCE = null;
    }
}
