package pages;

import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.awt.Button;
import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ViewTaskPage {
	WebDriver d;
	
	public ViewTaskPage(WebDriver d) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(d, this);
		this.d=d;
	}

	@FindBy(how=How.XPATH,using="//*[@id='districts_filter_rightbar']") WebElement DDDistrict;
	@FindBy(how=How.XPATH,using="//*[@id='territory_filter_rightbar']") WebElement DDTerriotorry;
	@FindBy(how=How.XPATH,using="//*[@id='gn_divisions_on_filter_form']") WebElement DDGNDivisions;
	
	@FindBy(how=How.XPATH,using="//*[@id='sdate']") WebElement DDStartdate;
	
	@FindBy(how=How.XPATH,using="//*[@id='edate']") WebElement DDEnddate;
	
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[6]/label/span") WebElement CheckBoxTowers;
	@FindBy(how=How.XPATH,using="//*[@id='js-filter_map_towers']") WebElement TowersDropdown;
	
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[6]/div/div") WebElement DDTowers;
	
	@FindBy(how=How.XPATH,using="//*[@id='remarks']") WebElement TextBoxRemarksTex;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[8]/div/div/div/div/button[3]") WebElement EditButton;
	
	
	
	public void DropDownisenable(WebElement element) {
		// TODO Auto-generated method stub
		//boolean isDisplayed= classes.contains("btn dropdown-toggle disabled");
	
//element.isEnabled();
	}
	
	
	public void VeriffDDNotEnabled(WebElement DDElement) {
		// TODO Auto-generated method stub
		//d.get("http://wom/v3staging/d2d/SingleTask/manage/4");
		String isdissable= DDElement.getAttribute("disabled");
		boolean isDisplayed1= isdissable.contains("true");
		assertTrue(isDisplayed1);

	}
	
	public void VeriffDDEnabled(WebElement DDElement) {
		// TODO Auto-generated method stub
		//d.get("http://wom/v3staging/d2d/SingleTask/manage/4");
		String isdissable= DDElement.getAttribute("disabled");
		//boolean isDisplayed1= isdissable.contains(null);
		assertNull(isdissable);

	}
	
	public void verifycheckboxisenable(WebElement DDElement) {
		// TODO Auto-generated method stub
DDElement.isEnabled();
	}
		
	public void VerifyDistrictISEnabled() {
		// TODO Auto-generated method stub
		VeriffDDNotEnabled(DDDistrict);
	}
	
	public void TerriotorryISEnabled() {
		// TODO Auto-generated method stub
		VeriffDDNotEnabled(DDTerriotorry);
	}
	
	public void VerifyDDGNDivisionsISEnabled() {
		// TODO Auto-generated method stub
		VeriffDDNotEnabled(DDGNDivisions);
	}
	
	public void VerifyDDStartdateISEnabled() {
		// TODO Auto-generated method stub
		VeriffDDNotEnabled(DDStartdate);
	}
	
	public void VerifyDDEnddateISEnabled() {
		// TODO Auto-generated method stub
		VeriffDDNotEnabled(DDEnddate);
	}
	public void VerifyDDTowersISEnabled() {
		// TODO Auto-generated method stub
		verifycheckboxisenable(CheckBoxTowers);
	}
	
	public void VerifyDDTowersDropdownISEnabled() {
		// TODO Auto-generated method stub
		verifycheckboxisenable(TowersDropdown);
	}
	
	public void VerifyTextBoxRemarksTexNotEnabled() {
		// TODO Auto-generated method stub
		VeriffDDNotEnabled(TextBoxRemarksTex);
	}
	
	public void ClickOnButtons(WebElement ButtonName) {
		// TODO Auto-generated method stub
ButtonName.click();
	}
	
	public void ClickOneditButton() {
		// TODO Auto-generated method stub
		ClickOnButtons(EditButton);
	}
	
	public void VerifyTextBoxRemarksTexISEnabled() {
		// TODO Auto-generated method stub
		VeriffDDEnabled(TextBoxRemarksTex);
	}
	
}
