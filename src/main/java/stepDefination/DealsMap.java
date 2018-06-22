/*package stepDefination;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DealsMap {

	WebDriver driver;

	@Given("^user is main page$")
	public void user_is_main_page() throws Throwable {
		driver=new FirefoxDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Then("^user enter username and password$")
	public void user_enter_username_and_password(DataTable credential) throws Throwable {
		for (Map<String, String> data : credential.asMaps(String.class, String.class)) {

			driver.findElement(By.name("username")).sendKeys(data.get("username"));
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys(data.get("password"));
		}
	}

	@Then("^user click the login button$")
	public void user_click_the_login_button() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Login']")).click();

	}

	@Then("^user mouse over the  clcking newdeal$")
	public void user_mouse_over_the_clcking_newdeal() throws Throwable {
		Thread.sleep(5000);
		driver.switchTo().frame("mainpanel");
		WebElement el = driver.findElement(By.xpath("//a[@title='Deals']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(el).build().perform();
		driver.findElement(By.xpath("//a[@title='New Deal']")).click();
	}

	@Then("^user clicking the new deal$")
	public void user_clicking_the_new_deal() throws Throwable {
		driver.findElement(By.xpath("//a[@title='New Deal']")).click();

	}

	@Then("^user enter deal details$")
	public void user_enter_deal_details(DataTable deal) throws Throwable {
		for (Map<String, String> data : deal.asMaps(String.class, String.class)) {
			driver.findElement(By.id("title")).sendKeys(data.get("title"));
			driver.findElement(By.id("amount")).sendKeys(data.get("amount"));
			driver.findElement(By.id("commission")).sendKeys(data.get("commission"));
			
			driver.findElement(By.xpath("//input[@value='Save']")).click();
			
			
			Actions ac = new Actions(driver);
			Thread.sleep(5000);
			WebElement el = driver.findElement(By.xpath("//a[@title='Deals']"));
			ac.moveToElement(el).build().perform();
			driver.findElement(By.xpath("//a[@title='New Deal']")).click();
		
		}
	}

	@Then("^user click the save button$")
	public void user_click_the_save_button() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Save']")).click();
	}

	@Then("^user close the browser$")
	public void user_close_the_browser() throws Throwable {
		driver.close();
	}

}
*/