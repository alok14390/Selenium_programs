package testngdemo;

import org.testng.annotations.Test;

public class Groups {
	
	@Test(priority=1,groups="Smoke")
	public void tc1()
	{
		System.out.println("This is my first Smoke testing");
	}
	@Test(priority=1,groups="Regression")
	public void tc2()
	{
		System.out.println("This is my first Regression testing");
	}
	@Test(priority=2,groups="Smoke")
	public void tc3()
	{
		System.out.println("This is my second Smoke testing");
	}
	@Test(priority=2,groups="Regression")
	public void tc4()
	{
		System.out.println("This is my second Regression testing");
	}
}
