package P1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage 
{

	        WebDriver driver;
	        public   HomePage(WebDriver driver)
	        {
	             this.driver=driver;
	        }
	        public void openUrl()
	        {
	                 driver.get("http://www.flipkart.com/");
	                 driver.manage().window().maximize();
	        }
	        public void selectProduct()
	        {
	             
	        	new Actions(driver).moveToElement(driver.findElement(By.xpath("//*[text()='Electronics']"))).perform();
	        	driver.findElement(By.linkText("HP")).click();
	        	
	        }
	}

