import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addToCartGeneric {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		int j =0;
		String [] cartItems = {"Cucumber","Brocolli, Beetroot"};//put the products in arrays  
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i = 0; i <products.size(); i++) {
			
			String [] names = products.get(i).getText().split("-");
			String formattedName = names[0].trim();
			//check whether name you extracted is present in array or not
			//convert array into array list for easy search  
			List arrayItems = Arrays.asList(cartItems);
			if (arrayItems.contains (formattedName )) {
				j++ ;
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				if(j==3) {
					break;
				}
			}
		}
		
		driver.quit();
		
		
		
		

	}

}
