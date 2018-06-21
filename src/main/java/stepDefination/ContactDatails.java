/*package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ContactDatails {
	WebDriver driver;
	
	@Given("^User already FREE_CRM Page$")
	public void user_already_FREE_CRM_Page() throws Throwable {
		driver=new FirefoxDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	   
	}

	@Then("^User enter the \"(.*?)\" and \"(.*?)\"$")
	public void user_enter_the_and(String Username, String Password) throws Throwable {
		driver.findElement(By.name("username")).sendKeys(Username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Password);
	    
	}

	@Then("^User clicking the login button$")
	public void user_clicking_the_login_button() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	 
	}

	@Then("^user mouse over the contact$")
	public void user_mouse_over_the_contact() throws Throwable {
		Thread.sleep(5000);
		driver.switchTo().frame("mainpanel");
		WebElement el=driver.findElement(By.xpath("//a[@title='Contacts']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(el).build().perform();
		
		
	}

	@Then("^user clicking the new contact$")
	public void user_clicking_the_new_contact() throws Throwable {
		driver.findElement(By.xpath("//a[@title='New Contact']")).click();
	    
	}

	@Then("^user enter contact details \"(.*?)\" and \"(.*?)\"and \"(.*?)\"$")
	public void user_enter_contact_details_and_and(String firstname, String lastname, String position) throws Throwable {
		driver.findElement(By.id("first_name")).sendKeys(firstname);
		driver.findElement(By.id("surname")).sendKeys(lastname);
		driver.findElement(By.id("company_position")).sendKeys(position);
	   
	}

	@Then("^user click the save button$")
	public void user_click_the_save_button() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Save']")).click();
	    
	}

	@Then("^user clcik the logout button$")
	public void user_clcik_the_logout_button() throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	   
	}

	@Then("^user close the browser$")
	public void user_close_the_browser() throws Throwable {
		driver.close();
	 
	}



}
*/