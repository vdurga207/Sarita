import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Demp\\chromedriver.exe");
		ChromeDriver op=new ChromeDriver();
		op.get("https://www.google.com/");
		WebElement sea=op.findElement(By.id("lst-ib"));
		sea.sendKeys("fb");
		sea.sendKeys(Keys.ENTER);
	
	}

}
