/*package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Company {
	WebDriver driver;
	
	@Given("^User enter the home Page$")
	public void user_enter_the_home_Page() throws Throwable {
		driver=new FirefoxDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}

	@When("^user enter the \"(.*?)\"and\"(.*?)\"$")
	public void user_enter_the_and(String Username, String password ) throws Throwable {
		driver.findElement(By.name("username")).sendKeys(Username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
	  
	}

	@Then("^user click the login button$")
	public void user_click_the_login_button() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	    
	}
	@Then("^user mouse over the companies$")
	public void user_mouse_over_the_companies() throws Throwable {
		Thread.sleep(5000);
		driver.switchTo().frame("mainpanel");
		Actions ac=new Actions(driver);
		WebElement el=driver.findElement(By.xpath("//a[@title='Companies']"));
		ac.moveToElement(el).build().perform();
		
	   
	}

	@Then("^user click the new company$")
	public void user_click_the_new_company() throws Throwable {
		driver.findElement(By.xpath("//a[@title='New Company']")).click();
	    
	}

	@Then("^user enter company details\"(.*?)\"and\"(.*?)\"$")
	public void user_enter_company_details_and(String name, String industry) throws Throwable {
		driver.findElement(By.id("company_name")).sendKeys(name);
		driver.findElement(By.name("industry")).sendKeys(industry);
	    
	}

	@Then("^user  click the logout$")
	public void user_click_the_logout() throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	   
	}

	@Then("^user close browser$")
	public void user_close_browser() throws Throwable {
		driver.close();
	    
	}

}
*/