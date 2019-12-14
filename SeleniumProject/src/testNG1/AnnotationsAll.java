package testNG1;

import org.testng.Reporter;
import org.testng.annotations.*;

public class AnnotationsAll {
	@BeforeSuite
	public void method0() {
		System.out.println("Before suite");
	}

	@BeforeClass
	public void method1() {
		Reporter.log("Before class");
	}

	@BeforeTest
	public void method2() {
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

	@Test
	public void test1() {
		System.out.println("In Test");
	}

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
	}

	@AfterClass
	public void method8() {
		Reporter.log("After Class");
	}

	@AfterSuite
	public void method9() {
		System.out.println("After Suite");
	}
}
