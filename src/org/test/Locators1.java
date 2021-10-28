package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {
	public static void main(String[] args) throws InterruptedException {
		//To configure browser
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Madhan\\eclipse-workspace\\Chrome\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
			Thread.sleep(3000);
		
		WebElement txtUserName = driver.findElement(By.id("email"));//driver.findelement change to webelement
			txtUserName.sendKeys("Maevin@gmail.com");
			
			Thread.sleep(3000);
			
		WebElement txtPassword = driver.findElement(By.id("pass"));
			txtPassword.sendKeys("capital");
			
			Thread.sleep(3000);
			
		//WebElement click_login = driver.findElement(By.id("login"));
			//click_login.click();
		//	Thread.sleep(50000);
			
			WebElement C_L = driver.findElement(By.name("login"));
			C_L.click();
			
			
			Thread.sleep(5000);
			
		//driver.close();
		

}
}