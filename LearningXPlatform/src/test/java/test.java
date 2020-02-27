import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","/home/saravananl/eclipse-workspace/Workspace/LearningXPlatform/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
}
