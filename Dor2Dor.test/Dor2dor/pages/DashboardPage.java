package pages;

import static org.testng.Assert.assertEquals;

import java.awt.List;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

import config.DataLoader;
import config.Dbconnection;
import proxy.verifications;



public class DashboardPage  {
	
	verifications VerifyText= new verifications();
	DataLoader loaddata= new DataLoader();
	WebDriver d;
	
	//@FindBy (how=How.XPATH,using="//*[@id='nav-accordion']/li[8]/a") WebElement DooorToDoorTab;
	@FindBy (how=How.XPATH,using="//*[contains(text(),'DOOR TO DOOR')]") WebElement DooorToDoorTab;
	@FindBy (how=How.XPATH,using="//*[contains(text(),'Sub Task Detailed Report')]") WebElement SubtaskDetailedreport;
	//@FindBy (how=How.XPATH,using="//*[@id='nav-accordion']/li[8]/ul[5]/li/a") WebElement AsignTaskSubmenue;
	@FindBy (how=How.XPATH,using="//*[contains(text(),'Sales Planning')]") WebElement AsignTaskSubmenue;
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Assigned Tasks')]") WebElement MYTaskText;
	@FindBy(how=How.XPATH,using="//*[contains(text(),'TM Territory Allocation')]")  WebElement DeportsToTerritorryManager;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Agent Task View')]")  WebElement AgentTaskView;
	String AgentTaskViewUrl="http://wom/v3staging/d2d/SubTaskList/view";
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Assigned Tasks')]") WebElement TerritorryManagerTasks;
	String TerritorryManagerTasksUrl="http://wom/v3staging/d2d/ClusterManager/view";
	
	
	
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[1]/label") WebElement DistrictLableLocatorr;
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[2]/label") WebElement TerriToryLableLocatorr;
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[3]/label") WebElement GnDivitionLableLocatorr;
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[4]/label") WebElement StartDateLableLocatorr;
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[5]/label") WebElement EndDateLableLocatorr;
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[6]/label") WebElement TowersLableLocatorr;
	@FindBy(how=How.XPATH,using="//*[@id='d2d-tassign-rightbar-wrap']/form/div[7]/label") WebElement RemarksLableLocatorr;
	
	@FindBy(how=How.XPATH,using="//*[@id='districts_filter_rightbar']") WebElement DistrictDropdown;
	@FindBy(how=How.XPATH,using="//*[@id='territory_filter_rightbar']") WebElement territryDropDown;
	
	@FindBy (how=How.XPATH,using="//*[contains(text(),'Add Cluster Manager')]") WebElement addClusterManager;
	
	
	
	public DashboardPage(WebDriver d2) {
		// TODO Auto-generated constructor stub
		this.d=d2;
		PageFactory.initElements(d, this);
	}

	//In this function user will navigate to door to door moudule
		public void navigateToDortoDor() {
		// TODO Auto-generated method stub
			DooorToDoorTab.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
	// 	TODO Auto-generated catch block
				e.printStackTrace();
			}
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
	
	public void NavigateToSalesPlanning() {
		// TODO Auto-generated method stub
		navigateToDortoDor();
		AsignTaskSubmenue.click();
//String CurrentUrl=d.getCurrentUrl();
//System.out.println(CurrentUrl);
//assertEquals(CurrentUrl, "http://wom/v3staging/d2d/AssignTask/index");

	}
		
	public void NavigateToSubtaskDetailReport() {
		// TODO Auto-generated method stub
		navigateToDortoDor();
		navigatetosubmenu(SubtaskDetailedreport, "http://wom/v3staging/d2d/SubTaskDetailsReport/view");
	}
	
	public void NavigteToAssignedTasks() {
	// TODO Auto-generated method stub
	navigateToDortoDor();
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
			
	public void loaddatabase(String EnterTableColumnName,String EnterQuery) throws ClassNotFoundException, SQLException {
	Dbconnection Database= new Dbconnection();
	ResultSet rs=Database.loadDatafromDB(EnterQuery);
	String value = null;
	while(rs.next()) 
//{
//	 value=rs.getString(EnterTableColumnName);
//	//System.out.println(">>>>>>>>>>Name of value is>>??<<>> "+value);
//}

System.out.println(">>>>>>>>>>Name of value is>>??<<>> "+value);
assertEquals("15", value);
}

	public void verifywithdb() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//"SELECT * FROM `d2d_tasks_to_bb_towers` WHERE TASK_ID=15"
loaddatabase("DEPOT_ID", "SELECT * FROM `sys_user_to_depot` WHERE USER_ID =4");
//loaddatabase("SUB_TASK_ID", "SELECT * FROM `d2d_sub_task_to_agent_users`");


}
	
	String[] districtvalues = {"ANY","Please Select","Colombo","Gampaha","Kalutara","Galle","Hambantota","Badulla","Ratnapura"};
	
	public void verifyAllTheDistrictdropdownValues() {
		// TODO Auto-generated method stub
		VerifyText.verifyAllDropdownValues(DistrictDropdown,districtvalues);
	}
	
	

	String[] territoryValues = {"Please Select","AWI - Awissawella Depot","COL - Colombo Depot","PIL - Piliyandala Depot"};
	public void verifyAllTheTerritorrdropdownValues() {
		// TODO Auto-generated method stub
		VerifyText.verifyAllDropdownValues(territryDropDown,territoryValues);
	}
	

	
	
	public void verifyNavigattoAddClusterManagerPage() {
		// TODO Auto-generated method stub
//		String expectedUrl="http://wom/v3staging/d2d/ClusterManagerController/view";
//		String currenturl=d.getCurrentUrl();
//		assertEquals(currenturl, expectedUrl);
		VerifyText.verifyNavigation(d, "http://wom/v3staging/d2d/ClusterManagerController/view");

	}
	
	public void navigateToAddClusterManagerqq() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		addClusterManager.click();
	}
	}
