package Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface DBUtil {
	public static Connection provideConnection() {
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/courseplatform";
		try {
			conn=DriverManager.getConnection(url,"root","Scientist@0");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
