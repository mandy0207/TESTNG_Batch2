package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

	@Test
	public void LEARN_HARDAssert() {
			
		String actualfirstName = "Aparna";
		String expectedfirstName= "Neha";
		
		System.out.println("I am first line");
		
		/**
		 * 1) True assert will only accept true and false will only accept false
		 * 2) Hard Assertions - If any of assertion failed at any point, program will fail at that step. It means 
		 *    it will not move ahead.
		 *3)  Like in this eg. we are acomparing actualFirstname and expectedFirstname.
		 *    Both are different so our test is failing
		 */
		  Assert.assertTrue(true);
		  Assert.assertFalse(false);
		
		  Assert.assertEquals(actualfirstName, expectedfirstName);
		  System.out.println("I am the lastLine");

		
		
	}
}
