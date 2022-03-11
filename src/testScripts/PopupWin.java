package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupWin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A0808909\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stqatools.com/demo/Windows.php");
		String parentWin = driver.getWindowHandle();
		System.out.println("Parent Window Handle:="+parentWin);
		driver.findElement(By.xpath("//button[contains(text(),'Tab')]")).click();
		Set<String> tabs = driver.getWindowHandles();
		System.out.println("Number of Windows := "+tabs.size());
		for(String childWin:tabs)
		{
			System.out.println(childWin);
			if(!childWin.equalsIgnoreCase(parentWin))
			{
				driver.switchTo().window(childWin);
				driver.findElement(By.xpath("//a[contains(text(),'Java')]")).click();
			}
		}
		driver.close();
		driver.switchTo().window(parentWin);
		driver.findElement(By.xpath("//button[contains(text(),'new Window')]")).click();
		Set<String> wins = driver.getWindowHandles();
		System.out.println("Number of windows:" +wins.size());
		for(String w:wins)
		{
			if(!w.equalsIgnoreCase(parentWin))
			{
				driver.switchTo().window(w);
				
			}
		}
		driver.quit();

	}

}