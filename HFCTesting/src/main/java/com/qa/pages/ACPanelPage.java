package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.TestBase;

public class ACPanelPage extends TestBase{
	
	@FindBy(xpath = "//*[@id='gridFranchise']/div[2]/table/tbody/tr[11]/td[9]/ul/li/div/button")
	WebElement optBtn; 																						//Right side option button in franchise list
	@FindBy(xpath="//*[@id='gridFranchise']/div[2]/table/tbody/tr[11]/td[9]/ul/li/div/ul/li[2]/a")
	WebElement impersonOpt;																					//Location of Impersonate text in drop down list
	@FindBy(xpath = "//*[@id='gridFranchise']/div[2]/table/tbody/tr[11]/td[9]/ul/li/div/ul/li[2]/ul/li[1]/a")
	WebElement userRole;																					//Location of first user in list
	@FindBy(xpath="//*[@id='navv']/nav/div/div[1]/h2")
	WebElement homeIcon;
	@FindBy(xpath="//*[@id='crm-form-detail']/div[1]/div[1]/h2")
	WebElement newsUpdTxt;
	WebDriverWait wait = new WebDriverWait(driver,30);

	//Initializing the page object
			public ACPanelPage(){
				PageFactory.initElements(driver, this);
			}

	
	//Action
			
	public void clickUser() throws InterruptedException{
		
		Thread.sleep(7000);
		wait.until(ExpectedConditions.elementToBeClickable(optBtn));
		Actions ac = new Actions(driver);
		ac.moveToElement(optBtn).build().perform();
		optBtn.click();
		//wait.until(ExpectedConditions.elementToBeSelected(impersonOpt));
		Thread.sleep(5000);
		//Select s= new Select(impersonOpt);
		//s.selectByVisibleText("Impersonate as:");
		
		ac.moveToElement(impersonOpt).click().build().perform();
		Thread.sleep(5000);
		ac.moveToElement(userRole).click().build().perform();
		wait.until(ExpectedConditions.textToBePresentInElement(newsUpdTxt, "News & Updates"));
	}
	
	public String homePageTxt(){
		String text = newsUpdTxt.getText();
		return text;
	}
}
