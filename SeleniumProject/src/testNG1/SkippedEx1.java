package testNG1;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SkippedEx1 {
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	@Test
	public void test2() {
		System.out.println("Test 2");
	}
	@Test
	public void test3() {
		System.out.println("Test 3");
		Assert.fail();
		// System.out.println(assert.hashCode()); *** Need to Verify ****
	}
	@Test(dependsOnMethods="test3")
	public void test4() {
		System.out.println("Test 4");
	}
	@Test(dependsOnMethods="test3")
	public void test5() {
		System.out.println("Test 5");
	}
	

}
