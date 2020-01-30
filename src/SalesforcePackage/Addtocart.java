package SalesforcePackage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Addtocart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\yashDoc\\Data\\WebDrivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		//WebDriverWait w = new WebDriverWait(driver, 5);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);

		// driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		String[] vegies = { "Tomato", "Carrot", "Cauliflower" };
		//w.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector(".product-name"))));
		List<WebElement> product = driver.findElements(By.cssSelector(".product-name"));

		if (driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).getAttribute("class")
				.contains("disabled")) {
			for (int i = 0; i < product.size(); i++) {
				String[] name = product.get(i).getText().split("-");
				String Formatedname = name[0].trim();
				List al = Arrays.asList(vegies);
				if (al.contains(Formatedname)) {
					//w.until(ExpectedConditions
							//.visibilityOfElementLocated((By.xpath("//button[text()='ADD TO CART']"))));
					driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
					Thread.sleep(2000);

				}

			}
			driver.findElement(By.xpath("//img[@alt='Cart']")).click();

		} else {
			driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		}

	}
}
