package com.nopcommerce.testsuite;

import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.LoginPage;
import com.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by bhavesh patel
 */
public class LoginPageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginPage(){
    homePage.clickOnLoginLink();
    String actualText=loginPage.getWelcomeText();
    String expectedText= "Welcome, Please Sign In1!";
        Assert.assertEquals(expectedText,actualText,"Verigying welcome text");
    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("codebuster@gmail.com");
        loginPage.enterPassWord("123456");
        loginPage.clickOnLoginButton();
        String actualMessage=loginPage.getErrorMessage();
        String expectedMessage="Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertEquals(expectedMessage,actualMessage,"Verifying error message");
    }

}
