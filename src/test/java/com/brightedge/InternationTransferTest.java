package com.brightedge;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InternationTransferTest {
	App app = new App();	
	boolean testResult ;
	int val;
	@Before
	public  void Setup(){

	   app.setup();
	  
   }
	
	@Test
	public void internationTransferTest(){
		app.clickOnInternationalTransfertab();
		app.signUpViaInternationalTransfer();
		app.convertCurrencyviaIPage("USD United States Dollar", "1" , "INR Indian Rupees");
		//Check Result div is displayed which contains the result 
		assertTrue(app.checkResultOnIPage());
		//app.convertCurrency(");
		
	}
	
	@After
	public void closeBrowser(){
			app.teardown();
		
	}
}
