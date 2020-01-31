package SalesforcePackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\yashDoc\\Data\\WebDrivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:accounts.google.com/signup");

		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Privacy']")).click();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// WebDriverWait w= new WebDriverWait(driver,7);
		driver.findElement(By.xpath("//a[text()='Privacy']")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		while (it.hasNext()) {
			String Childwindow = it.next();
			if (!parentWindow.equalsIgnoreCase(Childwindow)) {

				// Switching to Child window
				driver.switchTo().window(Childwindow);
				System.out.println(driver.getTitle());

			}

		}
	}
}
