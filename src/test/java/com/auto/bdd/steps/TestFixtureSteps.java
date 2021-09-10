package com.auto.bdd.steps;

import com.auto.bdd.pages.Page;
import com.google.inject.Inject;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class TestFixtureSteps{
    @Inject
    Page page;

    @After
    public void tearDownScenario(Scenario scenario){
        page.closeBrowser();
    }
}
