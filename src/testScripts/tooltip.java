package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tooltip {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A0808909\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		WebElement ageBox = driver.findElement(By.cssSelector("#age"));
		ageBox.sendKeys(Keys.PAGE_DOWN);
		Actions a = new Actions(driver);
		a.moveToElement(ageBox).perform();
		WebElement text = driver.findElement(By.cssSelector(".ui-tooltip-content"));
		
		System.out.println(text.getText());
		ageBox.sendKeys("30");
		
	}

}
