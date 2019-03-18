package pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.RenderingHints.Key;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import config.DataLoader;
import proxy.verifications;

public class SalesPlanningPage {

	WebDriver d;
	verifications verify= new verifications();
	DataLoader dl= new DataLoader();
	
	@FindBy(how=How.XPATH,using="//*[@id='d2d-taskassign-top-wrap']/div[3]/div[1]/label/span") WebElement ShowPrevisitsCheckbox;
	@FindBy(how=How.XPATH,using="//*[@id='d2d-taskassign-top-wrap']/div[3]/div[2]/label/span") WebElement TopTenGNDivisions;
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[1]/div/div/button/span[1]") WebElement DistrictDropDown;
	
	@FindBy(how=How.XPATH,using="//*[@id='districts_filter_rightbar']") WebElement DistrictDropDownall;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[2]/div/div/button") WebElement TerritoryDropDown;
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[2]/div/div/div/div/input") WebElement TerriotorryTextBox;
	                             
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[3]/div/div/button") WebElement GNDivisionsDropDown;
	@FindBy(how=How.XPATH,using="//*[@id='sdate']") WebElement StartdateDatePiker;
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[5]/div/input") WebElement EnddateDatePiker;
	@FindBy(how=How.XPATH,using="//*[@id='remarks']") WebElement RemarksTextField;
	//@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[6]/label") WebElement TowersCheckBoxLocation;
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[6]/label/span") WebElement TowerCheckbox;
	
	//@FindBy(how=How.XPATH,using="//*[@id='js-filter_map_towers']") WebElement TowerCheckbox;
	@FindBy(how=How.XPATH,using="//*[@id='js-filter_map_towers']") WebElement TowersDropDown;
	
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[1]/div/div/div/div/input") WebElement DistrictDDTextbox;
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[3]/div/div/button/span[1]") WebElement GNDivisionDD;

	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[3]/div/div/div/div[1]/input") WebElement GNDivisionTextBox;
	@FindBy(how=How.XPATH,using="//*[@id='sdate']") WebElement startdate;
	@FindBy(how=How.XPATH,using="//*[@id='edate']") WebElement EndDate;

	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[6]/label/span")
	private WebElement TowerCheckBox;
	
	@FindBy(how=How.XPATH,using="//*[@id='googlemap_elem']/div/div/div[1]/div[3]/div/div[3]/div[2]/img") WebElement Towerimage;
	
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[8]/div/div/div/div/button") WebElement SubmitButton;
	
	@FindBy(how=How.XPATH,using="/html/body/div[5]/div[2]/div/div/div/div/div/div/div") WebElement msgbox;
	
	
	@FindBy(how=How.XPATH,using="/html/body/div[5]/div[2]/div/div/div/div/div/div/div/div[3]") WebElement msgboxtext;
	
	@FindBy(how=How.XPATH,using="/html/body/div[5]/div[2]/div/div/div/div/div/div/div/div[4]/button[2]") WebElement MessageBoxcanclebutton;
	
	@FindBy(how=How.XPATH,using="/html/body/div[5]/div[2]/div/div/div/div/div/div/div/div[4]/button[1]") WebElement MessageBoxConfirmtbutton;
	
	@FindBy(how=How.XPATH,using="//*[@id='gritter-item-1']/div/div[2]/p") WebElement VerifyMessage;
	
	@FindBy(how=How.XPATH,using="") WebElement VerifySuccessMessage;
	
	public enum Status {
	    enable,
	    disble
	}
	
	
	public void verifytowerDDStatus(Status statusof) {
		// TODO Auto-generated method stub
		if (statusof==Status.enable) {
			verify.verifyElementIsEnabled(Status.disble, TowersDropDown);	
		}
		
		else if (statusof==Status.disble) {
			verify.verifyElementIsEnabled(Status.disble, TowersDropDown);	
		}
		}
	
	public SalesPlanningPage(WebDriver d) {
		// TODO Auto-generated constructor stub
		this.d=d;
		PageFactory.initElements(d, this);
	}


	public void VeriFyDropDownIsEnabled(WebElement DropDownName) {
		// TODO Auto-generated method stub
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Assert.assertTrue(DropDownName.isSelected());
		DropDownName.isEnabled();
		System.out.println("truuueee");
			
	}
	
	
	public void VerifyIsDistrictDropdownEnabled() {
		// TODO Auto-generated method stub
VeriFyDropDownIsEnabled(DistrictDropDown);
	}
	
	public void VerifyIsTerritoryDropdownEnabled() {
		// TODO Auto-generated method stub
VeriFyDropDownIsEnabled(TerritoryDropDown);
	}
	
	public void VerifyIsGNDivisionsDropdownEnabled() {
		// TODO Auto-generated method stub
VeriFyDropDownIsEnabled(TerritoryDropDown);
	}
	

	
	public void VerifyIsTowersDropdownEnabled() {
		// TODO Auto-generated method stub
VeriFyDropDownIsEnabled(TowersDropDown);
	}
	
	
	public void SelectDropDown(WebElement DropdownName,WebElement Dropdowntexboxvalue,String TextValue) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DropdownName.click();
		
		Dropdowntexboxvalue.sendKeys(TextValue);
		
		Dropdowntexboxvalue.sendKeys(Keys.ENTER);
		
	
	}
	
	public void verifyDistrictDropdownValues() {
		// TODO Auto-generated method stub
		String[] districtDDValues= {"Colombo","gampaha"};
		Select districtDD=new  Select(DistrictDropDownall);
		for (int i = 0; i < districtDDValues.length; i++) {
			
		}

	}
	
	
	public void verifySelectedDistrict() throws IOException {
		// TODO Auto-generated method stu
		Properties prop=dl.LoadDataToSalesPlanning();
		verify.verifyGlobalSelectDropDown(DistrictDropDown, DistrictDDTextbox,prop.getProperty("selectColombo"),prop.getProperty("ExpectingColombo"));
	}
	
	public void verifySelectedTerriotarry() throws IOException {
		// TODO Auto-generated method stub  enterTerritory 
		Properties prop=dl.LoadDataToSalesPlanning();
		verify.verifyGlobalSelectDropDown(TerritoryDropDown, TerriotorryTextBox, prop.getProperty("enterTerritory"),prop.getProperty("ExpectedTerritorry"));

	}
	
	public void verifySelectedselectGNDivision() throws IOException {
		// TODO Auto-generated method stub
		Properties prop= dl.LoadDataToSalesPlanning();
		//SelectDropDown(GNDivisionDD, GNDivisionTextBox,"sedawa");
		verify.verifyGlobalSelectDropDown(GNDivisionDD, GNDivisionTextBox, prop.getProperty("enterGNDivision"), prop.getProperty("ExpectedGNDivision"));
//		String s=GNDivisionDD.getText();
//		System.out.println("text gndivisions value is "+s);
//		assertEquals(s, "Sedawatta");
	}
	
	public void getlistvalues() {
		// TODO Auto-generated method stub
//		DistrictDropDownall.click();
Select x=new Select(DistrictDropDownall);
List<WebElement> elementlist =x.getOptions();
int itemcount=elementlist.size();
for(int l = 0; l < itemcount; l++)
{
	List<String> genderList = new ArrayList<String>();
	for (WebElement G : elementlist ) {
	    genderList.add(G.getText());
	}
	System.out.println(genderList);
    System.out.println(elementlist.get(l).getText());
    
    
}
	}
	
	public void Selectdate(WebElement datePiker) {
		// TODO Auto-generated method stub
datePiker.click();
datePiker.sendKeys(Keys.ARROW_RIGHT);
datePiker.sendKeys(Keys.ENTER);
	}
	
	
	public void verifyselectStartdate() throws IOException {
		// TODO Auto-generated method stub
		Properties prop= dl.LoadDataToSalesPlanning();
		verify.Selectdate(startdate,prop.getProperty("Enterstartdate"),prop.getProperty("expectedStartDate"));
//Selectdate(startdate);
//String currentdate=startdate.getText();
//System.out.println("currentdate is"+currentdate);
//assertEquals(currentdate, "2018-12-13");
	}
	
	
	public void dbconnection() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		//forName(“com.mysql.jdbc.Driver”);
		//String dbUrl = "jdbc:mysql://localhost:3036/emp";
		Class.forName("com.mysql.jdbc.Driver");
		java.sql.Connection con=	DriverManager.getConnection("jdbc:MySQL://172.26.28.127:3306/wom_devel", "womuser", "Womuser@123");
		//java.sql.Connection con=	DriverManager.getConnection("jdbc:MySQL://127.0.0.1/wom_devel", "womuser", "Womuser@123");
		java.sql.Statement stmt = con.createStatement();	
	ResultSet rs=	stmt.executeQuery("SELECT * FROM `d2d_tasks_to_bb_towers` WHERE TASK_ID=15");
	System.out.println(rs);

	}
	
	public void verifySelectEnddate() throws IOException {
		// TODO Auto-generated method stub
		Properties prop= dl.LoadDataToSalesPlanning();
		verify.Selectdate(EndDate,prop.getProperty("EnterEndDate"),prop.getProperty("expectedEndDate"));
	}
	
	
	public void ClickonToweCheckBox() {
		// TODO Auto-generated method stub
		verify.ClickonCheckBox(TowerCheckbox);
			}
	
public void verifytoverCheckBoxIsEnablled() {
	// TODO Auto-generated method stub
//verify.verifyElementIsEnabled(TowerCheckbox);
}
	
	
	public void VerifyTextMessage() throws IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js=(JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0,300)");
		SubmitButton.click();
		Properties prop=dl.LoadDataToSalesPlanning();
		//assertTrue(msgbox.isEnabled());	
		verify.VerifyTextgloble(msgboxtext, prop.getProperty("messagetext"));
	
	}
	
	public void ClickOnCancleButton() {
		// TODO Auto-generated method stub
//		try {
//			Thread.sleep(200);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		MessageBoxcanclebutton.click();
//		try {
//			Thread.sleep(200);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		//msgbox.isEnabled();
		assertFalse(msgbox.isEnabled());
	}
	
	
	public void MessageBoxcSubmitbutton() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SubmitButton.click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MessageBoxConfirmtbutton.click();
		String  message=VerifyMessage.getText();
		assertTrue(message.contains("success"));
		
	}

//	public WebElement getTowerCheckBox() {
//		return TowerCheckBox;
//	}

	public void setTowerCheckBox(WebElement towerCheckBox) {
		TowerCheckBox = towerCheckBox;
	}

}
