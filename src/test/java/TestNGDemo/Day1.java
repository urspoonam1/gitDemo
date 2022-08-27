package TestNGDemo;

import org.testng.annotations.Test;

public class Day1 {

	@Test
	public void demo() {
		System.out.println("This is Demo Method.");
	}

	@Test(groups = { "group1", "group2" })
	void demo2() {
		System.out.println("This is Demo 2 method");
	}
	void demo3() {
		System.out.println("This is Demo 2 method");
	}
}

