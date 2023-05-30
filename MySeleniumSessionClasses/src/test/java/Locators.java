import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Sampada");
		driver.findElement(By.name("inputPassword")).sendKeys("abc123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p[class=\"error\"]")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("Slesha");
		driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("abac@hmail.com");
		driver.findElement(By.xpath("//input[@type=\"text\"][2]")).clear();
		driver.findElement(By.cssSelector("input[type=\"text\"]:nth-child(3)")).sendKeys("abac@email.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("6774764747");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());

		driver.quit();

	}
	
	
}
