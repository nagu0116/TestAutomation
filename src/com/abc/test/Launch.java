package com.abc.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Launch {

	public static void main(String[] args) {
		System.out.println("print");
		System.setProperty("webdriver.gecko.driver",
				"/home/joker/Downloads/drive/june-july/geckodriver-v0.26.0-linux64_orig/geckodriver");
//		System.setProperty("webdriver.firefox.marionette", "/home/joker/Downloads/drive/june-july/geckodriver-v0.26.0-linux64_orig/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		String baseUrl = "https://www.facebook.com/";
		driver.get(baseUrl);

		String Title = driver.getTitle();
		System.out.println(Title);

		driver.close();
	}

}
