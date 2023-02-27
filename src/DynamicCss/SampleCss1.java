package DynamicCss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleCss1 {
	
     public static void main(String[] args) throws InterruptedException {
		
    	 WebDriverManager.chromedriver().setup();
    	 WebDriver driver=new ChromeDriver();
    	 
    	 //Enter URL
    	 driver.get("http://triotend.com/tts/site/login");
    	 
    	 //Tag and Id
    	 driver.findElement(By.cssSelector("input#email")).sendKeys("Tag and Id");
    	 Thread.sleep(4000);
    	 driver.findElement(By.cssSelector("input#email")).clear();
    	 Thread.sleep(4000);
    	 
    	 //Tag and Class
    	 driver.findElement(By.cssSelector("input.form-username")).sendKeys("Tag and Class");
    	 Thread.sleep(4000);
    	 driver.findElement(By.cssSelector("input#email")).clear();
    	 Thread.sleep(4000);
    	 
    	 //Tag and Attribute
    	 driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Tag and Attribute");
    	 Thread.sleep(4000);
    	 driver.findElement(By.cssSelector("input#email")).clear();
    	 Thread.sleep(4000);
    	 
    	 //Tag, class and Attribute
    	 driver.findElement(By.cssSelector("input.form-username[placeholder='Username']")).sendKeys("Tag Class Attribute");
    	 Thread.sleep(4000);
    	 driver.findElement(By.cssSelector("input#email")).clear();
    	 Thread.sleep(4000);
    	 
    	 //Tag, Id and Attribute
    	 driver.findElement(By.cssSelector("input#email[placeholder='Username']")).sendKeys("Tag Id Attribute");
    	 Thread.sleep(4000);
    	 driver.findElement(By.cssSelector("input#email")).clear();
    	 Thread.sleep(4000);
    	 
    	 //Sub-String Matches
    	 
    	 //StartsWith
    	 driver.findElement(By.cssSelector("input[placeholder^='Us']")).sendKeys("Starts With");
    	 Thread.sleep(4000);
    	 driver.findElement(By.cssSelector("input#email")).clear();
    	 Thread.sleep(4000);
    	 
    	 //EndsWith
    	 driver.findElement(By.cssSelector("input[placeholder$='me']")).sendKeys("Ends With");
    	 Thread.sleep(4000);
    	 driver.findElement(By.cssSelector("input#email")).clear();
    	 Thread.sleep(4000);
    	 
    	 //Contains
    	 driver.findElement(By.cssSelector("input[placeholder*='name']")).sendKeys("Contains");
    	 Thread.sleep(4000);
    	 driver.findElement(By.cssSelector("input#email")).clear();
    	 Thread.sleep(4000);
    	 
    	 driver.close();
    	 
    	 
    	 
    	 
    	 
    	 
    	
  
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
	}

}
