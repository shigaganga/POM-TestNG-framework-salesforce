package com.training.pages;

import java.util.Set;

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

public class HomePage extends BasePage{
	public HomePage(WebDriver driver) {
		super(driver);
	}

	
	
	@FindBy(id="userNavLabel")
	WebElement profilenameElement;
public void usermenudropdown() {
	profilenameElement.click();
}
@FindBy(xpath="//a[@title='My Profile']")
WebElement myProfile;
public void profileclick() {
waitforElement(profilenameElement);
myProfile.click();
}
@FindBy(xpath="//*[@id='chatterTab']/div[2]/div[2]/div[1]/h3/div/div/a/img")
WebElement editPen;
public void editpen() {
waitforElement(editPen);
clickElement(editPen);}
@FindBy(id="contactInfoContentId")
WebElement frame1;
public void framechange1() {
frameElement(frame1);
}
@FindBy(xpath="//li[@id='aboutTab']/a")
WebElement about;
public void about() {
	waitforElement(about);
	about.click();
}
@FindBy(id="lastName")
WebElement lastname;
public void lastname(String strlastname) {
waitforElement(lastname);
lastname.clear();
lastname.sendKeys(strlastname);
}

@FindBy(xpath="//input[@value='Save All']")
WebElement saveAllEle;
public void saveallmethod()
{
clickElement(saveAllEle);
defaultoriginalPage();
}
@FindBy(xpath="//a[@id='publisherAttachTextPost']/span[1]")
WebElement post;
public void post() {
	waitforElement(post);
	post.click();
	
}

@FindBy(xpath="//iframe[@title='Rich Text Editor, publisherRichTextEditor']")
WebElement frame2;
public void framechange2() {
	frameElement(frame2);
}
@FindBy(xpath="/html/body")
WebElement textArea;
public void textArea(String postText) {
	waitforElement(textArea);
	textArea.sendKeys(postText);
	defaultoriginalPage();
}

@FindBy(xpath="//input[@id='publishersharebutton']")

WebElement share;
public void share() {
	waitforElement(share);
	share.click();
}
@FindBy(xpath="//a[@id='publisherAttachContentPost']/span[1]")
WebElement file;
public void fileclick() {
	waitforElement(file);
	file.click();
}
@FindBy(id="displayBadge")
WebElement moderator;
public void moderator() {
MoveToElementAction(moderator);
}
@FindBy(xpath="//a[@id='uploadLink']")
WebElement uploadphoto;
public void uploadPhotoclick() {
	waitforElement(uploadphoto);
	uploadphoto.click();
}
@FindBy(xpath="//a[@id='deletePhoto']")
WebElement deletephoto;
public void Deletephoto() {
	waitforElement(deletephoto);
	clickElement(deletephoto);
}
@FindBy(id="uploadPhotoContentId")
WebElement frame3;
public void frame3change() {
	waitforElement(frame3);
	frameElement(frame3);	
}
@FindBy(xpath="//input[@id='j_id0:uploadFileForm:uploadInputFile']")
WebElement choosefile;
public void choosefilePhoto(String path) {
choosefile.sendKeys(path);
}
@FindBy(xpath="//input[@id='j_id0:uploadFileForm:uploadBtn']")
WebElement save1;
public void savePhoto1() {
	waitforElement(save1);
	save1.click();
	defaultoriginalPage();
}
@FindBy(id="uploadPhotoContentId")
WebElement frame4;
public void frame4() {
waitforElement(frame4);
frameElement(frame4);
}
@FindBy(xpath="//input[@id='j_id0:j_id7:save']")
WebElement save2;
public void photosave2() {
waitforElement(save2);
clickElement(save2);
defaultoriginalPage();
}//settings
@FindBy(xpath="//a[@title='My Settings']")
	WebElement settings;
public void settingsClick() {                
	clickElement(settings);
}
@FindBy(id="PersonalInfo_font")
	
	WebElement personal;
public void personalClick() {
	personal.click();
}
@FindBy(id="LoginHistory_font")	

	WebElement loginHistory;
public void loginHistoryclick() {
	loginHistory.click();
}
@FindBy(id="DisplayAndLayout_font")	
	WebElement displayFormat;
public void displayFormat() {
	waitforElement(displayFormat);
	displayFormat.click();
}
	@FindBy(xpath="//span[@id='CustomizeTabs_font']")
	
	WebElement customizTab;
	public void customizetab() {
	customizTab.click();}
	@FindBy(xpath="//select[@id='p4']")
	WebElement selectId;
	public void slesforceChatterSelect() {
		selectText(selectId, "Salesforce Chatter");
	}
	@FindBy(xpath="//option[@value='report']")
	WebElement report;
	public void reportclick() {
		waitforElement(report);
		report.click();
	}
	@FindBy(xpath="//img[@title='Add']")
	WebElement add;
	public void addclick() {
		waitforElement(add);
	add.click();
	}
@FindBy(xpath="//input[@title='Save']")
WebElement saveReport;
public void saveReport() {
	saveReport.click();
}
@FindBy(xpath="//div[@id='EmailSetup']/a")
	WebElement email;
public void emailClick() {
	waitforElement(email);
	email.click();
}
@FindBy(xpath="//span[@id='EmailSettings_font']")
WebElement emailSettings;
public void emailSettingsClick() {
waitforElement(emailSettings);
emailSettings.click();
}
@FindBy(xpath="//input[@id='sender_name']")
	WebElement emailNameBox;
public void emailNameBox(String textname) {
	clearElement(emailNameBox);
	enterText(emailNameBox, textname);
}
@FindBy(xpath="//input[@id='sender_email']")
	WebElement emailBox;
public void emailBox(String textemail) {
	clearElement(emailBox);
	enterText(emailBox, textemail);
}
@FindBy(xpath="//input[@id='auto_bcc0']")
	WebElement bccradioButton;
public void bccradio() {
	clickElement(bccradioButton);
	}
@FindBy(xpath="//input[@title='Save']")
		WebElement saveEmailSettings;
public void saveEmailsettings() {
	clickElement(saveEmailSettings);
	}
@FindBy(id="CalendarAndReminders_font")
WebElement calender;
public void calender() {
	waitforElement(calender);
calender.click();}
@FindBy(xpath="//span[@id='Reminders_font']")
WebElement activityRemainder;
public void activityremainder() {
waitforElement(activityRemainder);
activityRemainder.click();
}
@FindBy(id="testbtn")
WebElement openRemainder;
public void openRemainder()
{
openRemainder.click();
Log.info("Test case is passed,calender remainder works fine");

}//developer console
@FindBy(xpath="//div[@id='userNav']")
WebElement currentwindow;
public void curntwindowString() {
String parent=	getParentWindow();
}
public void newwindow() {
	switchNewWindow();
}
@FindBy(xpath="//a[@title='Developer Console (New Window)']")
WebElement developerfield;
public void developerfieldinNewwindow() {
developerfield.click();
}

}

