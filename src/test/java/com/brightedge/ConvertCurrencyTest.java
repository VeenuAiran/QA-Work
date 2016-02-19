package com.brightedge;

import org.junit.*;
import com.brightedge.App;
import static org.junit.Assert.*;

public class ConvertCurrencyTest {

	App app = new App();

	// test method to add two values
	@Before
	public void Setup() {

		app.setup();

	}

	@Test
	public void convert() {
		int val;
		//TC 1 
		val = app.convertCurrency("USD", "INR", "2");
		assertTrue(val > 0);
		
		//TC2
		val = app.convertCurrency("USD", "INR", "1");
		assertTrue(val > 0);
		
		//TC 3
		app.convertCurrency("USD", "INR", "0");
		assertTrue(val == 0.0000);
		
		//TC4
		app.convertCurrency("USD", "INR", "999999999999999");
		val = app.convertCurrency("USD", "INR", "0.0000000000000");
		
		//TC 5 
		// Changing Integer to Double
		double d_val = val;
		Assert.assertEquals(Double.doubleToLongBits(0.00000),Double.doubleToLongBits(d_val));
		
		//TC 6 
		// Negative Case
		val = app.convertCurrency("USD", "INR", "-1");
		assertFalse(val > 0);
		
		//TC 7
		// Flip Currency
		assertTrue(app.flipCurrency());
		
		//TC 8
		// Refresh a page - Test whether values should reset to old values
		val = app.convertCurrency("USD", "INR", "10");
		assertTrue(val > 0);
		app.refresh();
		app.checkvalue("USD", "INR", "10");
		assertTrue(val > 0);
	

	}

	@After
	public void closeBrowser() {
		app.teardown();
	}

}