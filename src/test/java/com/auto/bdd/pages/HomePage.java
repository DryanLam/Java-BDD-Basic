package com.auto.bdd.pages;

import com.auto.bdd.utils.Timeout;
import io.cucumber.guice.ScenarioScoped;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

@ScenarioScoped
public class HomePage extends Page{

    @FindBy(id = "btn-make-appointment")
    private WebElement btnAppointment;

    public void openHomePage(){
        driver.navigate().to(getBaseUrl());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Timeout.MEDIUM_TIME, TimeUnit.SECONDS);
    }

    public void clickAppointment(){
        btnAppointment.click();
    }
}
