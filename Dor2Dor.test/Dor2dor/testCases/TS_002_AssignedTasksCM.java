package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

//import Config.LaunchWebDriver;
import pages.DshboardPage;
import pages.LoginPage;
import pages.AssignedTaskedPage;

public class TS_002_AssignedTasksCM {
WebDriver d= config.LaunchWebDriver.WebdriverLaunch();
	
	AssignedTaskedPage mytask= new AssignedTaskedPage(d);
	
	@Test(priority=1)
	public void TC_001_Verify_navigate_To_wom() throws IOException {
		// TODO Auto-generated method stubLoginPage Login= new LoginPage(d);
		LoginPage Login= new LoginPage(d);
		Login.LoginToWom();	
		}
	
	@Test(priority=2)
	public void TC_002_Verify_Navigate_TO_MyTask() {
		// TODO Auto-generated method stub
		DshboardPage dashbord= new DshboardPage(d);
		dashbord.ClickOnDortoDor();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dashbord.NavigteToAssignedTasks();
//d.get("http://wom/v3staging/d2d/ClusterManager/view");
//d.get("http://localhost/wom_v3/d2d/ClusterManager/view");


	}
	
	@Test(priority=3)
	public void TC_003_verify_SartFrom_Lable() throws IOException {
		// TODO Auto-generated method stub
		//AssignedTaskedPage mytask= new AssignedTaskedPage(d);
		mytask.VerifyStartFromLable();
	}
	
	
	@Test(priority=4)
	public void TC_004_verify_EndDate_Lable() throws IOException {
		// TODO Auto-generated method stub
		//AssignedTaskedPage mytask= new AssignedTaskedPage(d);
		mytask.verifyEndDateLable();
	}
	
	@Test(priority=5)
	public void TC_005_verify_District_Lable() throws IOException {
		// TODO Auto-generated method stub
		//AssignedTaskedPage mytask= new AssignedTaskedPage(d);
		mytask.verifyDistrictLable();
	}
	
	
	@Test(priority=6)
	public void TC_006_verify_Territory_Lable() throws IOException {
		// TODO Auto-generated method stub
		//AssignedTaskedPage mytask= new AssignedTaskedPage(d);
		mytask.verifyTerritoryLable();
	}
	
	@Test(priority=7)
	public void TC_007_verify_Status_Lable() throws IOException {
		// TODO Auto-generated method stub
		//AssignedTaskedPage mytask= new AssignedTaskedPage(d);
		mytask.verifyStatusLable();
	}
	
	
	@Test(priority=8)
	public void TC_008_Verify_select_StartDate() throws IOException {
		// TODO Auto-generated method stub
		//AssignedTaskedPage mytask= new AssignedTaskedPage(d);
		mytask.VerifyStartDate();
		
	}
	
	@Test(priority=9)
	public void TC_009_Verify_select_endDate() throws IOException {
		// TODO Auto-generated method stub
		//AssignedTaskedPage mytask= new AssignedTaskedPage(d);
		mytask.verifyEndDate();
		//mytask.verifyEndDate();
		
	}
	
	@Test(priority=10)
	public void TC_010_Verify_select_District() throws IOException {
		// TODO Auto-generated method stub
		//AssignedTaskedPage mytask= new AssignedTaskedPage(d);
		mytask.verifySelectDistrict();
	//	mytask.verifyDistrictValue();
	}
	
	@Test(priority=11)
	public void TC_011_vrify_select_Territorry() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//AssignedTaskedPage mytask= new AssignedTaskedPage(d);
		mytask.SelectTerritorry();
		mytask.VerifyTerritorryValue();
	}
	
	@Test(priority=12)
	public void TC_014_Verify_Multiselect_Functionlity_OF_District_Dropdown() throws IOException {
		// TODO Auto-generated method stub
		mytask.multiselectrDistrict();
	}
	
	
	@Test(priority=13)
	public void TC_012_Verify_select_Status() throws IOException {
		// TODO Auto-generated method stub
		//AssignedTaskedPage mytask= new AssignedTaskedPage(d);
		mytask.SelectStaus();
mytask.VerifyStatusyValue();
	}
	
	@Test(priority=14)
	public void TC_013_Verify_click_sublit() {
		// TODO Auto-generated method stub
		//AssignedTaskedPage mytask= new AssignedTaskedPage(d);
mytask.verifySelctButton();
	}
	
	
//	
//	public void TC_014_Verify_district_in_the_drop_down() {
//		// TODO Auto-generated method stub
//		mytask.verifyDropDownistInTheDistrict();
//	}
//	

	
	@Test(priority=15)
	public void TC_015_Verify_Table_View() {
		// TODO Auto-generated method stub
		//AssignedTaskedPage mytask= new AssignedTaskedPage(d);
		mytask.IsTableviewEnabled();
	}
	
	@Test(priority=16)
	public void TC_016Verify_Grid_View() {
		// TODO Auto-generated method stub
		//AssignedTaskedPage mytask= new AssignedTaskedPage(d);
mytask.IsGridviewEnabled();
	}
	
	@Test(priority=17)
	public void TC_017_uit() {
		// TODO Auto-generated method stub
//d.quit();
	}
	
}
