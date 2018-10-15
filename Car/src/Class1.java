import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium_Demp\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://apps.qaplanet.in/WebApp/UserInputForm.html");
		int i=234567800;

	}

}
