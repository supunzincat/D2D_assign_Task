package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TerritorryManagerTasks {

	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//*[@id='container']/header/div[2]/ul/li/a/span") WebElement Username;
	String Usernamevalue="supun_zincat";
	
	@FindBy(how=How.XPATH,using="//*[@id='container']/div[1]/div") WebElement lableHedder;
	String value="Door To Door | Assigned Tasks";
	
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[1]/div/div/label") WebElement startdateexpath;
	String StartfromText="Start From *";

	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[2]/div/div/label") WebElement enDDate;
	String EnddateText="End Date *";	
	
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[3]/div/div/label") WebElement TerritorryLocator;
	String TerritoryText="Territory *";
	
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[4]/div/div/label") WebElement StatusLocator;
	String StatusText="Status";
	
	public TerritorryManagerTasks(WebDriver driver) {
		// TODO Auto-generated constructor stuth
		PageFactory.initElements(driver, this);
		this.driver= driver;
		}

	
	
//	public void VerifyText1() {
//		// TODO Auto-generated method stub
//		//StartFormText.click();
//String x=StartFormText.getText();
//assertEquals(x,"");
//System.out.println(x);
//	}



	public void VerifyText(WebElement EnterFildForValidate,String enterExpectedValueForValidate) {
		// TODO Auto-generated method stub
		//StartFormText.click();
String x=EnterFildForValidate.getText();
assertEquals(x,enterExpectedValueForValidate);
System.out.println(x);
	}

	public void VeriUsername() {
		// TODO Auto-generated method stub
VerifyText(Username, Usernamevalue);
	}
	
	public void VerifyNameOfThePage() {
		// TODO Auto-generated method stub
VerifyText(lableHedder, value);
	}
	
	public void VerifyStartdate() {
		// TODO Auto-generated method stub
VerifyText(startdateexpath, StartfromText);
	}
	
	public void VerifyEnddate() {
		// TODO Auto-generated method stub
VerifyText(enDDate, EnddateText);
	}
		//test
	public void VerifyTerritoryText() {
		// TODO Auto-generated method stub
VerifyText(TerritorryLocator, TerritoryText);
	}
	
	public void VerifyStatusText() {
		// TODO Auto-generated method stub
VerifyText(StatusLocator, StatusText);
	}
}
