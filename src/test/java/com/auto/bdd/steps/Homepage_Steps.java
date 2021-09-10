package com.auto.bdd.steps;

import com.auto.bdd.pages.AppointmentPage;
import com.auto.bdd.pages.HomePage;
import com.auto.bdd.pages.LoginPage;
import com.auto.bdd.utils.Verify;
import com.google.inject.Inject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Homepage_Steps {

    @Inject HomePage homePage;
    @Inject LoginPage loginPage;
    @Inject AppointmentPage appointmentPage;


    @Given("Navigate to home page")
    public void navigateToHomePage() {
        homePage.openHomePage();
    }

    @When("Click to Appointment button on home page")
    public void clickToAppointmentButtonOnHomePage() {
        homePage.clickAppointment();
    }

    @And("Input username {string} and password {string}")
    public void inputUsernameAndPassword(String userName, String passWord) {
        loginPage.inputUserName(userName);
        loginPage.inputPassword(passWord);
    }

    @And("Click to Login button on login page")
    public void clickToLoginButtonOnLoginPage() {
        loginPage.clickLogin();
    }

    @Then("Verify that {string} page is displayed")
    public void verifyThatPageIsDisplayed(String pageTitle) {
        String title = appointmentPage.pageTitle();
        Verify.isTrue(title.contains(pageTitle));
    }
}
