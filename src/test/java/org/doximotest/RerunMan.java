package org.doximotest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RerunMan {
	@Test
	public void tc1() {
		System.out.println("Line 1");
		System.out.println("Line 2");
		System.out.println("Line 3");

	}
	@Test(retryAnalyzer=A_Failure.class)
	public void tc2() {
		System.out.println("Line 4");
		Assert.assertTrue(false);
		System.out.println("Line 5");

	}
	@Test
	public void tc3() {
		System.out.println("Line 6");
		System.out.println("Line 7");
		
	}

}
