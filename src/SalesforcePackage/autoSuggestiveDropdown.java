package SalesforcePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\yashDoc\\Data\\WebDrivers\\Chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/?gclid=Cj0KCQiAsbrxBRDpARIsAAnnz_PP4mkceo6DRXkI3DciRVC-45tZ4P6zs73C-0bVLoxujMhlMOg-yFwaAviAEALw_wcB&cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded|162031058804&s_kwcid=AL!1631!3!162031058804!e!!g!!make%20my%20trip&ef_id=Cj0KCQiAsbrxBRDpARIsAAnnz_PP4mkceo6DRXkI3DciRVC-45tZ4P6zs73C-0bVLoxujMhlMOg-yFwaAviAEALw_wcB:G:s");
        driver.findElement(By.xpath("//label[@for='fromCity']")).click();
        driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-1']")).sendKeys("mum");
        Thread.sleep(2000);
        int i=2;
        while(i<=3)
        {
        	driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-1']")).sendKeys(Keys.DOWN);
        i++;
	}
        driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-1']")).sendKeys(Keys.ENTER);
	


}
}
