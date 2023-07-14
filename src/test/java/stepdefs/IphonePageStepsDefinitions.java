package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import org.example.IphonePage;

public class IphonePageStepsDefinitions {

    IphonePage iphonePage = new IphonePage();

    @Then("I check Iphone price in Dollars")
    public void iCheckIphonePriceInDollars(){
        double actualResult = iphonePage.getIPhonePriceDollars();
        double expectedResult = 123.20;

        Assertions.assertThat(actualResult)
                .as("fail")
                .isEqualTo(expectedResult);
    }

    @When("I click on a currency sign")
    public void iClickOnCurrencySign(){
        iphonePage.clickOnCurrencySign();
    }
    @When("I select EUR currency")
    public void iSelectCurrencyEUR(){
        iphonePage.clickOnEUR();
    }

    @Then("I check Iphone price in EUR")
    public void iCheckIphonePriceInEUR(){
        double actualResult = iphonePage.getIPhonePriceEuro();
        double expectedResult = 112.45;

        Assertions.assertThat(actualResult)
                .as("fail")
                .isEqualTo(expectedResult);
    }

    @When("I click on a currency sign 2")
    public void iClickOnCurrencySign2(){
        iphonePage.clickOnCurrencySign();
    }

    @When("I select GBP currency")
    public void iSelectCurrencyGBP(){
        iphonePage.clickOnGBP();
    }

    @Then("I check Iphone price in GBP")
    public void iCheckIphonePriceInGBP(){
        double actualResult = iphonePage.getIPhonePricePoundsSterling();
        double expectedResult = 96.41;

        Assertions.assertThat(actualResult)
                .as("fail")
                .isEqualTo(expectedResult);
    }
}
