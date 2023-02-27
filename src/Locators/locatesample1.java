package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locatesample1 {

	
		       public static void main(String[] args) throws InterruptedException {
		    	   
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				
				//Enter URL
				driver.get("http://triotend.com/tts/site/login");
						
				//By ID
				driver.findElement(By.id("email")).sendKeys("triotend@gmail.com");
				Thread.sleep(1000);
				
				//By Classname
				driver.findElement(By.className("form-password")).sendKeys("triotend");
				Thread.sleep(1000);
				
				//By Tagname
				driver.findElement(By.tagName("button")).click();
				Thread.sleep(6000);
				
				//By Css selector
				driver.findElement(By.cssSelector("#alert > nav > div.col-md-7.col-sm-9.col-xs-7 > div > div > ul > li.dropdown.user-menu > a > img")).click();
				Thread.sleep(2000);
				 
				//By Xpath
				driver.findElement(By.xpath("//*[@id=\"alert\"]/nav/div[2]/div/div/ul/li[4]/ul/li/div/div[4]/a[3]")).click();
				Thread.sleep(2000);
				  
				//Close
				driver.close();
				

				
	}

}
