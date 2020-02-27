package testCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Testlogin {
	
	@Test
		public void chromebro() throws MalformedURLException {
		DesiredCapabilities cap= DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.LINUX);
		WebDriver driver= new RemoteWebDriver(new URL("http://192.168.167.186:4444/wd/hub"), cap);
		driver.get("https://qa06.exphosted.com");
		
		driver.manage().window().maximize();
		driver.close();
		
		}
	
	public void firefoxbro() throws MalformedURLException {
		DesiredCapabilities cap= DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.LINUX);
		WebDriver driver= new RemoteWebDriver(new URL("http://192.168.167.186:4444/wd/hub"), cap);
		driver.get("https://qa06.exphosted.com");
		
		driver.manage().window().maximize();
		driver.close();
		
		}

}
