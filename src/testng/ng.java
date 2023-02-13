package testng;

import org.testng.annotations.Test;

public class ng {
	
	@Test(groups= {"Smoke"})
	public void tc1()
	{
		System.out.println("one");
	}

	@Test
	public void tc2()
	{
		System.out.println("wto");
	}
	
	
	@Test
	public void tc3()
	{
		System.out.println("three");
	}
}
