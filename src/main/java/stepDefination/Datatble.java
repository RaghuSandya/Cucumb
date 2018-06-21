/*package stepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Datatble {
	WebDriver driver;
	@Given("^user is main page$")
	public void user_is_main_page() throws Throwable {
	    driver=new FirefoxDriver();
	    driver.get("https://www.freecrm.com/index.cfm");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Then("^user enter username and password$")
	public void user_enter_username_and_password(DataTable credentials) throws Throwable {
		List<List<String>>data=credentials.raw();
		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(data.get(0).get(1));
	  
	}

	@Then("^user click the login button$")
	public void user_click_the_login_button() throws Throwable {
	  driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("^user close the browser$")
	public void user_close_the_browser() throws Throwable {
	    driver.close();
	}

}
*/