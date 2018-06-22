package com.qa.utils;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase(){
		try {
			prop=new Properties();
			FileInputStream fin=new FileInputStream("C:/Users/Baburao/workspace/com.cucumber.selenium/freecrmBDDFramework/src/main/java/com/qa/config/config.properties"); 
			prop.load(fin);
		} catch (IOException e) {
			e.getMessage();
		}
	}
	
public static void intialization(){
	
	String Browsername=prop.getProperty("browser");
	
	if(Browsername.equals("Firefox")){
	driver=new FirefoxDriver();
	}else if(Browsername.equals("chrome")){
	System.setProperty("webdriver.chrome.driver", "C:/Users/Baburao/workspace/com.cucumber.selenium/freecrmBDDFramework/Utils/chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().to(prop.getProperty("url"));
	driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_TimeOut,TimeUnit.SECONDS );
	driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
	}
	}
}