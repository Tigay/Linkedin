package com.Linkedin;

import com.Linkedin.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a.nav__button-secondary")
    private WebElement signUpButton;

    public WelcomePage signUpButton() {
        wait.until(ExpectedConditions.elementToBeClickable(signUpButton));
        signUpButton.click();
        return new WelcomePage(driver);
    }
}