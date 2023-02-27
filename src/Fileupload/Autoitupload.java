package Fileupload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autoitupload {

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://triotendtech.in/treecutting/documents.html");
		
		WebElement upbtn=driver.findElement(By.cssSelector("input#picture"));
		
		Actions act=new Actions(driver);
		act.click(upbtn).build().perform();
		
		Runtime.getRuntime().exec("./src/Fileupload/Fileupload.exe"+" "+"E:\\Hospital.pptx");
	  
		
		
		
		
		
		
		
		

	}

}
