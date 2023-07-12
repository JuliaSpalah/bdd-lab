package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.BasePage.getDriver;

public class LoginPage {

    @FindBy(xpath = "//a[@class='list-group-item' and text()='Forgotten Password']")
    private WebElement forgottenPasswordLocator;


    public LoginPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public ForgottenPasswordPage clickOnForgottenPassword() {
        forgottenPasswordLocator.click();
        return new ForgottenPasswordPage();
    }
}
