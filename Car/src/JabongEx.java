import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JabongEx {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Demp\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.jabong.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("men");
		driver.findElement(By.xpath("//*[@id='top-search-input']/div[1]/span")).click();
		Thread.sleep(2000);
//driver.findElement(By.xpath("//*[@id='Accessory_Gift_Set']/input")).click();
		List<WebElement> li=driver.findElements(By.xpath("//div[@class='options']/label/div/input"));
		Iterator<WebElement> it=li.iterator();
		while(it.hasNext())
		{
			WebElement c=it.next();
			c.click();
		}
	}

}
