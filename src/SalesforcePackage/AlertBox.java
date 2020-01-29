package SalesforcePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\yashDoc\\Data\\WebDrivers\\Chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("[id='name']")).sendKeys("Bharti");
		driver.findElement(By.cssSelector("//input[@id='alertbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

	}

}
