package com.training.testcases;
	import org.apache.log4j.xml.DOMConfigurator;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import com.training.base.BaseTest;
	import com.training.log.Log;
import com.training.pages.AccountPage;
import com.training.pages.HomePage;
	import com.training.pages.LoginPage;
import com.training.pages.OpportunityPage;
import com.training.utilities.PropertiesFile;
	import com.training.utilities.ScreenshotUtility;
	public class OpportunityTest extends BaseTest {
			LoginPage loginpage;
			HomePage homepage;
			AccountPage accountpage;
			OpportunityPage opportunitypage;
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
			      DOMConfigurator.configure("log4j.xml");
			
			 }
			 @Test
			 public void OpportunityDropdownVerify15() {
				 Log.startTestCase("Login Testcase");
				  String username = prop.getproperties("username");
			      loginpage.enterintoUsername(username);
			     
			      String password = prop.getproperties("password");
			      loginpage.enterintoPassword(password);
			      loginpage.clickLogin();
			   
			      opportunitypage.oppobj();
			      opportunitypage.verifydropDown();
			 }
			 @Test
			 public void newopportunity16() {
				 Log.startTestCase("Login Testcase");
				  String username = prop.getproperties("username");
			      loginpage.enterintoUsername(username);
			      Log.info("Successfully entered the username"+username);
			      String password = prop.getproperties("password");
			      loginpage.enterintoPassword(password);
			      loginpage.clickLogin();
			      Log.info("Entered in to the homepage");
			      opportunitypage.oppobj();
			      opportunitypage.verifydropDown();
			      opportunitypage.newopp();
			      String oppname=prop.getproperties("opportunityname");
			      opportunitypage.oppName(oppname);
			      String parent=opportunitypage.getParentWindow();
			      opportunitypage.accname();
			      opportunitypage.currentwindow();
			      opportunitypage.searchiconopp();
			      opportunitypage.newWindowOpp();
			      opportunitypage.frameEleOpp1();
			      opportunitypage.InputSend("sa");
			      opportunitypage.goOpp();
			     opportunitypage.defaultcontent();
			     opportunitypage.frameEleOpp2();
			     opportunitypage.tableClick();
			     Log.info("table clicked");
			     opportunitypage.switchToparentWndow(parent);
			     Log.info("after window change");
			     opportunitypage.closedate();
			     opportunitypage.stageSelect();
	              opportunitypage.selectLeadSource();
	              opportunitypage.currentwindow2();
	              opportunitypage.searchiconCampaign();
	              opportunitypage.newWindowCampaign();
			      opportunitypage.frameEleSearch();
			      opportunitypage.campaignInput("*a*");
			      opportunitypage.goCampDefaultFrme();
			      opportunitypage.framecamp5();
			      opportunitypage.switchToparentWndow(parent);
			      opportunitypage.saveopp();
			      
			      
	}
			 @Test
			 public void oppPipeline17() {
				 Log.startTestCase("Login Testcase");
				  String username = prop.getproperties("username");
			      loginpage.enterintoUsername(username);
			      Log.info("Successfully entered the username"+username);
			      String password = prop.getproperties("password");
			      loginpage.enterintoPassword(password);
			      loginpage.clickLogin();
			      Log.info("Entered in to the homepage");
			      opportunitypage.oppobj();
				 opportunitypage.oppPipeline();
			 }
			 @Test
			 public void StuckedOpp18() {
				 Log.startTestCase("Login Testcase");
				  String username = prop.getproperties("username");
			      loginpage.enterintoUsername(username);
			      Log.info("Successfully entered the username"+username);
			      String password = prop.getproperties("password");
			      loginpage.enterintoPassword(password);
			      loginpage.clickLogin();
			      Log.info("Entered in to the homepage");
			      opportunitypage.oppobj();
			      opportunitypage.StuckOpp();
}
			 @Test
			 public void QuarterlySumLink19() {Log.startTestCase("Login Testcase");
			  String username = prop.getproperties("username");
		      loginpage.enterintoUsername(username);
		      Log.info("Successfully entered the username"+username);
		      String password = prop.getproperties("password");
		      loginpage.enterintoPassword(password);
		      loginpage.clickLogin();
		      Log.info("Entered in to the homepage");
		      opportunitypage.oppobj();
		      String interval=prop.getproperties("oppInterval");
		      opportunitypage.QIntervalSelect(interval);
		      String include=prop.getproperties("oppInclude");
				opportunitypage. oppIncludeSelect(include);
				opportunitypage.runreport();
				 }
					 
				
					
	}