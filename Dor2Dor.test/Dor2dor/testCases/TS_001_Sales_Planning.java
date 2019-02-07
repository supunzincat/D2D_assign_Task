package testCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Config.LaunchWebDriver;
import pages.DshboardPage;
import pages.LoginPage;
import pages.SalesPlanningPage;
import pages.SalesPlanningPage.Status;

public class TS_001_Sales_Planning {
	
	WebDriver d=LaunchWebDriver.WebdriverLaunch();
	DshboardPage dashbord= new DshboardPage(d);
	SalesPlanningPage taskAssign= new SalesPlanningPage(d);
	@Test(priority=1)
	public void TC_001_verify_User_Able_TO_Navigate_Dashboard() throws IOException 
	{
		// TODO Auto-generated method stub
		LoginPage Login= new LoginPage(d);
		Login.LoginToWom();
	}

	
	@Test(priority=2)
		public void TC_002_Verify_navigateTo_SalesPlanning() {
		// TODO Auto-generated method stub
		DshboardPage dashbord= new DshboardPage(d);
		dashbord.NavigateToSalesPlanning();
		//d.findElement(By.xpath("//select[@id='depot']")).isEnabled();
}
	
	
	
	@Test(priority=3)
public void TC_003_Verify_District_Lable() throws IOException {
	// TODO Auto-generated method stub
		dashbord.verifyDistrictLable();
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
	public void TC010_VerifyIs_District_DropdownEnabled() {
		// TODO Auto-generated method stub
		SalesPlanningPage taskAssign= new SalesPlanningPage(d);
		taskAssign.VerifyIsDistrictDropdownEnabled();

	}
		
	@Test(priority=11)
	public void TC011_VerifyIs_Territory_DropdownEnabled() {
		// TODO Auto-generated method stub
		SalesPlanningPage taskAssign= new SalesPlanningPage(d);
		taskAssign.VerifyIsTerritoryDropdownEnabled();
	}
	
	
	@Test(priority=12)
	public void TC012_VerifyIs_GNDivisions_DropdownEnabled() {
		// TODO Auto-generated method stub
		SalesPlanningPage taskAssign= new SalesPlanningPage(d);
		taskAssign.VerifyIsGNDivisionsDropdownEnabled();
	}
	
	
	@Test(priority=13)
	public void TC013_VerifyIs_Towers_DropdownEnabled() {
		// TODO Auto-generated method stub
		SalesPlanningPage taskAssign= new SalesPlanningPage(d);
		//taskAssign.VerifyIsTowersDropdownEnabled();
		taskAssign.verifytowerDDStatus(Status.disble);
	}

	
	@Test(priority=14)
	public void TC014_select_districtValue() throws IOException {
		// TODO Auto-generated method stub
		//SalesPlanningPage taskAssign= new SalesPlanningPage(d);
		taskAssign.verifySelectedDistrict();
	}
	
	
	@Test(priority=15)
	public void TC_015_select_Terriotorry() throws IOException {
		// TODO Auto-generated method stub
		//SalesPlanningPage taskAssign= new SalesPlanningPage(d);
		taskAssign.verifySelectedTerriotarry();
	}

	
	@Test(priority=16)
	private void TC_016_Verify_select_GN_Division() throws IOException {
		// TODO Auto-generated method stub
		taskAssign.verifySelectedselectGNDivision();
	}
	
	
	@Test(priority=17)
	public void Tc_017_verify_select_StarttDate() throws IOException {
		// TODO Auto-generated method stub
		SalesPlanningPage taskAssign= new SalesPlanningPage(d);
		taskAssign.verifyselectStartdate();
		}
	
	
	@Test(priority=18)
	public void Tc_0181_verify_select_EndDate() throws IOException {
		// TODO Auto-generated method stub
		SalesPlanningPage taskAssign= new SalesPlanningPage(d);
		taskAssign.verifySelectEnddate();
		}
	
	
	@Test(priority=19)
	public void Tc_19_verify_Click_tower_Check_Box() {
		// TODO Auto-generated method stub
	//	SalesPlanningPage taskAssign= new SalesPlanningPage(d);

		taskAssign.verifytowerDDStatus(Status.disble);
		taskAssign.ClickonToweCheckBox();
		//taskAssign.TowerCheckBox.cl
		taskAssign.verifytowerDDStatus(Status.enable);
		
	}
	
	@Test(priority=20)
	public void Tc_020_verify_Confirm_message() throws IOException {
		// TODO Auto-generated method stub
		taskAssign.VerifyTextMessage();
		
	}
	
	@Test(priority=21)
	public void Tc_021_verify_Cancle_Submission() {
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
	
	
	@Test(priority=22)
	public void Tc_022_verify_SubmitSuccessFully() {
		// TODO Auto-generated method stub
		SalesPlanningPage taskAssign= new SalesPlanningPage(d);
		taskAssign.MessageBoxcSubmitbutton();
		
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
	
	
	
	@Test(priority=16)
	public void close() {
		// TODO Auto-generated method stub
//d.quit();
//System.out.println("qiiiit");
//d.get("http://wom/v3staging/d2d/SingleTask/manage/4");

	}
	
	
	
}
