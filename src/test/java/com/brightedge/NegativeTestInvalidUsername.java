package com.brightedge;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NegativeTestInvalidUsername {

	App app = new App();	
	boolean testResult ;
	@Before
	public  void Setup(){

	   app.setup();
	  
   }
	
	@Test
	public void invalidUsername() throws InterruptedException{
		//Uname feild length has 1 char
		app.openAccount();

		testResult = app.Register("Adam", "White", "adam.white@yahoo.com", "a", "helloWorld!", "999-999-9999");
		assertFalse(testResult);
	}
	
	@After
	public void closeBrowser(){
			app.teardown();
		
	}
}
