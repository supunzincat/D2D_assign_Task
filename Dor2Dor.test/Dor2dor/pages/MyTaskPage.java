package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyTaskPage {
WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[3]/div/div/div/div/div/div[1]/input")WebElement District;
	@FindBy(how=How.XPATH,using="*[@id='main-content']/section/div/div/div[1]/section[1]/div[1]/form/fieldset/div[3]/div/div/div/div/div/div[1]/input")WebElement DistrictTextBoxt;
	//
	
	
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
}
