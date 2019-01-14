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
public void TC001_Verify_SelectDD() {
	// TODO Auto-generated method stub
	Page_SubtaskListView subtask= new Page_SubtaskListView(driver);
	subtask.selectALLDropdownValues();
	subtask.selectalldates();

}


//selectALLDropdownValues
}
