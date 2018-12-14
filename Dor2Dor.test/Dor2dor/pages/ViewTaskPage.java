package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ViewTaskPage {
	WebDriver d;
	
	public ViewTaskPage(WebDriver d) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(d, this);
		this.d=d;
	}

	
	
	public void DropDownisenable() {
		// TODO Auto-generated method stub

	}
}
