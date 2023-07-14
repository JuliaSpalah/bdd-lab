package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

import static org.example.BasePage.getDriver;

public class IphonePage {

    @FindBy(xpath = "//h2/span[@class='price-new']")
    private WebElement iPhonePrice;
    @FindBy(xpath = "//a[span[text()='Currency']]//strong")
    private WebElement currencySign;
    @FindBy(xpath = "//a[text()='€ Euro']")
    private WebElement euroCurrency;
    @FindBy(xpath = "//a[text()='£ Pound Sterling']")
    private WebElement poundSterlingCurrency;
    public IphonePage() {
        PageFactory.initElements(getDriver(), this);
    }

    public double getIPhonePriceDollars() {
        String priceText = iPhonePrice.getText();
        return Utils.extractPriceValue(priceText);
    }

    public void clickOnCurrencySign() {
        currencySign.click();
    }
    public void clickOnEUR() {
        euroCurrency.click();
    }

    public double getIPhonePriceEuro() {
        return Utils.extractPriceValue(iPhonePrice.getText());
    }

    public void clickOnGBP() {
        poundSterlingCurrency.click();
    }

    public double getIPhonePricePoundsSterling() {
        return Utils.extractPriceValue(iPhonePrice.getText());
    }

}
