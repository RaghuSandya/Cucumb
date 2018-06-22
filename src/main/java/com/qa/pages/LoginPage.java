package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.utils.TestBase;

public class LoginPage extends TestBase{
	
	String PageTitle="CRMPRO";
	
	
	By Username=By.xpath("//input[@placeholder='Username']");
	By PassWord=By.xpath("//input[@type='password']");
	By Login =By.xpath("//input[@value='Login']");
	By Logout=By.xpath("//a[contains(text(),'Logout')]");
	
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void Username (String txt){
		driver.findElement(Username).sendKeys(txt);
	}
	public void password(String pass){
		driver.findElement(PassWord).sendKeys(pass);
		driver.findElement(Login).click();
	}
	
	public void pagetile(){
		String PageTitl=driver.getTitle();
		if(PageTitle.equals(PageTitl)){
			System.out.println("Title macthes:"+PageTitl);
		}
	}
	public void logout(){
		driver.findElement(Logout).click();
	}
	
}
