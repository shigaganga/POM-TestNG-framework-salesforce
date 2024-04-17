package com.training.testcases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.log.Log;
import com.training.pages.LoginPage;
import com.training.utilities.PropertiesFile;
import com.training.utilities.ScreenshotUtility;

public class LoginTest extends BaseTest{
	
	LoginPage loginpage;
	 WebDriver driver;
	 PropertiesFile prop;
	 ScreenshotUtility screen = new ScreenshotUtility();
	 
	
	 @BeforeMethod
	public void beforeMethod() {
		 driver = getDriver(); 
		prop = new PropertiesFile();
		 String url = prop.getproperties("url");
		 driver.get(url);
		 
	      loginpage= new LoginPage(driver);
	      DOMConfigurator.configure("log4j.xml");
	}
	
	 


	@Test
	public void invalidlogin1() {
	//Sequence of steps
		Log.startTestCase("Login Testcase");
	  String username = prop.getproperties("username");
      loginpage.enterintoUsername(username);
      String password=prop.getproperties("password");
      loginpage.clearpassword(password);;
      loginpage.clickLogin();
      
      Log.warn("Please enter the correct password");
      Log.endTestCase("Invalid Testcases");
      
	}
	@Test
	public void login2() {
		//Sequence of steps
		 Log.startTestCase("Login Testcase");
		  String username = prop.getproperties("username");
	      loginpage.enterintoUsername(username);
	      Log.info("Successfully entered the username"+username);
	      String password = prop.getproperties("password");
	      loginpage.enterintoPassword(password);
	      loginpage.clickLogin();
	      Log.warn("login clicked");
		}
	@Test
	public void loginRememberme3() {
		//Sequence of steps
		 Log.startTestCase("Login Testcase");
		 loginpage.remembermeclick();
		  String username = prop.getproperties("username");
	      loginpage.enterintoUsername(username);
	      Log.info("Successfully entered the username"+username);
	      String password = prop.getproperties("password");
	      loginpage.enterintoPassword(password);
	      loginpage.clickLogin();
	      loginpage.usermenu();
	      
	      Log.info("usemenu dropdown clicked");
	      loginpage.Logout();
	      Log.info("username displayed in usernamefield");
		}

	@Test
	public void loginForgotpassword4() {
	//Sequence of steps
	 Log.startTestCase("Login Testcase");
	 loginpage.remembermeclick();
	  String username = prop.getproperties("username");
      loginpage.enterintoUsername(username);
      Log.info("Successfully entered the username"+username);
      loginpage.forgotPassword();
      Log.info("forgot password page");
      String username2 = prop.getproperties("username");
      loginpage.Forgotpageusrnm(username2);
      loginpage.Continuename();
	}
	@Test
	public void wrongusernamepw4() {
	//Sequence of steps
	 Log.startTestCase("Login Testcase");
	 loginpage.remembermeclick();
	  String username = prop.getproperties("usernameWrong");
      loginpage.enterintoUsername(username);
      Log.info("Successfully entered the username"+username);
      String password = prop.getproperties("passwordWrong");
      loginpage.enterintoPassword(password);
      loginpage.clickLogin();
      loginpage.error();
      Log.info("Error message displayed");
	}

	
	@AfterMethod
	public void teardown() {
		screen.takescreenshot(driver);
		close();
	}
	
}
