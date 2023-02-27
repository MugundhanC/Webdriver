package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testalerts {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
		
		driver.findElement(By.cssSelector("button[onclick='myFunction()']")).click();
		
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		
		if(alt.getText().equals("Press a button"))
		{
			alt.accept();
			System.out.println("ok clicked");
		}
		else
		{
			alt.dismiss();
			System.out.println("Cancel Clicked");
		}

	}

}
