import java.io.FileOutputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FliKart_To_PropFile {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Demp\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Samsung")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("VIEW ALL")).click();
		Thread.sleep(1000);
		List<WebElement> name=driver.findElements(By.xpath("//div[@class='_3wU53n']"));
		List<WebElement> price=driver.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
		
		Properties pro=new Properties();
		FileOutputStream f=new FileOutputStream("C:\\Users\\QAP22\\Desktop\\Car\\src\\Sam.properties");
		for(int i=0;i<name.size();i++){
		pro.setProperty("Mobile_Name"+i, name.get(i).getText());
		pro.setProperty("Mobile_Prize"+i, price.get(i).getText());
		
		}
		pro.store(f, null);
	}

}
