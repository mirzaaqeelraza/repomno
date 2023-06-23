import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Frames {

	public static void main(String[] args) {
   
		WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
         driver.get("http://omayo.blogspot.com/");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
         
         //Switch to required Frame
         
         WebElement Handling_frames = driver.findElement(By.id("iframe"));
         driver.switchTo().frame(Handling_frames);
         driver.findElement(By.id("q")).sendKeys("Mirza");
         
         //Switch back to main page
         
         driver.switchTo().defaultContent();
         driver.findElement(By.id("ta1")).sendKeys("Mirza");
         
         //Number of frames available in web page
         System.out.println("driver.findElements(By.tagName(\"iframe\")).size()");
         

	}

}
