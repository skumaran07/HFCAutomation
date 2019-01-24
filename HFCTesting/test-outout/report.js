$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/WMS/git/HFCAutomation/HFCTesting/src/main/java/com/qa/featureFiles/Login.feature");
formatter.feature({
  "name": "Verify the login page is working",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check login is allow the user based on valid username and password",
  "description": "",
  "keyword": "Scenario"
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