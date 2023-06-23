import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tables_Handing {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://omayo.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        
      //table[@id="table1"]
      //table[@id="table1"]//th
      //table[@id="table1"]//td
      //table[@id="table1"]//tr[3]//td[2]
        
		/*
		 * List<WebElement> data =
		 * driver.findElements(By.xpath("//table[@id=\"table1\"]//th")); for(int i=0;
		 * i<data.size(); i++) {
		 * 
		 * System.out.println(data.get(i).getText()); }
		 */
        
        
        
        driver.quit();

	}

}
