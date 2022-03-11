
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A0808909\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// Instantiate a ChromeDriver class.
		WebDriver driver=new ChromeDriver();
        driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		
		driver.findElement(By.xpath("(//button[contains(text(),'Click Me!')])[1]"));
		Alert alert=driver.switchTo(). alert();
		System.out.println("Alert text:"+alert.getText());
		
		alert.accept();
		
		// Launch Website
		//driver.get("https://www.google.com");
		//Maximize the browser
		//driver.manage().window().maximize();
	
		//driver.close();
		
		
	}

}