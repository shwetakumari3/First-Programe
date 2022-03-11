package testScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A0808909\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/iframe");
		//driver.switchTo().frame("mce_0_ifr");
		//driver.switchTo().frame(0);
		WebElement iFrameElem = driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(iFrameElem);
		WebElement inputTxt = driver.findElement(By.id("tinymce"));
		inputTxt.clear();
		inputTxt.sendKeys("Hello World");
		driver.switchTo().parentFrame();
		WebElement linkTxt = driver.findElement(By.cssSelector("span.tox-statusbar__branding"));
		linkTxt.click();
		

	}

}








//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Frames {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		// TODO Auto-generated method stub
//				System.setProperty("webdriver.chrome.driver", "C:\\Users\\A0808909\\Downloads\\chromedriver_win32\\chromedriver.exe");
//				// Instantiate a ChromeDriver class.
//				WebDriver driver=new ChromeDriver();
//		        driver.get("http://the-internet.herokuapp.com/iframe");
//		        driver.manage().window().maximize();
//		     //   driver.switchTo().frame("mca_0_ifr");
//		       // driver.switchTo().frame(0);
//		        WebElement iFrameElem=driver.findElement(By.id("mce_0_ifr"));
//		        driver.switchTo().frame(iFrameElem);
//		        WebElement inputTxt=driver.findElement(By.id("tinymce"));
//		        inputTxt.clear();
//		        inputTxt.sendKeys("Hello");
//		        //driver.switchTo().parentFrame();
//		        //driver.switchTo().defaultContent();driver.findElement(By.linkText("Powered by tiny")).click();
//		        driver.findElement(By.cssSelector("span.tox-statusbar_branding"));
//		        //linkTxt.Click();
//		 
//	}
//
//}
