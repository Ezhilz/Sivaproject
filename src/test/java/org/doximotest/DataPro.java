package org.doximotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataPro {
	public static WebDriver driver;
	public String sTestCaseName;

	public int iTestCaseRow;

	@Test
	public void tc1() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

	}
	@Test(dataProvider="sampleData")
	public void tc2(String email,String pass) {
		
		WebElement txtUserName = driver.findElement(By.id("email"));

		txtUserName.sendKeys(email);
		WebElement txtPass = driver.findElement(By.id("pass"));

		txtPass.sendKeys(pass);
		

	}
	 @DataProvider

	  public Object[][] sampleData() throws Exception{

		    

		 	ExcelUtils.setExcelFile("‪C://Users//dell//eclipse-workspace//TestingBatch//src//test//resources//TestData","Sheet1");

		 	sTestCaseName = this.toString();

		  	
		  	sTestCaseName = ExcelUtils.getTestCaseName(this.toString());

		    
		 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);

		    Object[][] testObjArray = ExcelUtils.getTableArray("C://Users//dell//eclipse-workspace//TestingBatch//src//test//resources//TestData","Sheet1",iTestCaseRow);

		    	return (testObjArray);

			}
}
