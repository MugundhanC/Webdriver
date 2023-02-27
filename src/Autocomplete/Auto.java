package Autocomplete;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Auto {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("te");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		List<WebElement>options=driver.findElements(By.cssSelector("ul.G43f7e>li"));
		
		for (WebElement el : options) {
			
			System.out.println(el.getText());
			
			if(el.getText().equals("teams login"))
			{
				el.click();
				break; 
			}
			
		}

	}

}
