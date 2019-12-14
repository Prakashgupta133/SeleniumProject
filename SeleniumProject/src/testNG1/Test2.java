package testNG1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 extends BaseTest1{
	@Test
	public void test1() {
		System.out.println(" Class Test2 method test1");
		//Reporter.log(" Class Test2 method test1",true);
	}
	@Test
	public void test2() {
		System.out.println(" Class Test2 method test2");
		//Reporter.log(" Class Test2 method test2",true);
	}
	@Test
	public void test3() {
		System.out.println(" Class Test2 method test3");

		//Reporter.log(" Class Test2 method test3",true);
	}

}
