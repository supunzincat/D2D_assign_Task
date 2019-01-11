package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import driverlaunch.LaunchWebDriver;
import pages.LoginPage;

public class TC_TerritorryManagerTasks {
WebDriver driver = LaunchWebDriver.WebdriverLaunch();
	@Test
	private void TC001_verifynavigateTodashboard() {
		// TODO Auto-generated method stub
LoginPage lo= new LoginPage(driver);
lo.LoginToWom();
	}
}
