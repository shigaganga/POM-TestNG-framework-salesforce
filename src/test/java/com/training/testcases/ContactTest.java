package com.training.testcases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.log.Log;
import com.training.pages.AccountPage;
import com.training.pages.ContactPage;
import com.training.pages.HomePage;
import com.training.pages.LeadPage;
import com.training.pages.LoginPage;
import com.training.pages.OpportunityPage;
import com.training.utilities.PropertiesFile;
import com.training.utilities.ScreenshotUtility;

public class ContactTest extends BaseTest{
	LoginPage loginpage;
	HomePage homepage;
	AccountPage accountpage;
	OpportunityPage opportunitypage;
	LeadPage leadpage;
	ContactPage contactpage;
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
	      leadpage=new LeadPage(driver);
	      contactpage=new ContactPage(driver);
	      DOMConfigurator.configure("log4j.xml");
	
	 }
	 @Test
	 public void ContactCreate25() {

		 Log.startTestCase("Login Testcase");
		  String username = prop.getproperties("username");
	      loginpage.enterintoUsername(username);
	     
	      String password = prop.getproperties("password");
	      loginpage.enterintoPassword(password);
	      loginpage.clickLogin();
	   contactpage.contactObj();
	   contactpage.contactNewBtn();
	   contactpage.contactContinue();
	   String contactLastname=prop.getproperties("contactLastname");
	   contactpage.contactLastname(contactLastname);
	   contactpage.contactCurrentWindow();
	   contactpage.contactSearchicon();
	   contactpage.contactnewwindow();
	   contactpage.contactFrame1();
	   String first2char=prop.getproperties("contactfirstchars");
	   contactpage.contactInput(first2char);
	   contactpage.contactgo();
	   contactpage.contactFrame2();
	   contactpage.contactTable();
	   contactpage.contactSwitchParrentWindow();
	   contactpage.contactSave();
	   
	   
	 }
	 @Test
	   public void contactView26() {
		   Log.startTestCase("Login Testcase");
			  String username = prop.getproperties("username");
		      loginpage.enterintoUsername(username);
		     
		      String password = prop.getproperties("password");
		      loginpage.enterintoPassword(password);
		      loginpage.clickLogin();
		   contactpage.contactObj();
		   contactpage.contactviewLink();
		   String viename=prop.getproperties("contactViewname");
		   contactpage.contactViewname(viename);
		   String uniquename=prop.getproperties("ContactViewUniquename");
		   contactpage.ContactViewUniquename(uniquename);
		   contactpage.contactSave2();
	   }
	 @Test
	   public void contactRecentlyCreated27() {
		   Log.startTestCase("Login Testcase");
			  String username = prop.getproperties("username");
		      loginpage.enterintoUsername(username);
		     
		      String password = prop.getproperties("password");
		      loginpage.enterintoPassword(password);
		      loginpage.clickLogin();
		   contactpage.contactObj();
		   contactpage.contactRightDopDown("Recently Created");
}
	 @Test
	 public void MycontactView28() {
			   Log.startTestCase("Login Testcase");
				  String username = prop.getproperties("username");
			      loginpage.enterintoUsername(username);
			     
			      String password = prop.getproperties("password");
			      loginpage.enterintoPassword(password);
			      loginpage.clickLogin();
			   contactpage.contactObj();
			   contactpage.contactViewdropDown("My Contacts");
	 }
	 @Test
	 public void OneContactInformation29() {
			   Log.startTestCase("Login Testcase");
				  String username = prop.getproperties("username");
			      loginpage.enterintoUsername(username);
			     
			      String password = prop.getproperties("password");
			      loginpage.enterintoPassword(password);
			      loginpage.clickLogin();
			   contactpage.contactObj();
			   contactpage.ContactONeContactInfo();
	 }
	 @Test
	 public void CreateNewViewError30() {
			   Log.startTestCase("Login Testcase");
				  String username = prop.getproperties("username");
			      loginpage.enterintoUsername(username);
			     
			      String password = prop.getproperties("password");
			      loginpage.enterintoPassword(password);
			      loginpage.clickLogin();
			   contactpage.contactObj();
			   contactpage.contactviewLink();
			   String view=prop.getproperties("blankViewname");
			   contactpage.contactViewname(view);
			   String uniquename=prop.getproperties("contactview");
			   contactpage.ContactViewUniquename(uniquename);
			   contactpage.contactSave2();
			   String error=prop.getproperties("contactViewError");
			   contactpage.contctviewExpectedError(error);
			   contactpage.Contacterrormsg();
	 } @Test
	 public void NewViewcancelButton31() {
		   Log.startTestCase("Login Testcase");
			  String username = prop.getproperties("username");
		      loginpage.enterintoUsername(username);
		     
		      String password = prop.getproperties("password");
		      loginpage.enterintoPassword(password);
		      loginpage.clickLogin();
		   contactpage.contactObj();
		   contactpage.contactviewLink();
		   String viename=prop.getproperties("contactViewname");
		   contactpage.contactViewname(viename);
		   String uniquename=prop.getproperties("ContactViewUniquename");
		   contactpage.ContactViewUniquename(uniquename);
		   contactpage.contactViewcancel();
	 }@Test
	 public void SaveAndNewViwButton32() {
		   Log.startTestCase("Login Testcase");
			  String username = prop.getproperties("username");
		      loginpage.enterintoUsername(username);
		     
		      String password = prop.getproperties("password");
		      loginpage.enterintoPassword(password);
		      loginpage.clickLogin();
		   contactpage.contactObj();
		   contactpage.contactNewBtn();
		   contactpage.contactContinue();
		   String contactLastname=prop.getproperties("contactLastname");
		   contactpage.contactLastname(contactLastname);
		   contactpage.contactCurrentWindow();
		   contactpage.contactSearchicon();
		   contactpage.contactnewwindow();
		   contactpage.contactFrame1();
		   String first2char=prop.getproperties("contactfirstchars");
		   contactpage.contactInput(first2char);
		   contactpage.contactgo();
		   contactpage.contactFrame2();
		   contactpage.contactTable();
		   contactpage.contactSwitchParrentWindow();
		   contactpage.contactSavenew();
	 }}