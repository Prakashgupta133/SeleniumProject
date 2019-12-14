package testNG1;

import org.testng.annotations.Test;

public class TestGroups1 extends BaseTest1{
	@Test(groups="Regression")
	public void meth1()
	{
		System.out.println("TestGroups1: Method 1 group regression");
	}
	@Test(groups="Sanity")
	public void meth2()
	{
		System.out.println("TestGroups1: Method 2 in group sanity");
	}
	@Test(groups="Regression")
	public void meth3()
	{
		System.out.println("TestGroups1: Method 3 in group regression");
	}
	@Test(groups="Sanity")
	public void meth4()
	{
		System.out.println("TestGroups1: Method 4 in group Sanity");
	}

}
