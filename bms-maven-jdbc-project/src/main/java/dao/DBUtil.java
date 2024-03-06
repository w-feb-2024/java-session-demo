package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static private Connection conn;
	static private String connectionUrl = "jdbc:mysql://localhost:3306/book_management_system";
	static private String userName = "root";
	static private String password = "root";
	
	static Connection makeConnection(){
		// singleton design pattern to obtain the same connection again and again
		if(conn == null) {
			try {
				conn = DriverManager.getConnection(connectionUrl, userName, password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	static void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
