package testCases;
import java.io.IOException;
import java.sql.SQLException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import config.LaunchWebDriver;
import pages.DashboardPage;
import pages.LoginPage;
import pages.SalesPlanningPage;
import pages.SalesPlanningPage.Status;

public class TS_001_Sales_Planning {
	
	WebDriver d=LaunchWebDriver.WebdriverLaunch();
	DashboardPage dashbord= new DashboardPage(d);
	SalesPlanningPage taskAssign= new SalesPlanningPage(d);
	
	@BeforeTest
	public void LoginTowom() throws IOException 
	{
		// TODO Auto-generated method stub
		LoginPage Login= new LoginPage(d);
		Login.LoginToWom();
	}
	
	@Test(priority=1)
	public void TC_001_Verify_navigateTo_SalesPlanning() throws ClassNotFoundException, SQLException {
		//// TODO Auto-generated method stub
		DashboardPage dashbord= new DashboardPage(d);
		dashbord.NavigateToSalesPlanning();
}
//
	@Test(priority=3)
	public void TC_003_Verify_District_Lable() throws IOException, ClassNotFoundException, SQLException {
	// TODO Auto-generated method stub
	//dashbord.verifyAllTheDistrictdropdownValues();
	dashbord.verifyDistrictLable();
	//taskAssign.dbconnection();
		}
	
	@Test(priority=4)
	public void TC_004_Verify_TerriTory_Lable() throws IOException {
	// TODO Auto-generated method stub
		dashbord.verifyTerritoryLable();
		}
		
	@Test(priority=5)
	public void TC_005_Verify_GnDivision_Lable() throws IOException {
	// TODO Auto-generated method stub
		dashbord.verifyGNDivisionLable();
		}
		
	@Test(priority=6)
	public void TC_006_Verify_StartDate_Lable() throws IOException {
		// TODO Auto-generated method stub
			dashbord.verifyStartDateLable();
			}
		
	@Test(priority=7)
	public void TC_007_Verify_EndDate_Lable() throws IOException {
		// TODO Auto-generated method stub
			dashbord.verifyEndDateLable();
			}
		
	@Test(priority=8)
	public void TC_008_Verify_Tower_Lable() throws IOException {
		// TODO Auto-generated method stub
			dashbord.verifyTowerLable();
			}	
	
	@Test(priority=9)
	public void TC_009_Verify_Remarks_Lable() throws IOException {
		// TODO Auto-generated method stub
			dashbord.verifyRemarksLable();
			}

	@Test(priority=10)
	public void TC_010_VerifyIs_District_DropdownEnabled() {
		// TODO Auto-generated method stub
		SalesPlanningPage taskAssign= new SalesPlanningPage(d);
		taskAssign.VerifyIsDistrictDropdownEnabled();
	}
	
	@Test(priority=11)
	public void TC_011_VerifyIs_Territory_DropdownEnabled() {
		// TODO Auto-generated method stub
		SalesPlanningPage taskAssign= new SalesPlanningPage(d);
		taskAssign.VerifyIsTerritoryDropdownEnabled();
	}
	
	@Test(priority=12)
	public void TC_012_VerifyIs_GNDivisions_DropdownEnabled() {
		// TODO Auto-generated method stub
		SalesPlanningPage taskAssign= new SalesPlanningPage(d);
		taskAssign.VerifyIsGNDivisionsDropdownEnabled();
	}
	
	@Test(priority=13)
	public void TC_013_VerifyIs_Towers_DropdownEnabled() {
		// TODO Auto-generated method stub
		SalesPlanningPage taskAssign= new SalesPlanningPage(d);
		//taskAssign.VerifyIsTowersDropdownEnabled();
		taskAssign.verifytowerDDStatus(Status.disble);
	}
	
	//this will verify the all values in the dd
	@Test(priority=14)
	public void TC_0014_verifyDistrictvalues() {
		// TODO Auto-generated method stub
		dashbord.verifyAllTheDistrictdropdownValues();
	}
		
	@Test(priority=15)
	public void TC_015_select_districtValue() throws IOException {
		// TODO Auto-generated method stub
		//SalesPlanningPage taskAssign= new SalesPlanningPage(d);
		taskAssign.verifySelectedDistrict();
	}

	
	@Test(priority=16)
	public void TC_016_verifyTerritoryvalues() {
		// TODO Auto-generated method stub
		dashbord.verifyAllTheTerritorrdropdownValues();
	}
	
	@Test(priority=17)
	public void TC_017_select_Terriotorry() throws IOException {
		// TODO Auto-generated method stub
		//SalesPlanningPage taskAssign= new SalesPlanningPage(d);
		taskAssign.verifySelectedTerriotarry();
	}
		
	@Test(priority=18)
	private void TC_018_Verify_select_GN_Division() throws IOException {
		// TODO Auto-generated method stub
		taskAssign.verifySelectedselectGNDivision();
	}
	
	@Test(priority=19)
	public void TC_019_verify_select_StarttDate() throws IOException {
		// TODO Auto-generated method stub
		SalesPlanningPage taskAssign= new SalesPlanningPage(d);
		taskAssign.verifyselectStartdate();
		}
	
	@Test(priority=20)
	public void TC_020_verify_select_EndDate() throws IOException {
		// TODO Auto-generated method stub
		SalesPlanningPage taskAssign= new SalesPlanningPage(d);
		taskAssign.verifySelectEnddate();
		}
	
	@Test(priority=21)
	public void TC_021_verify_Click_tower_Check_Box() {
		// TODO Auto-generated method stub
	//	SalesPlanningPage taskAssign= new SalesPlanningPage(d);

		taskAssign.verifytowerDDStatus(Status.disble);
		taskAssign.ClickonToweCheckBox();
		//taskAssign.TowerCheckBox.cl
		taskAssign.verifytowerDDStatus(Status.enable);
		
	}
	
	@Test(priority=22)
	public void TC_022_verify_Confirm_message() throws IOException {
		// TODO Auto-generated method stub
		taskAssign.VerifyTextMessage();
		}
	
	@Test(priority=23)
	public void TC_023_verify_Cancle_Submission() {
		// TODO Auto-generated method stub
	//	SalesPlanningPage taskAssign= new SalesPlanningPage(d);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		taskAssign.ClickOnCancleButton();
		
	}
	
	@Test(priority=24)
	public void TC_024_verify_SubmitSuccessFully() {
		// TODO Auto-generated method stub
		SalesPlanningPage taskAssign= new SalesPlanningPage(d);
		taskAssign.MessageBoxcSubmitbutton();
		}
	
	@Test(priority=25)
	public void TC_025_districtValue() throws IOException {
		// TODO Auto-generated method stub
		//SalesPlanningPage taskAssign= new SalesPlanningPage(d);
		taskAssign.verifyDistrictDropdownValues();
	}
	
//	@Test(priority=11)
//	public void SELECTEDIS() {
//		// TODO Auto-generated method stub
//		TaskAssignPage taskAssign= new TaskAssignPage(d);
//		taskAssign.VerifyIsDistrictDropdownEnabled();
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
		
	@Test(priority=26)
	public void close() {
		// TODO Auto-generated method stub
//d.quit();
//System.out.println("qiiiit");
//d.get("http://wom/v3staging/d2d/SingleTask/manage/4");

	}
		
}
