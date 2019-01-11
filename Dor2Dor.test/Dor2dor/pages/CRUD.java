package pages;

import static org.testng.Assert.assertEquals;

import java.security.Key;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CRUD {
	
	WebDriver  driver;

	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section/div/div[2]/form/div/div/button") WebElement AddNewButton;
//@FindBy(how=How.XPATH,using="//*[@id='exampleModalLabel']") WebElement MessageBoxText;
	@FindBy(how=How.XPATH,using="//*[@id='container']/div[3]/div/div") WebElement MessageBoxText;
	@FindBy(how=How.XPATH,using="//*[@id='container']/div[3]/div/div/form") WebElement formone;
	@FindBy(how=How.XPATH,using="//*[@id='exampleModalLabel']") WebElement formtext;
	@FindBy(how=How.XPATH,using="//*[@id='territory-manager-add-form']/div[3]/button[1]") WebElement addbutton;
	@FindBy(how=How.XPATH,using="//*[@id='wo-details-wrap']/div[2]/div[4]/div[2]/form/a") WebElement updateButton;
	@FindBy(how=How.XPATH,using="//*[@id='wo_status_update_form']/div[1]/div/fieldset/div[1]/div/div/button/span[1]") WebElement initial;
	@FindBy(how=How.XPATH,using="//*[@id='territory-manager-add-form']/div[3]/button[2]") WebElement CancleButton;
	@FindBy(how=How.XPATH,using="//*[@id='territory-manager-add-form']/div[1]/div/fieldset/div[1]/div/div/button/span[1]") WebElement Username;
	@FindBy(how=How.XPATH,using="//*[@id='territory-manager-add-form']/div[1]/div/fieldset/div[2]/div/div/button") WebElement Territory;
	@FindBy(how=How.XPATH,using="//*[@id='territory-manager-add-form']/div[1]/div/fieldset/div[1]/div/div/div/div/input") WebElement usernametextbox;
	@FindBy(how=How.XPATH,using="//*[@id='territory-manager-add-form']/div[1]/div/fieldset/div[2]/div/div/div/div[1]/input") WebElement territorytextbox;
	@FindBy(how=How.XPATH,using="//*[@id='gritter-item-3']/div/div[2]/span") WebElement Successmessage;
	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[2]/section/div/div[1]/table/tbody/tr[1]/td[1]") WebElement addedValue;
	
	
	
	
	public void clickupdate() {
		// TODO Auto-generated method stub
		//*[@id='wo-details-wrap']/div[2]/div[4]/div[2]/form/a
		updateButton.click();
		initial.click();
	}
	
	public CRUD(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
			}

	public void ClickOnAddNewButton() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
AddNewButton.click();

	}
	
	public void verifycanclebutton() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
CancleButton.click();
formtext.isDisplayed();
//String x = formtext.getText();
//System.out.println(">>>"+x);

	}
	
	public void verifymessagebox() {
		// TODO Auto-generated method stubTec
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String x = formtext.getText();
		//System.out.println(">>>>"+formtext.getText());
		//addbutton.click();
		//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='container']/div[3]/div/div/form")));
		//System.out.println(formtext.getText());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		assertEquals(x, "Territory to manager mapping");
	}
	
	public void selectdd(WebElement ddvalue,WebElement ddtextbox,String valueoftextbox) {
		// TODO Auto-generated method stub
ddvalue.click();
ddtextbox.sendKeys(valueoftextbox);
ddtextbox.sendKeys(Keys.ENTER);

	}
	
	public void fillform() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
selectdd(Username, usernametextbox, "root");

selectdd(Territory, territorytextbox, "awi");
addbutton.click();
//verifysucsessmessage();

}
	public void verifysucsessmessage() {
		// TODO Auto-generated method stub
String successmessagetext=Successmessage.getText();
System.out.println(">>>>>"+successmessagetext);
		assertEquals(successmessagetext, "Success!");
	}
	
	public void verifyaddedvalue() {
		// TODO Auto-generated method stub
		String x=addedValue.getText();
		assertEquals(x, "Awissawella Depot");
	}
}
