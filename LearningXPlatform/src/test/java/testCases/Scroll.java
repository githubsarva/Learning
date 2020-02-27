package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll {
	
	@Test
	public void scroll() throws InterruptedException {
		String filepath = "/home/saravananl/Downloads/chromedriver_linux64 (4)/chromedriver";
		System.setProperty("webdriver.chrome.driver", filepath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;

        // Launch the application		
        driver.get("http://demo.guru99.com/test/guru99home/");
        js.executeScript("window.scrollBy(0,3000)");
       
        Thread.sleep(5000);
        driver.close();
	}

}
