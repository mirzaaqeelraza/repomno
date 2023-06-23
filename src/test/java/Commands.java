import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commands {

	public static void main(String[] args) throws InterruptedException {
		
   WebDriverManager.chromedriver().setup();

   WebDriver driver = new ChromeDriver();
   
   driver.get("http://omayo.blogspot.com/");
   
   driver.manage().window().maximize();
   
  //driver.findElement(By.id("alert1")).click();
   
	/*
	 * WebElement element = driver.findElement(By.id("ta1")); Thread.sleep(3000);
	 * element.sendKeys("Aqeel raza");
	 * 
	 * Thread.sleep(5000);
	 * 
	 * element.clear();
	 */
   
  //String ele = driver.findElement(By.id("pah")).getText();
  // System.out.println(ele);

	}

}
