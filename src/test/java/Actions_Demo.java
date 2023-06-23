import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_Demo {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://omayo.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        
        //MoveToElement -- Hoveover
        WebElement Menu = driver.findElement(By.id("blogsmenu"));
        Actions a = new Actions(driver);
        a.moveToElement(Menu).perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()=\"Selenium143\"]")).click();
        
        //Drag and dropBy
        
        //ContextClick -- right Click
        
        //Double Click
        
        //Drag And Drop
        
        //KeyDown and KeyUp
        
        //sendKeys
        
        System.out.println("Updated By Karan");

		
         System.out.println("Updated By Krish");

       
		
		



	}

}
