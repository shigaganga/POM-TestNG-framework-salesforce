package com.training.base;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.log.Log;

public class BasePage {
	 WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
	public  void waitforElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void clearElement(WebElement ele) {
		if (ele.isDisplayed()) {
			ele.clear();
		}
	}
	

	public void clickElement(WebElement ele) {
		if (ele.isEnabled()) {
			ele.click();
			
		}}
		public String getTextFromElement(WebElement ele) {
			String data = ele.getText();
			Log.info("extracted the text"+data);
			return data;
		
}
		public void enterText(WebElement ele, String data) {
			waitforElement(ele);
			if (ele.isDisplayed()) {
				clearElement(ele);
				ele.sendKeys(data);
			}
		}
		//window methods
		public String getParentWindow() {
			String parentwindow=driver.getWindowHandle();
			System.out.println("Title of the current window:" + driver.getTitle());
			return parentwindow;
			
		}
		
		public void switchNewWindow() {
			String parentwindow=driver.getWindowHandle();
			Set<String>windowHandles=driver.getWindowHandles();
			for(String newWindowHandle:windowHandles) {
				 if (!newWindowHandle.equals(parentwindow))
			        {
			        
					 driver.switchTo().window(newWindowHandle);
			        }
				 System.out.println("Title of the new window:" + driver.getTitle());	}}
					

		
		public void switchToparentWndow(String parentwindow) {
						Set<String>windowHandles=driver.getWindowHandles();
						for(String newWindowHandle:windowHandles) {
							 if (!newWindowHandle.equals(parentwindow))
						        {
						        
								 driver.switchTo().window(newWindowHandle);
						        }}
                         driver.switchTo().window(parentwindow);
						
					}
		public void SwitchParentwind() {
			driver.close();
		}
		public  void selectText(WebElement element, String text)
		{
			Select selectText=new Select(element);
			selectText.selectByVisibleText(text);
			System.out.println("selected"+text);
		}
		public  void selectIndex(WebElement element, int index)
		{
			waitforElement(element);
			Select selectIndex=new Select(element);
			selectIndex.selectByIndex(index);
			System.out.println("selected"+index);
		}
		public void selectValue(WebElement element, String text)
		{
			Select selectValue=new Select(element);
			selectValue.selectByVisibleText(text);
			System.out.println("selected"+text);
		}
		//action class methods
		public  void MoveToElementAction(WebElement ele) {
			Actions action=new Actions(driver);
			action.moveToElement(ele).build().perform();
			System.out.println("cursor moved to the webelement");
		}
		public  void ContextClickAction(WebElement ele) {
			Actions action=new Actions(driver);
			action.contextClick(ele).build().perform();
			System.out.println("right click performed to the webelement");
		}
		public  void doubleClickAction(WebElement ele) {
			Actions action=new Actions(driver);
			action.doubleClick(ele).build().perform();
			System.out.println("right click performed to the webelement");
		}
		public void frameElement(WebElement frameEle){
			waitforElement(frameEle);
			driver.switchTo().frame(frameEle);
		}	
		public void framename(String frameName){
			driver.switchTo().frame(frameName);
		}	
		public void frameindex(int frameNo){
			driver.switchTo().frame(frameNo);
		}	
		public void defaultoriginalPage() {
			driver.switchTo().defaultContent();
			
		}
		public void alertAccept() {
			Alert alert=driver.switchTo().alert();
			alert.accept();
		}
		public void alertdismiss() {
			Alert alert=driver.switchTo().alert();
			alert.dismiss();
		}
		}
			
