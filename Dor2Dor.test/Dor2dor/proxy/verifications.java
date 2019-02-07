package proxy;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.chrono.IsoChronology;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.mustache.Value;

import Config.DataLoader;
import pages.SalesPlanningPage.Status;

public class verifications {

	DataLoader dl= new DataLoader();
	
	public void VerifyTextgloble(WebElement EnterFildForValidate,String enterExpectedValueForValidate) throws IOException {
		String valueoftext=EnterFildForValidate.getText();
		 assertEquals(valueoftext,enterExpectedValueForValidate);
		//System.out.println(valueoftext);
	}
	
	public void setwait(int EnterWaittime) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(EnterWaittime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void SelectDropDown(WebElement DropdownName,WebElement Dropdowntexboxvalue,String TextValueForEnterToTextBox,String SelectedValueExpected) {
		// TODO Auto-generated method stub
		setwait(500);
		int itaration=20;
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		for (int i = 0; i < itaration; i++) {
			DropdownName.click();
			break;
		}
		//DropdownName.click();		
		//Dropdowntexboxvalue.sendKeys(TextValueForEnterToTextBox);
		for (int i = 0; i < itaration; i++) {
			Dropdowntexboxvalue.sendKeys(TextValueForEnterToTextBox);
			break;
		}
		
		for (int i = 0; i < itaration; i++) {
			Dropdowntexboxvalue.sendKeys(Keys.ENTER);	
			break;
		}				
		String s=DropdownName.getText();
		assertEquals(s, SelectedValueExpected);
	
	}
	
	
	
	public void Selectdate(WebElement datePiker,String datevalue,String expectedValue) {
		// TODO Auto-generated method stub
datePiker.click();
datePiker.clear();
datePiker.sendKeys(datevalue);
//datePiker.sendKeys(Keys.ARROW_RIGHT);
datePiker.sendKeys(Keys.ENTER);
String valueofdatepiker=datePiker.getAttribute("value");
assertEquals(valueofdatepiker, expectedValue);
	}
	
	public void ClickonCheckBox(WebElement checkbox) {
		// TODO Auto-generated method stub
		//
		checkbox.click();
		assertFalse(true);
//		checkbox.isSelected();
//		checkbox.isDisplayed();
//		checkbox.isSelected();
//		checkbox.isDisplayed();
//		String x=checkbox.getAttribute("class");
//		String y=checkbox.getAttribute("class");
		//assertTrue(Towerimage.isEnabled());		
	}
	
	
	public void verifyElementIsEnabled(Status statusof,WebElement enterelementlocator) {
	
		if (statusof==Status.enable) {
			boolean value=enterelementlocator.isEnabled();
			assertTrue(value);
		}
		else if (statusof==Status.disble) {
			boolean value=enterelementlocator.isEnabled();
			assertFalse(value);
		}
	
	}
	
	
	public void verifyMessageBox(WebElement EnterMessageBoxText,String EntervalueNeedToVerify) {
		// TODO Auto-generated method stub
		String s=EnterMessageBoxText.getText();
		System.out.println("messsage text is"+s);
		assertTrue(s.contains(EntervalueNeedToVerify));

	}
	
	
}
