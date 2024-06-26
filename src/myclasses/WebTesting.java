package myclasses;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WebTesting {

	/*1) Order of TestNG test execution depends on Alphabetical order of test name
	 * 
	 *2) Order of execution can be altered using priority annotation . Lesser the priority higher will be the execution order
	 *   Order will be priority 0, 1, 2,....
	 *3) If one test is having priority 0 and another is not having any priority. Alphabetical order will take precedence
	 *
	 *4) BeforeTest will run once before all the tests present in a class
	 *
	 *5) After Test will run once at the end after all test cases are executed in class.
	 *
	 *6) BeforeMethod will execute before all the test methods present in class.
	 *If there are 4 test cases. BeforeMethod will execute 4 times, i.e before every test method
	 * 
	 * 7) same for after Test
	 */
	
	@Test(groups="Smoke")
	public void First_WebTest() {
		System.out.println("I am in first web Test");
	}

	
	@Test
	@Parameters({"Username","Password"})
	public void Second_WebTest(String username, String password) {
		System.out.println("I am in second web Test");
		System.out.println(username + "  "+ password);
		
	}
	

	
	@BeforeTest(alwaysRun=true)
	public void Before_WebTest() {
		System.out.println("I am in before Test");
	}
	
	
	
	@AfterTest
	public void After_WebTest() {
		System.out.println("I am in After Test");
	}
	
	
	
	@BeforeClass
	public void BeforeClass_WebTest() {
		System.out.println("I am in before Class WebTest");
	}
	
	
	@AfterClass
	public void AfterClass_WebTest() {
		System.out.println("I am in After class webtest");
	}
	
	
	
	
	
//	@BeforeMethod
//	public void Before_Method_WebTest() {
//		System.out.println("I will execute before every Test method");
//	}
//	
//	@AfterMethod
//	public void After_Method_WebTest() {
//		System.out.println("I will execute after every Test method");
//	}
	
	
	
	
	
	
//	@Test(priority=0)
//	public void Third_WebTest() {
//		System.out.println("I am in Third web Test");
//	}
	
	
	
	
}
