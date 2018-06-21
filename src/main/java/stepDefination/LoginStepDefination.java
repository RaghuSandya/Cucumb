/*package stepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination {
	
WebDriver driver;
	
	@Given("^User is already on login page$")
	public void user_is_already_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Utils/chromedriver.exe");
		driver=new ChromeDriver();
		driver=new FirefoxDriver();
		driver.get("https://www.freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}
	
	@When("^title of login page is Free CRM$")
 	public void title_of_login_page_is_Free_CRM() throws Throwable {
		String title=driver.getTitle();
		System.out.println("Title of page is:"+title);
		Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", title);
	}
	@Then("^user enter username and pass word$")
	public void user_enter_username_and_pass_word() throws Throwable {
		driver.findElement(By.name("username")).sendKeys("Giddaiah");
		driver.findElement(By.name("password")).sendKeys("Raghu123");
	    
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	   
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		String home=driver.getTitle();
		System.out.println("Home page title is :"+home);
		Assert.assertEquals("CRMPRO", home);  
	}
	@Then("^browser should be closed$")
	public void browser_should_be_closed() throws Throwable {
	    driver.close();
	}
	@Then("^user enter \"(.*?)\" and \"(.*?)\"$")
	public void user_enter_and(String Username, String password) throws Throwable {
		driver.findElement(By.name("username")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(password);
	  
	}
		
}
*/