package com.samplejenkinparameter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class JenkinParameterTest {
	
	public  WebDriver driver=null;
	//comment by Branch2
	
	@Test
	public  void jenkinParameterTest()
		
	{
		String browser=System.getProperty("browser");
		
		String url=System.getProperty("url");
		switch(browser) {
		 case "chrome":
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 break;
		 case "firefox":
			 WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			 break;
			 }
		driver.get(url);
		driver.quit();
		//comment by Branch1
			
		     		
		}
	}
	
	


