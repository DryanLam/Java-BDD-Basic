package com.auto.bdd.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/auto/bdd/features", glue={"com.auto.bdd.steps"}, publish = true
)
public class RunnerTest {
}