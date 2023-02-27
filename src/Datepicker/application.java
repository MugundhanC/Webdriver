package Datepicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class application {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		//explicit wait time
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(40));
		
		//Script to login
		driver.get("http://triotend.com/tts/site/login");
		driver.findElement(By.cssSelector("input#email")).sendKeys("triotend@gmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("triotend");
		driver.findElement(By.cssSelector("button.btn")).click();
		
		//script to click on the front office menu
		WebElement Frontoffice=driver.findElement(By.cssSelector("ul.sidebar-menu>li"));
		wait.until(ExpectedConditions.elementToBeClickable(Frontoffice));
		Frontoffice.click();
		
		//script to click on the visitor book
		WebElement visitorbook=driver.findElement(By.cssSelector("div.box-tools>a:nth-child(2)"));
		wait.until(ExpectedConditions.elementToBeClickable(visitorbook));
		visitorbook.click();
		
		//script to click on the addvisitor 
		WebElement addvisitor=driver.findElement(By.cssSelector("div.box-tools>a"));
		wait.until(ExpectedConditions.elementToBeClickable(addvisitor));
		addvisitor.click();
		
		//script to clickon the datepicker
		WebElement datepicker=driver.findElement(By.cssSelector("#date"));
		wait.until(ExpectedConditions.elementToBeClickable(datepicker));
		datepicker.click();
		
		//calling the datepicker function to click the date
		datepicker1 dat=new datepicker1();
		dat.datpicker(driver, "19", 4, 2005);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
