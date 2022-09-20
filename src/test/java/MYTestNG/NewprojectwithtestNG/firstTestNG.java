package MYTestNG.NewprojectwithtestNG;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class firstTestNG {
	
	@BeforeSuite
	 public void BeforeSuiteMethod() {
		System.out.println("1");
	}
	@org.testng.annotations.BeforeTest
	public void BeforeTest() {
		System.out.println("2");
	}
	@org.testng.annotations.BeforeClass
	public void BeforeClass() {
		System.out.println("3");
	}
	@org.testng.annotations.BeforeMethod 
	public void BeforeMethod() {
		System.out.println("4");
	}
	@Test
	public void Test1()	{
		System.out.println("5A");
	}
	@Test 
	public void Test2()	{
		System.out.println("5B");
	}
	
	@org.testng.annotations.AfterMethod
	public void AfterMethod() {
		System.out.println("6");
	}
	@org.testng.annotations.AfterClass
	public void AfterClass() {
		System.out.println("7");
	}
	@org.testng.annotations.AfterTest
	public void AfterTest() {
		System.out.println("8");
	}
	@org.testng.annotations.AfterSuite
	public void AfterSuite() {
		System.out.println("9");
	}
	
	

}
