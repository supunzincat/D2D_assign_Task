package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import driverlaunch.LaunchWebDriver;
import pages.LoginPage;
import pages.MyTaskPage;

public class TCestMyTask {

	WebDriver d= LaunchWebDriver.WebdriverLaunch();
	
	@Test(priority=1)
	public void second() {
		// TODO Auto-generated method stubLoginPage Login= new LoginPage(d);
		
		LoginPage Login= new LoginPage(d);
		Login.LoginToWom();
	
}
	
	@Test(priority=2)
	public void Verify_Navigate_TO_MyTask() {
		// TODO Auto-generated method stub
	
//d.get("http://localhost/wom_v3/d2d/ClusterManager/view");
d.get("http://localhost/wom_v3/d2d/ClusterManager/view");
MyTaskPage mytask= new MyTaskPage(d);
mytask.SelectDistrict();
	}
	
	
}
