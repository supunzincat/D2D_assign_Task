package proxy;

import org.openqa.selenium.WebElement;

public class WomActions {

	
	public void setwait(int enterWaittimeInMiliseconds) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(enterWaittimeInMiliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickonbutton(WebElement enterButtonThatYouNeedToClick) {
		// TODO Auto-generated method stub
		enterButtonThatYouNeedToClick.click();
	}
}
