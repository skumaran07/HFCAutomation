package com.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.TestBase;

public class LeadPage extends TestBase{
	WebDriverWait wait = new WebDriverWait(driver, 30);
	
	@FindBy(xpath="//*[@id='menu']/li[2]")
	WebElement salesIcon;
	
	@FindBy(xpath="//*[@id='gridLeadSearch']/div[1]/div/div[2]/div[1]/button[2]/i")
	WebElement leadAddBtn;
	
	@FindBy(xpath="//*[@id='tab2']/div[1]/ul/li")
	WebElement infoIcon;
	
	@FindBy(xpath="//*[@id='tab6']/div/div/div/div[1]/div[1]/div/input")
	WebElement fName;
	
	@FindBy(xpath="//*[@id='tab6']/div/div/div/div[1]/div[2]/div/input")
	WebElement lName;
	
	@FindBy(xpath="//*[@id='tab6']/div/div/div/div[1]/div[4]/div/div[1]/div[2]/input")
	WebElement zipCode;
	
	@FindBy(xpath="//*[@id='autocomp__value']")
	WebElement address1;
	
	@FindBy(xpath="//*[@id='autocomp__dropdown']")
	WebElement address1List;
	
	@FindBy(xpath="//*[@id='tab6']/div/div/div/div[2]/div[5]/div/div/span/div/div/input")  //*[@id="tab6"]/div/div/div/div[2]/div[5]/div/div/span/div/div
	WebElement sourceList;
	
	@FindBy(xpath="//*[@id='tab6']/div/div/div/div[1]/div[4]/div/div[5]/div/input")
	WebElement city;
	
	@FindBy(xpath="//*[@id='tab6']/div/div/div/div[1]/div[4]/div/div[6]/div/span/select")
	WebElement stateList;
	
	@FindBy(xpath="//*[@id='tab2']/div[1]/div[1]/ul/li[2]/button/i")
	WebElement saveBtn;
	
	@FindBy(xpath="//*[@id='tab2']/div[1]/div[1]/button[2]/i")
	WebElement editIcon;
	
	//Initializing the page object
	public LeadPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public void VerifyLeadPage(){
		
		salesIcon.click();
		wait.until(ExpectedConditions.elementToBeClickable(leadAddBtn));
	}
	
	public void addLead(){
		leadAddBtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(infoIcon));
			
	}
	
	public String verifyAddLead(){
		String infoIconTxt = infoIcon.getText();
		return infoIconTxt;
	}
	
	public void enterValueInLead(String FName, String LName, String ZipCode, String Add1, String lCity, String lState, String lSource) throws Exception{
		fName.clear();
		fName.sendKeys(FName);
		lName.clear();
		lName.sendKeys(LName);
		Thread.sleep(5000);
		zipCode.clear();
		zipCode.sendKeys(ZipCode);
		Thread.sleep(5000);
		enterAddress1(Add1);
		//checkCities(lCity);
		Thread.sleep(5000);
		//checkStates(lState);
		//sourceList.clear();
		//sourceList.sendKeys(lSource);
		Thread.sleep(5000);
		selectSource(lSource);
		wait.until(ExpectedConditions.elementToBeClickable(saveBtn));
		SaveRecords();
	}
	
	public void enterAddress1(String LAddress1) throws Exception{
		
		address1.clear();
		address1.sendKeys(LAddress1);
		Thread.sleep(5000);
		//wait.until(ExpectedConditions.elementToBeClickable(address1List));
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	public void verifyViewLead(String FName){
		wait.until(ExpectedConditions.elementToBeClickable(editIcon));
		String pTitle = driver.getTitle();
		if(pTitle.contains(FName)){
			System.out.println("New Lead has Created and Displaying corresponding Lead View Page");
		}else{
			System.out.println("Page Redirected to incorrected page");
		}
		
	}
	
	
	
	public void checkCities(String LCity){
		
		System.out.println("City field");    //for testing perpose
		String exCity = city.getAttribute("value");
		System.out.println(exCity);  //for testing perpose
		if(exCity.equalsIgnoreCase(LCity)){
			System.out.println("CIty has displayed" +exCity + " in city field");
		}else{
			city.clear();
			city.sendKeys(LCity);
		}
		
	}
	
	public void checkStates(String LState){
		
		Select s = new Select(stateList);
		List<WebElement> options = s.getOptions();
		System.out.println(options.size());
		
		for(WebElement ele : options){
			
			String sValue = ele.getAttribute("value");
			
			if(sValue.contains(LState)){
				System.out.println("State has displayed" +sValue+ " in State field");
			}else{
				stateList.clear();
				stateList.sendKeys(LState);
			}
			
		}
	}
	
	public void selectSource(String LSource) throws Exception{
		
		sourceList.sendKeys(LSource);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		/*Select s = new Select(sourceList);
		List<WebElement> sOptions = s.getOptions();
		int Size = sOptions.size();
		for(WebElement val1 : sOptions){
			
			String listVal = val1.getAttribute("value");
			if(listVal.equalsIgnoreCase(LSource)){
				sourceList.sendKeys(listVal);
				Robot rb = new Robot();
				rb.keyPress(KeyEvent.VK_ENTER);
				rb.keyRelease(KeyEvent.VK_ENTER);
			}else{
				System.out.println("Values not entered into source field");
			}
		}
		*/
		
	}
	
	public void SaveRecords(){
		
		saveBtn.click();
		
		
	}

}
