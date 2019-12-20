package com.abc.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementId
{
	public static void main(String[] args) throws InterruptedException
	{ 
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://www.gmail.com");
	WebElement email=driver.findElement(By.id("identifierId"));
	email.sendKeys("nagur0116@gmail.com");
	Thread.sleep(5000);
	driver.close();
}	
}
