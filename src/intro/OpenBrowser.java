package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\V Veera Kumar\\.eclipse\\selenium_automation\\allfiles\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\V Veera Kumar\\.eclipse\\selenium_automation\\allfiles\\geckodriver.exe");
		
		WebDriver driver1= new ChromeDriver();
		driver1.get("https://www.flipkart.com/");
		
		System.setProperty("webdriver.ie.driver", 
				"C:\\Users\\V Veera Kumar\\.eclipse\\selenium_automation\\allfiles\\IEDriver.exe");
		
		WebDriver driver2= new ChromeDriver();
		driver2.get("https://www.flipkart.com/");
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\V Veera Kumar\\.eclipse\\selenium_automation\\allfiles\\msedgedriver.exe");
		
		WebDriver driver3= new ChromeDriver();
		driver3.get("https://www.flipkart.com/");
		
		
		WebDriver driver4= new SafariDriver();
		
		
		
	}

}
