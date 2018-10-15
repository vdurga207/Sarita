import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium_Demp\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://apps.qaplanet.in/WebApp");
	driver.findElement(By.xpath("/html/body/div/h1[4]/a")).click();
	Set<String> s=driver.getWindowHandles();
	Iterator i=s.iterator();
	while(i.hasNext())
	
	
	driver.switchTo().window("http://apps.qaplanet.in/WebApp/NestedAlerts");
	driver.findElement(By.xpath("html/body/input[1]")).click();
}
}
