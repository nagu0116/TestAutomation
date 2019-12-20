package com.abc.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CurrentUrl {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
	}

}
