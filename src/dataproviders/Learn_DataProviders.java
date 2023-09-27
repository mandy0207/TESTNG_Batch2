package dataproviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Learn_DataProviders {

	@Test(dataProvider="GetData2")
	public void TestApplication(String firstName, String lastName) {
		System.out.println("I am running");
		System.out.print(firstName + "  "+ lastName);
		System.out.println();
      
	}

	@DataProvider
	public String[][] GetData() {

		String data[][] = new String[3][2];
		// Declaring elements of ist row
		data[0][0] = "Sajitha";
		data[0][1] = "Saju";

		// Declaring elements of second row
		data[1][0] = "Aparna";
		data[1][1] = "Sabu";

		// Declaring elements of third row
		data[2][0] = "Rinky";
		data[2][1] = "George";
		
		return data;

	}
	
	@DataProvider
	public String[][] GetData2() {

		String data[][] = new String[2][2];
		// Declaring elements of ist row
		data[0][0] = "Sugesh";
		data[0][1] = "C";

		// Declaring elements of second row
		data[1][0] = "Meenu";
		data[1][1] = "Manohar";	
		return data;

	}
	
}
