package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ControlKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A0808909\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");
		Actions a = new Actions(driver);
		WebElement text = driver.findElement(By.cssSelector("input.form-control.input-lg"));
		WebElement searchBtn = driver.findElement(By.cssSelector("span >.btn.btn-default.btn-lg"));
		text.sendKeys("Phone");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(searchBtn));
		searchBtn.click();
//		a.contextClick(text).perform();
//		WebElement move = driver.findElement(By.cssSelector("ul.nav.navbar-nav li.dropdown:nth-child(3)"));
//		a.moveToElement(move)
//		 .click(driver.findElement(By.xpath("//a[contains(text(),'Monitors (2)')]")))
//		 .perform();
//		WebElement searchBox = driver.findElement(By.cssSelector("input.form-control.input-lg"));
////		searchBox.sendKeys("Phone");
//		searchBox.sendKeys(Keys.chord(Keys.SHIFT+"P"));
//		searchBox.sendKeys(Keys.chord("hone"));
//		searchBox.sendKeys(Keys.ENTER);
////		driver.findElement(By.cssSelector("span >.btn.btn-default.btn-lg")).click();
//		searchBox = driver.findElement(By.cssSelector("input.form-control.input-lg"));
////		searchBox.sendKeys(Keys.PAGE_DOWN);
////		searchBox.sendKeys(Keys.PAGE_DOWN);
////		searchBox.sendKeys(Keys.BACK_SPACE);
//		boolean redirectElem = driver.findElement(By.name("redirect")).isDisplayed();
//		System.out.println("Redirect element present := "+redirectElem);
		
	}

}