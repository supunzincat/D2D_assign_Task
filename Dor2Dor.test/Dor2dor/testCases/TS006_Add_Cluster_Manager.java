package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.LaunchWebDriver;
import pages.AddClusterManagetPage;
import pages.DashboardPage;
import pages.LoginPage;

public class TS006_Add_Cluster_Manager {

	WebDriver d=LaunchWebDriver.WebdriverLaunch();
	DashboardPage dashboardPage= new DashboardPage(d);
	AddClusterManagetPage addculstermanaget=new AddClusterManagetPage(d);
	
	//Login to wom and navigate to door to door 
	@BeforeTest
	public void LoginTowom() throws IOException 
	{
		// TODO Auto-generated method stub
		LoginPage Login= new LoginPage(d);
		Login.LoginToWom();
		dashboardPage.navigateToDortoDor();
	}
	
	
	@Test(priority=1)
	public void Tc001_testquit() {
		// TODO Auto-generated method stub
		//dashboardPage.navigateToAddClusterManager();
		dashboardPage.navigateToAddClusterManagerqq();
//d.quit();
	}
	
	@Test(priority=2)
	public void Tc002_verify_Navigation_to_AddClusterManagerPage() {
		// TODO Auto-generated method stub
		dashboardPage.verifyNavigattoAddClusterManagerPage();
//Dnd.quit();
	}

	
	@Test(priority=3)
	public void TC_003_Verify_Display_of_popup() {
		// TODO Auto-generated method stub
		addculstermanaget.verifypopup();
//Dnd.quit();
	}
	
	@Test(priority=3)
	public void TC_003_Verify_All_DropdownValues() {
		// TODO Auto-generated method stub
		addculstermanaget.verifypopup();
//Dnd.quit();
	}
	
	@Test(priority=4)
private void TC_004_validate_popup_User_Name() throws IOException {
	// TODO Auto-generated method stub
		addculstermanaget.verifyUsername();
}
	@Test(priority=5)
	public void TC_005_Verify_erroeMessageForEmptySubmit() throws IOException {
		// TODO Auto-generated method stub
		addculstermanaget.verifyemptyerrormessage();
//Dnd.quit();
	}
}
