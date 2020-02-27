package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



public class Config {
	
	public  static WebDriver driver = null;
	public static ProjectSpecific ps = null;

	
	@BeforeSuite
	public void precondition() {
		
		System.setProperty("webdriver.chrome.driver","/home/saravananl/eclipse-workspace/Workspace/LearningXPlatform/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//ps = new ProjectSpecific(driver);
		
	}
	
	
	@AfterSuite
	public void afterSuite() {
		driver.quit();
	}

}
