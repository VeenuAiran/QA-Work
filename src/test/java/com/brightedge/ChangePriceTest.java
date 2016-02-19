package com.brightedge;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ChangePriceTest {
	App app = new App();	
	boolean testResult ;
	int val;
	@Before
	public  void Setup(){

	   app.setup();
	  
   }
	@Test
	public void changePriceType(){
		app.clickHistoricalExchangeRateTab();
		//Change Price Type to Bid
		assertTrue(app.changePriceType("Bid"));
		//Change Price Type to Ask 
		assertTrue(app.changePriceType("Ask"));
		//Change Price Type to Midpoint 
		assertTrue(app.changePriceType("Midpoint"));
	}
	@After
	public void closeBrowser(){
			app.teardown();
		
	}
}
