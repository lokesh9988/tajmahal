package MYTestNG.NewprojectwithtestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

public class SecondTestNG {
	
	
		@org.testng.annotations.BeforeSuite
		public void BeforeSuite() {
			System.out.println("A");
		}
		@org.testng.annotations.BeforeTest
		public void BeforeTest() {
			System.out.println("B");
		}
		@org.testng.annotations.BeforeClass
		public void BeforeClass() {
			System.out.println("C");
		}
		@BeforeMethod
		public void BeforeMethod() {
			System.out.println("D");
		}
		
		@org.testng.annotations.Test
		public void Test() {
			System.out.println("ACF");
		}
		@org.testng.annotations.AfterMethod
		public void AfterMethod() {
			System.out.println("E");
		}
		@AfterClass
		public void AfterClss() {
			System.out.println("F");
		}
		
		@org.testng.annotations.AfterTest
		public void AfterTest() {
			System.out.println("G");
		}
		@org.testng.annotations.AfterSuite
		public void AfterSuite() {
			System.out.println("H");
		}
	}


