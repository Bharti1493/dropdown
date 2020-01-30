package SalesforcePackage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocart {

	public static void main(String[] args) throws InterruptedException {
		int j=0;
		System.setProperty("webdriver.chrome.driver","E:\\yashDoc\\Data\\WebDrivers\\Chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	
		String [] vegies= {"Carrot","Tomato","Cauliflower"};
	 List<WebElement> product=driver.findElements(By.cssSelector(".product-name"));
		
		for(int i=0;i<product.size();i++)
		{
			String[] name=product.get(i).getText().split("-");
			String Formatedname=name[0].trim();
			List al= Arrays.asList(vegies);
			if(al.contains(Formatedname))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				Thread.sleep(2000);
				if(j==3)
				{
					Systm.out.println("Stop loop")
				}
				
			}
			
			
		}
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();

	}
}


