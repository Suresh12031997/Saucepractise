package org.light;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContinueButtonTC10 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dinesh\\eclipse-workspace\\Saucedemopractise\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Robot r = new Robot();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]")).click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
		Thread.sleep(1600);
		driver.findElement(By.xpath("//button[text()='Checkout']")).click();
		driver.findElement(By.name("firstName")).sendKeys("MS");
		driver.findElement(By.id("last-name")).sendKeys("Dhoni");
		driver.findElement(By.xpath("(//input[@type=\"text\"])[3]")).sendKeys("600118");
		driver.findElement(By.id("continue")).click();

	}

}
