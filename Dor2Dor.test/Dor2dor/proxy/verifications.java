package proxy;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.chrono.IsoChronology;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.mustache.Value;

import com.mysql.fabric.xmlrpc.base.Array;

import config.DataLoader;
import pages.SalesPlanningPage.Status;

public class verifications {

	DataLoader dl= new DataLoader();
	
	public void VerifyTextgloble(WebElement EnterFildForValidate,String enterExpectedValueForValidate) throws IOException {
		String valueoftext=EnterFildForValidate.getText();
		 assertEquals(valueoftext,enterExpectedValueForValidate);
		//System.out.println(valueoftext);
	}
	
	
		
	//Tis will verify all the dropdown values
		public void verifyAllDropdownValues(WebElement dropdown,String[] exp) {
		// TODO Auto-generated method stub
		int arraycount=0;
				
		Select dd = new Select(dropdown);
		
		List<WebElement> options = dd.getOptions();
		for(WebElement item:options) 
		{
		String x=item.getText();
		System.out.println("from dropdown >>"+x);

		for(arraycount=arraycount;arraycount<=exp.length;) {
//				System.out.println("from array"+exp[arraycount]);
//				System.out.println("from array"+arraycount);
				
				
				if(item.getText().equals(exp[arraycount]))
				{
				System.out.println("from dd "+item.getText()+"is mached with "+exp[arraycount]+" from array");
				System.out.println(arraycount);
				arraycount=arraycount+1;
				System.out.println(arraycount);
				assertTrue(true);
				}
				
				else {
				System.out.println("else");
				System.out.println(exp[arraycount]);
				System.out.println(arraycount);
				arraycount=arraycount+1;
				System.out.println(arraycount);
				assertTrue(false);
				}
				//arraycount=arraycount+1;
				System.out.println(arraycount);
				break;
				
			}
			
		}
		
		

		

	}
	
	public void setwait(int enterWaittimeInMiliseconds) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(enterWaittimeInMiliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public void verifyGlobalSelectDropDown(WebElement DropdownName,WebElement Dropdowntexboxvalue,String TextValueForEnterToTextBox,String SelectedValueExpected) {
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
			Dropdowntexboxvalue.clear();
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
			
	public void multiselect(WebElement dropDown,WebElement dropDownTextBox,String firstdistrict) {
		// TODO Auto-generated method stub
		setwait(500);
		int iterrator=20;
		String districtname;
		for(int i=0;i<iterrator;i++) {
			dropDown.click();
			break;
		}
		
		for(int i=0;i<3;i++) {
			if (i==0)
			{
				districtname = firstdistrict;
			setdistrict(dropDownTextBox, districtname);
			}
			
		
		}
				
	}
		
	public void setdistrict(WebElement dropDownTextBox,String districtname) {
		// TODO Auto-generated method stub
		dropDownTextBox.sendKeys(districtname);
		dropDownTextBox.clear();
		dropDownTextBox.sendKeys(Keys.ENTER);
	}
		
	public void Selectdate(WebElement enterDatePiker,String enterDatevalueThatYouNeedToSelect,String enterExpectedValue) {
		// TODO Auto-generated method stub
enterDatePiker.click();
enterDatePiker.clear();
enterDatePiker.sendKeys(enterDatevalueThatYouNeedToSelect);
//datePiker.sendKeys(Keys.ARROW_RIGHT);
enterDatePiker.sendKeys(Keys.ENTER);
String valueofdatepiker=enterDatePiker.getAttribute("value");
assertEquals(valueofdatepiker, enterExpectedValue);
	}
		
	public void ClickonCheckBox(WebElement enterCheckbox) {
		// TODO Auto-generated method stub
		//
		enterCheckbox.click();
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
