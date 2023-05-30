import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value=\"BLR\"]")).click();
		driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value=\"MAA\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		String returnDisabled = driver.findElement(By.cssSelector("#Div1")).getAttribute("style");
		if(returnDisabled.contains("0.5")){
			System.out.println("it is disabled");
		}
		else {
			System.out.println("it is not disabled");
		}
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		for(int i =1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.cssSelector("#btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		WebElement select = driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
		Select drp = new Select(select);
		drp.selectByIndex(2);
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		driver.quit(); 
		 

	}

}
