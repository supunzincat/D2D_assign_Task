package pages;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.dom4j.io.SAXReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.UselessFileDetector;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import driverlaunch.DataLoader;

public class LoginPage {
	WebDriver driver;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id='username-validate']")
	WebElement Username;
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/div[1]/div[2]/input[2]")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/form/div[1]/button")
	WebElement SubmitButton;

	public LoginPage(WebDriver d)  {
		// TODO Auto-generated constructor stub
		this.driver = d;
		PageFactory.initElements(driver, this);
		
	}

	public void LoginToWom() throws IOException {
		// Log in to wom
//		if (uname==null && password==null) 
//		{
//			Username.sendKeys("supun_zincat");
//			Password.sendKeys("dapss@418");
//			SubmitButton.click();
//			
//			
//		}
//		if (uname.equals("supun_zincat") && password.equals("dapss@418")) 
//			Username.sendKeys("supun_zincat");
//			Password.sendKeys("dapss@418");
//			SubmitButton.click();
//			
//		}
//		if (uname.equals("supun_zincat") | password.equals("dapss@418")) 
//		{ 
//			Username.sendKeys("supun_zincat");
//			Password.sendKeys("dapss@418");
//			SubmitButton.click();
//			
//		}
//		if (uname.equals("supun_zincat") | password.equals("dapss@418")) 
//		{
//			Username.sendKeys("supun_zincat");
//			Password.sendKeys("dapss@418");
//			
//			
//		}
		DataLoader dataloader= new DataLoader();
		Properties prop =dataloader.LoadLogginData();
//		Properties prop =new Properties();
//		FileInputStream ip= new FileInputStream("C:\\Users\\supun_zincat\\git\\D2D_assign_Task\\Dor2Dor.test\\Dor2dor\\dataprovider\\logindetails.properties");
//		prop.load(ip);
		
		System.out.println(prop.getProperty("username"));
		Username.sendKeys(prop.getProperty("username"));
		//Username.sendKeys("supun_zincat");
		Password.sendKeys(prop.getProperty("pwd"));
	//	Password.sendKeys("dapss@418");
		SubmitButton.click();
		
//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String currentUrl = driver.getCurrentUrl();
		assertEquals(currentUrl, "http://wom/v3staging/user/user_dashbaord");
	}
}
