package com.auto.bdd.steps;

import com.auto.bdd.pages.Page;
import com.google.inject.Inject;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestFixtureSteps {

    @Inject
    Page page;

    @Before
    public void setUpScenario(Scenario scenario){
    }

    @After
    public void tearDownScenario(Scenario scenario){
        page.closeBrowser();
    }
}
