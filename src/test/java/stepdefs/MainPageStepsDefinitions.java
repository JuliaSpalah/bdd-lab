package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.MainPage;

public class MainPageStepsDefinitions {

    MainPage mainPage = new MainPage();

    @Given("I am on the main page")
    public void iAmOnTheMainPage() {
        mainPage.openMainPage();
    }

    @When("I click on the brands link")
    public void iClickOnBrandsLink() {
        mainPage.clickBrandsLink();
    }

    @When("I click on my account")
    public void iClickOnMyAccount() {
        mainPage.clickOnMyAccount();
    }

    @When("I click on login")
    public void iClickOnLogin(){
        mainPage.clickOnLogin();
    }
}
