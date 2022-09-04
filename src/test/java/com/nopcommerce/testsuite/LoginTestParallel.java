package com.nopcommerce.testsuite;

import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.LoginPage;
import com.nopcommerce.utility.Utility;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTestParallel extends Utility {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @BeforeMethod
    @Parameters("browser")
    public void setUp(String browser) {
        selectBrowser(browser);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPage() {
        homePage.clickOnLoginLink();
        String actualText = loginPage.getWelcomeText();
        String expectedText = "Welcome, Please Sign In1!";
        Assert.assertEquals(expectedText, actualText, "Verigying welcome text");
    }

    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }
}
