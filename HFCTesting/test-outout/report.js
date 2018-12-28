$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/WMS/workspace/HFCTesting/src/main/java/com/qa/featureFiles/Lead.feature");
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
  "error_message": "org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : Matching Name already exists!\r\nMatching Address already exists!\r\nDo you wish to Save this Duplicate?\r\n}\n  (Session info: chrome\u003d70.0.3538.77)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds: null\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027WMS-PC\u0027, ip: \u0027192.168.1.16\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_92\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\WMS\\AppData\\Local\\...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 70.0.3538.77, webStorageEnabled: true}\nSession ID: 04faf7dbfa577461de8a0cf1674ce004\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\u0027tab2\u0027]/div[1]/div[1]/button[2]/i}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:172)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy14.isDisplayed(Unknown Source)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.elementIfVisible(ExpectedConditions.java:314)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:43)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:300)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:297)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$23.apply(ExpectedConditions.java:670)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$23.apply(ExpectedConditions.java:666)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:249)\r\n\tat com.qa.pages.LeadPage.verifyViewLead(LeadPage.java:116)\r\n\tat com.qa.stepDefinition.LeadSteps.enter_the_values_in_all_the_fields_and_save_the_record(LeadSteps.java:34)\r\n\tat ✽.Enter the values in all the fields and save the record(C:/Users/WMS/workspace/HFCTesting/src/main/java/com/qa/featureFiles/Lead.feature:38)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});