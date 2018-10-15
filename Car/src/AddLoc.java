import java.io.File;
import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
public class AddLoc {
	
	    public static void main(String[] args) throws Exception
	    {
	        
	      System.setProperty("webdriver.chrome.driver","D:\\Selenium_Demp\\chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	         WebDriverWait wait=new WebDriverWait(driver,60);
	      
	     //To open URL
	     driver.get("http://apps.qaplanet.in/qahrm/login.php");
	    
	    WebElement objUN = driver.findElement(By.name("txtUserName"));
	     WebElement objPWD =driver.findElement(By.name("txtPassword"));
	     WebElement objLogin = driver.findElement(By.name("Submit"));
	     System.out.println(objLogin.getCssValue("style"));
	     //Verify if user name is displayed
	        if(objUN.isDisplayed())
	        {
	            System.out.println("User name displayed");
	        }
	        //Verify password
	        if(objPWD.isDisplayed())
	        {
	            System.out.println("Password displayed");
	        }
	        //Verify login and clear
	        if(objLogin.isDisplayed())
	        {
	            System.out.println("Login button is displayed");
	        }
	        
	        String strUN="qaplanet1";
	        String strPWD="lab1";
	        //LOGIN TO ORANGE HRM
	        objUN.sendKeys(strUN);
	        objPWD.sendKeys(strPWD);
	        objLogin.click();
	        //Wait for OrangeHRM page and verify
	        if(wait.until(ExpectedConditions.titleIs("OrangeHRM")))
	        {
	            System.out.println("OrangeHRM page displayed");
	        }
	        else
	        {
	            System.out.println("Failed to login");
	            return;
	        }
	        //-----------------------------------------------------------------------------
	        //Get welcome text
	        String welText=driver.findElement(By.xpath("//ul[@id='option-menu']/li[1]")).getText();
	        //Verify welcome text
	        if(welText.equals("Welcome "+strUN))
	        {
	            System.out.println("Welcome "+strUN+" displayed");
	        }
	        //Create webelements for Change Password & logout
	        WebElement objCP=driver.findElement(By.linkText("Change Password"));
	        WebElement objLogout=driver.findElement(By.linkText("Logout"));
	        //Verify Change Password & logout
	        if(objCP.isDisplayed() && objLogout.isDisplayed())
	        {
	            System.out.println("Change Password & logout are displayed");
	        }
	        //Focus on Admin
	        Actions act=new Actions(driver);
	        WebElement objAdmin=driver.findElement(By.id("admin"));
	        act.moveToElement(objAdmin).perform();
	        //Verify the Company info is displayed
	        WebElement objCompInfo=driver.findElement(By.linkText("Company Info"));
	        if(objCompInfo.isDisplayed())
	        {
	            System.out.println("Company info displayed");
	        }
	        else
	        {
	            System.out.println("Company info is not displayed");
	        }
	        //Focus on Company info
	        Actions act2=new Actions(driver);
	        WebElement objCompfocus=driver.findElement(By.xpath("//*[@id='admin']/ul/li[1]/a"));
	        act2.moveToElement(objCompfocus).perform();
	        //Verify the General is displayed
	        WebElement objGeneral=driver.findElement(By.linkText("General"));
	        if(objGeneral.isDisplayed())
	        {
	            System.out.println("General displayed");
	        }
	        else
	        {
	            System.out.println("General is not displayed");
	        }
	        //Verify the Locations is displayed
	        WebElement objLocations=driver.findElement(By.linkText("Locations"));
	        if(objLocations.isDisplayed())
	        {
	        System.out.println("Locations displayed");
	        }
	        else
	        {
	        System.out.println("Locations is not displayed");
	        }
	        //Verify the Company Structure is displayed
	        WebElement objCompanyStructure=driver.findElement(By.linkText("Company Structure"));
	        if(objCompanyStructure.isDisplayed())
	        {
	        System.out.println("Company Structure displayed");
	        }
	        else
	        {
	        System.out.println("Company Structure is not displayed");
	        }
	        WebElement objCompanyProperty=driver.findElement(By.linkText("Company Property"));
	        if(objCompanyProperty.isDisplayed())
	        {
	        System.out.println("Company Property displayed");
	        }
	        else
	        {
	        System.out.println("Company Property is not displayed");
	        }        
	        
	        
	        //Verify the job is displayed
	                WebElement objJob=driver.findElement(By.linkText("Job"));
	                if(objJob.isDisplayed())
	                {
	                    System.out.println("Job displayed");
	                }
	                else
	                {
	                    System.out.println("Job is not displayed");
	                }
	        //Verify the Qualification is displayed
	        WebElement objQual=driver.findElement(By.linkText("Qualification"));
	        if(objQual.isDisplayed())
	        {
	        System.out.println("Qualification displayed");
	        }
	        else
	        {
	        System.out.println("Qualification is not displayed");
	        }
	        //Verify the Skills is displayed
	        WebElement objSkills=driver.findElement(By.linkText("Skills"));
	        if(objSkills.isDisplayed())
	        {
	        System.out.println("Skills displayed");
	        }
	        else
	        {
	        System.out.println("Skills is not displayed");
	        }        
	        //Step 5:click on Locations
	        objLocations.click();
	        Thread.sleep(2000);
	        driver.switchTo().frame("rightMenu");
	        //Verify Company Info : Locations page with search by, search edit box, search button,reset,add,delete buttons.
	        //Search By:Dropdown
	       /* Thread.sleep(2000);
	          wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("rightMenu")));
	        WebElement objSearchBy=driver.findElement(By.xpath("//*[@id='loc_code']"));
	        WebElement objSearchFor=driver.findElement(By.name("loc_name"));
	        WebElement objSearchtext=driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input[2]"));
	        WebElement objReset=driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input[3]"));
	        WebElement objAdd=driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div[1]/input[1]"));
	        WebElement objDel=driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div[1]/input[2]"));
	        if(objSearchBy.isDisplayed()&&objSearchFor.isDisplayed())
	        {
	            System.out.println("Search by and Search for are displayed");
	        }
	        else
	        {
	            System.out.println("Search by and Search for are not displayed");
	        }
	        if(objSearchtext.isDisplayed()&&objReset.isDisplayed())
	        {
	            System.out.println("Search text and Reset are displayed");
	        }
	        else
	        {
	            System.out.println("Search text and Reset are not displayed");
	        }
	        if(objAdd.isDisplayed()&&objDel.isDisplayed())
	        {
	            System.out.println("Add and Delete buttons are displayed");
	        }
	        else
	        {
	            System.out.println("Add and Delete buttons are not displayed");
	        }    
	    //Click on Add
	        objAdd.click();    
	    //Verify Company Info : Locations page and all fields must be displayed
	        WebElement objLocName=driver.findElement(By.name("txtLocDescription"));
	        WebElement objLocCountry=driver.findElement(By.name("cmbCountry"));
	        WebElement objLocAddress=driver.findElement(By.name("txtAddress"));
	        WebElement objLocZip=driver.findElement(By.name("txtZIP"));
	        if(objLocName.isDisplayed()&&objLocCountry.isDisplayed())
	        {
	            System.out.println("Name and Country are displayed");
	        }
	        else
	        {
	            System.out.println("Name and Country are not displayed");
	        }
	        if(objLocAddress.isDisplayed()&&objLocZip.isDisplayed())
	        {
	            System.out.println("Address and Zip are displayed");
	        }
	        else
	        {
	            System.out.println("Address and Zip are not displayed");
	        }
	        
	WebElement objLocSave=driver.findElement(By.id("editBtn"));
	//Keep all fields as blank and click on save
	objLocSave.click();

	//Creating alert1 handling popup
	Alert Alert1=driver.switchTo().alert();

	String alerttext1=Alert1.getText();
	Alert1.accept();
	System.out.println(alerttext1);
	String expectedalertmsg1="Please correct the following\n\n        - Location Name has to be specified\n        - Country should be selected!\n        - Address should be specified\n        - Zip Code should be specified";
	System.out.println(expectedalertmsg1);
	if(alerttext1.equals(expectedalertmsg1))
	        {
	    System.out.println("Yes message is displayed");
	        }
	else
	{
	    System.out.println("No message is not displayed");
	}
	String strCompName="Comp name";
	Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	System.out.println(timestamp);
	String strCompNameTimestamp=strCompName+timestamp;
	System.out.println(strCompNameTimestamp);
	//Enter name only and click on save
	objLocName.sendKeys(strCompNameTimestamp);
	objLocSave.click();
	//Creating alert2 handling popup
	Alert Alert2=driver.switchTo().alert();

	String alerttext2=Alert2.getText();
	Alert2.accept();
	System.out.println(alerttext2);
	String expectedalertmsg2="Please correct the following\n\n        - Country should be selected!\n        - Address should be specified\n        - Zip Code should be specified";
	System.out.println(expectedalertmsg2);
	if(alerttext2.equals(expectedalertmsg2))
	        {
	    System.out.println("Yes message is displayed");
	        }
	else
	{
	    System.out.println("No message is not displayed");
	}
	//Select country and click on save
	Select selcountrydropdown=new Select(driver.findElement(By.id("cmbCountry")));
	selcountrydropdown.selectByVisibleText("India");
	objLocSave.click();
	//Creating alert3 handling popup
	Alert Alert3=driver.switchTo().alert();

	String alerttext3=Alert3.getText();
	Alert3.accept();
	System.out.println(alerttext3);
	String expectedalertmsg3="Please correct the following\n\n\t- Address should be specified\n\t- Zip Code should be specified\n";
	System.out.println(expectedalertmsg3);
	if(alerttext3.equals(expectedalertmsg3))
	        {
	    System.out.println("Yes message is displayed");
	        }
	else
	{
	    System.out.println("No message is not displayed");
	}
	Thread.sleep(2000);
	//Enter Address and click on save
	objLocAddress.sendKeys("Company location Address");
	objLocSave.click();
	//Creating alert4 handling popup
	Alert Alert4=driver.switchTo().alert();

	String alerttext4=Alert4.getText();
	Alert4.accept();
	System.out.println(alerttext4);
	String expectedalertmsg4="Please correct the following\\n\\n\\t- Zip Code should be specified";
	System.out.println(expectedalertmsg4);
	if(alerttext4.equals(expectedalertmsg4))
	        {
	    System.out.println("Yes message is displayed");
	        }
	else
	{
	    System.out.println("No message is not displayed");
	}

	//Enter zip code and click on save
	objLocZip.sendKeys("12345");
	objLocSave.click();
	Thread.sleep(2000);
	//verify location info must be displayed on locations table.
	int rc=driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr")).size();
	        int i;
	        for(i=1;i<=rc;i++)
	        {
	            //Get second column data
	            String strLocID=driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[2]")).getText();
	            System.out.println(strLocID);
	            //Get third column data
	            String strCompNametable=driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[3]/a")).getText();
	            System.out.println(strCompNametable);
	            
	            if(strCompNametable.equals(strCompNameTimestamp))
	            {
	                System.out.println(strLocID+" , "+strCompNametable+" displayed at: "+i);
	                driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[3]/a")).click();
	               // break;
	                }
	                WebElement next=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
	                if(next.isEnabled())
	                {
	                	next.click();
	                }    
	        }
	        String xp="[0-9]";
	        String comxpath="//div[@class='pagingbar']/a[contains(text(),'')]";
	        WebElement next=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
	        List<WebElement> li=driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr/td[3]/a"));
	        Iterator<WebElement> itr=li.iterator();
	        while(itr.hasNext())
	        {
	        	WebElement locname=itr.next();
	        	if(locname.getText().equals(strCompNameTimestamp))
	        		locname.click();
	        	else{
	        	while(next.isEnabled())
	        		next.click();
	        	if(locname.getText().equals(strCompNameTimestamp))
	        		locname.click();
	        	}
	        	
	        }*/
	        int rc=driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr")).size();
	        int i;
	        for(i=1;i<=rc;i++)
	        {
	            //Get second column data
	        	String name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]/a")).getText();
	        	if(name.contains("LOC25"))
	        	{
	            WebElement checkbox=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]/input"));
	            checkbox.click();
	            }
	        	
	    }
	    }
	        
	      
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	/*Thread.sleep(2000);
	//boolean n=driver.findElement(By.xpath("//table/descendant::td/a[contains(text(),'"+strCompNameTimestamp+"')]/ancestor::td/preceding-sibling::td[1]/a")).isDisplayed();
	if(wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//table/descendant::td/a[contains(text(),'"+strCompNameTimestamp+"')]/ancestor::td/preceding-sibling::td[1]/a"))))
	{
		
		System.out.println("verified");
		driver.findElement(By.xpath("//table/descendant::td/a[contains(text(),'"+strCompNameTimestamp+"')]/ancestor::td/preceding-sibling::td[1]/a")).click();
	}
	else
	{
		driver.findElement(By.linkText("2")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//table/descendant::td/a[contains(text(),'"+strCompNameTimestamp+"')]/ancestor::td/preceding-sibling::td[1]/a")).click();
	}*/
	//Get the location id
	
	/*String strLocId1=driver.findElement(By.name("txtLocationCode")).getAttribute("value");
	System.out.println(strLocId1);
	//Click on back button
	driver.findElement(By.xpath("/html/body/div/div[1]/input")).click();
	//Search for the newly created location by ID"
	Select selsearchbydropdown=new Select(driver.findElement(By.id("loc_code")));
	selsearchbydropdown.selectByVisibleText("ID");
	driver.findElement(By.name("loc_name")).sendKeys(strLocId1);
	driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input[2]")).click();

	//Verify the location name in locations table
	String strcomptable2=driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr[1]/td[3]/a")).getText();
	System.out.println(strcomptable2);

	if(strCompNameTimestamp.equals(strcomptable2))
	{
	    System.out.println("Location is created and verified");
	}
	else
	{
	    System.out.println("Location is not verified");
	}
	driver.close();
	driver.quit();*/
	}

