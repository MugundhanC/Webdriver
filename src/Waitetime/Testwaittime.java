package Waitetime;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testwaittime {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://triotend.com");
		
		//java wait time
		Thread.sleep(4000);
		
		//implicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		//explicity wait
		WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(40));
		
		wt.until(ExpectedConditions.visibilityOf(null));
		
		
		
	}

}
