package SalesforcePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class validatingButtonIsDisableOrEnable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\yashDoc\\Data\\WebDrivers\\Chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']")).isEnabled());
		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_0")).click();
		if(driver.findElement(By.cssSelector("#Div1")).getAttribute("style").contains("1"))
{
System.out.println("The webElement is enabled");
	}
		else {
			
			Assert.assertTrue(true);
		}

}
}
