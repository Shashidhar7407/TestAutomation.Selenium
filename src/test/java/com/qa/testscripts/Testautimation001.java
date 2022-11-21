package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testautimation001 {
	

	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver cdriver=new ChromeDriver();
		cdriver.get("https://shopsystore.com/");
		cdriver.findElement(By.linkText("Search")).click();
		cdriver.findElement(By.name("q")).sendKeys("mens");
		cdriver.findElement(By.className("action_button")).click();
		cdriver.get("https://shopsystore.com/");
		cdriver.findElement(By.linkText("Contact Us")).click();
		cdriver.findElement(By.id("contactFormName")).sendKeys("ppshetty");
		cdriver.findElement(By.id("contactFormEmail")).sendKeys("ppshetty@gmail.com");
		cdriver.findElement(By.id("contactFormMessage")).sendKeys("Hope you are safe and happy i didn't recieve my reward");
		cdriver.findElement(By.className("action_button")).click();
		
		
		
		
		Thread.sleep(15000);
		

		cdriver.close();
		
		
		
		
		
		
		
		
	}

}
