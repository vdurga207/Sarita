import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium_Demp\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://newtours.demoaut.com/");
	List<WebElement> li=driver.findElements(By.tagName("a"));
	for(int i=0;i<li.size();i++)
	{
		System.out.println(li.get(i).getText());
		li.get(i).click();
		Thread.sleep(1000);
		
		//driver.navigate().back();
	}
}
}
