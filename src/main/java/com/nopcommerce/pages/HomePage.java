package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

/**
 * Created by Bhavesh Patel
 */
public class HomePage extends Utility {

    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");

    public void clickOnLoginLink(){
        Reporter.log("Clicking on login link" + loginLink.toString()+"<br>");
      clickOnElement(loginLink);
      //clickOnElement(By.linkText("Log in"));
    }

    public void clickOnRegisterLink(){
        Reporter.log("Clicking on register link" + registerLink.toString()+"<br>");
        clickOnElement(registerLink);
    }


}
