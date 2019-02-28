package pages;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import proxy.verifications;

public class Page_SubtaskListView {
verifications verify= new verifications();

	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[1]/div/div/div/div/button/span[1]")WebElement Districtvalue;
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[1]/div/div/div/div/div/div/input")WebElement DistricttextBox;
	public String districtname= "colo";
	
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[5]/div/div/div/button")WebElement Territorry;
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[5]/div/div/div/div/div/input")WebElement Territorry1Textbox;
	public String TerritoryName= "col";
	
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[6]/div/div/div/div/button/span[1]")WebElement agent;
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[6]/div/div/div/div/div/div[1]/input")WebElement agentTextbox;
	public String AgentName= "chamo";
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"d2d-sub-task-list-sdate\"]")WebElement StartDate;
	@FindBy(how=How.XPATH,using="//*[@id=\"d2d-sub-task-list-edate\"]")WebElement EndDate;
	
	@FindBy(how=How.XPATH,using="//*[@id='d2d-task-save-btn']")WebElement SubmitButton;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[2]/section/div/div[1]/table/tbody/tr/td[1]")WebElement Subtaskname;
	
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[2]/section/div/div[1]/table/tbody/tr/td[1]/a")WebElement Subtaskvalue;
	@FindBy(how=How.XPATH,using="//*[@id='container']/div[5]/div/div/div")WebElement popup;
	
	@FindBy(how=How.XPATH,using="//*[@id='container']/div[5]/div/div/div/div[1]/div[1]/div[1]/h4")WebElement TaskName;
	String ExpectedTaskName="Task ID : 17";
	
	public Page_SubtaskListView(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	public void SelectDropDown(WebElement DropdownName,WebElement Dropdowntexboxvalue,String TextValue) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DropdownName.click();
		
		Dropdowntexboxvalue.sendKeys(TextValue);
		
		Dropdowntexboxvalue.sendKeys(Keys.ENTER);
		
	
	}
	
	public void selectALLDropdownValues() {
		// TODO Auto-generated method stub
		SelectDropDown(Districtvalue, DistricttextBox, districtname);
		SelectDropDown(Territorry, Territorry1Textbox, TerritoryName);
		SelectDropDown(agent, agentTextbox, AgentName);
	}
	
	
	public void SelectStartdate(WebElement datePiker) {
		// TODO Auto-generated method stub
//datePiker.click();
datePiker.clear();
datePiker.click();
//datePiker.sendKeys(Keys.ARROW_RIGHT);
datePiker.sendKeys("2018-11-01");

//datePiker.sendKeys(Keys.ENTER);
	}
	
	
	public void SelectEnddate(WebElement datePiker) {
		// TODO Auto-generated method stub

datePiker.click();
datePiker.sendKeys(Keys.ARROW_RIGHT);

datePiker.sendKeys(Keys.ENTER);
	}
	
	public void selectalldates() {
		// TODO Auto-generated method stub
		//verify.Selectdate(StartDate, enterDatevalueThatYouNeedToSelect, enterExpectedValue);
		SelectStartdate(StartDate);
		SelectEnddate(EndDate);
	}
	
	public void submit() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SubmitButton.click();
	}
	
	
	public void verifyselectedvalue() {
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
String x=Subtaskname.getText();
System.out.println("subtask name is"+ x);
assertEquals(x,"Sub Task 5");
	}
	
	public void ClickonSutask() {
		// TODO Auto-generated method stub
		Subtaskvalue.click();
		popup.isDisplayed();
	}
	
	public void ContentText(WebElement TextName,String expectedvalue) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value=TextName.getText();
		assertEquals(value, expectedvalue);
	}
	
	public void verifyTaskname() {
		// TODO Auto-generated method stub
		ContentText(TaskName, ExpectedTaskName);
//
	}
}
