package com.training.testcases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.w3c.dom.DOMConfiguration;

import com.training.base.BaseTest;
import com.training.log.Log;
import com.training.pages.HomePage;
import com.training.pages.LoginPage;
import com.training.utilities.PropertiesFile;
import com.training.utilities.ScreenshotUtility;



public class HomeTest extends BaseTest{
	
	LoginPage loginpage;
	HomePage homepage;
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
	      homepage=new HomePage(driver);
	      DOMConfigurator.configure("log4j.xml");
	}
	
	
	@Test
	public void listUsermenuDrpDown() {
	//Sequence of steps
	 Log.startTestCase("Login Testcase");
	  String username = prop.getproperties("username");
      loginpage.enterintoUsername(username);
      Log.info("Successfully entered the username"+username);
      String password = prop.getproperties("password");
      loginpage.enterintoPassword(password);
      loginpage.clickLogin();
      Log.info("Entered in to the homepage");
     homepage.usermenudropdown();
     Log.info("usermenudropdown visibled");
	}
	
	@Test
	public void UsermenuProfile() {
	//Sequence of steps
	 Log.startTestCase("Login Testcase");
	  String username = prop.getproperties("username");
      loginpage.enterintoUsername(username);
      Log.info("Successfully entered the username"+username);
      String password = prop.getproperties("password");
      loginpage.enterintoPassword(password);
      loginpage.clickLogin();
      Log.info("Entered in to the homepage");
     homepage.usermenudropdown();
     Log.info("usermenudropdown visibled");
     homepage.profileclick();
     Log.info("Profile clicked from usermenu");
     homepage.editpen();
     Log.info("editpen clicked");
     homepage.framechange1();
     homepage.about();
     String lastname=prop.getproperties("lastname");
     homepage.lastname(lastname);
     homepage.saveallmethod();
     homepage.post();
    homepage.framechange2();
    String text = prop.getproperties("text");
     homepage.textArea(text);
     homepage.share();
     Log.info("text is entered");
     homepage.fileclick();
     homepage.moderator();
     homepage.uploadPhotoclick();
     homepage.frame3change();
     String photopath=prop.getproperties("photoPath");
     homepage.choosefilePhoto(photopath);
     homepage.savePhoto1();
     homepage.frame4();
     homepage.photosave2();
     Log.warn("manually delete photo in each execution,so update photolink choosed");
    // homepage.Deletephoto();
	}
	@Test
	public void UsermenuSettings() {
	//Sequence of steps
	 Log.startTestCase("Login Testcase");
	  String username = prop.getproperties("username");
      loginpage.enterintoUsername(username);
      Log.info("Successfully entered the username"+username);
      String password = prop.getproperties("password");
      loginpage.enterintoPassword(password);
      loginpage.clickLogin();
      Log.info("Entered in to the homepage");
     homepage.usermenudropdown();
     Log.info("usermenudropdown visibled");
     homepage.settingsClick();
     homepage.personalClick();
     homepage.loginHistoryclick();
     homepage.displayFormat();
     homepage.customizetab();
     homepage.slesforceChatterSelect();
     homepage.reportclick();
     homepage.addclick();
     homepage.saveReport();
     homepage.emailClick();
     homepage.emailSettingsClick();
     String name=prop.getproperties("firstname");
     homepage.emailNameBox(name);
     String email=prop.getproperties("email");
     homepage.emailBox(email);
     homepage.bccradio();
     homepage.saveEmailsettings();
     homepage.calender();
     homepage.activityremainder();
     homepage.openRemainder();
     
     
     
}
	@Test
	public void UsermenuDeveloperConsole() {
	//Sequence of steps
	 Log.startTestCase("Login Testcase");
	  String username = prop.getproperties("username");
      loginpage.enterintoUsername(username);
      Log.info("Successfully entered the username"+username);
      String password = prop.getproperties("password");
      loginpage.enterintoPassword(password);
      loginpage.clickLogin();
      Log.info("Entered in to the homepage");
     homepage.usermenudropdown();
     Log.info("usermenudropdown visibled");
     homepage.curntwindowString();
     homepage.developerfieldinNewwindow();
     homepage.newwindow();
     Log.info("new developer console window opened");
     //homepage.parentwindow();
    	
}

	@Test
	public void UsermenuLogout() {
	//Sequence of steps
	 Log.startTestCase("Login Testcase");
	  String username = prop.getproperties("username");
      loginpage.enterintoUsername(username);
      Log.info("Successfully entered the username"+username);
      String password = prop.getproperties("password");
      loginpage.enterintoPassword(password);
      loginpage.clickLogin();
      Log.info("Entered in to the homepage");
     homepage.usermenudropdown();
     Log.info("usermenudropdown visibled");
     loginpage.Logout();
}
	
	@AfterMethod
	public void teardown() {
		screen.takescreenshot(driver);
		close();
	}
	
}
