import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSexetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A0808909\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//((Object) driver.manage()).maximize();
		driver.get("");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String strTitle=(String)js.executeScript("return document.title");
		System.out.println(strTitle);
		WebElement searchBox=(WebElement)js.executeScript("return document.getElementsByName(search)[0]");
		searchBox.sendKeys("Phone");
		

	}

}
