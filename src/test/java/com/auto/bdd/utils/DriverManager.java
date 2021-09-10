package com.auto.bdd.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
    protected static WebDriver driver = null;

    public static WebDriver getDriver() {
        if (null != driver) {
            return driver;
        }

        // Just implementing Firefox
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        return driver;
    }
}
