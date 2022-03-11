package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A0808909\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement dragElem = driver.findElement(By.cssSelector("div#draggable"));
		WebElement dropElem = driver.findElement(By.cssSelector("div#droppable"));
		Actions a = new Actions(driver);
		a.dragAndDrop(dragElem, dropElem).perform();
		

	}

}
