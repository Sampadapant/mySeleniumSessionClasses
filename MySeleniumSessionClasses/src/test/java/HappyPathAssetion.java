import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class HappyPathAssetion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder=\"Username\"]")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[type*=\"pass\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[contains(@class,\"oxd-button\")]")).click();
		Thread.sleep(5000);
		//boolean display = driver.findElement(By.xpath("//span[@class=\"oxd-topbar-header-breadcrumb\"]/h6")).isDisplayed();
		System.out.println(driver.findElement(By.cssSelector("a[href=\"http://www.orangehrm.com\"]")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("a[href=\"http://www.orangehrm.com\"]")).getText(), "OrangeHRM, Inc");
	
		//Assert.assertTrue(display);
	driver.findElement(By.cssSelector("i.oxd-icon.bi-caret-down-fill.oxd-userdropdown-icon")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("a[href=\"/web/index.php/auth/logout\"]")).click();
    Thread.sleep(5000);
   String display = driver.findElement(By.cssSelector("a[href='http://www.orangehrm.com']")).getText();
   System.out.println(display);
   Assert.assertEquals(driver.findElement(By.cssSelector("a[href=\"http://www.orangehrm.com\"]")).getText(), display);
    
//	Select ld = new Select(logDrop);
//	ld.selectByIndex(3);
//	Thread.sleep(3000);
//	
	
	
	driver.quit();

	}

}
