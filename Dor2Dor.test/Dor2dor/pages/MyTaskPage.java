package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyTaskPage {
WebDriver driver;

	//@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[3]/div/div/div/div/div/div[1]/input")WebElement District;
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[3]/div/div/div/div/button")WebElement District;
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[3]/div/div/div/div/button/span[1]")WebElement Districtvalue;
	
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\'main-content\']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[3]/div/div/div/div/div/div[1]/input")WebElement DistrictTextBoxt;
	
	
	//@FindBy(how=How.XPATH,using="//*[@id='territory_id']")WebElement teriitorry;
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[5]/div/div/div/button")WebElement teriitorry;
	
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[5]/div/div/div/div/div[1]/input")WebElement teriitoryTesxBox;
	//
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[6]/div/div/div/div/button")WebElement Status;
	//
	@FindBy(how=How.XPATH,using="//*[@id=\"main-content\"]/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[6]/div/div/div/div/div/div[1]/input")WebElement StatusTextBox;
	
	
	
	public MyTaskPage(WebDriver d) {
		// TODO Auto-generated constructor stub
		this.driver=d;
		PageFactory.initElements(driver, this);
	}


	public void SelectDDValues(WebElement ElementName,WebElement ElementTextBox,String Velue) {
		// TODO Auto-generated method stub
ElementName.click();
ElementTextBox.sendKeys(Velue);
ElementName.sendKeys(Keys.ENTER);
	}
	
	public void SelectDistrict() {
		// TODO Auto-generated method stub
SelectDDValues(District, DistrictTextBoxt, "Colom");
	}
	
	public void SelectTerritorry() {
		// TODO Auto-generated method stub
SelectDDValues(teriitorry, teriitoryTesxBox, "awi");
	}	
	
	public void SelectStaus() {
		// TODO Auto-generated method stub
SelectDDValues(Status, StatusTextBox, "ini");
	}
	
	public void getselectedvalue() {
		// TODO Auto-generated method stub
String x=District.getAttribute("title");
System.out.println("value od x is>>"+x);
assertEquals(x, "Colombo");
	}
	
	
	
}
