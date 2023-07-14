package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
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
    public void iClickOnLogin() {
        mainPage.clickOnLogin();
    }

    @When("I hover over Desktops")
    public void iHoverOverDesktops() {
        mainPage.hoverOverDesktops();
    }

    @When("I click on Desktops")
    public void iClickOnDesktops() {
        mainPage.clickOnDesktops();
    }

    @When("I click on Show All Desktops")
    public void iClickOnShowAllDesktops() {
        mainPage.clickOnShowAllDesktops();
    }

    @Then("I check a current currency sign")
    public void iCheckCurrencySign(){
        String actualResult = mainPage.getCurrencySign();
        String expectedResult = "$";

        Assertions.assertThat(actualResult)
                .as("fail")
                .isEqualTo(expectedResult);
    }

    @When("I click on Iphone on Main Page")
    public void iClickOnIphone(){
        mainPage.clickOnIPhone();
    }
}

