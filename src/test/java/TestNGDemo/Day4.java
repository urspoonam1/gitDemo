package TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day4 {
	@Test(priority = 1)
	void WebLoginHomeLoan()

	{
		System.out.println("This is for Web Login for Personal");
	}

	@Test(priority = -2)

	void MobileLoginHomeLoan() {
		System.out.println("This is for Mobile Login for Personal");
	}
@Test
	void MobileLoginHomeLoan1() {
		System.out.println("This is for Mobile Login1 for Personal 1");
	}
@Test
	void MobileLoginHomeLoan2() {
		System.out.println("This is for Mobile Login2 for Personal 2");
	}
	
	@Test(priority = -1)

	void APILoginPersonalLoan() {
		System.out.println("This is for API Login for Personal");
		// Assert.fail();
	}
}
