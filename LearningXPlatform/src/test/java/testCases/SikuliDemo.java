package testCases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SikuliDemo {

	@Test
	public void login() throws InterruptedException{

		String filepath = "/home/saravananl/Downloads/chromedriver_linux64 (4)/chromedriver";
		System.setProperty("webdriver.chrome.driver", filepath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/image_upload/index.php");
Thread.sleep(6000);
		WebDriverWait wait=new WebDriverWait(driver,10);



		// Wait till the element is not visible

		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("photoimg")));
//driver.findElement(By.id("photoimg")).click();
		element.click();
		driver.close();
	}

}
