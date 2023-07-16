package stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import org.example.CamerasPage;

public class CamerasPageStepsDefinitions {

    CamerasPage camerasPage = new CamerasPage();

    @Then("I check cameras quantity on page")
    public void iCheckCamerasQuantity(){
        int actualResult = camerasPage.getCamerasQuantityOnPage();
        int expectedResult = 2;

        Assertions.assertThat(actualResult)
                .as("fail")
                .isEqualTo(expectedResult);
    }

    @Then("I check an old price Canon EOS 5D")
    public void iCheckAnOldPriceOfFirstCamera(){
        double actualResult = camerasPage.getOldPriceFirstCamera();
        double expectedResult = 122.00;

        Assertions.assertThat(actualResult)
                .as("fail")
                .isEqualTo(expectedResult);
    }

    @Then("I check a new price Canon EOS 5D")
    public void iCheckNewPriceOfFirstCamera(){
        double actualResult = camerasPage.getNewPriceFirstCamera();
        double expectedResult = 98.00;

        Assertions.assertThat(actualResult)
                .as("fail")
                .isEqualTo(expectedResult);
    }

    @Then("I check ex. rate price Nikon")
    public void iCheckTaxPriceSecondCamera(){
        double actualResult = camerasPage.getTaxPriceSecondCamera();
        double expectedResult = 80.00;

        Assertions.assertThat(actualResult)
                .as("fail")
                .isEqualTo(expectedResult);
    }
}
