package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import driverlaunch.LaunchWebDriver;
import pages.DshboardPage;
import pages.LoginPage;
import pages.Page_SubtaskListView;

public class TC_ViewSubtaskList {
WebDriver driver= LaunchWebDriver.WebdriverLaunch();

@Test(priority=1)
public void TC001_Verify_Navigate_TO_SubtaskList() {
	// TODO Auto-generated method stub
	LoginPage log= new LoginPage(driver);
	log.LoginToWom();
	DshboardPage dsh= new DshboardPage(driver);
	dsh.ClickOnDortoDor();
	dsh.NavigateTOSelectSubtaskList();

}


@Test(priority=2)
public void TC002_Verify_SelectDD() {
	// TODO Auto-generated method stub
	Page_SubtaskListView subtask= new Page_SubtaskListView(driver);
	subtask.selectalldates();
	subtask.selectALLDropdownValues();
	subtask.submit();
	subtask.verifyselectedvalue();
//selectALLDropdownValues
}
	
	@Test(priority=3)
	public void TC003_Verify_view_subtask_popup() {
		//when user click on sub task link sub task popup should be display
		Page_SubtaskListView subtask= new Page_SubtaskListView(driver);
		subtask.ClickonSutask();
		}
	
	@Test(priority=4)
	public void TC004_Verify_subtask_Name () {
		//when user click on sub task link sub task popup should be display
		Page_SubtaskListView subtask= new Page_SubtaskListView(driver);
		subtask.verifyTaskname();
		}
}
