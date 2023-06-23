import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Light_box {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://omayo.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        
        //Switch to light box
        driver.findElement(By.id("light1")).click();
        Thread.sleep(4000);
        
        //Remove to the light box
        driver.findElement(By.id("light-Box1")).click();
	}

}
