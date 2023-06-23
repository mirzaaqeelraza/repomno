import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelection {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(4000);
		
		//WebElement drop = driver.findElement(By.xpath("//Select[@id=\"drop1\"]"));
		//drop.sendKeys("doc 3");

		
		  WebElement drop = driver.findElement(By.xpath("//Select[@id=\"drop1\"]"));
		  Select select = new Select(drop); select.selectByVisibleText("doc 3");
		  Thread.sleep(3000); select.selectByIndex(1);
		 
       
       WebElement Multi = driver.findElement(By.xpath("//select[@id=\"multiselect1\"]"));
       Select select1 = new Select(Multi);
       select1.selectByVisibleText("Volvo");
       select1.selectByVisibleText("Audi");
       select1.selectByVisibleText("Hyundai");
       
       Thread.sleep(5000);
       select1.deselectByVisibleText("Audi");
       
       
       
		

	}

}
