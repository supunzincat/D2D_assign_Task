package testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.Test;

import config.LaunchWebDriver;
import pages.CRUD;
import pages.DshboardPage;
import pages.LoginPage;
import pages.AssignedTaskedPage;

public class TS_004_TM_Territory_Allocation 
{WebDriver driver = LaunchWebDriver.WebdriverLaunch();

@Test(priority=1)
public void TC_001_verify_User_Able_TO_Navigate_Dashboard() throws IOException {
	// TODO Auto-generated method stub
	LoginPage Login= new LoginPage(driver);
	Login.LoginToWom();
}

@Test(priority=2)
public void TC_002_Verify_Navigate_To_Crud() {
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
public void TC_003_Verify_messageBox(){
	// TODO Auto-generated method stub
	//driver.get("http://wom/v3staging/SingleWorkOrder/view/791669");
	
CRUD crd= new CRUD(driver);
//crd.clickupdate();
crd.ClickOnAddNewButton();
crd.verifycanclebutton();
//crd.ClickOnAddNewButton();
//crd.verifymessagebox();
}

@Test(priority=4)
public void TC_004_Verify__messageBox(){
	// TODO Auto-generated method stub
	//driver.get("http://wom/v3staging/SingleWorkOrder/view/791669");
	
CRUD crd= new CRUD(driver);
//crd.clickupdate();
crd.ClickOnAddNewButton();
crd.verifymessagebox();
crd.verifycanclebutton();

//driver.quit();
}


@Test(priority=5)
public void TC_005_Verify_fillform(){
	// TODO Auto-generated method stub
	//driver.get("http://wom/v3staging/SingleWorkOrder/view/791669");
	
CRUD crd= new CRUD(driver);
//crd.clickupdate();
crd.ClickOnAddNewButton();
crd.fillform();
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
crd.verifysucsessmessage();
//driver.quit();
}

@Test(priority=6)
public void TC_006_verify_added_record_is_displayed() {
	// TODO Auto-generated method stub
	CRUD crd= new CRUD(driver);
	crd.verifyaddedvalue();

}
}
