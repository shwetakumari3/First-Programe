package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A0808909\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		WebElement checkBox = driver.findElement(By.id("isAgeSelected"));
		Thread.sleep(3000);
		checkBox.click();
		System.out.println("Is checkbox elected := "+checkBox.isEnabled());
		Thread.sleep(3000);
		checkBox.click();
		
		System.out.println("Is checkbox elected := "+checkBox.isEnabled());
	}

}