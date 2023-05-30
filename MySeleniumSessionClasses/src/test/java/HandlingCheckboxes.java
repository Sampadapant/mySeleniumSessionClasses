import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		boolean checkFamily = driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected();
//		System.out.println(checkFamily);
//		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
//		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
//		
      
	    Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).isSelected());
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).isSelected());
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).isSelected());
		
		//counting the numbeer of check boxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		 //radio Buttons
		//clicking on the round trip and checking the return date enabled or not
		String beforeClicking = driver.findElement(By.id("Div1")).getAttribute("style");
		System.out.println(beforeClicking);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); 
//		boolean enabled = driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled();
//		System.out.println(enabled);
		String afterClicking = driver.findElement(By.id("Div1")).getAttribute("style");
		System.out.println(afterClicking);
		if(afterClicking.contains("1")){
			System.out.println("executed");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("not executed");
			Assert.assertTrue(false);
		
		}
	

	}

}
