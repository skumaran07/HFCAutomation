$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/WMS/git/HFCAutomation/HFCTesting/src/main/java/com/qa/featureFiles/Lead.feature");
formatter.feature({
  "name": "Check whether the lead page is working properly",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "open the browser and enter the url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.open_the_browser_and_enter_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter valid username and password for login",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.enter_valid_username_and_password_for_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check page redirect to franchises list page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.check_page_redirect_to_franchises_list_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select users option under impersonate as at right of three dot",
  "keyword": "Then "
});
formatter.match({
  "location": "ACPanelSteps.select_users_option_under_impersonate_as_at_right_of_three_dot()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check the page redirect to home dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "ACPanelSteps.check_the_page_redirect_to_home_dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check whether we can create a new lead",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AddLead"
    }
  ]
});
formatter.step({
  "name": "Select Sales icon from left navigation and check the page is displaying lead list page",
  "keyword": "Then "
});
formatter.match({
  "location": "LeadSteps.select_Sales_icon_from_left_navigation_and_check_the_page_is_displaying_lead_list_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Add Lead button and check the page redirected into corresponding page",
  "keyword": "Then "
});
formatter.match({
  "location": "LeadSteps.click_Add_Lead_button_and_check_the_page_redirected_into_corresponding_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the values in all the fields and save the record",
  "keyword": "Then "
});
formatter.match({
  "location": "LeadSteps.enter_the_values_in_all_the_fields_and_save_the_record()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});