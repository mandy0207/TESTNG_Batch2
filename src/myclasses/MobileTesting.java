package myclasses;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MobileTesting {

	
	@Test 
	@Parameters({"Username","Password"})
	public void First_MobileTest(@Optional String username, @Optional String password) {
		System.out.println("I am in first Mobile Test");
		System.out.println(username + "  "+ password);
	}
	
	@Test(groups="Smoke")
	public void SEcond_MobileTest() {
		System.out.println("I am in second Mobile Test");
	}
	
	
//	@BeforeSuite
//	public void BeforeSuite_Tests() {
//		System.out.println("I am in BeforeSuite");
//	}
//	
//	@AfterSuite
//	public void AfterSuite_Tests() {
//		System.out.println("I am in After suite");
//	}
	
	
}


