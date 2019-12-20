package com.abc.test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo 
{
	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.firefox.marionette","/home/joker/Downloads/drive/june-july/geckodriver-v0.26.0-linux64_orig\\geckodriver.exe");
        FirefoxDriver Driver = new FirefoxDriver();	
	}
}
