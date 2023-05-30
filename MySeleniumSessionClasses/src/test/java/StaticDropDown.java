import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//dropdown with select tag
		WebElement dropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropp = new Select(dropDown);
		dropp.selectByIndex(3);
		System.out.println(dropp.getFirstSelectedOption().getText());
		dropp.selectByVisibleText("AED");
		System.out.println(dropp.getFirstSelectedOption().getText());
		dropp.selectByValue("INR");
		System.out.println(dropp.getFirstSelectedOption().getText());
	

	}

}
