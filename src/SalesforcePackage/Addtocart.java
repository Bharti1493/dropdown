package SalesforcePackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\yashDoc\\Data\\WebDrivers\\Chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String [] vegies= {"Carrot","Tomato","Cauliflower"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	 List<WebElement> product=driver.findElements(By.cssSelector("h4[class*='product-name']"));
		
		for(int i=0;i<product.size();i++)
		{
			String name=product.get(i).getText();
			if(name.contains("vegies"))
			{
				driver.findElement(By.cssSelector("//button[@type='button']")).click();
			}
		}

	}

}
