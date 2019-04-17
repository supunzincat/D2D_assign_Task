package pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import config.DataLoader;
import proxy.verifications;

public class TerritorryManagerTasks {

	  String time;  

     public void setTime (String t) {time = t; } public String getTime() {  return time;  } 
	
    DataLoader dl = new DataLoader();
    verifications verify= new verifications();
    
    
    
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="") WebElement Locatorname;
	
	@FindBy(how=How.XPATH,using="//*[@id='container']/header/div[2]/ul/li/a/span") WebElement Username;
	//String Usernamevalue="supun_zincat";
	
	@FindBy(how=How.XPATH,using="//*[@id='container']/div[1]/div") WebElement lableHedder;
//	String PageName="Door To Door | Assigned Tasks";
	
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[1]/div/div/label") WebElement startdateexpath;
	//String StartfromText="Start From *";
	

	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[2]/div/div/label") WebElement enDDate;
	//String EnddateText="End Date *";	
	
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[3]/div/div/label") WebElement TerritorryLocator;
	//String TerritoryText="Territory *";
	
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[5]/div/div/label") WebElement StatusLocator;
	
	//String StatusText="Status";
	
	@FindBy(how=How.XPATH,using="//*[@id='cluster_order_by_label']") WebElement OnlyexpirdtasktextLocator;
	
	//String onlyexpiredtaskText="Only expired tasks";
	
	@FindBy(how=How.XPATH,using="//*[@id='d2d-task-list-sdate']") WebElement StartDateLocator;
	String StartDateValue="2018-01-25";
	String StartdateExpectedvalue="2018-01-25";
		
	@FindBy(how=How.XPATH,using="//*[@id='d2d-task-list-edate']") WebElement EndDateLocator;
	String EndDateDateValue="2019-02-23";
	String EnddateExpectedvalue="2019-02-24";
	
	
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[3]/div/div/div/button") WebElement DropdownTerritoryLocator;
	//*[@id="territory_id"]
	
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[3]/div/div/div/div/div/input") WebElement DropdownTerritoryTextBox;
	
	
	String TerritoryName="AWI";
	String expectedTerritory="AI - Awissawella Depot";
	
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[5]/div/div/div/div/button") WebElement DropdownStatusLocator;
	
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[5]/div/div/div/div/div/div[1]/input") WebElement DropdownStatusTextBox;
	
	String DropDownStatus="assi";
	
	@FindBy(how=How.XPATH,using="//*[@id='d2d-task-save-btn']") WebElement SubmitButtonLocator;
	
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[2]/section/div/div[1]/table") WebElement TableLocator;
	
	@FindBy(how=How.XPATH,using="//*[@id='table_view']") WebElement TableViewLocator;
	
	@FindBy(how=How.XPATH,using="//*[@id='grid_view']") WebElement GridViewLocator;
	@FindBy(how=How.XPATH,using="//*[@id=\"territory_id\"]") WebElement dropdownterritorry;
	
	
	public TerritorryManagerTasks(WebDriver driver) {
		// TODO Auto-generated constructor stuth
		PageFactory.initElements(driver, this);
		this.driver= driver;
		}

	
	
//	public void VerifyText1() {
//		// TODO Auto-generated method stub
//		//StartFormText.click();
//String x=StartFormText.getText();
//assertEquals(x,"");
//System.out.println(x);
//	}



//	public void VerifyText(WebElement EnterFildForValidate,String enterExpectedValueForValidate) throws IOException {
//		String valueoftext=EnterFildForValidate.getText();
//		assertEquals(valueoftext,enterExpectedValueForValidate);
//		//System.out.println(valueoftext);
//	}

	verifications veriGl= new verifications();
	
	
	
	
	public void VerifyText(WebElement EnterFildForValidate,String enterExpectedValueForValidate) throws IOException {
		String valueoftext=EnterFildForValidate.getText();
		 assertEquals(valueoftext,enterExpectedValueForValidate);
		 
		//System.out.println(valueoftext);
	//	 veriGl.VerifyTextgloble(EnterFildForValidate, enterExpectedValueForValidate);
	}
	
	
	public void VerifyUsername() throws IOException {
		// TODO Auto-generated method stub
		Properties prop= dl.LoadDataToTerritorryMangerTasks();
//	VerifyText(Username, prop.getProperty("un"));
	
		veriGl.VerifyTextgloble(Username, prop.getProperty("un"));
		System.out.println(prop.getProperty("un"));
	}
	
	public void VerifyNameOfThePage() throws IOException {
		// TODO Auto-generated method stub
		Properties prop= dl.LoadDataToTerritorryMangerTasks();
VerifyText(lableHedder, prop.getProperty("Pagename"));
	}
	
	public void verifyLableOfStartdate() throws IOException {
		// TODO Auto-generated method stubp
		Properties prop= dl.LoadDataToTerritorryMangerTasks();
VerifyText(startdateexpath, prop.getProperty("StartfromText"));
	}
	
	public void VerifyEnddate() throws IOException {
		// TODO Auto-generated method stub
		Properties prop= dl.LoadDataToTerritorryMangerTasks();
VerifyText(enDDate, prop.getProperty("EnddateText"));
	}
		//test
	public void VerifyTerritoryText() throws IOException {
		// TODO Auto-generated method stub
		Properties prop = dl.LoadDataToTerritorryMangerTasks();
VerifyText(TerritorryLocator, prop.getProperty("TerritoryText"));
	}
	
	public void VerifyStatusText() throws IOException {
		// TODO Auto-generated method stub
		Properties prop= dl.LoadDataToTerritorryMangerTasks();
VerifyText(StatusLocator, prop.getProperty("StatusText"));
	}
	
	public void OnlyExpiredTaskText() throws IOException {
		// TODO Auto-generated method stub
		Properties prop= dl.LoadDataToTerritorryMangerTasks();
VerifyText(OnlyexpirdtasktextLocator, prop.getProperty("onlyexpiredtaskText"));
	}
	
	public void EnterDate(WebElement EnterDateName ,String enterdatevalue,String expecteddate ) {
		// TODO Auto-generated method stub
EnterDateName.click();
EnterDateName.clear();
EnterDateName.sendKeys(enterdatevalue);
String x=EnterDateName.getAttribute("value");
assertEquals(x, expecteddate);
	}	
	
	public void validateEnteredStartDate() throws IOException {
		// TODO Auto-generated method stub
		Properties prop= dl.LoadDataToTerritorryMangerTasks();
EnterDate(StartDateLocator, prop.getProperty("EnterringStartDate"),prop.getProperty("ExpectedStartDate"));

	}
	
	public void EnerEndDate() throws IOException {
		// TODO Auto-generated method stub
		Properties prop = dl.LoadDataToTerritorryMangerTasks();
		//EnterDate(EndDateLocator, EndDateDateValue,EnddateExpectedvalue);
		EnterDate(EndDateLocator, prop.getProperty("EnterringEndDateDateValue"),prop.getProperty("ExpectedEndDateDateValue"));
	}
	
	public void EnterValuesForDropdown(WebElement DropDownName,WebElement DropdownTextBoX,String DropdownValue,String ExpectedvalueForDD) {
		// TODO Auto-generated method stu
		DropDownName.click();
		DropdownTextBoX.sendKeys(DropdownValue);
		DropdownTextBoX.sendKeys(Keys.RETURN);
	String 	x=DropDownName.getText();
	assertEquals(x, ExpectedvalueForDD);
	System.out.println("enterd value iss"+x);
	}
	
	public void selectTerritoryValueFromDropdown() throws IOException {
		// TODO Auto-generated method stub
		Properties prop = dl.LoadDataToTerritorryMangerTasks();
		//EnterValuesForDropdown(DropdownTerritoryLocator, DropdownTerritoryTextBox, TerritoryName,expectedTerritory);
		//EnterValuesForDropdown(DropdownTerritoryLocator, DropdownTerritoryTextBox, prop.getProperty("EnterTerritoryName"),prop.getProperty("ExpectedTerritory"));
		verifications verify = new verifications();
		verify.verifyGlobalSelectDropDown(DropdownTerritoryLocator, DropdownTerritoryTextBox, prop.getProperty("EnterTerritoryName"),prop.getProperty("ExpectedTerritory"));
	}

	public void selectStatusValue() throws IOException {
		// TODO Auto-generated method stub
		Properties prop = dl.LoadDataToTerritorryMangerTasks();
		EnterValuesForDropdown(DropdownStatusLocator, DropdownStatusTextBox,prop.getProperty("EnterDropDownStatus"),prop.getProperty("expectedDropdownStatus"));
	}

	
	public void veriFySubmitButton() {
		// TODO Auto-generated method stub
SubmitButtonLocator.click();
try {
	Thread.sleep(500);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
TableLocator.isEnabled();
	}
	
	public void verifyGridViewOrTableView(WebElement EnterElementViewType) {
		// TODO Auto-generated method stub
		assertTrue(EnterElementViewType.isSelected());
	}
	public void verifyTableViewRadioButton() {
		// TODO Auto-generated method stub
	//	assertTrue(TableViewLocator.isSelected());
		verifyGridViewOrTableView(TableViewLocator);

	}
	
	public void GridviewIsEnabled() {
		// TODO Auto-generated method stub
		GridViewLocator.click();
		verifyGridViewOrTableView(GridViewLocator);
	}
	
	
	public void verifyallTerritorryDDValues() {
		// TODO Auto-generated method stub
		String[] districtvalues = {"Please Select","Please select","AWI - Awissawella Depot","COL - Colombo Depot","GAM - Gampaha Depot","NEG - Negombo Depot","PIL - Piliyandala Depot","BAL - Balapitiya Depot","ELP - Elpitiya Depot","EMB - Embilipitiya Depot","GAL - Galle Depot"};
		
verify.verifyAllDropdownValues(dropdownterritorry, districtvalues);
	}
}
