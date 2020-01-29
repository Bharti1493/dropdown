package SalesforcePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\yashDoc\\Data\\WebDrivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");

		Select departureFrom = new Select(
				driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1_CTXT']")));
		departureFrom.selectByIndex(4);
		departureFrom.selectByVisibleText("Amritsar (ATQ)");
	}

}
