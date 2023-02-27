package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frm=driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frm);
		
		WebElement src=driver.findElement(By.cssSelector("div#draggable"));
		WebElement desig=driver.findElement(By.cssSelector("div#droppable"));
		
		Actions alt=new Actions(driver);
		alt.dragAndDrop(src, desig).build().perform();
	}

}
