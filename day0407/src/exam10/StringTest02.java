package exam10;

public class StringTest02 {
	
	//문자열을 매개변수로 갖는 메소드는 대체로 String으로 되어 있다.
	public static void pro(String data) { 
		System.out.println(data);
	}

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello");
		sb.append(" java");
		
		//pro(sb);
		//pro(new String(sb));
		
		//StringBuffer를 String으로 바꿔달라는 의미
		pro(sb.toString());
		
		//변하는 문자열 처리를 위하여 StringBuffer로 처리된 객체를 바로 String을 매개변수로 갖는 메소드를 호출 할 수 없다.
		//객체를 바로 String을 생성자로 String객체를 생성한 후 호출 또는 toString메소드를 통하여 string으로 변환 후 호출해야한다.
	}

}
