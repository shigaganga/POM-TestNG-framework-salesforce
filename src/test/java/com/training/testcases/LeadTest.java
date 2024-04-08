package com.training.testcases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.log.Log;
import com.training.pages.AccountPage;
import com.training.pages.HomePage;
import com.training.pages.LeadPage;
import com.training.pages.LoginPage;
import com.training.pages.OpportunityPage;
import com.training.utilities.PropertiesFile;
import com.training.utilities.ScreenshotUtility;

public class LeadTest extends BaseTest {

		LoginPage loginpage;
		HomePage homepage;
		AccountPage accountpage;
		OpportunityPage opportunitypage;
		LeadPage leadpage;
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
		      DOMConfigurator.configure("log4j.xml");
		
		 }
		 @Test
		 public void LeadTabCheck20() {
			 Log.startTestCase("Login Testcase");
			  String username = prop.getproperties("username");
		      loginpage.enterintoUsername(username);
		      String password = prop.getproperties("password");
		      loginpage.enterintoPassword(password);
		      loginpage.clickLogin();
		      leadpage.leadObj();
		     
}
		 @Test
		 public void LeadSelectView21() {
			 Log.startTestCase("Login Testcase");
			  String username = prop.getproperties("username");
		      loginpage.enterintoUsername(username);
		      String password = prop.getproperties("password");
		      loginpage.enterintoPassword(password);
		      loginpage.clickLogin();
		      leadpage.leadObj();
		     leadpage.LeadSelectViiew();
}
		 @Test
		 public void LeadDefaultView22() {
			 Log.startTestCase("Login Testcase");
			  String username = prop.getproperties("username");
		      loginpage.enterintoUsername(username);
		      String password = prop.getproperties("password");
		      loginpage.enterintoPassword(password);
		      loginpage.clickLogin();
		      leadpage.leadObj();
		     leadpage.LeadSelectViiew();
		     String unreadLead=prop.getproperties("unreadLead");
		     leadpage.leadselectViewbox(unreadLead);
		     leadpage.leadGoClick();
		     
		     }
		 @Test
		 public void UnreadLead23() {
			 Log.startTestCase("Login Testcase");
			  String username = prop.getproperties("username");
		      loginpage.enterintoUsername(username);
		      String password = prop.getproperties("password");
		      loginpage.enterintoPassword(password);
		      loginpage.clickLogin();
		      leadpage.leadObj();
		     leadpage.LeadSelectViiew();
		     String todaylead=prop.getproperties("todayLead");
		     leadpage.leadToday(todaylead);
		     leadpage.leadGoClick();
		     
		     }
		 @Test
		 public void LeadCreate24() {
			 Log.startTestCase("Login Testcase");
			  String username = prop.getproperties("username");
		      loginpage.enterintoUsername(username);
		      String password = prop.getproperties("password");
		      loginpage.enterintoPassword(password);
		      loginpage.clickLogin();
		      leadpage.leadObj();
		      leadpage.LeadCreate();
		      String lastname=prop.getproperties("leadLastname");
		      leadpage.LeadLastname(lastname);
		      String companyname=prop.getproperties("leadCompanyname");
		      leadpage.leadCompanyname(companyname);
		      leadpage.LeadCreateSave();
}}