package util;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInit {
	
	static WebDriver driver;
	
	
	public static WebDriver init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://techfios.com/test/101/");
		return driver;
		
			
	}
	public static void tearDown() {
		driver.close();
		driver.quit();
		
	}

}
