package com.auto.bdd.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    private WebDriver driver;

    // Just implementing Firefox
    public WebDriver createDriver() {
        if (null == driver) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            return driver;
        }
        return driver;
    }

    public WebDriver getDriver() {
        if (driver == null) {
            return this.createDriver();
        }
        return driver;
    }
}
