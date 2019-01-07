package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import driverlaunch.LaunchWebDriver;
import pages.CRUD;
import pages.DshboardPage;
import pages.LoginPage;
import pages.MyTaskPage;

public class TestCrud 
{WebDriver driver = LaunchWebDriver.WebdriverLaunch();

@Test(priority=1)
public void TC_001_verify_User_Able_TO_Navigate_Dashboard() {
	// TODO Auto-generated method stub
	LoginPage Login= new LoginPage(driver);
	Login.LoginToWom();
}

@Test(priority=2)
public void TC002_Verify_Navigate_To_Crud() {
	// TODO Auto-generated method stub
	DshboardPage dashbord= new DshboardPage(driver);
	dashbord.ClickOnDortoDor();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	dashbord.navigateToCRUD();
}

@Test(priority=3)
public void TC_003_Verify_add_new_record(){
	// TODO Auto-generated method stub
CRUD crd= new CRUD(driver);
crd.ClickOnAddNewButton();
}

}
