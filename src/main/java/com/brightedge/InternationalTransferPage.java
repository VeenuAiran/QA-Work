package com.brightedge;

import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.WebElement;
public class InternationalTransferPage {

	@FindBy(css=".round-btn:first-child")
	//ArrayList<WebElement> roundButton = new ArrayList<WebElement>();
	WebElement openAccount;
	
	@FindBy(css="#fxtradePracticeGateButton")
	WebElement practiceButton;
	
	@FindBy(css="#country")
	WebElement selectCountry;
	//Select chooseCountry = new Select(selectCountry);
	
	public void register(){
			openAccount.click();
			practiceButton.click();
			//Select a country 
			new Select(selectCountry).selectByVisibleText("United States");
			///selectCountry.selectByVisibleText("United States");	
	}
	
	
	
	
	
}
