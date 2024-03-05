import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class DeleteBookDemo {

	public static void main(String[] args) {
		//2.1 Load the driver ( is not needed from JDBC 4.0 version, it is automatically loaded)
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded...");
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
			System.out.println("Connection established...");
			//2.3 Create a PreparedStatement and execute it
			int bookId = 10;
			String query = "delete from book_details where book_id=?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, bookId);
			int rowsAffected = pstmt.executeUpdate();
			System.out.println(rowsAffected + " row(s) affected...");
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
