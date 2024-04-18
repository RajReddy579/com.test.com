package com.test.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testclass {
	
	public WebDriver driver;
	
	@Test
	@Parameters({"browserName"})
	public void testing(String browser) {
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("We don't support this browser");
		}
		
		this.driver.get("https://www-qa2.jetblue.com");
		this.driver.manage().window().maximize();
		this.driver.quit();
		
	}

}
