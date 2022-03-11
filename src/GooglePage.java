

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GooglePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A0808909\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://the-internet.herokuapp.com/login");
		//driver.get("https://accounts.lambdatest.com/register");
		//		WebElement searchBox = driver.findElement(By.name("q"));
		//		searchbox.sendKeys("java tutorials");
		//		searchbox.submit();
		//		System.out.println("page Title:"+driver.getTitle());

		//driver.get(“https://the-internet.herokuapp.com/login”);
		//			driver.findElement(By.cssSelector(".gLFyf.gsfi.")).click();
		//			driver.findElement(By.cssSelector(".gLFyf.gsfi.")).sendKeys("APJ");
		//			driver.findElement(By.cssSelector("")).click();

		//driver.findElement(By.id("username")).sendKeys("tomsmith");

//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword");
//		//driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
//
//		WebElement inputElem =driver.findElement(By.tagName("input"));
//		System.out.println("Input element Attribute" +inputElem.getAttribute("input"));
//
//
//
//		List<WebElement> elements = driver.findElements(By.tagName("input"));
//
//		System.out.println("no.of elements:"+elements.size());
//		for(WebElement elem: elements) {
//
//			System.out.println("value of name attribute:"+elem.getAttribute("name"));
//			//contain is a method and for dynamic locator use starts with
//			driver.findElement(By.xpath("//i[contains(text(),'Login')]")).click();
			
		//this is called CONTROLKEYS
		
//		driver.get("https://demo.opencart.com");
//		WebElement searchBox= new WebElement(By.cssSelector(null));
//		searchBox.sendKeys("Phone");
//		driver.findElement(By.cssSelector(span>)).click();
//		searchBox=driver.findElement(By.cssSelector(""));
//				searchBox.sendKeys(Keys.PAGEDOWN);
//				
//				//cord method
//				
//				searchBox.sendKeys(Keys.chord(Keys.SHIFT+"P"));
//				searchBox.sendKeys(Keys.chord(Keys.SHIFT("hone")));
//				searchBox.sendKeys(Keys.ENTER);
//				
				//Radio button . dropdown and Checkbox
//				driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
//	
//				WebElement chkbox=driver.findElement(By.cssSelector("#isAgeSeleted"));
//				chkbox.click();
//				System.out.println("After select:"+chkbox.isSelected());
//				chkbox.click();
//				System.out.println("After Unselect:"+chkbox.isSelected());
//				chkbox.click();
				
				
				
				
		//google seach list
		
	    //ul[@role='listbox']//li//descendant::div[@class='pcTkSc']
//		List<Wbelement>
				
		
//		weekend excercise
//		registration page on opencart-
//		radio button and sanfracsico employee details
//		from Anandhi to everyone:    12:28 PM
//		https://demo.opencart.com/index.php?route=account/register
//		from Anandhi to everyone:    12:28 PM
//		https://demo.seleniumeasy.com/basic-radiobutton-demo.html
//		from Anandhi to everyone:    12:28 PM
//		https://demo.seleniumeasy.com/table-sort-search-demo.html
		
				
		//double-click
	Actions actions=new Actions(driver);
		
		driver.get("https://stqatools.com/demo/DoubleClick.php");
		
		//WebElement menu= driver.findElement(By.cssSelector("ul.nav.navbar-nav li.dropdwn:nth-child(3)"));
		 WebElement searchBox = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/p[1]/button"));
		 actions.contextClick(searchBox).perform();
		

		}
		


	}


