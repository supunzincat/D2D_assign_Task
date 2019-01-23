package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import driverlaunch.LaunchWebDriver;
import pages.DshboardPage;
import pages.LoginPage;
import pages.TerritorryManagerTasks;

public class TC_TerritorryManagerTasks {
	WebDriver driver= LaunchWebDriver.WebdriverLaunch();

	@Test(priority=1)
	public void TC001_Verify_Navigate_TO_Territorry_Manager_Task() throws IOException {
		//this will click on territorry manager link and navigate to territory manger Task
		LoginPage log= new LoginPage(driver);
		log.LoginToWom();
		DshboardPage dsh= new DshboardPage(driver);
		dsh.ClickOnDortoDor();
		dsh.navigatetoTerritoryManagarTask();	
}
	
	@Test(priority=2)
	public void TC_002_verify_User() {
		// TODO Auto-generated method stub
		TerritorryManagerTasks page= new TerritorryManagerTasks(driver);
		page.VeriUsername();
	}
	
	@Test(priority=3)
	public void TC_003_verify_header_text() {
		// TODO Auto-generated method stub
		TerritorryManagerTasks page= new TerritorryManagerTasks(driver);
		page.VerifyNameOfThePage();
	}
	
	@Test(priority=4)
	public void TC_004_verify_Start_From_Date_Text() {
		// TODO Auto-generated method stub
		TerritorryManagerTasks page= new TerritorryManagerTasks(driver);
		page.VerifyStartdate();
	}
	
	@Test(priority=5)
	public void TC_005_verify_End_Date_text() {
		// TODO Auto-generated method stub
		TerritorryManagerTasks page= new TerritorryManagerTasks(driver);
		page.VerifyEnddate();
	}
	
	@Test(priority=6)
	public void TC_006_verify_Territory_Text() {
		// TODO Auto-generated method stub
		TerritorryManagerTasks page= new TerritorryManagerTasks(driver);
		page.VerifyTerritoryText();
	}
	
	@Test(priority=7)
	public void TC_007_verify_Status_Text() {
		// TODO Auto-generated method stub
		TerritorryManagerTasks page= new TerritorryManagerTasks(driver);
		page.VerifyStatusText();
	}

}