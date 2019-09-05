package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import config.LaunchWebDriver;
import pages.DashboardPage;
import pages.LoginPage;
import pages.TerritorryManagerTasks;
import proxy.verifications;

public class TS_003_TerritorryManagerTasks {
	WebDriver driver= LaunchWebDriver.WebdriverLaunch();

	@Test(priority=1)
	public void TC_001_Verify_Navigate_TO_Territorry_Manager_Task() throws IOException {
		//this will click on territorry manager link and navigate to territory manger Task
		LoginPage log= new LoginPage(driver);
		log.LoginToWom();
		DashboardPage dsh= new DashboardPage(driver);
		dsh.navigateToDortoDor();
		dsh.navigatetoTerritoryManagarTask();	
}
	
	@Test(priority=2)
	public void TC_002_verify_User() throws IOException {
		// TODO Auto-generated method stub
		TerritorryManagerTasks page= new TerritorryManagerTasks(driver);
		page.VerifyUsername();
		
		
	}
	
	@Test(priority=3)
	public void TC_003_verifNamw_Of_The_Page() throws IOException {
		// TODO Auto-generated method stub
		TerritorryManagerTasks page= new TerritorryManagerTasks(driver);
		page.VerifyNameOfThePage();
	}
	
	@Test(priority=4)
	public void TC_004_verify_Start_From_Date_Text() throws IOException {
		// TODO Auto-generated method stub
		TerritorryManagerTasks page= new TerritorryManagerTasks(driver);
		page.verifyLableOfStartdate();
	}
	
	@Test(priority=5)
	public void TC_005_verify_End_Date_text() throws IOException {
		// TODO Auto-generated method stub
		TerritorryManagerTasks page= new TerritorryManagerTasks(driver);
		page.VerifyEnddate();
	}
	
	@Test(priority=6)
	public void TC_006_verify_Territory_Text() throws IOException {
		// TODO Auto-generated method stub
		TerritorryManagerTasks page= new TerritorryManagerTasks(driver);
		page.VerifyTerritoryText();
	}
	
	@Test(priority=7)
	public void TC_007_verify_Status_Text() throws IOException {
		// TODO Auto-generated method stub
		TerritorryManagerTasks page= new TerritorryManagerTasks(driver);
		page.VerifyStatusText();
	}

	@Test(priority=8)
	public void TC_008_verif_OnlyExpiredTsks_Text() throws IOException {
		// TODO Auto-generated method stub
		TerritorryManagerTasks page= new TerritorryManagerTasks(driver);
		page.OnlyExpiredTaskText();
	}
	
	
	@Test(priority=9)
	public void TC_009_verif_EnerStarDate() throws IOException {
		// TODO Auto-generated method stub
		TerritorryManagerTasks page= new TerritorryManagerTasks(driver);
		page.validateEnteredStartDate();
	}
	
	@Test(priority=10)
	public void TC_010_verif_EnerEndDate() throws IOException {
		// TODO Auto-generated method stub
		TerritorryManagerTasks page= new TerritorryManagerTasks(driver);
		page.EnerEndDate();
	}
	
	
	@Test(priority=11)
	public void TC_011_verif_SelectTerritoryValue() throws IOException {
		// TODO Auto-generated method stub
		TerritorryManagerTasks page= new TerritorryManagerTasks(driver);
		page.selectTerritoryValueFromDropdown();
	}

	@Test(priority=12)
	public void verify_all_values_in_the_DD() {
		// TODO Auto-generated method stub
		TerritorryManagerTasks page= new TerritorryManagerTasks(driver);
		page.verifyallTerritorryDDValues();
	}
	
	@Test(priority=13)
	public void TC_012_verif_selectStatusValue() throws IOException {
		// TODO Auto-generated method stub
		TerritorryManagerTasks page= new TerritorryManagerTasks(driver);
		page.selectStatusValue();
	}
	
	
	@Test(priority=14)
	public void TC_013_verif_SubmitButton(){
		// TODO Auto-generated method stub
		TerritorryManagerTasks page= new TerritorryManagerTasks(driver);
		page.veriFySubmitButton();
	}
	
	@Test(priority=15)
	public void TC_014_verif_Defaultview(){
		// TODO Auto-generated method stub
		TerritorryManagerTasks page= new TerritorryManagerTasks(driver);
		page.verifyTableViewRadioButton();
	}
	
	@Test(priority=16)
	public void TC_015_verif_GridviewIsEnabled(){
		// TODO Auto-generated method stub
		TerritorryManagerTasks page= new TerritorryManagerTasks(driver);
		page.GridviewIsEnabled();
		//driver.quit();
	}
	
}