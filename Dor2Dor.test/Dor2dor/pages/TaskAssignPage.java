package pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TaskAssignPage {

	WebDriver d;
	
	@FindBy(how=How.XPATH,using="//*[@id='d2d-taskassign-top-wrap']/div[3]/div[1]/label/span") WebElement ShowPrevisitsCheckbox;
	@FindBy(how=How.XPATH,using="//*[@id='d2d-taskassign-top-wrap']/div[3]/div[2]/label/span") WebElement TopTenGNDivisions;
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[1]/div/div/button/span[1]") WebElement DistrictDropDown;
	
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[2]/div/div/button") WebElement TerritoryDropDown;
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[2]/div/div/div/div/input") WebElement TerriotorryTextBox;
	                             
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[3]/div/div/button") WebElement GNDivisionsDropDown;
	@FindBy(how=How.XPATH,using="//*[@id='sdate']") WebElement StartdateDatePiker;
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[5]/div/input") WebElement EnddateDatePiker;
	@FindBy(how=How.XPATH,using="//*[@id='remarks']") WebElement RemarksTextField;
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[7]/label/span") WebElement TowersCheckBox;
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[6]/div/div") WebElement TowersDropDown;
	
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
	
	
	public void verifytowerDDenable() {
		// TODO Auto-generated method stub
TowersDropDown.isSelected();
	}
	
	public TaskAssignPage(WebDriver d) {
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
	
	
	public void selectDistrict() {
		// TODO Auto-generated method stub
		SelectDropDown(DistrictDropDown, DistrictDDTextbox,"Colombo");
		String s=DistrictDropDown.getText();
		System.out.println("text district value is "+s);
		assertEquals(s, "Colombo");
	}
	
	public void selectTerriotarry() {
		// TODO Auto-generated method stub
		SelectDropDown(TerritoryDropDown, TerriotorryTextBox,"Col");
		String s=TerritoryDropDown.getText();
		System.out.println("text Terriotarry value is "+s);
		assertEquals(s, "COL - Colombo Depot");
	}
	
	public void selectGNDivision() {
		// TODO Auto-generated method stub
		SelectDropDown(GNDivisionDD, GNDivisionTextBox,"sedawa");
		String s=GNDivisionDD.getText();
		System.out.println("text gndivisions value is "+s);
		assertEquals(s, "Sedawatta");
	}
	
	
	
	public void Selectdate(WebElement datePiker) {
		// TODO Auto-generated method stub
datePiker.click();
datePiker.sendKeys(Keys.ARROW_RIGHT);
datePiker.sendKeys(Keys.ENTER);
	}
	
	
	public void SelectStartdate() {
		// TODO Auto-generated method stub
Selectdate(startdate);
//String currentdate=startdate.getText();
//System.out.println("currentdate is"+currentdate);
//assertEquals(currentdate, "2018-12-13");
	}
	
	public void SelectEnddate() {
		// TODO Auto-generated method stub
Selectdate(EndDate);
	}
	
	public void ClickonToweCheckBox() {
		// TODO Auto-generated method stub
		
		getTowerCheckBox().click();
		assertTrue(Towerimage.isEnabled());		
	}
	
	public void VerifyTextMessage() {
		// TODO Auto-generated method stub
		JavascriptExecutor js=(JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0,300)");
		SubmitButton.click();
		//assertTrue(msgbox.isEnabled());	
		String s=msgboxtext.getText();
		System.out.println("messsage text is"+s);
		assertTrue(s.contains("Are you sure you need to assign this task to"));
	}
	
	public void ClickOnCancleButton() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MessageBoxcanclebutton.click();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//msgbox.isEnabled();
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

	public WebElement getTowerCheckBox() {
		return TowerCheckBox;
	}

	public void setTowerCheckBox(WebElement towerCheckBox) {
		TowerCheckBox = towerCheckBox;
	}
}
