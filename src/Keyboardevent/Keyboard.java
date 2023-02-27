package Keyboardevent;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.triotend.com/");
		
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.TAB).build().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		act.sendKeys(Keys.TAB).build().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		act.sendKeys(Keys.TAB).build().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		act.sendKeys(Keys.TAB);
		
	}

}
