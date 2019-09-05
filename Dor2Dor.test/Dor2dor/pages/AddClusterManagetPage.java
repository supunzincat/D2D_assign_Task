package pages;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import proxy.WomActions;
import proxy.verifications;

public class AddClusterManagetPage {
	
	verifications verify = new verifications();
	WomActions womaction= new WomActions();
	WebDriver d;
	
	public AddClusterManagetPage(WebDriver d) {
		// TODO Auto-generated constructor stub
	this.d=d;
	PageFactory.initElements(d, this);
	}
	
	@FindBy (how=How.XPATH,using="//*[@id='main-content']/section/div/div/div[1]/section/div/div[2]/form/div/div/button") WebElement AddNewBotton;
	@FindBy (how=How.XPATH,using="//*[@id='exampleModalLabel']") WebElement MwsageBoxtitle;
	@FindBy (how=How.XPATH,using="//*[@id='territory-manager-add-form']/div[1]/div/fieldset/div/div/span") WebElement errorMessageForemptyUserName;
	@FindBy (how=How.XPATH,using="//*[@id='territory-manager-add-form']/div[3]/button[1]") WebElement AddButton;
	@FindBy (how=How.XPATH,using="//*[@id='territory-manager-add-form']/div[1]/div/fieldset/div/label") WebElement UsernameInPOpup;
	@FindBy (how=How.XPATH,using="//*[@id='user_ids']") WebElement Dropdown;
	
	
//	public void verifyDropdownValues() {
//		// TODO Auto-generated method stub
//		
//		verify.verifyAllDropdownValues(Dropdown, enterexpectedvaluesArray);
//	}
	
	public void verifypopup() {
		// TODO Auto-generated method stub
		verify.verifypopup(AddNewBotton, MwsageBoxtitle, "Add Cluster Manager");
	}
	
	public void verifyemptyerrormessage() throws IOException {
		// TODO Auto-generated method stub
		womaction.setwait(500);
		womaction.clickonbutton(AddButton);
		verify.VerifyTextgloble(errorMessageForemptyUserName, "This field cannot be empty");
	}
	
	public void verifyUsername() throws IOException {
		// TODO Auto-generated method stub
		verify.VerifyTextgloble(UsernameInPOpup, "User Name*");
	}

}
