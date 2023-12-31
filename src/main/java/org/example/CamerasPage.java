package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

import java.util.List;

import static org.example.BasePage.getDriver;

public class CamerasPage {
    @FindBy(xpath = "//div[@class='product-thumb']")
    private List<WebElement> camerasThumbnails;

    @FindBy(xpath = "//span[@class='price-old']")
    private WebElement oldPriceFirstCamera;

    @FindBy(xpath = "//div[h4/a[text()='Canon EOS 5D'] and @class='description']//span[@class='price-new']")
    private WebElement newPriceFirstCamera;

    @FindBy(xpath = "//div[h4/a[text()='Nikon D300'] and @class='description']//span[@class='price-tax']")
    private WebElement taxPriceSecondCamera;
    public CamerasPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public int getCamerasQuantityOnPage() {
        return camerasThumbnails.size();
    }

    public double getOldPriceFirstCamera() {
        String priceText = oldPriceFirstCamera.getText();
        return Utils.extractPriceValue(priceText);
    }

    // Першочергово getNewPriceFirstCamera виглядала так само, як getOldPriceFirstCamera
    //Але її спростили. Прибрали String priceText= і вставили в StringUtils.extractPriceValue()
    public double getNewPriceFirstCamera() {
        return Utils.extractPriceValue(newPriceFirstCamera.getText());

    }

    public double getTaxPriceSecondCamera(){
        String priceText = taxPriceSecondCamera.getText();
        return Utils.extractPriceValue(priceText);
    }
}
