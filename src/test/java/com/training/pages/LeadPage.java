package com.training.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;
import com.training.log.Log;


public class LeadPage extends BasePage {
      WebDriver driver;
	
	public LeadPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//a[text()='Leads']")
			WebElement leadobj;
	public void leadObj() {
			waitforElement(leadobj);
			doubleClickAction(leadobj);
	
}//LeadSelectView
@FindBy(xpath="//select[@id='fcf']")
	WebElement viewbox;
public void LeadSelectViiew() {
	clickElement(viewbox);
	Log.info("Viewdropdownlist displayed");
}//defaultview
public void leadselectViewbox(String viewSelect) {
	waitforElement(viewbox);
selectText(viewbox, viewSelect);
}
@FindBy(xpath="//input[@title='Go!']")
WebElement go;
public void leadGoClick() {
	waitforElement(go);
	clickElement(go);

Log.info("defaultview is my unreadleads");
}//todays leads
public void leadToday(String today) {
selectText(viewbox, today);
Log.info("TodaysLead displayed");
}//leadcreate
@FindBy(xpath="//form[@id='hotlist']/table/tbody/tr/td[2]/input")
WebElement newcreate;
public void LeadCreate() {
	waitforElement(newcreate);
	clickElement(newcreate);
}
@FindBy(xpath="//input[@id='name_lastlea2']")
WebElement lastname;
public void LeadLastname(String leadLastname) {
	clearElement(lastname);
	enterText(lastname, leadLastname);
}
@FindBy(xpath="//input[@id='lea3']")
WebElement companyName;
public void leadCompanyname(String leadCompany) {
waitforElement(companyName);
clearElement(companyName);
enterText(companyName, leadCompany);
}
@FindBy(xpath="//td[@id='bottomButtonRow']/input[1]")
WebElement save;
public void LeadCreateSave() {
waitforElement(save);
clickElement(save);
Log.info("test case passed,new lead saved");
}
}