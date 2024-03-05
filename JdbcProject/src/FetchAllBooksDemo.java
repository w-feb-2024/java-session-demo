import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchAllBooksDemo {

	public static void main(String[] args) {
		//2.1 Load the driver ( is not needed from JDBC 4.0 version, it is automatically loaded)
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String connectionUrl = "jdbc:mysql://localhost:3306/book_management_system";
		String userName = "root";
		String password = "root";
		Connection conn = null;
		try {
			//2.2 Establish connection with server
			conn = DriverManager.getConnection(connectionUrl, userName, password);
			System.out.println("Connection Established...");
			//2.3 Create a Statement and execute it
			Statement stmt = conn.createStatement();
			String query = "select * from book_details";
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println("Book ID:" + rs.getInt("book_id"));
				System.out.println("Book Title:" + rs.getString("book_title"));
				System.out.println("Book Cost:" + rs.getInt("book_cost"));
				System.out.println("******************************");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//2.4 handle the exception
	}

}
