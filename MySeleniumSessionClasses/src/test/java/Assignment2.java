import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("sampada");
		driver.findElement(By.name("email")).sendKeys("sampadapant1@gmail.com");
		driver.findElement(By.cssSelector("#exampleInputPassword1")).sendKeys("slesha123");
		driver.findElement(By.cssSelector("#exampleCheck1")).click();
		WebElement genD = driver.findElement(By.cssSelector("#exampleFormControlSelect1"));
		Select gender = new Select(genD);
		gender.selectByIndex(1);
		driver.findElement(By.cssSelector("#inlineRadio1")).click();
		driver.findElement(By.cssSelector("input[type=\"date\"]")).sendKeys("11/11/2011");
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		String successMessage = driver.findElement(By.cssSelector("div[class=\"alert alert-success alert-dismissible\"]")).getText();
		System.out.println(successMessage);
		Assert.assertEquals(successMessage, "×\n"
				+ "Success! The Form has been submitted successfully!.");
		driver.quit();

	}

}
 