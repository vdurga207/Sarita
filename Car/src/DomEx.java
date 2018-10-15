import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DomEx {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium_Demp\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://apps.qaplanet.in//qahrm//login.php");
	driver.manage().window().maximize();
	WebElement un=driver.findElement(By.name("txtUserName"));
	WebElement pwd=driver.findElement(By.name("txtPassword"));
	un.sendKeys("qaplanet1");
	pwd.sendKeys("lab1");
	
	pwd.sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	
	JavascriptExecutor JSE = (JavascriptExecutor)driver;
	WebElement s =driver.findElement(By.xpath("//ul[@id='option-menu']/li[1]"));
	String t= JSE.executeScript("return arguments[0].innerHTML;",s).toString();
	System.out.println(t);
	String s1=JSE.executeScript("return document.documentElement.innerText;").toString();
	System.out.println(s1);
}
}
