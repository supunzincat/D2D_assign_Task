package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import driverlaunch.LaunchWebDriver;
import pages.DshboardPage;
import pages.LoginPage;
import pages.MyTaskPage;

public class TCestMyTask {

	WebDriver d= LaunchWebDriver.WebdriverLaunch();
	
	@Test(priority=1)
	public void Verify_navigate_To_MY_Task() {
		// TODO Auto-generated method stubLoginPage Login= new LoginPage(d);
		
		LoginPage Login= new LoginPage(d);
		Login.LoginToWom();	
}
	
	@Test(priority=2)
	public void Verify_Navigate_TO_MyTask() {
		// TODO Auto-generated method stub
		DshboardPage dashbord= new DshboardPage(d);
		dashbord.ClickOnDortoDor();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dashbord.NavigteToMyTask();
//d.get("http://wom/v3staging/d2d/ClusterManager/view");
//d.get("http://localhost/wom_v3/d2d/ClusterManager/view");


	}
	@Test(priority=2)
	public void Verify_select_StartDate() {
		// TODO Auto-generated method stub
		MyTaskPage mytask= new MyTaskPage(d);
		mytask.selectStartDate();
		mytask.verifyStartDate();
	}
	
	@Test(priority=3)
	public void Verify_select_endDate() {
		// TODO Auto-generated method stub
		MyTaskPage mytask= new MyTaskPage(d);
		mytask.EndDate();
		mytask.verifyEndDate();
		
	}
	
	@Test(priority=4)
	public void Verify_select_District() {
		// TODO Auto-generated method stub
		MyTaskPage mytask= new MyTaskPage(d);
		mytask.SelectDistrict();
		mytask.verifyDistrictValue();
	}
	
	@Test(priority=5)
	public void vrify_select_Territorry() {
		// TODO Auto-generated method stub
		MyTaskPage mytask= new MyTaskPage(d);
		mytask.SelectTerritorry();
		mytask.VerifyTerritorryValue();
	}
	@Test(priority=6)
	public void Verify_select_Status() {
		// TODO Auto-generated method stub
		MyTaskPage mytask= new MyTaskPage(d);
		mytask.SelectStaus();
mytask.VerifyStatusyValue();
	}
	
	@Test(priority=7)
	public void Verify_click_sublit() {
		// TODO Auto-generated method stub
		MyTaskPage mytask= new MyTaskPage(d);
mytask.verifySelctButton();
	}
	
	@Test(priority=8)
	public void Verify_Table_View() {
		// TODO Auto-generated method stub
		MyTaskPage mytask= new MyTaskPage(d);
mytask.IsTableviewEnabled();
	}
	
	@Test(priority=9)
	public void Verify_Grid_View() {
		// TODO Auto-generated method stub
		MyTaskPage mytask= new MyTaskPage(d);
mytask.IsGridviewEnabled();
	}
	
}
