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

	public class OpportunityPage extends BasePage{
	public OpportunityPage(WebDriver driver) {
			super(driver);
		}
//opportunity objTc15
@FindBy(xpath="//a[text()='Opportunities']")
	WebElement oppob;
public void oppobj() {
	waitforElement(oppob);
	clickElement(oppob);
	}
	 
@FindBy(xpath="//select[@id='fcf']")	
WebElement oppDropDown;	
	 
public void verifydropDown() {
	waitforElement(oppDropDown);
	clickElement(oppDropDown);
	Log.info("opportunity dropdown is clicked,testcase passed");
	}//new opportunitycreate16

@FindBy(xpath="//form[@id='hotlist']/table/tbody/tr/td[2]/input")
	
	 WebElement newopp;
public void newopp()
{
	waitforElement(newopp);
	clickElement(newopp);
}
	
	@FindBy(xpath="//input[@id='opp3']")
	 WebElement oppname;
	public void oppName(String opportunityname) {
	enterText(oppname, opportunityname);
	}
	@FindBy(xpath="//input[@id='opp4']")
	 WebElement accname;
	public void accname() {
		waitforElement(accname);
	}
	public void currentwindow() {
		String parent=getParentWindow();
	}
	@FindBy(xpath="//a[@id='opp4_lkwgt']/img")
	WebElement Searchicon;
	public void searchiconopp() {
		waitforElement(Searchicon);
	clickElement(Searchicon);
	}
	public void newWindowOpp() {
	switchNewWindow();
	}
	@FindBy(xpath="//frame[@id='searchFrame']")
	WebElement frameEleopp1;
	public void frameEleOpp1() {
		waitforElement(frameEleopp1);
	frameElement(frameEleopp1);
	}
	@FindBy(xpath="//form[@id='theForm']/div/div[2]/input[1]")
	WebElement input;
	public void InputSend(String keySend) {
	waitforElement(input);
	enterText(input, keySend);
	}
	@FindBy(xpath="//input[@name='go']")
	WebElement go;
	public void goOpp() {
	waitforElement(go);
	clickElement(go);
	}
	public void defaultcontent() {
		defaultoriginalPage();
	}
	
	
	@FindBy(xpath="//frame[@id='resultsFrame']")
	WebElement frameEleOpp2;
	public void frameEleOpp2() {
		waitforElement(frameEleOpp2);
		frameElement(frameEleOpp2);
	}
@FindBy(xpath="//form[@id='new']/div/div[3]/div/div[2]/table/tbody/tr[2]/th/a")
	WebElement table;
	//System.out.println(table.getText());
public void tableClick() {
	waitforElement(table);
	clickElement(table);
}
public void currentwindowaftertableClick() {
	String parent=getParentWindow();
	switchToparentWndow(parent);
}

@FindBy(xpath="//input[@id='opp9']")
	WebElement closeDate;
public void closedate() {
	waitforElement(closeDate);
	enterText(closeDate, "4/5/2024");
}
@FindBy(xpath="//select[@id='opp11']")
	
	WebElement stage;
public void stageSelect() {
	selectIndex(stage, 2);}
@FindBy(xpath="//select[@id='opp6']")
	WebElement leadsource;
public void selectLeadSource() {
	selectIndex(Searchicon, 2);
}
@FindBy(xpath="//input[@id='opp17']")
	WebElement primaryCampaign;
public void currentwindow2() {
	getParentWindow();
}
@FindBy(xpath="//a[@id='opp17_lkwgt']/img")			
	WebElement searchiconCampaign;//*a* in searchbox
public void searchiconCampaign() {
	clickElement(searchiconCampaign);
}
public void newWindowCampaign() {
	switchNewWindow();
}
@FindBy(xpath="//frame[@id='searchFrame']")

	
	WebElement frameEleSearch;
public void frameEleSearch() {
	waitforElement(frameEleSearch);
	frameElement(frameEleSearch);}
	@FindBy(xpath="//form[@id='theForm']/div/div[2]/input[1]")
	WebElement input2;
	public void campaignInput(String strchar) {
	enterText(input2, strchar);//*a*
	}
	@FindBy(xpath="//input[@name='go']")
	WebElement go2;
	public void goCampDefaultFrme() {
		waitforElement(go2);
		clickElement(go2);
		defaultoriginalPage();
		}
	
	@FindBy(xpath="//frame[@id='resultsFrame']")
	WebElement frameElecamp5;
	public void framecamp5() {
	frameElement(frameElecamp5);}
	@FindBy(xpath="//form[@id='new']/div/div[3]/div/div[2]/table/tbody/tr[2]/th/a")
	WebElement table2;
	public void tableCampDefaultWindow() {
	clickElement(table2);
	defaultoriginalPage();
	}
	@FindBy(xpath="//td[@id='bottomButtonRow']/input[1]")
	WebElement saveopp;
	public void saveopp() {
	clickElement(saveopp);
	Log.info("Testcase passed new opportunity created");
	
	}//oppPipeline
	// TODO Auto-generated method stub
	@FindBy(xpath="//a[text()='Opportunity Pipeline']")
	WebElement oppPipeline;
	public void oppPipeline() {
	clickElement(oppPipeline);
	Log.info("report Page with the Opportunities that are pipelined is displayed.");
	
	 }//Stuckopp Report
	@FindBy(xpath="//a[text()='Stuck Opportunities']")
	 WebElement newoppEle;
	public void StuckOpp() {
	clickElement(newoppEle);
	 Log.info("StuckOpportunities Reports displayed");
}//Quarterly summarylink
	@FindBy(xpath="//select[@id='quarter_q']")
	 WebElement interval;
	public void QIntervalSelect(String oppInterval) {
		waitforElement(interval);
		selectText(interval, oppInterval);
	}
	 
	@FindBy(xpath="//select[@id='open']")
	 WebElement include;
	public void oppIncludeSelect(String oppinclude) {
		waitforElement(include);
		selectText(include, oppinclude);
	}
	 @FindBy(xpath="//input[@title='Run Report']")
	WebElement runreport;
	 public void runreport() {
		 clickElement(runreport);
	 
	
	 Log.info("testcase passed,reportpage displayed with criteria");
	
	}}