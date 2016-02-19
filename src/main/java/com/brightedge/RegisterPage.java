package com.brightedge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
	@FindBy(css="#first")
	WebElement firstName;
	
	@FindBy(css = "#last")
	WebElement lastName;
	
	
	@FindBy(css = "#email")
	WebElement email;
	

	@FindBy(css = "#username")
	WebElement Username;
	

	@FindBy(css = "#password")
	WebElement Password;
	

	@FindBy(css = "#phone")
	WebElement phoneNumber;
	
	@FindBy(css = ".btn-success")
	WebElement signUp;
	
	@FindBy(css =".help-block.ng-scope.ng-animate")
	private WebElement helperMessage;
	
	@FindBy(css ="#confirmPassword")
	WebElement passwordMatch;
	boolean success = true;
	
	@FindBy(css = "#open-account-btn")
	WebElement openLiveAccLink;
	
	@FindBy(css = ".ng-binding.language-selected")
	WebElement selectLanguage;
	
	public boolean  signUP(String fname, String lname, String emailAddress, String username, String password, String phone){
		
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);	
		email.sendKeys(emailAddress);
		Username.sendKeys(username);
		
		//Check for helper message "Must be 2-50 alphanumeric characters" is displayed 
		
	/**	if(helperMessage.getText().equals("You have exceeded the maximum number of bytes for all name fields")){
		System.out.println("inside username and pwd len");
		success = false;
		
		}**/
		
		if(App.driver.findElement(By.cssSelector(".help-block.ng-scope.ng-animate")).isDisplayed()){
			success = false;
		}
		Password.sendKeys(password);
		passwordMatch.sendKeys(password);
		
		if(!(Password.getText()).equals(passwordMatch.getText()) && (helperMessage.isDisplayed())){
		System.out.println("password matcg");
		success = false;
		}
		
		phoneNumber.sendKeys(phone);
	
		if (App.driver.findElement(By.cssSelector("#phone")).getAttribute("class").contains("invalid")){
			success=false;
		}
		
		signUp.click();
		
	/**	if(!openLiveAccLink.isDisplayed()){
			success = false;
		}**/
		
		if(!selectLanguage.isDisplayed()){
			System.out.println("Select Lang");
			success = false;
		}
		/**else{
			selectLanguage.click();
		}**/
		return success;
	}
	
}
