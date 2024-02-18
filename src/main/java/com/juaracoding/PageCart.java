package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageCart {

    private WebDriver driver;

    public CartPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    // Locator Find Element menggunakan PageFactory
    @FindBy(xpath = "")
    private WebElement someOne;

}
