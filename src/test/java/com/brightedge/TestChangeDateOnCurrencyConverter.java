package com.brightedge;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestChangeDateOnCurrencyConverter {
	App app = new App();	
	boolean testResult ;
	int val;
	@Before
	public  void Setup(){

	   app.setup();
	  
   }
	@Test
	public void changeDate(){
		//val = app.convertCurrency("USD","INR","1");
		//assertTrue(val>0);
		
		assertTrue(app.currentDate());
		//Rewind the Date
		app.rewindDate();
		//select a Before Date
		app.pickDate("12/25/2015");
		
		//Change price 
		
	}
	
	
	@After
	public void closeBrowser(){
			app.teardown();
		
	}
}
