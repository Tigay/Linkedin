package com.Linkedin;

import com.Linkedin.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WelcomePage extends BasePage {

    @FindBy(css = "#username")
    private WebElement userNameField;

    @FindBy(css = "#password")
    private WebElement passwordField;

    @FindBy(css = "button")
    private WebElement submitButton;

    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    public void inputUserNameField(String userName) {
        wait.until(ExpectedConditions.elementToBeClickable(userNameField));
        userNameField.sendKeys("tnatalgg3@gmail.com");
    }

    public void inputPasswordField(String password) {
        wait.until(ExpectedConditions.elementToBeClickable(passwordField));
        passwordField.sendKeys("321321qq");

    }

    public void clickSubmitButton() {
        wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        submitButton.click();
    }
}
