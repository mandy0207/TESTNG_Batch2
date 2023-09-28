package Validations;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArraysAssertion {

	@Test
	public void ValidateArrays() {
		
		String [] names1 = {"Sajitha", "Sugesh", "Aparna", "Meenu"};
		
		String [] names2 = {"Sugesh", "Aparna", "Sajitha", "Meenu"};
		
	//	Assert.assertEquals(names1, names2);
		
		Arrays.sort(names1);
		Arrays.sort(names2);
		PrintArray(names1);
		PrintArray(names2);
		Assert.assertEquals(names1, names2);
	}
	
	public static void PrintArray(String[] arr) {
		for(String element : arr) {
			System.out.print(element+ "  ");
		}
		System.out.println();
	}
}
