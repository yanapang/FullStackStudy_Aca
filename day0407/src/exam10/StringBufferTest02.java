package exam10;

public class StringBufferTest02 {
	public static void execute(String sql) {
		System.out.println("-------------------");
		System.out.println(sql+"을 동작하였습니다.");
		System.out.println("-------------------");
	}
	
	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer();
		sql.append("member");//스트링 버퍼에 추가.
		sql.append(" values(?,?,?,?,?)");//뒤에 추가.
		System.out.println(sql);
		sql.insert(0, "insert into ");//맨 앞 0번째 인덱스에 추가.
		System.out.println(sql);
		
		//execute(sql);
		execute(sql.toString());
	}
}
