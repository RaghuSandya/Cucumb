/*package stepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DataTable {
	WebDriver driver;
	
	@Given("^Free CRM home page$")
	public void free_CRM_home_page() throws Throwable {
		driver=new FirefoxDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}

	@Then("^enter the username and password$")
	public void enter_the_username_and_password(DataTable UPC) throws Throwable {

		List<List<String>>data=UPC.raw();
		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(data.get(0).get(1));
	  
	}
    public  List<List<String>> raw() {
		// TODO Auto-generated method stub
		return null;
	}

	@Then("^click the login button$")
	public void click_the_login_button() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	    
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		driver.close();
	 
	}


}
*/