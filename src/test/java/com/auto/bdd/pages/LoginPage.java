package com.auto.bdd.pages;

import cucumber.runtime.java.guice.ScenarioScoped;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@ScenarioScoped
public class LoginPage extends Page {
    @FindBy(id = "txt-username")
    private WebElement txtUsername;

    @FindBy(id = "txt-password")
    private WebElement txtPassword;

    @FindBy(id = "btn-login")
    private WebElement btnLogin;


    public void inputUserName(String username) {
        txtUsername.sendKeys(username);
    }

    public void inputPassword(String pwd) {
        txtPassword.sendKeys(pwd);
    }

    public void clickLogin() {
        btnLogin.click();
    }

}
