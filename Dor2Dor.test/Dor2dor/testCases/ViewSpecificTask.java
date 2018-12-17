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
		public void TC001_verify_District_Is_enable() {
			LoginPage Login= new LoginPage(driver);
			Login.LoginToWom();			
		
		}
		
		
		
		@Test(priority=2)
		public void TC002_verify_District_Is_enable() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://wom/v3staging/d2d/SingleTask/manage/4");
			ViewTaskPage viewtask= new ViewTaskPage(driver);
			viewtask.VerifyDistrictISEnabled();
			
		}
		
		@Test(priority=3)
		public void TC003_verify_VerifyDDTerriotorryISEnabled_Is_enable() {
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			ViewTaskPage viewtask= new ViewTaskPage(driver);
			viewtask.TerriotorryISEnabled();
			
		}
		
		@Test(priority=4)
		public void TC004_verify_VerifyDDGNDivisionsISEnabled_Is_enable() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			ViewTaskPage viewtask= new ViewTaskPage(driver);
			viewtask.VerifyDDGNDivisionsISEnabled();
			
		}
		
		@Test(priority=5)
		public void TC005_verify_VerifyDDStartdateISEnabled_Is_enable() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			ViewTaskPage viewtask= new ViewTaskPage(driver);
			viewtask.VerifyDDStartdateISEnabled();
			
		}
		
		@Test(priority=6)
		public void TC006_verify_VerifyDDEnddateISEnabled_Is_enable() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			ViewTaskPage viewtask= new ViewTaskPage(driver);
			viewtask.VerifyDDEnddateISEnabled();
			
		}
		
		@Test(priority=7)
		public void TC007_VerifyTowersCheckboxISEnabled_Is_enable() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			ViewTaskPage viewtask= new ViewTaskPage(driver);
			viewtask.VerifyDDTowersISEnabled();
			
		}
		
		@Test(priority=8)
		public void TC008_VerifyDDTowersISEnabled_Is_enable() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			ViewTaskPage viewtask= new ViewTaskPage(driver);
			viewtask.VerifyDDTowersDropdownISEnabled();
			
		}
		
		@Test(priority=9)
		public void TC009_VerifyTextBoxRemarksTexISEnabled_Is_enable() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			ViewTaskPage viewtask= new ViewTaskPage(driver);
			viewtask.VerifyTextBoxRemarksTexNotEnabled();
			
		}
		
		@Test(priority=10)
		public void TC010_VerifyTextBoxRemarksTexISEnabled_Is_enableAfterClick() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			ViewTaskPage viewtask= new ViewTaskPage(driver);
			viewtask.ClickOneditButton();
			viewtask.VerifyTextBoxRemarksTexISEnabled();
			
		}
}
	}
