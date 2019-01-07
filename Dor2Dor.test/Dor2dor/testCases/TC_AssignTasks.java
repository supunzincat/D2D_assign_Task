package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import driverlaunch.LaunchWebDriver;
import pages.DshboardPage;
import pages.LoginPage;
import pages.TaskAssignPage;

public class TC_AssignTasks {
	
	WebDriver d=LaunchWebDriver.WebdriverLaunch();
	
	@Test(priority=1)
	public void TC_001_verify_User_Able_TO_Navigate_Dashboard() 
	{
		// TODO Auto-generated method stub
		LoginPage Login= new LoginPage(d);
		Login.LoginToWom();
	}
//	public void TC_001_verify_User_Able_TO_Navigate_Dashboard2() 
//	{
//		// TODO Auto-generated method stub
//		LoginPage Login= new LoginPage(d);
//		Login.LoginToWom("abc", "xyz");
//	}
	
	
	@Test(priority=2)
public void TC_002_Verify_navigateTo_assignTask() {
	// TODO Auto-generated method stub
		DshboardPage dashbord= new DshboardPage(d);
		dashbord.NavigateToasignTask();
		d.findElement(By.xpath("//select[@id='depot']")).isEnabled();
}
	
	
	
	
	@Test(priority=3)
	public void TC003_VerifyIs_District_DropdownEnabled() {
		// TODO Auto-generated method stub
		TaskAssignPage taskAssign= new TaskAssignPage(d);
		taskAssign.VerifyIsDistrictDropdownEnabled();

	}
		
	@Test(priority=4)
	public void TC004_VerifyIs_Territory_DropdownEnabled() {
		// TODO Auto-generated method stub
		TaskAssignPage taskAssign= new TaskAssignPage(d);
		taskAssign.VerifyIsTerritoryDropdownEnabled();

	}
	
	
	@Test(priority=5)
	public void TC005_VerifyIs_GNDivisions_DropdownEnabled() {
		// TODO Auto-generated method stub
		TaskAssignPage taskAssign= new TaskAssignPage(d);
		taskAssign.VerifyIsGNDivisionsDropdownEnabled();
	}
	
	
	@Test(priority=6)
	public void TC006_VerifyIs_Towers_DropdownEnabled() {
		// TODO Auto-generated method stub
		TaskAssignPage taskAssign= new TaskAssignPage(d);
		//taskAssign.VerifyIsTowersDropdownEnabled();
		taskAssign.verifytowerDDenable();
	}
	

	

	
	@Test(priority=7)
	public void TC007_select_districtValue() {
		// TODO Auto-generated method stub
		TaskAssignPage taskAssign= new TaskAssignPage(d);
		taskAssign.selectDistrict();
	}
	
	
	@Test(priority=8)
	public void TC_008_select_Terriotorry() {
		// TODO Auto-generated method stub
		TaskAssignPage taskAssign= new TaskAssignPage(d);
		taskAssign.selectTerriotarry();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority=9)
	private void TC_009_Verify_select_GN_Division() {
		// TODO Auto-generated method stub
		TaskAssignPage taskAssign= new TaskAssignPage(d);
		taskAssign.selectGNDivision();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	@Test(priority=10)
	public void Tc_010_verify_selectofFirstDate() {
		// TODO Auto-generated method stub
		TaskAssignPage taskAssign= new TaskAssignPage(d);
		taskAssign.SelectStartdate();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(priority=11)
	public void Tc_011_verify_select_LastDate() {
		// TODO Auto-generated method stub
		TaskAssignPage taskAssign= new TaskAssignPage(d);
		taskAssign.SelectEnddate();
		
	}
	
	@Test(priority=012)
	public void Tc_12_verify_Click_tower_Check_Box() {
		// TODO Auto-generated method stub
		TaskAssignPage taskAssign= new TaskAssignPage(d);
		taskAssign.ClickonToweCheckBox();
		//taskAssign.TowerCheckBox.cl
		
	}
	
	@Test(priority=13)
	public void Tc_013_verify_Confirm_message() {
		// TODO Auto-generated method stub
		TaskAssignPage taskAssign= new TaskAssignPage(d);
		taskAssign.VerifyTextMessage();
		
	}
	
	@Test(priority=14)
	public void Tc_014_verify_Cancle_Submission() {
		// TODO Auto-generated method stub
		TaskAssignPage taskAssign= new TaskAssignPage(d);
		taskAssign.ClickOnCancleButton();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	@Test(priority=15)
	public void Tc_015_verify_SubmitSuccessFully() {
		// TODO Auto-generated method stub
		TaskAssignPage taskAssign= new TaskAssignPage(d);
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
System.out.println("qiiiit");
d.get("http://wom/v3staging/d2d/SingleTask/manage/4");

	}
	
	
	
}
