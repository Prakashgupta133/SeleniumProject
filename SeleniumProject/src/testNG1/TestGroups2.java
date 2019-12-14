package testNG1;

import org.testng.annotations.Test;

public class TestGroups2 extends BaseTest1 {
	@Test(groups = "Regression")
	public void meth1() {
		System.out.println("TestGroups2: Method 1 in group regression");
	}

	@Test(groups = "Sanity")
	public void meth3() {
		System.out.println("TestGroups2: Method 3 in group sanity");
	}

	@Test(groups = "Regression")
	public void meth2() {
		System.out.println("TestGroups2: Method 2 in group regression");
	}

	@Test(groups = "Functional")
	public void meth4() {
		System.out.println("TestGroups2: Method 4 in group Functional");
	}

}
