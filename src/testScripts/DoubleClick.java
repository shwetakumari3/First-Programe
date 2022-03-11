package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A0808909\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stqatools.com/demo/DoubleClick.php");
		//button[contains(text(),'Click Me')]
		Actions a = new Actions(driver);
		WebElement ab = driver.findElement(By.xpath("//button[contains(text(),'Click Me')]"));
		a.doubleClick(ab).doubleClick(ab).perform();		

	}

}