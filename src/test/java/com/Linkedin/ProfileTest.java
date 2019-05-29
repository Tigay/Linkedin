package com.Linkedin;

import org.junit.Test;

public class ProfileTest extends BaseTest {
    private WelcomePage welcomePage;
    private HomePage homePage;


    @Test
    public void testProfile() throws InterruptedException {
        homePage = new HomePage(driver);
        welcomePage = homePage.signUpButton();
        welcomePage.inputUserNameField("tnatalgg3@gmail.com");
        welcomePage.inputPasswordField("321321qq");
        welcomePage.clickSubmitButton();

    }
}
