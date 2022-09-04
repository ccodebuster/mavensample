package com.nopcommerce.testsuite;

import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.LoginPage;
import com.nopcommerce.testbase.TestBase;
import org.testng.annotations.Test;
import resources.testdata.TestData;

/**
 * Created by bhavesh patel
 */
public class LoginPageTestWithDataProvider extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test(dataProvider = "credentials",dataProviderClass = TestData.class)
    public void login(String userName, String password){
        homePage.clickOnLoginLink();
        loginPage.loginToApplication(userName,password);
    }



}
