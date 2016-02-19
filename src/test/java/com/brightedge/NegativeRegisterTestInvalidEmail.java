package com.brightedge;

import static org.junit.Assert.assertFalse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NegativeRegisterTestInvalidEmail {
	App app = new App();	
	boolean testResult ;
	@Before
	public  void Setup(){

	   app.setup();
	  
   }
	
	@Test
	public void invalidUsername() throws InterruptedException{

		//Invalid email Address - Enter special characters
		app.openAccount();

		testResult = app.Register("Harry", "White", "@#$!", "harry", "hell0!", "999-999-9999");
		assertFalse(testResult);
	}
	
	@After
	public void closeBrowser(){
			app.teardown();
		
	}
}
