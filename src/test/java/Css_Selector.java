import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*Locate by id
Locate by className
Locate by Name or Attribute and Multiple attribute
Match with Prefix or start with
Match with suffix or ends with
Match with substring or contains*/

public class Css_Selector {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector(input[class="oxd-input oxd-input--active"][placeholder="Username"]));
		
		
		
	}

}
