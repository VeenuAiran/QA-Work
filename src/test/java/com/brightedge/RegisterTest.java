package com.brightedge;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RegisterTest {
	
	App app = new App();	
	boolean testResult ;
	@Before
	public  void Setup(){

	   app.setup();
   }
	
	@Test
	public void registerTest() throws InterruptedException{
		
		//All Fields EnteredCorrectly
		app.openAccount();
		testResult = app.Register("Harry", "White", "harry.white@yahoo.com", "harryWhite", "helloWorld!", "999-999-9999");
		System.out.println(testResult);
		assertTrue(testResult);
	}
/**	@Test
	public void invalidUsername(){
		//Uname feild length has 1 char
		app.openAccount();

		testResult = app.Register("Harry", "White", "harry.white@yahoo.com", "h", "helloWorld!", "999-999-9999");
		assertFalse(testResult);
	}
	@Test
	public void invalidPwd(){
		//Pasrd field length has 5 char
		app.openAccount();

		testResult = app.Register("Harry", "White", "harry.white@yahoo.com", "harry", "hell0!", "999-999-9999");
		assertFalse(testResult);
	}
	@Test
	public void invalidEmailAdd(){
		//Invalid email Address - Enter special characters
		app.openAccount();

		testResult = app.Register("Harry", "White", "@#$!", "harry", "hell0!", "999-999-9999");
		assertFalse(testResult);
	}
	@Test
	public void invalidPhoneNumber(){
		//Enter phone number of length greater than 10 
		app.openAccount();

		testResult = app.Register("Harry", "White", "harry.white@yahoo.com", "h", "hell0!", "999-999-99990000");
		assertFalse(testResult);
	}**/
	
		
	

	@After
	public void closeBrowser(){
			app.teardown();
		
	}
}
