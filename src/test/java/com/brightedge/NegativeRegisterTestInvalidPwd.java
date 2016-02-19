package com.brightedge;

import static org.junit.Assert.assertFalse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NegativeRegisterTestInvalidPwd {
	App app = new App();
	boolean testResult;

	@Before
	public void Setup() {

		app.setup();

	}

	@Test
	public void invalidPassword() throws InterruptedException {
		// Uname feild length has 1 char
		app.openAccount();

		testResult = app.Register("Harry", "White", "harry.white@yahoo.com",
				"harry", "hell0!", "999-999-9999");
		assertFalse(testResult);
	}

	@After
	public void closeBrowser() {
		app.teardown();

	}
}
