
	package com.training.pages;

	import java.util.Set;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import com.training.base.BasePage;
	import com.training.log.Log;

	public class AccountPage extends BasePage{
	public AccountPage(WebDriver driver) {
			super(driver);
		}
		@FindBy(xpath="//a[@title='Accounts Tab']")
		
		WebElement AccountObj;
public void Accountobj() {
		waitforElement(AccountObj);
		doubleClickAction(AccountObj);
		}
		@FindBy (xpath="//input[@name='new']")
		WebElement newbutton;
public void newButton() {
		clickElement(newbutton);
	}
	@FindBy(xpath=" //input[@id='acc2']")
		WebElement Accountname;
public void accountName(String accountname) {
		clearElement(Accountname);
		enterText(Accountname, accountname);
	}
	@FindBy(xpath="//select[@id='acc6']")
		WebElement type;
public void selectType(String strtype) {
		waitforElement(type);
		selectText(type,strtype);
	}
	@FindBy(xpath="//select[@id='00NHp00000blNWX']")
		WebElement priority;
public void selectPriority(){
		waitforElement(priority);
		selectText(priority, "High");
	}
	@FindBy(xpath="//select[@id='00NHp00000blNWZ']")
	WebElement sla;
public void selectSLA(){
	waitforElement(sla);
	selectText(sla, "Gold");
}
		@FindBy(xpath="	//input[@id='00NHp00000blNWb']")
		WebElement SLAnum;
public void SLAnumber(String slanumber) {
			waitforElement(SLAnum);
		enterText(SLAnum, slanumber);
		}
	@FindBy(xpath="//input[@id='00NHp00000blNWa']")
		WebElement date;
public void date(String Date) {
		enterText(date, Date);
	}
@FindBy(xpath="//td[@id=\"topButtonRow\"]/input[1]")
		WebElement save;
public void saveDate() {
	waitforElement(save);
		save.click();
		System.out.println("testcase passed,new Account page is displayed");
	}//AccountCreateNewView
@FindBy(xpath="//a[text()='Create New View']")
WebElement createviewlink;
public void createViewLink() {
	waitforElement(createviewlink);
	clickElement(createviewlink);
}
@FindBy(xpath="//input[@id='fname']")
	WebElement viewname;
public void viewName(String ViewName) {
	clearElement(viewname);
enterText(viewname, ViewName);
}
@FindBy(xpath="//input[@id='devname']")
	WebElement viewUniquename;
public void Viewuniquename(String StrViewUname) {
waitforElement(viewUniquename);
clearElement(viewUniquename);
enterText(viewUniquename, StrViewUname);
//clickElement(viewUniquename);
}//custome validation error on second run pgm,this unique name already exist
@FindBy(xpath="//form[@id='editPage']/div[3]/table/tbody/tr/td[2]/input[1] ")
WebElement saveUname;
public void SaveUniquename()	
{
	waitforElement(saveUname);
clickElement(saveUname);
	Log.info("Testcase passed in createnewview");
	}//testcase12 editnew view
@FindBy(xpath="//select[@name='fcf']")
	WebElement selectView;
public void selectview(String viewname) {
	waitforElement(selectView);
	selectText(selectView, viewname);
}
@FindBy(xpath="//a[text()='Edit']")
	WebElement edit;
public void editview() {
	waitforElement(edit);
	clickElement(edit);
}
@FindBy(xpath="//input[@id='fname']")
	WebElement viewnamefield;
public void newviewname(String newviewname) {
clearElement(viewnamefield);
enterText(viewnamefield, newviewname);
}
@FindBy(xpath="//input[@id='devname']")
	WebElement viewUniquenamefield;
	public void newviewuniquename() {
clickElement(viewUniquenamefield);
	}                                        //custome validation error on second run pgm,this unique name already exist
@FindBy(xpath="//select[@id='fcol1']")
	WebElement AccountName;
public void selectAccountname() {
	selectText(AccountName, "Account Name");
}
@FindBy(xpath="//select[@id='fop1']")
	WebElement equals;
public void selectEquals() {
	selectText(equals, "equals");
}
@FindBy(xpath="//input[@name='fval1']")
	WebElement value1;
public void entervalue() {
	enterText(value1, "a");
}
@FindBy(xpath="//select[@id='colselector_select_0']/option[32]")
	WebElement lastActivity;
public void lasyActivity() {
	clickElement(lastActivity);
}
	@FindBy(xpath="//a[@id='colselector_select_0_right']/img")
	WebElement Add;
	public void addClick() {
		clickElement(Add);
	}
	@FindBy(xpath="//form[@id=\"editPage\"]/div[3]/table/tbody/tr/td[2]/input[1] ")
	WebElement saveLastactivity;
	public void saveLastActivity() {
		waitforElement(saveLastactivity);

	clickElement(saveLastactivity);;                                 
	Log.info(" EditView testcase passed");
	}
	//merge account
	@FindBy(xpath="//a[text()='Merge Accounts']")
		WebElement mergeAccount;
	public void mergeAccount() {
		clickElement(mergeAccount);
	}
	@FindBy(xpath="//input[@id='srch']")
		WebElement srchBox;
	public void srchbox(String mergekey) {
		enterText(srchBox, mergekey);
	}
		@FindBy(xpath="//form[@id='stageForm']/div/div[2]/div[4]/input[2]")
		WebElement findAccounts;
		public void findAccounts() {
		clickElement(findAccounts);}
		@FindBy(xpath="//form[@id='stageForm']/div/div[2]/div[5]/div/input[1]")
		WebElement next;
		public void nextClick() {
			waitforElement(next);
			clickElement(next);
		}
		@FindBy(xpath="//form[@id='stageForm']/div/div[2]/div[5]/div/input[2]")
		WebElement merge;
		public void merge() {
		waitforElement(merge);
		clickElement(merge);}
		public void alertmerge() {
			alertAccept();
			Log.info("Account page displayed with merged account");//second run error so create new account selenium
		}//lastactivityAccountReport30days
		@FindBy(xpath="//a[text()='Accounts with last activity > 30 days']")
		WebElement lastactivity;
		public void lastActivity() {
			waitforElement(lastactivity);
		clickElement(lastactivity);
		Log.info("Last activity displayed");
		}
	@FindBy(xpath="//input[@id='ext-comp-1042']")
			WebElement from;
	public void fromDate() {
		enterText(from, "3/2/2024");}
	@FindBy(xpath="//button[@id='ext-gen63']")
		WebElement button;
	public void buttonRunReport() {
		clickElement(button);
			Log.info("testcase passed");

		}
		
}


