import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * id -- driver.findElement(By.id("alert1")).click();
   name -- driver.findElement(By.name("alert1")).click();
   className -- driver.findElement(By.className("alert1")).click();
   LinkText -- driver.findElement(By.linkText("alert1")).click();
   partialLinkText -- driver.findElement(By.partialLinkText("alert1")).click();
   tagName -- driver.findElement(By.tagName("alert1")).click();
   cssSelector -- driver.findElement(By.cssSelector("input#alert1")).click();
                                     By.cssSelector("input.alert1")
                                     By.cssSelector("input[name=alert1"])
                                     By.cssSelector("inputalert1")
   xpath -- driver.findElement(By.xpath("//input[@type='text']")).click();
   */

   //driver.findElement(By.id("alert1")).click();
          //driver is a Webdriver object
          //findElement is a webdriver method
         // By is a class
         // id is a locator
          //username is a value
          
          

public class Locators {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//id
		
		


		


	}

}
