package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import driverlaunch.LaunchWebDriver;
import pages.LoginPage;
import pages.ViewTaskPage;

public class ViewSpecificTask {

	public class TesClass {
		
		WebDriver driver= LaunchWebDriver.WebdriverLaunch();
		
		@Test(priority=1)
		public void TC001_verify_NavigateToEdittaskScreen() {
			LoginPage Login= new LoginPage(driver);
			Login.LoginToWom();		
			//driver.get("http://wom/v3staging/d2d/SingleTask/manage/4");
			//ViewTaskPage viewtask= new ViewTaskPage(driver);
		
		}
		
		
		
		@Test(priority=2)
		public void TC002_verify_DistrictDD_Is_Disabled() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://wom/v3staging/d2d/SingleTask/manage/4");
			ViewTaskPage viewtask= new ViewTaskPage(driver);
			viewtask.VerifyDistrictISDisabled();
			
		}
		
		@Test(priority=3)
		public void TC003_verify_Verify_TerriotorryDD_Is_Disabled() {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			ViewTaskPage viewtask= new ViewTaskPage(driver);
			viewtask.TerriotorryISDisabled();
			
		}
		
		@Test(priority=4)
		public void TC004_verify_Verify_DDGNDivisions_IS_Disabled() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			ViewTaskPage viewtask= new ViewTaskPage(driver);
			viewtask.VerifyDDGNDivisionDisabled();
			
		}
		
		@Test(priority=5)
		public void TC005_verify_VerifyDDStartdateISEnabled_Is_Disabled() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			ViewTaskPage viewtask= new ViewTaskPage(driver);
			viewtask.VerifyDDStartdateISDisabled();
			
		}
		
		@Test(priority=6)
		public void TC006_verify_VerifyDDEnddateISEnabled_Is_Disabled() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			ViewTaskPage viewtask= new ViewTaskPage(driver);
			viewtask.VerifyDDEnddateISDisabled();
			
		}
		
		@Test(priority=7)
		public void TC007_VerifyTowersCheckboxISEnabled_Is_Disabled() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			ViewTaskPage viewtask= new ViewTaskPage(driver);
			viewtask.VerifyTowersCheckboxISDisabled();
			
		}
		
		@Test(priority=8)
		public void TC008_VerifyDDTowersIs_Disaled() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			ViewTaskPage viewtask= new ViewTaskPage(driver);
			viewtask.VerifyDDTowersDropdownISDisabled();
			
		}
		
		@Test(priority=9)
		public void TC009_VerifyTextBoxRemarksTexIS_disabled() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			ViewTaskPage viewtask= new ViewTaskPage(driver);
			viewtask.VerifyTextBoxRemarksTexDisabled();
			
		}
		

		
		@Test(priority=10)
		public void TC0011_verify_DistrictDD_Is_Disabled_after_click_On_EDit() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//			driver.get("http://wom/v3staging/d2d/SingleTask/manage/4");
//			ViewTaskPage viewtask= new ViewTaskPage(driver);
//			viewtask.VerifyDistrictISDisabled();
			//TC002_verify_DistrictDD_Is_Disabled();
			ViewTaskPage viewtask= new ViewTaskPage(driver);
			viewtask.VerifyDistrictISDisabled();
			
			
		}
		
		@Test(priority=11)
		public void TC0012_verify_Terriotorry_Is_Disabled_after_click_On_EDit() {
			TC003_verify_Verify_TerriotorryDD_Is_Disabled();
			ViewTaskPage viewtask= new ViewTaskPage(driver);
			viewtask.ClickOneditButton();
			viewtask.TerriotorryISDisabled();
		}
		
		@Test(priority=12)
		public void TC013_verify_GNDivision_DD_is_enabled_after_click_on_Edit_Button(){
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			ViewTaskPage viewtask= new ViewTaskPage(driver);
			viewtask.VerifyGNDivisionISEnabled();			
		}
		
		@Test(priority=13)
		private void TC014_VerifyStartDateIsEnabled_AftretClickOnEditButto() {
			// TODO Auto-generated method stub
			ViewTaskPage viewtask= new ViewTaskPage(driver);
			viewtask.VerifyStartDateIsEnabled();
		}
		
		@Test(priority=14)
		private void Verify_End_Date_Is_Enabled_AftretClick_On_EditButto() {
			// TODO Auto-generated method stub
			ViewTaskPage viewtask= new ViewTaskPage(driver);
			viewtask.VerifyEndDateIsEnabled();
		}
		
		@Test(priority=15)
		private void Verify_tower_CheckBox_is_enabled_after_click_on_edit_button() {
			// TODO Auto-generated method stub
			ViewTaskPage viewtask= new ViewTaskPage(driver);
			viewtask.VerifyTowersCheckboxISEnabled();
		}
		@Test(priority=16)
		private void Verify_tower_Dropdown_is_enabled_after_click_on_edit_button() {
			// TODO Auto-generated method stub
			ViewTaskPage viewtask= new ViewTaskPage(driver);
			viewtask.VerifyTowersDropDownISEnabled();
		}
		
		@Test(priority=17)
		public void TC010_VerifyTextBoxRemarksTexISEnabled_Is_enableAfterClick() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			ViewTaskPage viewtask= new ViewTaskPage(driver);
			viewtask.VerifyTextBoxRemarksTexISEnabled();
			
		}
	
}
	}
