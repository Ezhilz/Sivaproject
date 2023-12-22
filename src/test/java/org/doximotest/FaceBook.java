package org.doximotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	public static WebDriver driver;
	@Parameters({"mal","pas"})
	@Test
	private void tc1(@Optional("xyz@bgg.com")String email,@Optional("2356")String pass) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement txtUserName = driver.findElement(By.id("email"));

		txtUserName.sendKeys(email);
		WebElement txtPass = driver.findElement(By.id("pass"));

		txtPass.sendKeys(pass);

	}



}
