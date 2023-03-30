package browser_details;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDetails {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\V Veera Kumar\\.eclipse\\selenium_automation\\allfiles\\chromedriver.exe");
		//open the browser
		WebDriver driver= new ChromeDriver();
		//navigate to the website
		driver.get("https://www.flipkart.com");
		//driver.navigate().to("https://www.flipkart.com");
		//get the title
		String titile=driver.getTitle();
		System.out.println(titile);
		//get the current url of the page 
		String url=driver.getCurrentUrl();
		System.out.println(url);
		//get page source
		String source=driver.getPageSource();
		System.out.println(source);
		// sleep for 5 seconds
		Thread.sleep(5000);
		//close the browser
		driver.quit();
		
  }
}
