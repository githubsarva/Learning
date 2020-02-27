package utilities;

import org.openqa.selenium.WebDriver;

public class ProjectSpecific {
	
	
	public  static WebDriver driver = null;
	
	
	ProjectSpecific(WebDriver rdriver) {
		this.driver=rdriver;
	}
	
	
	public void testnavigateURL() {
		driver.get("https://qa06.exphosted.com");
	}
	

}
