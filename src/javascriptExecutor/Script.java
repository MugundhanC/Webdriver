package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Argument;

public class Script {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://triotend.com/tts/site/login");
		
		//TypeCast
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//Login
	    js.executeScript("document.getElementById('email').value='triotend@gmail.com'");
		js.executeScript("document.getElementById('password').value='triotend'");
		
		WebElement signin=driver.findElement(By.cssSelector("button.btn"));
		
		js.executeScript("arguments[0].click()", signin);
		
		
		
		
		
		
		
	}

}
