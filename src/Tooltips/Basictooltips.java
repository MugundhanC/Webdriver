package Tooltips;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basictooltips {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/css/tryit.asp?filename=trycss_tooltip");
		
		WebElement frm=driver.findElement(By.cssSelector("iframe#iframeResult"));
		driver.switchTo().frame(frm);
		
		WebElement tooltip=driver.findElement(By.cssSelector("div.tooltip"));
		
		Actions act=new Actions(driver);
		act.moveToElement(tooltip).build().perform();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		WebElement txt=driver.findElement(By.cssSelector("span.tooltiptext"));
		
		System.out.println(txt.getText());
		
		
		
		
		
		
		
		
	}

}
