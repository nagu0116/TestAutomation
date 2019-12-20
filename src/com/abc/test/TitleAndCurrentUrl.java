package com.abc.test;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleAndCurrentUrl {

	public static void test(FirefoxDriver driver)
	{
		driver.get("https://www.gmail.com");
		String title=driver.getTitle();
		System.out.println(title);
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
	}
	public static void test(ChromeDriver driver)
	{
		String title=driver.getTitle();
		driver.manage().window().maximize();
		System.out.println(title);
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
	}
	public static void main(String args[])
	{
		System.out.println("enter the browser name:");
		Scanner scan=new Scanner(System.in);
		String browser=scan.next();
		if(browser.equals("firefox"))//give input as firefox
		{
			FirefoxDriver f=new FirefoxDriver();
			test(f);
		}
		else if(browser.equals("Chrome"))//give input as Chrome
		{
			ChromeDriver c=new ChromeDriver();
			test(c);
		}
		else
		{
			System.out.println("invalid browser name");	
		}	
	}
}
