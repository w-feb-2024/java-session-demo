import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class InsertBookDemo {

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
			//2.3 Create a Statement and execute it
			Statement stmt = conn.createStatement();
			String bTitle = "Harry Potter and the Half Blood Prince";
			String bGenre = "Fantasy";
			int bCost = 450;
			int bAuthorId = 3;
			LocalDate bPublishedDate = LocalDate.of(2010, 11, 05);
			
			String query = "insert into book_details(book_title, book_author_id, book_genre, book_published, book_cost, book_image_url) values ('"+bTitle+"',"+bAuthorId+",'"+bGenre+"','"+bPublishedDate+"',"+bCost+",'')";
			//System.out.println(query);
			int rowsAffected = stmt.executeUpdate(query);
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
