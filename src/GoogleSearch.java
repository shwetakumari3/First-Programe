

	import java.time.Duration;
	import java.util.List;

	//import java.awt.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class GoogleSearch {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			//ul[@role='listbox']//li//descendant::div[@class='pcTkSc']
			System.setProperty("webdriver.chrome.driver","C:\\Users\\A0808909\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			WebElement search = driver.findElement(By.cssSelector(".gLFyf.gsfi"));
			search.sendKeys("Java Tutorial");
			//Thread.sleep(3000);
			List<WebElement> items = driver.findElements(By.xpath("//ul[@role='listbox']//li//descendant::div[@class='pcTkSc']"));
			System.out.println("Total Items :=" + items.size() );
			for(WebElement i :items)
			{
				String text = i.getText();
				if(text.equalsIgnoreCase("Java Tutorialspoint"))
				{
					i.click();
					break;
				}
				
				
					
			}
			
			 
		}
		

	}