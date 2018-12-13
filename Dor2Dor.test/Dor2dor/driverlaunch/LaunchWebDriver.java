package driverlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchWebDriver {

	public static WebDriver driver;
	
	public static WebDriver WebdriverLaunch() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\config\\chrome _new _driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://wom/v3staging/user/login");
		return driver;
		
	}
}
