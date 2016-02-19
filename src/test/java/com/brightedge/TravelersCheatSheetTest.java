package com.brightedge;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TravelersCheatSheetTest {

	App app = new App();	
	boolean testResult ;
	int val;
	@Before
	public  void Setup(){

	   app.setup();
	  
   }
	@Test
	
	public void TravelersCheatSheetTest(){
		assertTrue(app.travlersCheatSheet());
		
		assertTrue(app.checkPrintOption());
		
	}
	
	@After
	public void closeBrowser(){
			app.teardown();
		
	}
}
