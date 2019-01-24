package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.TestBase;

import junit.framework.Assert;

public class LoginPage extends TestBase{
	
	WebDriverWait wait;
	
	@FindBy(xpath="//*[@id='login']/section/div[1]/div/form/div[1]/input") 
	WebElement username;
	
	@FindBy(xpath="//*[@id='login']/section/div[1]/div/form/div[2]/input")
	WebElement password;
	
	@FindBy(xpath="//*[@id='login']/section/div[1]/div/form/div[3]/div/div[2]/button")
	WebElement loginbtn;
	
	@FindBy(xpath="//*[@id='example-navbar-collapse']/ul[1]/li/a")
	WebElement menu;
	
	//Initializing the page object
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		
	//Actions
		
	public void login(String uname, String pword){
		
		username.clear();
		username.sendKeys(uname);
		password.clear();
		password.sendKeys(pword);
		loginbtn.click();
		
	}
	
	public void verifyHomepage(){
		
		String menuText = menu.getText();
		System.out.println( menuText);
		Assert.assertEquals("Setup", menuText);
	}
	
	/*public void waitForHomePage(){
		
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.textToBePresentInElement(homepageIcon, "Setup"));
	}*/
	

}
