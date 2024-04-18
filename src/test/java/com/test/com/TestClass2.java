package com.test.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass2 {

	public WebDriver driver;

	@Test
	@Parameters({"browserName"})
	public void test(String browser) {
		if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else {
			System.out.println("We don't support "+browser+" browser");
		}
		driver.get("https://www-stg2.jetblue.com");
		driver.manage().window().maximize();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}
