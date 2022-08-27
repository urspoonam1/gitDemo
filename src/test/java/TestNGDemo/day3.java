package TestNGDemo;

import org.testng.annotations.Test;

public class day3 {

	@Test
	void WebLoginHomeLoan()

	{
		System.out.println("This is for Web Login");
	}

	@Test(groups = "group1")

	void MobileLoginHomeLoan() {
		System.out.println("This is for Mobile Login");
	}
	@Test
	void APILoginHomeLoan()

	{
		System.out.println("This is for API Login");
	}
	
	
	
}
