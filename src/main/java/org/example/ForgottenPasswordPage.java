package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.BasePage.getDriver;
import static utils.Utils.waitSeconds;

public class ForgottenPasswordPage {
    @FindBy(xpath = "//*[@id='input-email']")
    private WebElement emailInput;

    @FindBy(xpath = "//button[text()='Continue']")
    private WebElement continueButtonForgottenPassword;

    @FindBy(xpath = "//div[@id='alert']//div")
    private WebElement alertMessage;

    public ForgottenPasswordPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public ForgottenPasswordPage setEmailToEmailField(String email) {
        emailInput.sendKeys(email);
        return this;
    }

    public ForgottenPasswordPage clickOnContinueButton() {
        continueButtonForgottenPassword.click();
        return this;
    }

    public String getAlertMessageAfterSecond() {
        waitSeconds(1);
        return alertMessage.getText();
    }
}
