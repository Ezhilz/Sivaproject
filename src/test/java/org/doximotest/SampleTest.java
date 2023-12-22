package org.doximotest;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleTest {
	@BeforeClass
	private void beforeClass() {
System.out.println("beforeClass");

	}
	@AfterClass
	private void afterClass() {
		System.out.println("afterclass");

	}
	@BeforeMethod
	private void beforeMeth() {
		System.out.println("beforeMethod");

	}
	@AfterMethod
	private void afterMeth() {
		System.out.println("AfterMethod");
	}
	
	@Test
	private void test1() {
		System.out.println("testcase1");

	}
	@Test
	private void test2() {
		System.out.println("testcase2");
		//Soft Assert
		SoftAssert as=new SoftAssert();		
		as.assertTrue(false);
		System.out.println("Testing");
		
	}
	@Test
	private void test3() {
		System.out.println("testcase3");

	}
}
