package testNG1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 extends BaseTest1 {
	@Test
	public void testA() {
		System.out.println(" Class Test1 method testA");
	}
	@Test
	public void testB() {
		System.out.println(" Class Test1 method testB");
	}
	@Test
	public void testC() {
		System.out.println(" Class Test1 method testC");

		//Reporter.log(" Class Test1 method testC",true);
	}
}
