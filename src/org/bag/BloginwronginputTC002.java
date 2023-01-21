package org.bag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BloginwronginputTC002 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dinesh\\eclipse-workspace\\Saucedemopractise\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("suresh_12");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret-007");
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();

	}

}
