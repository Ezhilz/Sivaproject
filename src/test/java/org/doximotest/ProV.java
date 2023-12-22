package org.doximotest;

import org.testng.annotations.Test;

public class ProV {
	@Test(dataProvider="sampleData",dataProviderClass=DataPro.class)
	public void tc1(String email,String pass) {

		System.out.println(email);
		System.out.println(pass);
		System.out.println("----------------------------");
	}

}
