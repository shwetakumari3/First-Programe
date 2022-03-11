package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//td[contains(text(),'Wagner')]/following-sibling::td[5]
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A0808909\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		WebElement sel = driver.findElement(By.cssSelector(".form-control"));
		//sel.click();
		Select s = new Select(sel);
		s.selectByValue("Tuesday");
		Select multiSel = new Select(driver.findElement(By.name("States")));
		if(multiSel.isMultiple())
		{
			multiSel.selectByIndex(1);
			multiSel.selectByValue("New York");
			multiSel.selectByVisibleText("Texas");
			List<WebElement> items = multiSel.getAllSelectedOptions();
		    
		}
		
	}

}