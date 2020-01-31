package SalesforcePackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wholePractise {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver","E:\\yashDoc\\Data\\WebDrivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement driver1=driver.findElement(By.id("gf-BIG"));
		System.out.println(driver1.findElements(By.tagName("a")).size());
		WebElement driver2= driver1.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
		
		int size=driver2.findElements(By.tagName("a")).size();
 		for(int i=0;i<size;i++)//This loop will open all the tabs
		{
			String keysToClick=Keys.chord(Keys.CONTROL,Keys.ENTER);
			driver2.findElements(By.tagName("a")).get(i).sendKeys(keysToClick);
			Thread.sleep(3000);
		}
 		
			//String parentWindow=driver.getWindowHandle();
			Set<String> ChildWindows=driver.getWindowHandles();
			Iterator <String> id=ChildWindows.iterator();
			while(id.hasNext())
			{
			
				driver.switchTo().window(id.next());
				System.out.println(driver.getTitle()); 
			}
		}
		
		

	}


