package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.LoginPage;

public class LoginPageStepsDefinitions {

    LoginPage loginPage = new LoginPage();

    @When("I click on forgotten password")
    public void iClickOnForgottenPassword(){
        loginPage.clickOnForgottenPassword();
    }

}
