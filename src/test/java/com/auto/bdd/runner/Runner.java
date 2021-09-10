package com.auto.bdd.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = {"@Regression"},
        features = {"src/test/java/com/auto/bdd/features"},
        plugin = {
                "json:target/result.json"
        },
        glue = {
                "com.auto.bdd.steps"
        }
)
public class Runner extends AbstractTestNGCucumberTests {
}
