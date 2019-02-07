package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

	//this will load propperty  file to TerritorrymanagetTask page
	public Properties LoadDataToTerritorryMangerTasks() throws IOException {
		// TODO Auto-generated method stub
		Properties prop= new Properties();
		FileInputStream ip= new FileInputStream("C:\\Users\\supun_zincat\\git\\D2D_assign_Task\\Dor2Dor.test\\Dor2dor\\dataprovider\\TerritorryManagerTask.properties");
		prop.load(ip);
		return prop;
	}
	
//	public Properties LoadDataToAssignTasks() throws IOException {
//		// TODO Auto-generated method stub
//Properties prop= new Properties();
//FileInputStream ip= new FileInputStream("C:\\Users\\supun_zincat\\git\\D2D_assign_Task\\Dor2Dor.test\\Dor2dor\\dataprovider\\AssignTasksData.properties");
//prop.load(ip);
//return prop;
//	}


	public Properties LoadDataToAssignTasks() throws IOException {
		// TODO Auto-generated method stub
		Properties prop= new Properties();
		FileInputStream ip= new FileInputStream("C:\\Users\\supun_zincat\\git\\D2D_assign_Task\\Dor2Dor.test\\Dor2dor\\dataprovider\\AssignTasksData.properties");
		prop.load(ip);
		return prop;
	}
	
	//This will load data to Sales planning page
	public Properties LoadDataToSalesPlanning() throws IOException {
		// TODO Auto-generated method stub
		Properties pro= new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\supun_zincat\\git\\D2D_assign_Task\\Dor2Dor.test\\Dor2dor\\dataprovider\\SalesPlanning.propperties");
		pro.load(ip);
		return pro;		
	}
}
