package com.abc.test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFacebook 
{
	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https:/www.facebook.com");
	    Thread.sleep(5000);
	    driver.close();
	}
}
