package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;



public class DshboardPage  {
	
	

	WebDriver d;
	
	//@FindBy (how=How.XPATH,using="//*[@id='nav-accordion']/li[8]/a") WebElement DooorToDoorTab;
	@FindBy (how=How.XPATH,using="//*[contains(text(),'DOOR TO DOOR')]") WebElement DooorToDoorTab;
	
	//@FindBy (how=How.XPATH,using="//*[@id='nav-accordion']/li[8]/ul[5]/li/a") WebElement AsignTaskSubmenue;
	@FindBy (how=How.XPATH,using="//*[contains(text(),'Assign Task')]") WebElement AsignTaskSubmenue;
	@FindBy(how=How.XPATH,using="//*[contains(text(),'My Tasks')]") WebElement MYTaskText;
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Depots to territory managers')]")  WebElement DeportsToTerritorryManager;
	@FindBy(how=How.XPATH,using="//*[@id='nav-accordion']/li[8]/ul[9]/li/a")  WebElement SubtaskList;
	
	
	
	
	public DshboardPage(WebDriver d2) {
		// TODO Auto-generated constructor stub
		this.d=d2;
		PageFactory.initElements(d, this);
	}

	public void NavigateToasignTask() {
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
	
public void NavigteToMyTask() {
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

	public void NavigateTOSelectSubtaskList() {
		// TODO Auto-generated method stub
		SubtaskList.click();
		String actualUrl=d.getCurrentUrl();
		assertEquals(actualUrl, "http://wom/v3staging/d2d/SubTaskList/view");
	}
}
