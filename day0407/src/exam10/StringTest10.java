package exam10;
//comma 기준으로 스트링 분리

public class StringTest10 {

	public static void main(String[] args) {
		String data = "김도연,김소윤,김혜림,백지연,이창희";
		//컴마로 분리되는 스트링.
		//split 메소드를 이용하여 모든 사람의 이름을 출력한다. 
		
		String []arr = data.split(",");
		for(String name: arr) {
			System.out.println(name);
		}
		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
	}
	//배열의 길이: length
	//문자열의 길이: length()
}
