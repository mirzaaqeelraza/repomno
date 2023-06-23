import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {

         WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.makemytrip.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@id=\"fromCity\"]")).click();
		  Thread.sleep(5000);
		  WebElement from = driver.findElement(By.xpath("//input[@placeholder=\"From\"]"));
          from.click();
		  Thread.sleep(3000);
		  from.sendKeys("Bangkok");
		  Thread.sleep(2000);
		  from.sendKeys(Keys.DOWN);
		  Thread.sleep(2000);
		  from.sendKeys(Keys.ENTER);
			/*
			 * int i = 0; while(i<2) { Thread.sleep(3000); from.sendKeys(Keys.DOWN); i++; }
			 * 
			 * from.sendKeys(Keys.ENTER);
			 */
		  
		  //driver.close();
		  }

}
