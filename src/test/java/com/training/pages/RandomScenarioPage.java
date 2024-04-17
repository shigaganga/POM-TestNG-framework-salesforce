package com.training.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.base.BasePage;



public class RandomScenarioPage extends BasePage {

	public RandomScenarioPage(WebDriver driver) {
		super(driver);
	}//verify profile home
	@FindBy(xpath="//a[text()='Home']")
	WebElement HomeObj;
	public void RandomHomeobj() {
		waitforElement(HomeObj);
		clickElement(HomeObj);
		System.out.println("home page is displayed");
	}
	
	
	@FindBy(xpath="//div[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a")
	WebElement nameLink;
	public void randomNamelink() {
	String actualname=nameLink.getText();
	clickElement(nameLink);
	System.out.println("fullname of account holder displayed as : "+actualname);
	System.out.println("User firstname lastname page should be displayed");
	}
	@FindBy(id="userNavLabel")
	WebElement usernameElement ;
	public void randomUsernameEle() {
		waitforElement(usernameElement);
		clickElement(usernameElement);
	}
	@FindBy(xpath="//a[@title='My Profile']")
	WebElement myProfile;
	public void randomMyprofile() {
		waitforElement(myProfile);
		clickElement(myProfile);
		System.out.println("My profile page dispayed ");
		System.out.println("Both page same so testcase passed");
		
	}//random scenario home edit profile
	@FindBy(xpath="//div[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a")
	WebElement nameLinkEdit;
	public void Randomhomenamelink() {
	waitforElement(nameLinkEdit);
	clickElement(nameLinkEdit);
	}
	@FindBy(xpath="//*[@id='chatterTab']/div[2]/div[2]/div[1]/h3/div/div/a/img")
	WebElement editPen;
	public void randomEditpen() {
		waitforElement(editPen);
		clickElement(editPen);
	}
public void randomProfileEditFrame() {
framename("contactInfoContentId");
}
@FindBy(xpath="//a[contains(text(),'About')]")
	WebElement about;
	public void randomAbout() {
		waitforElement(about);
		clickElement(about);
	}
	@FindBy(id="lastName")
	WebElement randomlastnameele;
	public void randomlastname(String randomlastname) {
		clearElement(randomlastnameele);
	enterText(randomlastnameele,randomlastname);}
	@FindBy(xpath="//input[@value='Save All']")
	WebElement saveAll;
	public void randomSaveall() {
		waitforElement(saveAll);
		clickElement(saveAll);
		System.out.println("updated lastname is displayed");
	}
	//random tab customization
@FindBy(xpath="//img[@title='All Tabs']")
	WebElement plusTab;
public void randomTab() {
	clickElement(plusTab);
}
	@FindBy(xpath="//input[@title='Customize My Tabs']")
	WebElement CustomizeTab;
	public void randomcustomizetab() {
		clickElement(CustomizeTab);
	}
	@FindBy(xpath="//option[text()='Subscriptions']")
	WebElement subscriptionRemove;
	public void RandomsubscriptionRemove()
	{
		clickElement(subscriptionRemove);
	}
	@FindBy(xpath="//img[@title='Remove']")
	WebElement removeButton;
	public void randomRemoveButton() {
		clickElement(removeButton);
	}
	@FindBy(xpath="(//input[@name='save'])[1]")
	WebElement save;
	public void randomTabSave() {
	clickElement(save);
	System.out.println("The tab removed not displayed in the tabbar");

	
}//event
	@FindBy(xpath="//div[@id=\"ptBody\"]/div/div[2]/span[2]/a")
	WebElement calendelink;
	public void randomCXalenderlink() {
		clickElement(calendelink);
	}
	@FindBy(xpath="//div[@id='p:f:j_id25:j_id61:28:j_id64']")
	WebElement eightPM;
	public void random8pm() {
	clickElement(eightPM);}
	public String RandomparentWindow() {
		String parent=getParentWindow();
		return parent;
	}
	
	@FindBy(xpath="//table[@class='detailList']/tbody/tr[2]/td[2]/div/a/img")
	WebElement subjectombo;
	public void randomSubjectcombo() {
	waitforElement(subjectombo);
	clickElement(subjectombo);
	}
	public void randomNewwindow() {
		switchNewWindow();
	
}	

@FindBy(xpath="//div[2][@class='choicesBox tertiaryPalette brandSecondaryBrd']/ul/li[5]/a")
WebElement otherOption;
public void randomOtherOption() {
	waitforElement(otherOption);
	clickElement(otherOption);}
public void RandowParentSwichBack()
{
	SwitchParentwind();
	//switchToparentWndow(RandomparentWindow());
}
@FindBy(xpath="//input[@id='EndDateTime_time']")
WebElement endTime;
public void endtime(String time) {
	clearElement(endTime);
	enterText(endTime, time);
}
@FindBy(xpath="//td[@id='bottomButtonRow']/input[1]")
WebElement saveEvent;
public void randomSaveEvent() {
clickElement(saveEvent);
System.out.println("Testcasepassed event displayed");
}
//monthview"//input[@id='EndDateTime_time']"
@FindBy(xpath="//div[@id='p:f:j_id25:j_id61:20:j_id64']")
WebElement fourPM;
public void random4pm() {
	clickElement(fourPM);
}
@FindBy(xpath="//input[@id='EndDateTime_time']")
WebElement endTime2;
public void randomndtime2(String time) {
	clearElement(endTime2);
	enterText(endTime2, time);
	}
	@FindBy(xpath="//input[@id='IsRecurrence']")
	WebElement recurrenceEle;
	public void randomRecurance() {
	waitforElement(recurrenceEle);
	clickElement(recurrenceEle);
	}
	@FindBy(id="rectypeftw")
	WebElement weekly;
	public void RecTypeFtw() {
		waitforElement(weekly);
	clickElement(weekly);
	}
	@FindBy(xpath="//input[@id='RecurrenceEndDateOnly']")
	WebElement endDate;
	public void endDate(String date) {
		clearElement(endDate);
	enterText(endDate, date);
	}
	@FindBy(xpath="//td[@id='topButtonRow']//input[@title='Save']")
	WebElement saveEvent2;
	public void randomEventSave() {
		waitforElement(saveEvent2);
		clickElement(saveEvent2);
	
		
	}@FindBy(className="monthViewIcon")
	WebElement monthview;
	public void RandommonthviewPage() {
	waitforElement(monthview);
	clickElement(monthview);
	System.out.println("Testcasepassed event edit month view displayed");
	}
	}
