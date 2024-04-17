package com.training.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;
import com.training.log.Log;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ContactPage extends BasePage {
	   WebDriver driver;
		
		public ContactPage(WebDriver driver) {
			super(driver);
		}
		@FindBy(xpath="//li[@id='Contact_Tab']/a")
		WebElement contactObj;
		public void contactObj() {
			waitforElement(contactObj);
	clickElement(contactObj);
	Log.info("contactpage displayed");
	}
	@FindBy(xpath="//form[@id='hotlist']/table/tbody/tr/td[2]/input")
	WebElement newbutton;
	public void contactNewBtn() {
		waitforElement(newbutton);
		clickElement(newbutton);
	}
		@FindBy(xpath="//input[@title='Continue']")	
			
WebElement continueEle;
	public void contactContinue() {
		waitforElement(continueEle);
		clickElement(continueEle);
	}
		@FindBy(xpath="//input[@id='name_lastcon2']")	
			WebElement lastname;
		public void contactLastname(String lastnameCon) {
			enterText(lastname, lastnameCon);
		}
		@FindBy(xpath="//input[@id='con4']")
			WebElement AccntName;
		public String contactCurrentWindow() {
			
	     String parent=	 getParentWindow();
	    return parent;
		}
		@FindBy(xpath="//a[@id='con4_lkwgt']/img")
			WebElement Searchicon;
		public void contactSearchicon() {
			clickElement(Searchicon);
		}
		public void contactnewwindow() {
			switchNewWindow();
		}
			@FindBy(xpath="//frame[@id='searchFrame']")
		WebElement frameEle;
			public void contactFrame1() {
				waitforElement(frameEle);
		frameElement(frameEle);
			}
			@FindBy(xpath="//form[@id='theForm']/div/div[2]/input[1]")
		WebElement input;
		public void contactInput(String firstchars)	{
		
	waitforElement(input);
	enterText(input, firstchars);
		}
		@FindBy(xpath="//input[@name='go']")
		WebElement go;
		public void contactgo() {
			waitforElement(go);
		clickElement(go);
		defaultoriginalPage();
		}
		@FindBy(xpath="//frame[@id='resultsFrame']")
		WebElement frameEle2;
		public void contactFrame2() {
		frameElement(frameEle2);
		}
		@FindBy(xpath="//form[@id='new']/div/div[3]/div/div[2]/table/tbody/tr[2]/th/a")
		WebElement table;
		public void contactTable() {
			clickElement(table);
		}
		
		@FindBy(xpath="(//input[@name='save'])[1]")
		WebElement save;

	public void contactSave() {
	waitforElement(save);
		clickElement(save);
		Log.info("new contact page is created");
		}//contact newview
	@FindBy(xpath="//a[text()='Create New View']")
		 WebElement createviewlink;
		 public void contactviewLink() {
			 waitforElement(createviewlink);
			 clickElement(createviewlink);
		 }
		 @FindBy(xpath="//input[@id='fname']")
			WebElement viewname;
		 public void contactViewname(String view) {
			 clearElement(viewname);
			 enterText(viewname,view);
		 }
			@FindBy(xpath="//input[@id='devname']")
			WebElement viewUniquename;
			public void ContactViewUniquename(String unique) {
				clearElement(viewUniquename);
				enterText(viewUniquename, unique);
			}
			
			
			//custome validation error on second run pgm,this unique name already exist
			
			@FindBy(xpath="//form[@id='editPage']/div[3]/table/tbody/tr/td[2]/input[1]")
				WebElement	save2;
				public void contactSave2() {
					waitforElement(save2);
				clickElement(save2);
		Log.info("ViewName page is displayed,Testcase passed in createnewview");
				}
//recently created contact
@FindBy(id="hotlist_mode")
WebElement rightDropdownButton;
public void contactRightDopDown(String text) {
selectText(rightDropdownButton, text);
//selectob.selectByVisibleText("Recently Created");
Log.info("testcase passed,recently created contact page is displayed");
}//my contact view
@FindBy(xpath="//select[@name='fcf']")
WebElement viewDropdownBox;
public void contactViewdropDown(String text1) {
	waitforElement(viewDropdownBox);
	selectText(viewDropdownBox, text1);
	Log.info("testcase passed,My contacts page view is page is displayed");

}//one contact information
@FindBy(xpath="//a[text()='Gonzalez, Rose']")
WebElement contact;
public void ContactONeContactInfo() {
doubleClickAction(contact);
Log.info("one contact info is displayed");
	
}//ErrorCreatenewview
public String contctviewExpectedError(String expected) {
String expectederror="Error: You must enter a value";
return(expectederror);
}
@FindBy(xpath="//form[@id=\"editPage\"]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[2]")
	WebElement errormsg;
public String Contacterrormsg() {
	String actualerror=errormsg.getText();
	System.out.println(actualerror);
	return(actualerror);
}//newview cancel button click
@FindBy(xpath="//form[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[2]")
WebElement cancel;
public void contactViewcancel() {
waitforElement(cancel);
clickElement(cancel);
Log.info("test case passed,canceled so return back to contact homepage");
	
}//save and new
@FindBy(xpath="//td[@id='bottomButtonRow']/input[2]")
WebElement saveNew;
public void contactSavenew() {
	waitforElement(saveNew);
	clickElement(saveNew);
Log.info("test case passed for save&new");
}}


