import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium_Demp\\chromedriver.exe");
	/*ChromeOptions op=new ChromeOptions();
	op.addArguments("--disable-notifications");*/
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://apps.qaplanet.in//qahrm//login.php");
	driver.manage().window().maximize();
	WebElement un=driver.findElement(By.xpath("//input[matches(@name,'^te$')]"));
	WebElement pwd=driver.findElement(By.name("txtPassword"));
	un.sendKeys("qaplanet1");
	pwd.sendKeys("lab1");
	System.out.println(pwd.getAttribute("value"));
	pwd.sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	String l="^[L][a-z]{4}t$";
	Pattern p=Pattern.compile(l);
	//driver.findElement(By.xpath("//a[contains(text(),'"+RegEx.l+"')]")).click();


	/*FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
       .withTimeout(30, TimeUnit.SECONDS)
       .pollingEvery(5, TimeUnit.SECONDS)
       .ignoring(NoSuchElementException.class);*/
	//driver.findElement(By.name("Submit")).click();
	Thread.sleep(2000);                 
	/*driver.switchTo().frame("rightMenu");
	Thread.sleep(2000);
	WebElement s=driver.findElement(By.xpath("//table[@class='data-table']/descendant::td[contains(text(),'6631')]/preceding-sibling::td"));
	if(s.isDisplayed())
	{
		s.click();
		System.out.println("dis");
	}
	else
	{
		System.out.println("not");
	}
	WebDriverWait w=new WebDriverWait(driver, 20);
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
	driver.findElement(By.linkText("Add Employee")).click();
	w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("rightMenu"));
	String code=driver.findElement(By.id("txtEmployeeId")).getAttribute("value");
	driver.findElement(By.id("txtEmpLastName")).sendKeys("r");
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("r");
	driver.findElement(By.className("savebutton")).click();
	driver.findElement(By.className("backbutton")).click();
	
	int rc=driver.findElements(By.xpath("//table/tbody/tr")).size();
	for(int i=1;i<=rc;i++)
	{
		String codee=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
		WebElement name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]/a"));
		if(codee.equals(code)&&name.getText().equals("r r"))
		{
			System.out.println("added");
		
			driver.findElement(By.xpath("//td[contains(text(),'"+code+"')]/preceding-sibling::td/input")).click();
			//name.click();
			break;
		}
	}
	List<WebElement> li=driver.findElements(By.xpath("//td[contains(text(),'781')]/preceding-sibling::td/input"));

	Iterator<WebElement> itr=li.iterator();
	while(itr.hasNext())
	{
		WebElement c=itr.next();
		
		c.click();
	}
	*/
}
}
