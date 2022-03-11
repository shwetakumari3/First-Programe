import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.Alert;

public class AlertJava {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A0808909\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		driver.findElement(By.xpath("(//button[contains(text(),'Click me!')])[1]")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Text is := "+text);
		alert.accept();
		

		driver.findElement(By.xpath("(//button[contains(text(),'Click me!')])[2]")).click();
		Alert confirm = driver.switchTo().alert();
		String text1 = confirm.getText();
		System.out.println("Text is := "+text1);
		confirm.dismiss();

		driver.findElement(By.xpath("//button[contains(text(),'Prompt')]")).click();
		Alert prompt = driver.switchTo().alert();
		String text2 = prompt.getText();
		System.out.println("Text is := "+text2);
		prompt.sendKeys("Hello");
		prompt.accept();
		
	
		
		
		
	}

}