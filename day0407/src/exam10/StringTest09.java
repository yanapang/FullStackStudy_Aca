package exam10;

public class StringTest09 {

	public static void main(String[] args) {
		String data = "hello java";
		int n = data.indexOf('a');//7번째 
		int n2 = data.indexOf("java"); //6번째 
		
		System.out.println(n);
		System.out.println(n2);
		System.out.println("-------------");
		
		int n3 = data.lastIndexOf("a");//9번째. 마지막 'a'의 인덱스
		System.out.println(n3);
		
		String data2= data.replace("java", "oracle");//바뀐것을 유지하려면새로운 변수에 담아야함.
		data.replace("java", "oracle");//바뀐것이 유지되지 않음.
		System.out.println(data2);
		System.out.println(data);
	}

}
