package pages;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

import Config.DataLoader;
import proxy.verifications;



public class DshboardPage  {
	
	verifications VerifyText= new verifications();
	DataLoader loaddata= new DataLoader();

	WebDriver d;
	
	//@FindBy (how=How.XPATH,using="//*[@id='nav-accordion']/li[8]/a") WebElement DooorToDoorTab;
	@FindBy (how=How.XPATH,using="//*[contains(text(),'DOOR TO DOOR')]") WebElement DooorToDoorTab;
	
	//@FindBy (how=How.XPATH,using="//*[@id='nav-accordion']/li[8]/ul[5]/li/a") WebElement AsignTaskSubmenue;
	@FindBy (how=How.XPATH,using="//*[contains(text(),'Sales Planning')]") WebElement AsignTaskSubmenue;
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Assigned Tasks')]") WebElement MYTaskText;
	@FindBy(how=How.XPATH,using="//*[contains(text(),'TM Territory Allocation')]")  WebElement DeportsToTerritorryManager;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Agent Task View')]")  WebElement AgentTaskView;
	String AgentTaskViewUrl="http://wom/v3staging/d2d/SubTaskList/view";
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Territory Manager Tasks')]") WebElement TerritorryManagerTasks;
	String TerritorryManagerTasksUrl="http://wom/v3staging/d2d/TerritoryManager/view";
	
	
	
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[1]/label") WebElement DistrictLableLocatorr;
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[2]/label") WebElement TerriToryLableLocatorr;
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[3]/label") WebElement GnDivitionLableLocatorr;
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[4]/label") WebElement StartDateLableLocatorr;
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[5]/label") WebElement EndDateLableLocatorr;
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[6]/label") WebElement TowersLableLocatorr;
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[7]/label") WebElement RemarksLableLocatorr;
	
	
	
	public DshboardPage(WebDriver d2) {
		// TODO Auto-generated constructor stub
		this.d=d2;
		PageFactory.initElements(d, this);
	}

	public void NavigateToSalesPlanning() {
		// TODO Auto-generated method stub
DooorToDoorTab.click();

try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

AsignTaskSubmenue.click();
//String CurrentUrl=d.getCurrentUrl();
//System.out.println(CurrentUrl);
//assertEquals(CurrentUrl, "http://wom/v3staging/d2d/AssignTask/index");

	}
	
	public void ClickOnDortoDor() {
		// TODO Auto-generated method stub
DooorToDoorTab.click();
	}
	
public void NavigteToAssignedTasks() {
	// TODO Auto-generated method stub
MYTaskText.click();
String actualUrl=d.getCurrentUrl();
assertEquals(actualUrl, "http://wom/v3staging/d2d/ClusterManager/view");
}

	public void navigateToCRUD() {
		// TODO Auto-generated method stub
		DeportsToTerritorryManager.click();
		String actualUrl=d.getCurrentUrl();
		assertEquals(actualUrl, "http://wom/v3staging/d2d/UpdateTerritoryManagers/view");
	}

	public void NavigatwToAgentTaskPage() {

		navigatetosubmenu(AgentTaskView, AgentTaskViewUrl);
	}
	
	public void navigatetoTerritoryManagarTask() {
		// TODO Auto-generated method stub
navigatetosubmenu(TerritorryManagerTasks, TerritorryManagerTasksUrl);
	}
	
	public void navigatetosubmenu(WebElement listItem,String CurrentUrl) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		listItem.click();
		String actualUrl=d.getCurrentUrl();
		assertEquals(actualUrl, CurrentUrl);
		
	}
	
	
	public void verifyDistrictLable() throws IOException {
		// TODO Auto-generated method stub
		Properties prop= loaddata.LoadDataToSalesPlanning();
		VerifyText.VerifyTextgloble(DistrictLableLocatorr, prop.getProperty("districtLable"));
	}
	
	
	public void verifyTerritoryLable() throws IOException {
		// TODO Auto-generated method stub
		Properties prop= loaddata.LoadDataToSalesPlanning();
		VerifyText.VerifyTextgloble(TerriToryLableLocatorr, prop.getProperty("TerritorryLable"));
	}

	public void verifyGNDivisionLable() throws IOException {
		// TODO Auto-generated method stub
		Properties prop= loaddata.LoadDataToSalesPlanning();
		VerifyText.VerifyTextgloble(GnDivitionLableLocatorr, prop.getProperty("GNDivisionLable"));
	}
	
	public void verifyStartDateLable() throws IOException {
		// TODO Auto-generated method stub
		Properties prop= loaddata.LoadDataToSalesPlanning();
		VerifyText.VerifyTextgloble(StartDateLableLocatorr, prop.getProperty("StartDateLable"));
	}
	
	public void verifyEndDateLable() throws IOException {
		// TODO Auto-generated method stub
		Properties prop= loaddata.LoadDataToSalesPlanning();
		VerifyText.VerifyTextgloble(EndDateLableLocatorr, prop.getProperty("EndDateLable"));
	}
	
	public void verifyTowerLable() throws IOException {
		// TODO Auto-generated method stub
		Properties prop= loaddata.LoadDataToSalesPlanning();
		VerifyText.VerifyTextgloble(TowersLableLocatorr, prop.getProperty("TowerLable"));
	}
	
	public void verifyRemarksLable() throws IOException {
		// TODO Auto-generated method stub
		Properties prop= loaddata.LoadDataToSalesPlanning();
		VerifyText.VerifyTextgloble(RemarksLableLocatorr, prop.getProperty("RemarksLable"));
	}
	
}
