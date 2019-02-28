package config;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Dbconnection {
	
	public ResultSet loadDatafromDB(String EnterQuery) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//jdbc:MySQL://172.26.28.127:3306/wom_devel", "womuser", "Womuser@123");
		String url="jdbc:MySQL://172.26.28.127:3306/wom_devel?useSSL=false";
		String user="womuser";
		String password="Womuser@123";
		Class.forName("com.mysql.jdbc.Driver");
		java.sql.Connection con=DriverManager.getConnection(url, user, password);
		java.sql.Statement stmt = con.createStatement();	
		ResultSet rs=	stmt.executeQuery(EnterQuery);
		//return ResultSet;
		//"SELECT * FROM `d2d_tasks_to_bb_towers` WHERE TASK_ID=15"
		return rs;
//		while(rs.next()) 
//		{
//			
//			String value=rs.getString("");
//			System.out.println(">>>>>>>>>>Name of value is>>??<<>> "+value);
//		}

		}

}
