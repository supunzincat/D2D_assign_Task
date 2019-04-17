package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import config.LaunchWebDriver;
import pages.DshboardPage;
import pages.LoginPage;
import pages.Page_SubtaskListView;
import proxy.verifications;

public class TS005__AgentTaskView {
WebDriver driver= LaunchWebDriver.WebdriverLaunch();
Page_SubtaskListView subtask= new Page_SubtaskListView(driver);


@Test(priority=1)
public void TC001_Verify_Navigate_TO_SubtaskList() throws IOException {
	// TODO Auto-generated method stub
	LoginPage log= new LoginPage(driver);
	log.LoginToWom();
	DshboardPage dsh= new DshboardPage(driver);
	dsh.ClickOnDortoDor();
	dsh.NavigatwToAgentTaskPage();

}


@Test(priority=2)
public void TC002_Verify_SelectStartDate() throws IOException {
	// TODO Auto-generated method stub
	Page_SubtaskListView subtask= new Page_SubtaskListView(driver);
	subtask.selectStartDate();
//	subtask.selectALLDropdownValues();
//	subtask.submit();
//	subtask.verifyselectedvalue();
////selectALLDropdownValues
}
	
@Test(priority=3)
public void TC003_Verify_SelectEndDate() throws IOException {
	// TODO Auto-generated method stub
	//Page_SubtaskListView subtask= new Page_SubtaskListView(driver);
	subtask.selectEndDate();
	
	
	//subtask.verifyselectedvalue();
//selectALLDropdownValues
}


@Test(priority=3)
public void TC003_Verify_SelectTerritory() throws IOException {
	// TODO Auto-generated method stub
	//Page_SubtaskListView subtask= new Page_SubtaskListView(driver);
	subtask.verifyTerritory();
	
	//subtask.submit();
	//subtask.verifyselectedvalue();
//selectALLDropdownValues
}

	@Test(priority=3)
	public void TC003_Verify_view_subtask_popup() throws IOException {
		//when user click on sub task link sub task popup should be display
		//Page_SubtaskListView subtask= new Page_SubtaskListView(driver);
		subtask.submit();
		subtask.ClickonSutask();
		subtask.verifyTerritory();
		}
	
	@Test(priority=4)
	public void TC004_Verify_subtask_Name () {
		//when user click on sub task link sub task popup should be display
		Page_SubtaskListView subtask= new Page_SubtaskListView(driver);
		subtask.verifyTaskname();
		}
}
