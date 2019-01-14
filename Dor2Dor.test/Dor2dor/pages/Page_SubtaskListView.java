package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Page_SubtaskListView {

	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[1]/div/div/div/div/button/span[1]")WebElement Districtvalue;
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[1]/div/div/div/div/div/div/input")WebElement DistricttextBox;
	public String districtname= "colo";
	
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[5]/div/div/div/button")WebElement Territorry;
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[5]/div/div/div/div/div/input")WebElement Territorry1Textbox;
	public String TerritoryName= "col";
	
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[6]/div/div/div/div/button/span[1]")WebElement agent;
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[6]/div/div/div/div/div/div[1]/input")WebElement agentTextbox;
	public String AgentName= "sup";
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"d2d-sub-task-list-sdate\"]")WebElement StartDate;
	@FindBy(how=How.XPATH,using="//*[@id=\"d2d-sub-task-list-edate\"]")WebElement EndDate;
	
	
	
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
	
	
	public void Selectdate(WebElement datePiker) {
		// TODO Auto-generated method stub
datePiker.click();
datePiker.sendKeys(Keys.ARROW_RIGHT);
datePiker.sendKeys(Keys.ENTER);
	}
	
	public void selectalldates() {
		// TODO Auto-generated method stub
		Selectdate(StartDate);
		Selectdate(EndDate);
	}
	
}