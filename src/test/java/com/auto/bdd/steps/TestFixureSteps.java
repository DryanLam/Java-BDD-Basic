package com.auto.bdd.steps;

import com.auto.bdd.pages.Page;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class TestFixureSteps extends Page{
    @After
    public void tearDownScenario(Scenario scenario){
        closeBrowser();
    }
}
