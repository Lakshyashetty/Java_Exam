package q2_withUi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {
	 public static  Connection getConnection()  {
		 try {
			 Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		 Connection connection=null;
		 try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_m?useSSL=false", "root", "");
			System.out.println("connection 	created");
		} catch (SQLException  e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		 return connection;
	 }
}
