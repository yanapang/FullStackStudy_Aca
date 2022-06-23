public class BookManager {

	public static SqlSessionFactory sqlSessionFactory;
	static {
		try {
			String resource = "com/example/demo/db/sqlMapConfig.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory =
			  new SqlSessionFactoryBuilder().build(inputStream);
		}catch(Exception e) {
			System.out.println("Error :"+e.getMessage());
		}
	}
	
	public static List<BookVO> listBook() {
		List<BookVO> list = null;
		SqlSession session = sqlSessionFactory.openSession();
		list = session.selectList("book.findAll");
		session.close();
		return list;
	}
	
	public static BookVO getBook(int bookid) {
		BookVO book = null;
		SqlSession session = sqlSessionFactory.openSession();
		book= session.selectOne("book.getBook", bookid);
		session.close();
		return book;
	}
	
	public static int updateBook(BookVO b) {
		int re=-1;
		SqlSession session = sqlSessionFactory.openSession();
		re=session.update("book.update", b);
		session.commit();
		session.close();
		return re;
	}
	
	public static int deleteBook(int bookid) {
		int re=-1;
		SqlSession session = sqlSessionFactory.openSession();
		re=session.delete("book.delete", bookid);
		session.commit();
		session.close();
		return re;
	}
}
