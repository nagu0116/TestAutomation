package com.abc.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailSourceCode {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		
		String page=driver.getPageSource();
		System.out.println(page);
		
		
	}
}
