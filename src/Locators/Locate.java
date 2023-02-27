package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Locate {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//Enter URL
		driver.get("http://triotend.com/tts/site/login");
				
		//By ID
		driver.findElement(By.id("email")).sendKeys("By ID");
		Thread.sleep(4000);
		
		//By Classname
		driver.findElement(By.className("form-password")).sendKeys("By classname");
		Thread.sleep(4000);
		
		//By Tagname
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(4000);
		
		//By Name
		driver.findElement(By.name("username")).sendKeys("By name");
		Thread.sleep(4000);
		
		//By Linktext
		driver.findElement(By.linkText("Forgot Password?")).click();
		Thread.sleep(4000);
		
		//By Css selector
		driver.findElement(By.cssSelector("#form-username")).sendKeys("By CssSelector");
		Thread.sleep(4000);
		
		//By Xpath
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/button")).click();
		Thread.sleep(4000);
		
		//By partiallinktext
		driver.findElement(By.partialLinkText("Admin")).click();
		Thread.sleep(4000);
		
		driver.close();
	}

}
