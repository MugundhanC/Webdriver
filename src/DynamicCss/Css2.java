package DynamicCss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Css2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//Enter URL
		driver.get("http://triotend.com/tts/site/login");
		
		//Login Script
		driver.findElement(By.cssSelector("input#email")).sendKeys("triotend@gmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("triotend");
		driver.findElement(By.cssSelector("button.btn")).click();
		
		//Child Elements
		
		//Direct Child
		driver.findElement(By.cssSelector("ul.sidebar-menu>li")).click();
		
		//Nth Child
		driver.findElement(By.cssSelector("ul.sidebar-menu>li:nth-child(9)")).click();
		
		//Sub Child
		driver.findElement(By.cssSelector("ul.sidebar-menu>:nth-child(10)")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.findElement(By.cssSelector("ul.treeview-menu>li:nth-child(2)")).click();
		
		driver.close();
		
		
		
		
	}

}
