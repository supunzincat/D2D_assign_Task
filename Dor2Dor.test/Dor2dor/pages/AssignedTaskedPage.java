package pages;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Properties;

import javax.swing.event.TreeWillExpandListener;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import config.DataLoader;
import proxy.verifications;

public class AssignedTaskedPage {
WebDriver driver;

DataLoader dl= new DataLoader();

verifications verify= new verifications();

	//@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[3]/div/div/div/div/div/div[1]/input")WebElement District;
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[3]/div/div/div/div/button")WebElement DistrictLocator;
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[3]/div/div/div/div/button/span[1]")WebElement Districtvalue;
	
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\'main-content\']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[3]/div/div/div/div/div/div[1]/input")WebElement DistrictTextBoxt;
	
	
	//@FindBy(how=How.XPATH,using="//*[@id='territory_id']")WebElement teriitorry;
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[5]/div/div/div/button")WebElement TeriitorryLocator;	
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
	
	//Lables
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[1]/div/div/label")WebElement StartFromLable;
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[2]/div/div/label")WebElement EndDateLable;
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[3]/div/div/label")WebElement DistrictLable;
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[5]/div/div/label")WebElement TerritoryLable;
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[6]/div/div/label")WebElement StatusLable;
		
	
	public AssignedTaskedPage(WebDriver d) {
		// TODO Auto-generated constructor stub
		this.driver=d;
		PageFactory.initElements(driver, this);
	}

	public void ValidateLablesText(WebElement EnterLableLocator,String EnterExpectedValueOfLable) {
		// TODO Auto-generated method stub
String labletextvalue=EnterLableLocator.getText();
assertEquals(labletextvalue, EnterExpectedValueOfLable);
System.out.println(EnterExpectedValueOfLable);

	}

	public void VerifyStartFromLable() throws IOException {
		// TODO Auto-generated method stub
		Properties prop = dl.LoadDataToAssignTasks();
//ValidateLablesText(StartFromLable, prop.getProperty("StartFromLable"));
		verify.VerifyTextgloble(StartFromLable, prop.getProperty("StartFromLable"));
		System.out.println( prop.getProperty("StartFromLable"));
		
	}
	
	public void verifyEndDateLable() throws IOException {
		// TODO Auto-generated method stub
Properties prop=dl.LoadDataToAssignTasks();
verify.VerifyTextgloble(EndDateLable, prop.getProperty("EnddateLable"));
//ValidateLablesText(EndDateLable, prop.getProperty("EnddateLable"));

	}

	public void verifyDistrictLable() throws IOException {
		// TODO Auto-generated method stub
		Properties prop=dl.LoadDataToAssignTasks();
		ValidateLablesText(DistrictLable, prop.getProperty("DistrictLable"));
	}

	
	public void verifyTerritoryLable() throws IOException {
		// TODO Auto-generated method stub
		Properties prop=dl.LoadDataToAssignTasks();
		ValidateLablesText(TerritoryLable, prop.getProperty("TerritorryLable"));
	}

	
	public void verifyStatusLable() throws IOException {
		// TODO Auto-generated method stub
		Properties prop=dl.LoadDataToAssignTasks();
		ValidateLablesText(StatusLable, prop.getProperty("StatusLable"));
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
	
	
	
	
	public void VerifyStartDate() throws IOException {
		// TODO Auto-generated method stub
		Properties prop = dl.LoadDataToAssignTasks();
		verify.Selectdate(StartDate, prop.getProperty("VerifyStartdte"), prop.getProperty("VerifyStartdte"));
	}
	
	public void verifyEndDate() throws IOException {
		// TODO Auto-generated method stub
		Properties prop= dl.LoadDataToAssignTasks();
		//slectDate(EndDate, prop.getProperty("EnterEndDate"));
		verify.Selectdate(EndDate, prop.getProperty("VerifyEndDate"), prop.getProperty("VerifyEndDate"));
		
	}
	
	public void verifySelectDistrict() throws IOException {
		// TODO Auto-generated method stub
		Properties prop= dl.LoadDataToAssignTasks();
		verify.verifyGlobalSelectDropDown(DistrictLocator, DistrictTextBoxt,prop.getProperty("DistrictFirstValue") , prop.getProperty("VerifyDistrictValue"));
//SelectDDValues(DistrictLocator, DistrictTextBoxt, prop.getProperty("EnterDistrictValue"));

	}
	
	public void SelectTerritorry() throws IOException {
		// TODO Auto-generated method stub
		Properties pro= dl.LoadDataToAssignTasks();
SelectDDValues(TeriitorryLocator, teriitoryTesxBox,pro.getProperty("SelectTerritoryValue") );
	}	
	
	public void SelectStaus() throws IOException {
		// TODO Auto-generated method stub
		Properties prop= dl.LoadDataToAssignTasks();
		SelectDDValues(Status, StatusTextBox, prop.getProperty("SelectStatus"));
	}
	//for getattribute use title for drop downs,use value for date
	public void getselectedvalue(WebElement District,String FindbyValueof,String expectedValue) {
		// TODO Auto-generated method stub
String x=District.getAttribute(FindbyValueof);
assertEquals(x, expectedValue);
	}
	
	public void verifyDistrictValue() throws IOException {
		// TODO Auto-generated method stub
		Properties prop= dl.LoadDataToAssignTasks();
getselectedvalue(DistrictLocator,"title",prop.getProperty("VerifyDistrictValue"));


	}
	
	public void VerifyTerritorryValue() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		Thread.sleep(500);
		Properties prop= dl.LoadDataToAssignTasks();
getselectedvalue(TeriitorryLocator,"title",prop.getProperty("COL - Colombo Depot"));
	}
	
	public void VerifyStatusyValue() throws IOException {
		// TODO Auto-generated method stub
		Properties prop= dl.LoadDataToAssignTasks();
		getselectedvalue(Status,"title",prop.getProperty("VerifySelectedValue"));
	}
	
	public void verifyStartDate() throws IOException {
		// TODO Auto-generated method stub
		Properties prop=dl.LoadDataToAssignTasks();
		getselectedvalue(StartDate, "value",
		prop.getProperty("VerifyStartdte"));
	}
	
//	public void verifyEndDate() throws IOException {
//		
//		// TODO Auto-generated method stub
//		Properties prop= dl.LoadDataToAssignTasks();
//getselectedvalue(EndDate, "value",prop.getProperty("VerifyEndDate"));
//	}
	
	public void verifySelctButton() {
		// TODO Auto-generated method stub
		submitbutton.isEnabled();
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
	
	public void VerifyMultiSelectFunctionality(WebElement LocatorofDropDown,WebElement LocatorTextBox,
			String FirstValueSholudBeselected,String SecondValueShouldBeselected,String ThirdValueShouldBeselected,int CountOfValuesShouldBeSelected) {
		// TODO Auto-generated method stub
		LocatorofDropDown.click();
for (int i = 1; i <= CountOfValuesShouldBeSelected; i++) {
	LocatorTextBox.clear();
	if (i==1) {
		LocatorTextBox.sendKeys(FirstValueSholudBeselected);
		LocatorTextBox.sendKeys(Keys.RETURN);
	}
	else if(i==2) {
		LocatorTextBox.sendKeys(SecondValueShouldBeselected);
		LocatorTextBox.sendKeys(Keys.RETURN);	
	}
	else {
		LocatorTextBox.sendKeys(ThirdValueShouldBeselected);
		LocatorTextBox.sendKeys(Keys.RETURN);	
	}
	
}
String countselected=TeriitorryLocator.getText();
System.out.println(countselected);
	}
	
	public void multiselectrDistrict() throws IOException {
		// TODO Auto-generated method stub
		Properties prop= dl.LoadDataToAssignTasks();
		
VerifyMultiSelectFunctionality(TeriitorryLocator, teriitoryTesxBox, prop.getProperty("DistrictFirstValue"), prop.getProperty("DistrictSecondValue"), prop.getProperty("DistrictThirdValue"), 3);
	}
	
}
