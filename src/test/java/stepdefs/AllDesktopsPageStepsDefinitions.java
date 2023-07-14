package stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import org.example.AllDesktopsPage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllDesktopsPageStepsDefinitions {

    AllDesktopsPage allDesktopsPage = new AllDesktopsPage();

    @Then("I check that the value in Show dropdown is 10")
    public void iCheckSelectedValueInShowDropdown() {
        String actualResult = allDesktopsPage.getShowSelectedValue();
        String expectedResult = "10";

        Assertions.assertThat(actualResult)
                .as("fail")
                .isEqualTo(expectedResult);
    }

    @Then("I check that Sort by value is Default")
    public void iCheckSelectedValueInSortByDropdown() {
        String actualResult = allDesktopsPage.getSortBySelectedValue();
        String expectedResult = "Default";

        Assertions.assertThat(actualResult)
                .as("fail")
                .isEqualTo(expectedResult);
    }

    @Then("I check a quantity of products on page")
    public void iCheckQuantityOfProductsOnPage() {
        int actualResult = allDesktopsPage.getQuantityOfProducts();
        int expectedResult = 10;

        Assertions.assertThat(actualResult)
                .as("fail")
                .isEqualTo(expectedResult);
    }

    @When("I select 25 from show dropdown")
    public void iSelect25FromShowDropdown() {
        allDesktopsPage.select25FromShowDropdown("25");
    }

    @Then("I check a quantity of products on page after 25 selected in show dropdown")
    public void iCheckQuantityOfProductsOnPageAfter25SelectedInShowDropdown() {
        int actualResult = allDesktopsPage.getQuantityOfProductsAfterSelected25();
        int expectedResult = 12;

        Assertions.assertThat(actualResult)
                .as("fail")
                .isEqualTo(expectedResult);
    }

    @Then("I check text Showing 1 to 12 of 12 (1 Pages)")
    public void iCheckQuantityOfPagesOnWebPage() {
        String actualResult = allDesktopsPage.getPagesQuantityOnWebPage();
        String expectedResult = "Showing 1 to 12 of 12 (1 Pages)";

        Assertions.assertThat(actualResult)
                .as("fail")
                .isEqualTo(expectedResult);
    }

    @When("I click on Sort By dropdown")
    public void iClickOnSortByDropdown() {
        allDesktopsPage.clickOnSortByDropdown();
    }

    @When("I select Name(A-Z) in Sort By dropdown")
    public void iSelectNameAZ() {
        allDesktopsPage.clickOnOrderNameAToZ();
    }

    @Then("I check the products` order by Name")
    public void iCheckProductsOrderByName() {
        List<String> actualResult = allDesktopsPage.getProductNames();
        List<String> expectedResult = new ArrayList<>(actualResult);
        expectedResult.sort(String::compareToIgnoreCase);

        Assertions.assertThat(actualResult)
                .as("fail")
                .isEqualTo(expectedResult);
    }

    @When("I select Price(Low<High) in Sort By dropdown")
    public void iSelectPriceLowToHigh() {
        allDesktopsPage.clickOnPriceLowToHigh();
    }

    @Then("I check the products` order by Price")
    public void iCheckProductsOrderByPrice() {
        List<Double> actualResult = allDesktopsPage.getProductPrices();
        List<Double> expectedResult = new ArrayList<>(actualResult);
        Collections.sort(expectedResult);
    }


}

