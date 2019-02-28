package testCases;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.Test;

public class testclass {
	
	@Test(priority=0)
	private void TestDB() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

//		Class.forName("com.mysql.jdbc.Driver");
//		DriverManager.getConnection("", "", "");
		
		
			// TODO Auto-generated method stub
			//forName(“com.mysql.jdbc.Driver”);
			//String dbUrl = "jdbc:mysql://localhost:3036/emp";
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con=	DriverManager.getConnection("jdbc:MySQL://172.26.28.127:3306/wom_devel", "womuser", "Womuser@123");
			//java.sql.Connection con=	DriverManager.getConnection("jdbc:MySQL://127.0.0.1/wom_devel", "womuser", "Womuser@123");
			java.sql.Statement stmt = con.createStatement();	
		ResultSet rs=	stmt.executeQuery("SELECT * FROM `d2d_tasks_to_bb_towers` WHERE TASK_ID=15");
		while(rs.next()) 
		{
			
			String value=rs.getString("");
			System.out.println(">>>>>>>>>>Name of value is>>??<<>> "+value);
		}
		
		
	

}
}