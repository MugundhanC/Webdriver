package DynamicXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleXpath1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//Enter URL
		driver.get("http://triotend.com/tts/site/login");
		
		//Using single Slash-Absolute
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/form/div[1]/input")).sendKeys("Absolute");
		
		//Using Double slash or Relative
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
		Thread.sleep(4000);
		
		//Using Single Attribute
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Single Attribute");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
		Thread.sleep(4000);
		
		//Using Multiple Attribute
		driver.findElement(By.xpath("//input[@placeholder='Username'][@name='username']")).sendKeys("Multiple Attribute");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
		Thread.sleep(4000);
		
		//Using And Attribute
		driver.findElement(By.xpath("//input[@placeholder='Username' and @name='username']")).sendKeys("AND Attribute");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
		Thread.sleep(4000);
		
		//Using or Attribute
		driver.findElement(By.xpath("//input[@placeholder='Username' or @name='username']")).sendKeys("OR Attribute");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
		Thread.sleep(4000);
		
		//Using contains()
		driver.findElement(By.xpath("//input[contains(@placeholder,'name')]")).sendKeys("Contains");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
		Thread.sleep(4000);
		
		//Using Starts with()
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Us')]")).sendKeys("Starts with");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
		Thread.sleep(4000);
		
		//Using text()
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		Thread.sleep(4000);
		
		driver.close();
		
	}

}
