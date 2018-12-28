package com.qa.stepDefinition;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends TestBase {
	
	LoginPage login;
	WebDriverWait wait;
	
	@Given("^open the browser and enter the url$")
	public void open_the_browser_and_enter_the_url() throws Exception {
		
		TestBase.initialization();
	
	}

	@When("^Enter valid username and password for login$")
	public void enter_valid_username_and_password_for_login() throws Exception {
		login = new LoginPage();
		login.login(prop.getProperty("username1"), prop.getProperty("password1"));
		login.waitForHomePage();
		//Thread.sleep(7000);
	}

	@Then("^Check page redirect to franchises list page$")
	public void check_page_redirect_to_franchises_list_page() throws Exception {
		
		login.verifyHomepage();
	    
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Exception {
		TestBase.shutdown();
	    
	}


}
