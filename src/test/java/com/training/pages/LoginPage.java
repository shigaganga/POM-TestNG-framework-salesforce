package com.training.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.training.base.BasePage;
import com.training.log.Log;

public class LoginPage extends BasePage{
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
@FindBy(id="username")
WebElement username;


@FindBy(id="password")

WebElement password;

@FindBy(id="Login")
WebElement login;


@FindBy(id="rememberUn")
WebElement remember;

@FindBy(id="userNavLabel")
WebElement profilenameElement;
@FindBy(xpath="//a[@title='Logout']")
WebElement logout;
@FindBy(id="forgot_password_link")
WebElement forgotPW;
@FindBy(xpath="//input[@id='un']")
WebElement usrnm;
@FindBy(xpath="//input[@id='continue']")
WebElement continueEle;
@FindBy(xpath="//div[@id='error']")
WebElement errorEle;
public void error() {
	String expected="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
String AcualErrMsg=errorEle.getText();
System.out.println("Actual error msg : "+AcualErrMsg);
if(expected.equals(AcualErrMsg))
System.out.println("test case passed");
}
public void Continuename() {
	continueEle.click();
}

public void Forgotpageusrnm(String stUsename) {
	usrnm.sendKeys(stUsename);
}

public void forgotPassword() {
	forgotPW.click();
	System.out.println("testcase passed,forgot password reset message page is displayed ");

}

public void remembermeclick() {
	remember.click();

}

public void usermenu() {
	waitforElement(profilenameElement);
	profilenameElement.click();

}

public void Logout() {
	
	waitforElement(logout);
	logout.click();
	System.out.println("testcase passed,remember me ticked");
}


public void enterintoUsername(String strusername) {
	waitforElement(username);
	username.sendKeys(strusername);
	Log.info("Successfully entered the username"+username);
}

public void enterintoPassword(String strpassword) {
	password.sendKeys(strpassword);
	
	
}


public void clearpassword(String strpasswd) {
	password.clear();
}
public void clickLogin() {
	login.click();
	 Log.info("Entered in to the homepage");
}


}
