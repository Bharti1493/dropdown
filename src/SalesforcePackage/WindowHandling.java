package SalesforcePackage;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\yashDoc\\Data\\WebDrivers\\Chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https:accounts.google.com/signup");
		
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Privacy']")).click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebDriverWait w= new WebDriverWait(driver,7);
		w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text90='Terms of Service']"))));
		Set<String> ids= driver.getWindowHandles();
		Iterator <String>  it=  ids.iterator();
		String parentId= it.next();
		String childId= it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		
		
		

	}

}
