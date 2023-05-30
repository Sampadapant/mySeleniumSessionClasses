import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignement1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		boolean select = driver.findElement(By.id("checkBoxOption1")).isSelected();
		if(select) {
			System.out.println("test case is passed");
		}
		else {
			System.out.println("test case is failed");
		}
		
		driver.findElement(By.xpath("//input[@value=\"option1\"]")).click();
		
		boolean unselect = driver.findElement(By.xpath("//input[@value=\"option1\"]")).isSelected();
		if(!unselect) {
			System.out.println("test case  passed");
		}
		else {
			System.out.println("test case failed");
		}
		Thread.sleep(3000);
		
		List<WebElement> sizeCheckbox = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		System.out.println(sizeCheckbox.size());
		
		
		driver.quit();
	}
	

}
