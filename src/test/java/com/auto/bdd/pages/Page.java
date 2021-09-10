package com.auto.bdd.pages;

import com.auto.bdd.utils.DriverManager;
import com.auto.bdd.utils.Timeout;
import io.cucumber.guice.ScenarioScoped;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@ScenarioScoped
public class Page {
    protected WebDriver driver = DriverManager.getDriver();

    protected WebDriverWait wait = new WebDriverWait(driver, Timeout.SYNCHRONIZATION_TIME);

    public Page() {
        PageFactory.initElements(driver, this);
    }

    public static String getBaseUrl() {
        return (String) System.getProperty("siteUrl");
    }

    private void scrollIntoView(WebElement element) {
        executeJS("arguments[0].scrollIntoView(true)", element);
    }

    public void executeJS(Object... value) {
        JavascriptExecutor executor = (JavascriptExecutor) DriverManager.getDriver();
        if (value.length < 2) {
            executor.executeScript("return " + value[0] + ";");
        } else if (value.length == 2) {
            executor.executeScript(value[0].toString(), value[1]);
        }
    }

    public void click(WebElement element) throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollIntoView(element);
        element.click();
        waitForPageLoad();
    }

    public boolean waitForPageLoad() {
        this.pause(Timeout.SHORT_TIME);
        ExpectedCondition<Boolean> pageLoadCompleted = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver _driver) {
                return (Boolean) ((JavascriptExecutor) _driver).executeScript("return document.readyState")
                        .toString()
                        .equalsIgnoreCase("complete");
            }
        };
        return wait.until(pageLoadCompleted);
    }

    public void pause(int time) {
        try {
            Thread.sleep(time * 1000);
        } catch (Exception e) {
        }
    }

    public void closeBrowser() {
        DriverManager.closeBrowser();
    }

    public String pageTitle() {
        waitForPageLoad();
        return driver.getTitle();
    }
}
