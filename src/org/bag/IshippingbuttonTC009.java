package org.bag;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IshippingbuttonTC009 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dinesh\\eclipse-workspace\\Saucedemopractise\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
		Thread.sleep(1000);
		WebElement print = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
		String p = print.getText();
		System.out.println(p);
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();

	}

}
