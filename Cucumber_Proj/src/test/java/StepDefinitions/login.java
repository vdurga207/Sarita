package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	WebDriver driver;
	@Given("^openorge hrm$")
	public void openorge_hrm() throws Throwable {
	   System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Demp\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://apps.qaplanet.in//qahrm//login.php");
	}

	@When("^Enter username and password$")
	public void enter_username_and_password() throws Throwable {
	    driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
	    driver.findElement(By.name("txtPassword")).sendKeys("lab1");
	    driver.findElement(By.name("Submit")).click();
	}

	@Then("^Click on logout$")
	public void click_on_logout() throws Throwable {
	    driver.findElement(By.linkText("Logout")).click();
	}

}
