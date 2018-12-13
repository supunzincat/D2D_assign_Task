package pages;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;
	
	@FindBy (how=How.XPATH,using="//*[@id='username-validate']") WebElement Username;
	@FindBy (how=How.XPATH,using="/html/body/div[2]/form/div[1]/div[2]/input[2]") WebElement Password;
	@FindBy (how=How.XPATH,using="/html/body/div[2]/form/div[1]/button") WebElement SubmitButton;
	
	
	
	public LoginPage(WebDriver d) {
		// TODO Auto-generated constructor stub
		this.driver= d;
		PageFactory.initElements(driver, this);
	}



	public void LoginToWom() {
		// Log in to wom
Username.sendKeys("supun_zincat");
Password.sendKeys("dapss@418");
SubmitButton.click();
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
String currentUrl = driver.getCurrentUrl();
assertEquals(currentUrl, "http://wom/v3staging/user/user_dashbaord");
	}
}
