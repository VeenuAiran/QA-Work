package com.brightedge;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NegativeInvalidPhoneNumber {
	App app = new App();	
	boolean testResult ;
	@Before
	public  void Setup(){

	   app.setup();
	  
   }
	
	@Test
	
	public void invalidPhoneNumber() throws InterruptedException{
		//Enter phone number of length greater than 10 
		app.openAccount();

		testResult = app.Register("Harry", "White", "harry.white@yahoo.com", "harrrry", "h11ell0!", "99999999990000");
		assertFalse(testResult);
	}
	
	@After
	public void closeBrowser(){
			app.teardown();
		
	}
}
