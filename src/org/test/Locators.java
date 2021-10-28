package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		//To configure browser
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Madhan\\eclipse-workspace\\Chrome\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//WebDriver-interface , ChromeDriver-class name for chrome
		
		//To launch url
		driver.get("https://www.facebook.com/");
		
		//to get url
		String url = driver.getCurrentUrl();//return type-CTR(2)L
		System.out.println(url);
		
		//to get title
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
