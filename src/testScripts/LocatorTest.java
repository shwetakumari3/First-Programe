package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A0808909\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://the-internet.herokuapp.com/login");
		//driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
		//driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
		List<WebElement> l = driver.findElements(By.tagName("input"));
		System.out.println("No. of Elements := "+ l.size());
		//driver.findElement(By.className("radius")).click();
		for(WebElement elem:l)
		{
			System.out.println("Value of Name Attribute := " +elem.getAttribute("name"));
		}
		String textVal = driver.findElement(By.partialLinkText("Selenium")).getText();
		System.out.println("Text is := "+ textVal );
		
	}

}