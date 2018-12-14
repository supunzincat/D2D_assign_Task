package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import driverlaunch.LaunchWebDriver;
import pages.LoginPage;
import pages.ViewTaskPage;

public class ViewSpecificTask {

	public class TesClass {
		
		WebDriver d=LaunchWebDriver.WebdriverLaunch();
		
		@Test(priority=1)
		public void TC001_verify_District_Is_enable() {
	ViewTaskPage viewtask= new ViewTaskPage(d);
		}
		
}
	}
