package com.brightedge;
import java.util.Date;
import java.util.List;

import org.apache.xerces.impl.dv.xs.DayDV;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CurrencyConverterPage {

	boolean baseFlag = false;
	boolean quoteFlag = false;
	//WebDriver driver;
	@FindBy(css="#quote_currency")
	private WebElement quote;
	@FindBy(css="#base_currency_input")
	private WebElement base;
	@FindBy(css="#quote_amount_input")
	private WebElement baseamount;

	@FindBy(css="#base_amount_input")
	private WebElement amountQuoted;
	
	@FindBy(css="#flipper")
	private WebElement flipper;
	
	@FindBy(css="#quote_currency_code")
	private WebElement quoteCurrencyCode;
	
	@FindBy(css = "#base_currency_code")
	private WebElement baseCurrencyCode;
	
	@FindBy(css =".world_first_span>a")
	private WebElement internationTransfer;
	
	@FindBy(css ="#ncc>div>h1")
	private WebElement internationTransferTabHeader;
	
	@FindBy(css = ".im-button:first-child")
	private WebElement getStartedButton;
	
	@FindBy(css = "#date_rewind")
	private WebElement rewind;
	
	@FindBy(css = "#bidAskDate")
	private WebElement bidAskDate;
	
	@FindBy(css = "#end_date_input")
	private WebElement currentDate;
	String current_date; 
	Date date = new Date();
	
	@FindBy(css = ".date:last-child")
	private WebElement dateDayBefore;
	
	@FindBy(css = "#end_date_button")
	private WebElement openCalendar;
	
	@FindBy(css = ".calendarToday>span")
	private WebElement todayDate;
	
	
	@FindBy(css = ".flotr-grid-label:nth-child(4)")
	private WebElement lastValueOnXAxis;
	
	@FindBy(css = ".flotr-grid-label:first-child")
	private WebElement firstValueonXAxis;
	
	@FindBy(css = "#range60")
	private WebElement range60;
	
	@FindBy(css = "#view_cheatsheet>span")
	private WebElement openTravelerCheatSheet;
	
	@FindBy(css = ".header")
	private WebElement travelerCheatSheetHeader;
	
	@FindBy(css = ".left:first-child")
	private List<WebElement> tabList;

	@FindBy(css = "#hcc")
	private WebElement widgetHistoric;
	
	@FindBy(css = "#base_currency_input_0")
	private WebElement input0;
	
	@FindBy(css ="#base_currency_input_1")
	private WebElement input1;
	
	@FindBy(css = "#base_currency_input_2")
	private WebElement input2;
	
	@FindBy(css ="base_currency_input_3")
	private WebElement input3;
	
	@FindBy(css = ".currency.visible")
	private WebElement checkBox;
	
	@FindBy(css = "#price_input")
	private WebElement priceInput;
	
	@FindBy(css = ".bold")
	private WebElement dailyRate;
	
	@FindBy(css = ".header")
	private WebElement liveExHeader;
	
	@FindBy(css = ".bold_link")
	private WebElement printLink;
	
	@FindBy(css = ".im-button:first-child")
	private WebElement signUpTogetBenefitsbutton;
	
	@FindBy(css = "#currency-converter")
	private WebElement currencyConverterviaInternationaltransferPage;
	
	@FindBy(css = "#sell_currency")
	private WebElement sell;
	
	@FindBy(css = "#buy_currency")
	private WebElement buy; 
	
	@FindBy(css = "#sell_amount")
	private WebElement sellAmt;
	
	@FindBy(css = "#submit")
	private WebElement convert;
	@FindBy(css = "#result")
	private WebElement resultDiv;
	public void enterCurrencyIHave(String currency1){	
		quote.click();
		quote.sendKeys(currency1);
	}


	public void enterCurrenyYouWant(String currency2){
		base.click();
		base.sendKeys(currency2);	
		base.sendKeys(Keys.RETURN);
	}
	

	public void enterAmount(String amt){
		baseamount.clear();
		baseamount.sendKeys(amt);
		baseamount.sendKeys(Keys.RETURN);
	}

	public String convertedAmount(){
	String amountReturned = amountQuoted.getAttribute("value");
	return amountReturned;
	}
		
	public boolean flip(){
	
	String beforeQuoteCurrency = quoteCurrencyCode.getText();
	String beforeBaseCurrency = baseCurrencyCode.getText();
	flipper.click();
	//Verify that currencyYouWant and CurrencyIHave is flipped
	if((quoteCurrencyCode.getText()).equals(beforeBaseCurrency)){
		quoteFlag=true;
	}
	
	if((baseCurrencyCode.getText()).equals(beforeQuoteCurrency)){
		baseFlag=true;
	}

	if(baseFlag && quoteFlag){
		return true;
	}
	else{
		return false;
	}
	}
	
	
	public boolean checkQuoteAndBaseUponRefresh(String base, String quote , String amount){
		boolean success = false;
		if ((quoteCurrencyCode.getText()).equals(quote) && (baseCurrencyCode.getText().equals(base)) && (baseamount.getAttribute("value") == amount))
		success = true;
		else{
			success = false;
		}
		return success;
		
		
	}
	
	public void  selectInternationalTransfer(){
		
		internationTransfer.click();
		
	}
	public void getStarted(){
		getStartedButton.click();
	}
	
	public void SignUptogetBenefits(){
		signUpTogetBenefitsbutton.click();
		
		
	}
	public boolean getCurrentDate(){
		boolean output = false ;
		current_date = currentDate.getText();
	       // display time and date using toString()
	   System.out.printf("%1$s %2$tB %2$td, %2$tY","Current date:", date);
	   
	   if(current_date.equals(date)){
		   output = true;
	   }
	   return output;
	}
	public void getRewindDate(){
		rewind.click();
		
		//Update CurrentDate 
		current_date = currentDate.getText();
		System.out.println(current_date);
		
		
	}
	
	public void chooseDate(String date){
		openCalendar.click();
		System.out.println(todayDate.getText());
		if(todayDate.getText().equals(date)){
			todayDate.click();
		}
		String dateBefore = dateDayBefore.getText();
		System.out.println(dateBefore);
		String [] date_Arr = dateBefore.split(" ");
		for(String s : date_Arr){
			System.out.println(s);
		}
		
		}
	
	public void changeRange(String s){
		//First value and last value on x-axis on 30 day range 
		System.out.print(firstValueonXAxis.getText());
		System.out.print(lastValueOnXAxis.getText());
		
		if(s.equals("60")){
			
		}
	}
	
	public void selectHistoricExRateTab(){
		tabList.get(1).click();
	}
	public void selectSecondTab(String i1, String i2, String i3, String i4){
		tabList.get(1).click();
		if(widgetHistoric.isDisplayed()){
			//Change input 1 , input2 , input 3, input 4 , input 5 update currencies you want 
			input0.sendKeys(i1);
			input1.sendKeys(i2);
			input2.sendKeys(i3);
			input3.sendKeys(i4);
			
			
			
		}
	}
	
	public boolean selectLiveExRate(){
		tabList.get(2).click();
		boolean result = false;
		if(liveExHeader.isDisplayed()){
			result = true;
		}
		return result;
		
	}
	
	public boolean selectPrice(String p){
		boolean result = false;
		priceInput.sendKeys(p);
		
		if(dailyRate.getText().equals(p.toUpperCase())){
			result = true;
		}
		return result;
	}
	
	public boolean openTravelersCheatShee(){
		boolean result = false;
		openTravelerCheatSheet.click();
		if(travelerCheatSheetHeader.isDisplayed()){
			result = true;
		}
		return result;
	}
	
	public boolean ClickPrintOnTravlerCheatSheet(){
		boolean success = false;
		if(printLink.getText().equals("print a copy")){
			success = true;	
		}
		
		return success;
	}


	public void convertCurrency(String s, String amt, String b) {
		// TODO Auto-generated method stub
		new Select(sell).selectByVisibleText(s);
		sellAmt.sendKeys(amt);
		new Select(buy).selectByVisibleText(b);
		convert.click();
	
		
	}
	
	public boolean convertedResultDisplayed(){
		boolean success = false;
		if(resultDiv.isDisplayed()){
			success = true;
		}
		return success;
	}
}
