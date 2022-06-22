//DB PKG

public class MemberManager {

	public static SqlSessionFactory sqlSessionFactory;
	static {
		
		try {
			String resource = "com/example/demo/db/sqlMapConfig.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory =
			  new SqlSessionFactoryBuilder().build(inputStream);
			
		} catch(Exception e) {
			System.out.println("Error : "+ e.getMessage());
		}
	}
	
	public static int insert(MemberVO m) {
		int re=-1;
		SqlSession session = sqlSessionFactory.openSession();
		re = session.insert("member.insert", m);
		session.commit();
		session.close();
		return re;
	}
	
	
	public static MemberVO findById(String id) {
		SqlSession session = sqlSessionFactory.openSession();
		MemberVO m = session.selectOne("member.findById", id);
		session.close();
		return m;
	}
	
}
