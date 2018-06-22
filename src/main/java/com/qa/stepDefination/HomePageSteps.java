package com.qa.stepDefination;

import com.qa.pages.LoginPage;
import com.qa.utils.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSteps extends TestBase {
	LoginPage login=new LoginPage(driver);

	 
@Given("^user is open browser$")
public void user_is_open_browser() throws Throwable {
   TestBase.intialization();
} 

@Then("^user is enter username and password$")
public void user_is_enter_username_and_password() throws Throwable {
	Thread.sleep(5000);
	login.Username(prop.getProperty("username"));
	login.password(prop.getProperty("password"));
    
}
@Then("^home page tilte validates$")
public void home_page_tilte_validates() throws Throwable {
	login.pagetile();
    
}

@Then("^user clicking the logout$")
public void user_clicking_the_logout() throws Throwable {
	login.logout();
   
}

@Then("^user close the browser$")
public void user_close_the_browser() throws Throwable {
	driver.close();
    
}

}
