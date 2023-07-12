package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

import static org.example.BasePage.getDriver;

public class BrandsPage {

    @FindBy(xpath = "//div[@id='product-manufacturer']//div[@class='col-sm-3']/a")
    private List<WebElement> brandsLocator;

    public BrandsPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public List<String> getBrands() {
        List<String> list = new ArrayList<>();
        for (WebElement element : brandsLocator) {
            list.add(element.getText());

        }
        return list;
    }
}
