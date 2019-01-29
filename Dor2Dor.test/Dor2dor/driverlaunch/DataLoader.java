package driverlaunch;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataLoader {

	
	public Properties LoadLogginData() throws IOException {
		// TODO Auto-generated method stub
		Properties prop =new Properties();
		FileInputStream ip= new FileInputStream("C:\\Users\\supun_zincat\\git\\D2D_assign_Task\\Dor2Dor.test\\Dor2dor\\dataprovider\\logindetails.properties");
		prop.load(ip);
		return prop;
	}

	
	public Properties LoadDataToTerritorryMangerTasks() throws IOException {
		// TODO Auto-generated method stub
Properties prop= new Properties();
FileInputStream ip= new FileInputStream("C:\\Users\\supun_zincat\\git\\D2D_assign_Task\\Dor2Dor.test\\Dor2dor\\dataprovider\\TerritorryManagerTask.properties");
prop.load(ip);
return prop;
	}
}
