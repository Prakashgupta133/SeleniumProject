package testNG1;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest1 {
	@BeforeSuite
	public void method0() {
		System.out.println("Before suite");
	}

	@BeforeClass
	public void method1() {
		System.out.println("Before Class");
		Reporter.log("Before class");
	}

	@BeforeTest
	public void method2() {
		System.out.println("Before Test");
		Reporter.log("Before Test");
	}

	@BeforeGroups
	public void method3() {
		System.out.println("Before Groups");
	}

	@BeforeMethod
	public void method4() {
		System.out.println("Before Method");
	}

	/*
	 * @Test public void test1() { System.out.println("In Test"); }
	 */
	@AfterMethod
	public void method5() {
		System.out.println("After Method");
	}

	@AfterGroups
	public void method6() {
		System.out.println("After Groups");
	}

	@AfterTest
	public void method7() {
		Reporter.log("After Test");
		System.out.println("After Test");
	}

	@AfterClass
	public void method8() {
		Reporter.log("After Class");
		System.out.println("After Class");
	}

	@AfterSuite
	public void method9() {
		System.out.println("After Suite");
	}

}
