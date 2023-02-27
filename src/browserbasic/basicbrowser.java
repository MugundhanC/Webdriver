package browserbasic;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basicbrowser {

	public static void main(String[] args) throws InterruptedException {
		
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 
	 //To enter the Url
	 driver.get("http://triotend.com/tts/site/login");
	 Thread.sleep(5000);
	 
	 //To Navigate
	 driver.get("http://triotend.com");
	 Thread.sleep(5000);
	 
	 //Backward
	 driver.navigate().back();
	 Thread.sleep(5000);
	 
	 //Forward
	 driver.navigate().forward();
	 Thread.sleep(5000);
	 
	 //Refresh
	 driver.navigate().refresh();
	 Thread.sleep(5000);
	 
	 //Minimize
	 driver.manage().window().minimize();
	 Thread.sleep(5000);
	 
	 //Maximize
	 driver.manage().window().maximize();
	 Thread.sleep(5000);
	 
	 //Resize
	 Dimension d=new Dimension(465,1050);
	 driver.manage().window().setSize(d);
	  Thread.sleep(5000);
	  
	  //close
	  driver.close();
	 //driver.quit();
	 
	}

}
