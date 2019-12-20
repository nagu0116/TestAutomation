package com.abc.test;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyTitle {

	public static void main(String[] args) 
	{
		System.out.println("enter the Title");
		Scanner scan = new Scanner(System.in);
		
		String eTitle=scan.next();
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https:///www.gmail.com");
		
		String aTitle=scan.next();
		
		System.out.println("The expected title is "+eTitle);
		System.out.println("The actual  title is "+aTitle);
		
		if(eTitle.equals(aTitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
			
		}		
	}
}
