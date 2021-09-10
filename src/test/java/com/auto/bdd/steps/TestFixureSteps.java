package com.auto.bdd.steps;

import com.auto.bdd.pages.Page;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;

public class TestFixureSteps extends Page{
    @After
    public void tearDownScenario(Scenario scenario){
        closeBrowser();
    }
}
