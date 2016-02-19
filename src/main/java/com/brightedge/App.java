package com.brightedge;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;


public class App  {
	static WebDriver driver = new FirefoxDriver();
	InternationalTransferPage ipag1 = PageFactory.initElements(driver, InternationalTransferPage.class);
	CurrencyConverterPage page = PageFactory.initElements(driver, CurrencyConverterPage.class);
	
	
	public void setup() {
       
        driver.get("http://www.oanda.com/currency/converter/");
        driver.manage().window().maximize();
        //Close the browser
       //
    }
	//Base Currency and Quote Currency is different
	
	//Base Currency and Quote Currency is same 
	public int  convertCurrency(String currencyYouHave, String currencyIwant, String amount){
		page.enterCurrencyIHave(currencyYouHave);
		page.enterCurrenyYouWant(currencyIwant);
		page.enterAmount(amount);
		String result = page.convertedAmount();
//		//assertEqual("1.00000",result);
		System.out.println("result : "+ result);
		return Integer.parseInt(result);
		
		
	}
	
	public void refresh(){
		driver.navigate().refresh();
	}
	
	public boolean checkvalue(String q, String b, String amt){
		boolean output = page.checkQuoteAndBaseUponRefresh(q,b,amt);
		
		return output;
	}
	
	
	public boolean flipCurrency(){
		boolean output = page.flip();
		return output;
	}
	
	public void clickOnInternationalTransfertab()
	{
		page.selectInternationalTransfer();
	}
	
	public void openAccount() throws InterruptedException{
		ipag1.register();
		Thread.sleep(2000);
	}
	RegisterPage ipage = PageFactory.initElements(driver, RegisterPage.class);
	
	public boolean Register(String fname, String lname, String emailAdd, String uname, String pwd, String phNumber) {
		//Longest String +19999999999999999999999999999999999999999999999999999999999
		//Shortest String
		
		boolean result =  ipage.signUP(fname, lname, emailAdd, uname, pwd, phNumber);
		return result;
		
	}
	
	public boolean currentDate(){
		return page.getCurrentDate();
		//page.rewind();
		
	}
	
	public void  rewindDate(){
		 page.getRewindDate();
	}
	
	public void pickDate(String date){
		
		page.chooseDate(date);
		page.changeRange("60");
	}
	
	public boolean changePriceType(String s){
		return page.selectPrice(s);
	}
	
	public void clickHistoricalExchangeRateTab(){
		page.selectHistoricExRateTab();
	}
	
	public boolean clickLiveExRateTab(){
		return page.selectLiveExRate();
	}
	
	public boolean travlersCheatSheet(){
		return page.openTravelersCheatShee();
	}
	
	public boolean checkPrintOption(){
	return	page.ClickPrintOnTravlerCheatSheet();
	}
	
	public void signUpViaInternationalTransfer(){
		page.getStarted();
		page.SignUptogetBenefits();
		}
	public void convertCurrencyviaIPage(String a, String amt, String b){
		page.convertCurrency(a, amt, b);
	}
	
	public boolean checkResultOnIPage(){
		return page.convertedResultDisplayed();
	}
	//Switching the Base Currency to Quote Currency and vice versa 
	public void teardown(){
		 driver.quit();
	}
}
