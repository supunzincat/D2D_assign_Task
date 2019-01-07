package pages;

import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CRUD {
	
	WebDriver  driver;

	@FindBy(how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section/div/div[2]/form/div/div/button") WebElement AddNewButton;
	@FindBy(how=How.XPATH,using="//*[@id='exampleModalLabel']") WebElement MessageBoxText;
	
	
	public CRUD(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
			}

	public void ClickOnAddNewButton() {
		// TODO Auto-generated method stub
AddNewButton.click();
	}
	
	public void verifymessagebox() {
		// TODO Auto-generated method stubTec
		System.out.println(MessageBoxText.getText());
		
	}
}
