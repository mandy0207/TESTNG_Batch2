package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {

	@Test
	public void LEARN_SoftAssert() {
		/**
		 * 1) SoftAssertion will catch all the assertion errors and will throw at last
		 * once the test is fully executed
		 * 
		 * 2) In order to catch error we have to use softAssert.assertAll();
		 */
		SoftAssert softAssert = new SoftAssert();
		String actualfirstName = "Aparna";
		String expectedfirstName= "Neha";
		
		System.out.println("I am first line");
		
		
		softAssert.assertTrue(true);
		softAssert.assertFalse(false);
		
		softAssert.assertEquals(actualfirstName, expectedfirstName);
		System.out.println("I am the lastLine");

		softAssert.assertAll();
	}
	
	
}
