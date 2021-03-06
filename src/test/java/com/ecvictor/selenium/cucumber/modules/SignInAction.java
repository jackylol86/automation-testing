package com.ecvictor.selenium.cucumber.modules;

import com.ecvictor.selenium.cucumber.helpers.Log;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.ecvictor.selenium.cucumber.pageobjects.AutomationHomePage;
import com.ecvictor.selenium.cucumber.pageobjects.LoginPage;

import static org.testng.AssertJUnit.assertEquals;

public class SignInAction {

	public static void Execute(WebDriver driver,HashMap<String,String> map) throws Exception{
		
		AutomationHomePage.sign_in.click();
		Log.info("Click action is perfromed on My Account link" );

		LoginPage.email.sendKeys(map.get("username"));

		Log.info(" is entered in UserName text box" );
		
		LoginPage.password.sendKeys(map.get("password"));
		Log.info(" is entered in Password text box" );

		LoginPage.signin_button.click();
		Log.info("Click action is performed on Submit button");

		Reporter.log("SignIn Action is successfully perfomred");

	}
	public static void validateSigninFailed(WebDriver driver) throws Exception{

		assertEquals(AutomationHomePage.invalid_email.getText(),"uthentication failed.") ;
		Log.info("Authentication failed Found");

		Reporter.log("Validation is performed");

	}
}
