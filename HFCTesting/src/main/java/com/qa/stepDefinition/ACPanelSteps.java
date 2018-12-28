package com.qa.stepDefinition;

import com.qa.pages.ACPanelPage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class ACPanelSteps extends TestBase {
	
	LoginPage loginPage = new LoginPage();
	ACPanelPage acPage = new ACPanelPage();
	
	
	@Then("^Select users option under impersonate as at right of three dot$")
	public void select_users_option_under_impersonate_as_at_right_of_three_dot() throws Exception {
		
		acPage.clickUser();
		
	    
	}

	@Then("^Check the page redirect to home dashboard page$")
	public void check_the_page_redirect_to_home_dashboard_page() throws Exception {
	    
		Assert.assertEquals(acPage.homePageTxt(), "News & Updates");
		System.out.println("Page Redirected to corresponding home page");
	}


}
