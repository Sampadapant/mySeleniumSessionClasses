import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchChrome {

	public static void main(String[] args) {
		// System.setProperty("WebDriver.chrome.driver",
		// "/Users/sampada/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}

}
// base class implementation with multiple browser
//Page Object Model and Page Factory in Selenium
//log4j