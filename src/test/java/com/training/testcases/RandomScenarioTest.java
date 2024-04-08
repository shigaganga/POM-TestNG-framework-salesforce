package com.training.testcases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.log.Log;
import com.training.pages.AccountPage;
import com.training.pages.HomePage;
import com.training.pages.LoginPage;
import com.training.pages.OpportunityPage;
import com.training.pages.RandomScenarioPage;
import com.training.utilities.PropertiesFile;
import com.training.utilities.ScreenshotUtility;

public class RandomScenarioTest extends BaseTest {
	LoginPage loginpage;
	HomePage homepage;
	AccountPage accountpage;
	OpportunityPage opportunitypage;
	RandomScenarioPage randompage;
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
	      accountpage=new AccountPage(driver);
	      opportunitypage=new OpportunityPage(driver);
	      randompage=new RandomScenarioPage(driver);
	      DOMConfigurator.configure("log4j.xml");
	
	 }@Test
	public void profileVerify33() {
	//Sequence of steps
	 Log.startTestCase("Login Testcase");
	  String username = prop.getproperties("username");
      loginpage.enterintoUsername(username);
      Log.info("Successfully entered the username"+username);
      String password = prop.getproperties("password");
      loginpage.enterintoPassword(password);
      loginpage.clickLogin();
      Log.info("Entered in to the homepage");
  randompage.RandomHomeobj();
  randompage.randomNamelink();
  randompage.randomUsernameEle();
  randompage.randomMyprofile();
     
}@Test
	 public void EditProfile34() {
	 Log.startTestCase("Login Testcase");
	  String username = prop.getproperties("username");
     loginpage.enterintoUsername(username);
     Log.info("Successfully entered the username"+username);
     String password = prop.getproperties("password");
     loginpage.enterintoPassword(password);
     loginpage.clickLogin();
     Log.info("Entered in to the homepage");
 randompage.RandomHomeobj();
 randompage.Randomhomenamelink();
 randompage.randomEditpen();
 randompage.randomProfileEditFrame();
 randompage.randomAbout();
 String editlastname=prop.getproperties("randomEditLastname");
 randompage.randomlastname(editlastname);
 randompage.randomSaveall();
}
@Test
public void TabRemove35() {
Log.startTestCase("Login Testcase");
 String username = prop.getproperties("username");
loginpage.enterintoUsername(username);
Log.info("Successfully entered the username"+username);
String password = prop.getproperties("password");
loginpage.enterintoPassword(password);
loginpage.clickLogin();
Log.info("Entered in to the homepage");
randompage.randomTab();
randompage.randomcustomizetab();
randompage.RandomsubscriptionRemove();
randompage.randomRemoveButton();
randompage.randomTabSave();
}
@Test
public void BlockEvent36() {
Log.startTestCase("Login Testcase");
 String username = prop.getproperties("username");
loginpage.enterintoUsername(username);
Log.info("Successfully entered the username"+username);
String password = prop.getproperties("password");
loginpage.enterintoPassword(password);
loginpage.clickLogin();
randompage.RandomHomeobj();
randompage.randomCXalenderlink();
randompage.random8pm();
randompage.RandomparentWindow();
randompage.randomSubjectcombo();
randompage.randomNewwindow();
randompage.randomOtherOption();
randompage.RandowParentSwichBack();
String endtime=prop.getproperties("randomEndTime");
randompage.endtime(endtime);
randompage.randomSaveEvent();


}@Test
public void monthviewEvent37() {
	Log.startTestCase("Login Testcase");
	 String username = prop.getproperties("username");
	loginpage.enterintoUsername(username);
	Log.info("Successfully entered the username"+username);
	String password = prop.getproperties("password");
	loginpage.enterintoPassword(password);
	loginpage.clickLogin();
	randompage.RandomHomeobj();
	randompage.randomCXalenderlink();
	randompage.random4pm();
	randompage.RandomparentWindow();
	randompage.randomSubjectcombo();
	randompage.randomNewwindow();
	randompage.randomOtherOption();
	randompage.RandowParentSwichBack();
	String endtime2=prop.getproperties("randomEndTime2");
	randompage.randomndtime2(endtime2);
	randompage.randomRecurance();
	randompage.RecTypeFtw();
	randompage.endDate(endtime2);
	randompage.randomEventSave();
	randompage.RandommonthviewPage();
}
}