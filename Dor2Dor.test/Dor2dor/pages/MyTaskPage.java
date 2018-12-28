package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyTaskPage {
WebDriver driver;

	//@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[3]/div/div/div/div/div/div[1]/input")WebElement District;
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[3]/div/div/div/div/button")WebElement District;
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[3]/div/div/div/div/button/span[1]")WebElement Districtvalue;
	
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\'main-content\']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[3]/div/div/div/div/div/div[1]/input")WebElement DistrictTextBoxt;
	
	
	//@FindBy(how=How.XPATH,using="//*[@id='territory_id']")WebElement teriitorry;
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[5]/div/div/div/button")WebElement teriitorry;
	
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[5]/div/div/div/div/div[1]/input")WebElement teriitoryTesxBox;
	//
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[6]/div/div/div/div/button")WebElement Status;
	//
	@FindBy(how=How.XPATH,using="//*[@id=\"main-content\"]/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[6]/div/div/div/div/div/div[1]/input")WebElement StatusTextBox;
	@FindBy(how=How.XPATH,using="//*[@id='d2d-task-list-sdate']")WebElement StartDate;
	@FindBy(how=How.XPATH,using="//*[@id='d2d-task-list-edate']")WebElement EndDate;
	
	@FindBy(how=How.XPATH,using="//*[@id='d2d-task-save-btn']")WebElement submitbutton;
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[2]/section/div/div[1]/table")WebElement Table;
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[2]/section/div/div[1]/div[2]/div")WebElement Gridview;
	
	@FindBy(how=How.XPATH,using="//*[@id='table_view']")WebElement TableView;
	
	@FindBy(how=How.XPATH,using="//*[@id='table_view']")WebElement GridviewRadioBtn;
	@FindBy(how=How.XPATH,using="//*[@id='table_view']")WebElement TableViewRadioButton;
	
	
	
	
	public MyTaskPage(WebDriver d) {
		// TODO Auto-generated constructor stub
		this.driver=d;
		PageFactory.initElements(driver, this);
	}


	public void SelectDDValues(WebElement ElementName,WebElement ElementTextBox,String Velue) {
		// TODO Auto-generated method stub
ElementName.click();
ElementTextBox.sendKeys(Velue);
ElementName.sendKeys(Keys.ENTER);
	}
	public void slectDate(WebElement Datevalue,String Date) {
		// TODO Auto-generated method stub
		Datevalue.clear();
Datevalue.sendKeys(Date);
	}
	
	
	public void selectStartDate() {
		// TODO Auto-generated method stub
		slectDate(StartDate,"2018-12-01");
		
	}
	
	public void EndDate() {
		// TODO Auto-generated method stub
		slectDate(EndDate,"2019-01-26");
		
	}
	
	public void SelectDistrict() {
		// TODO Auto-generated method stub
SelectDDValues(District, DistrictTextBoxt, "Colom");
	}
	
	public void SelectTerritorry() {
		// TODO Auto-generated method stub
SelectDDValues(teriitorry, teriitoryTesxBox, "COL - Colombo Depot");
	}	
	
	public void SelectStaus() {
		// TODO Auto-generated method stub
SelectDDValues(Status, StatusTextBox, "ini");
	}
	//for getattribute use title for drop downs,use value for date
	public void getselectedvalue(WebElement District,String FindbyValueof,String expectedValue) {
		// TODO Auto-generated method stub
String x=District.getAttribute(FindbyValueof);
assertEquals(x, expectedValue);
	}
	
	public void verifyDistrictValue() {
		// TODO Auto-generated method stub
getselectedvalue(District,"title","Colombo");
	}
	
	public void VerifyTerritorryValue() {
		// TODO Auto-generated method stub
getselectedvalue(teriitorry,"title","COL - Colombo Depot");
	}
	
	public void VerifyStatusyValue() {
		// TODO Auto-generated method stub
getselectedvalue(Status,"title","INITIAL");
	}
	
	public void verifyStartDate() {
		// TODO Auto-generated method stub
getselectedvalue(StartDate, "value","2018-12-01");
	}
	
	public void verifyEndDate() {
		// TODO Auto-generated method stub
getselectedvalue(EndDate, "value","2019-01-26");
	}
	
	public void verifySelctButton() {
		// TODO Auto-generated method stub
submitbutton.click();
//Gridview.isEnabled();
//String tumbanil=Gridview.getAttribute("class");
//assertEquals(tumbanil, "thumbnail");
//Table.isEnabled();
	}
	
	public void IsGridviewEnabled() {
		// TODO Auto-generated method stub
		GridviewRadioBtn.click();
String tumbanil=Gridview.getAttribute("class");
assertEquals(tumbanil, "thumbnail");
	}
	
	public void IsTableviewEnabled() {
		// TODO Auto-generated method stub
		TableViewRadioButton.click();
String tumbanil=TableView.getAttribute("class");
assertEquals(tumbanil, "table-count-wrap clearfix");
	}
	
}
