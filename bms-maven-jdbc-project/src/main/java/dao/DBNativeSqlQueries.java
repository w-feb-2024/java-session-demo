package dao;

public class DBNativeSqlQueries {
	public static final String BOOK_DELETE = "delete from book_details where book_id=?";
	public static final String BOOK_FETCH_BY_ID = "select * from book_details where book_id=?";
	public static final String BOOK_FETCH_ALL = "select * from book_details";
	public static final String BOOK_FETCH_BY_GENRE = "select * from book_details where book_genre=?";
	public static final String BOOK_ADD = "insert into book_details(book_title, book_author_id, book_cost, book_published, book_genre, book_image_url) value(?,?,?,?,?,?)";
	public static final String BOOK_UPDATE = "update book_details set book_cost=? where book_id=?";
}
