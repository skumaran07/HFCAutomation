package com.qa.stepDefinition;

import com.qa.pages.LeadPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class LeadSteps extends TestBase{
	
	LeadPage leadPage = new LeadPage();
	
	@Then("^Select Sales icon from left navigation and check the page is displaying lead list page$")
	public void select_Sales_icon_from_left_navigation_and_check_the_page_is_displaying_lead_list_page() throws Exception {
		
		leadPage.VerifyLeadPage();
		String pageTitle = driver.getTitle();
		Assert.assertEquals("Lead #", pageTitle);
	    
	}
	
	@Then("^Click Add Lead button and check the page redirected into corresponding page$")
	public void click_Add_Lead_button_and_check_the_page_redirected_into_corresponding_page() throws Exception {
	    
		leadPage.addLead();
		Assert.assertEquals("Information", leadPage.verifyAddLead());
	}

	@Then("^Enter the values in all the fields and save the record$")
	public void enter_the_values_in_all_the_fields_and_save_the_record() throws Exception {


		leadPage.enterValueInLead(prop.getProperty("firstName"), prop.getProperty("lastName"), prop.getProperty("zipCode"), prop.getProperty("Address1"), prop.getProperty("City"), prop.getProperty("State"), prop.getProperty("Source"));
	    leadPage.verifyViewLead(prop.getProperty("firstName"));
	}


}
