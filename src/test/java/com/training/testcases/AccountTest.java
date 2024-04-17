package com.training.testcases;


	import org.apache.log4j.xml.DOMConfigurator;
	import org.openqa.selenium.WebDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import com.training.base.BaseTest;
	import com.training.log.Log;
import com.training.pages.AccountPage;
import com.training.pages.HomePage;
	import com.training.pages.LoginPage;
	import com.training.utilities.PropertiesFile;
	import com.training.utilities.ScreenshotUtility;
	public class AccountTest extends BaseTest {
			LoginPage loginpage;
			HomePage homepage;
			AccountPage accountpage;
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
			      DOMConfigurator.configure("log4j.xml");
			
			 }
			 @Test
public void accountcreation10() {
				 Log.startTestCase("Login Testcase");
				  String username = prop.getproperties("username");
			      loginpage.enterintoUsername(username);
			      Log.info("Successfully entered the username"+username);
			      String password = prop.getproperties("password");
			      loginpage.enterintoPassword(password);
			      loginpage.clickLogin();
			      Log.info("Entered in to the homepage");
			      accountpage.Accountobj();
			      accountpage.newButton();
			      String accountname1=prop.getproperties("accountname");
			      accountpage.accountName(accountname1);
			      String type=prop.getproperties("type");
			      accountpage.selectType(type);
			      accountpage.selectPriority();
			      accountpage.selectSLA();
			      String sla=prop.getproperties("slanumber");
			      accountpage.SLAnumber(sla);
			      String date1=prop.getproperties("Date");
			      accountpage.date(date1);
			      accountpage.saveDate();
}
			 @Test
			 public void accountNewViewcreation11() {
				 Log.startTestCase("Login Testcase");
				  String username = prop.getproperties("username");
			      loginpage.enterintoUsername(username);
			      Log.info("Successfully entered the username"+username);
			      String password = prop.getproperties("password");
			      loginpage.enterintoPassword(password);
			      loginpage.clickLogin();
			      Log.info("Entered in to the homepage");
			      accountpage.Accountobj();
			      accountpage.createViewLink();
			      accountpage.viewName("vIewname");
			      accountpage.Viewuniquename("nEwViewname");
			      accountpage.SaveUniquename();
			      
			 }
			 @Test
			 public void editviewname12() {
				 Log.startTestCase("Login Testcase");
				  String username = prop.getproperties("username");
			      loginpage.enterintoUsername(username);
			      Log.info("Successfully entered the username"+username);
			      String password = prop.getproperties("password");
			      loginpage.enterintoPassword(password);
			      loginpage.clickLogin();
			      Log.info("Entered in to the homepage");
			      accountpage.Accountobj();
			      accountpage.selectview("newViewname");
			      accountpage.editview();
			      accountpage.newviewname("newViewname2");
			      accountpage.newviewuniquename();
			      accountpage.selectAccountname();
			      accountpage.selectEquals();
			      accountpage.entervalue();
			      accountpage.lasyActivity();
			      accountpage.addClick();
			      accountpage.saveLastActivity();
}
			 @Test
			 public void mergeAccount13() {
				 Log.startTestCase("Login Testcase");
				  String username = prop.getproperties("username");
			      loginpage.enterintoUsername(username);
			      Log.info("Successfully entered the username"+username);
			      String password = prop.getproperties("password");
			      loginpage.enterintoPassword(password);
			      loginpage.clickLogin();
			      Log.info("Entered in to the homepage");
			      accountpage.Accountobj(); 
			      accountpage.mergeAccount();
			      accountpage.srchbox("te");//create account with te starting
			      accountpage.findAccounts();
			      accountpage.nextClick();
			      accountpage.merge();
			      accountpage.alertmerge();
			 }
			 @Test
			 public void AccountReport14() {
				 Log.startTestCase("Login Testcase");
				  String username = prop.getproperties("username");
			      loginpage.enterintoUsername(username);
			      Log.info("Successfully entered the username"+username);
			      String password = prop.getproperties("password");
			      loginpage.enterintoPassword(password);
			      loginpage.clickLogin();
			      Log.info("Entered in to the homepage");
			      accountpage.Accountobj(); 
			      accountpage.lastActivity();
			      accountpage.fromDate();
			      accountpage.buttonRunReport();
			 }
}