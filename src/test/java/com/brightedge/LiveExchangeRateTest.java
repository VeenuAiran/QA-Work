package com.brightedge;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LiveExchangeRateTest {
	App app = new App();	
	boolean testResult ;
	int val;
	@Before
	public  void Setup(){

	   app.setup();
	  
   }
	@Test
	
	public void LiveExRate(){
		assertTrue(app.clickLiveExRateTab());
		
	}
	
	@After
	public void closeBrowser(){
			app.teardown();
		
	}
}
