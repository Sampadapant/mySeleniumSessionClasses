import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsUsingSiblingsWithXpath {
	
	public static void main(String[] args) {
		
		//Parent- child to child Traverse
		//header/div/button[1]/following-sibling::button[1]
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String loginText = driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
		System.out.println(loginText);
		
		//Sibling- parent to child Traverse
		//header/div/button[1]/parent::div
		
		String parentText = driver.findElement(By.xpath("//header/div/button[1]/parent::div")).getText();
		System.out.println(parentText);
		
		
}
}