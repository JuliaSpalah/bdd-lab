package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import org.example.ForgottenPasswordPage;

public class ForgottenPasswordPageStepsDefinitions {

    ForgottenPasswordPage forgottenPasswordPage = new ForgottenPasswordPage();

    @When("I set an email into email field")
    public void iSetEmailToEmailField() {
        forgottenPasswordPage.setEmailToEmailField("anakonda@mail.com");
    }

    @When("I click on a Continue button on Forgotten Password Page")
    public void iClickOnContinueButtonOnForgottenPasswordPage() {
        forgottenPasswordPage.clickOnContinueButton();
    }

    @Then("I check an Alert Message text")
    public void iCheckAnAlertMessageText() {
        String actualResult = forgottenPasswordPage.getAlertMessageAfterSecond();
        String expectedResult = "Warning: The E-Mail Address was not found in our records!";

        Assertions.assertThat(actualResult)
                .as("fail")
                .isEqualTo(expectedResult);
    }
}
