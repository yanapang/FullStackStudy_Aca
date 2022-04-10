package exam01;

import java.util.Scanner;

//회원가입에 필요한 아이디, 암호, 이메일을 입력받아 출력하는 프로그램
//아이디, 암호, 이메일 형식에 맞지 않으면 제대로 된 값을 입력 받을 동안 무한반복.
//처리 조건
//아이디: 6글자 이상이고,첫글자는 영문
//암호: 8글자 이상, 반드시ㅣ 특수문자 하나이상 포함
//이메일:@ 포함. @앞에 2글자 이상. 끝 패턴이 .com, co.kr로 끝나야 함.
public class JoinTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id, pwd, email;
		
		while(true) {
			System.out.print("Input id: ");
			id = sc.next();
			if(id.length() >= 6 && 
					((id.charAt(0)>='A'&&id.charAt(0)<='Z') || 
					(id.charAt(0)>='a'&& id.charAt(0)<='z')))
				break;
			System.out.println("ID는 6글자 이상이고, 첫글자가 영문이어야 합니다.");
		}
		
		do {
			System.out.print("Input Password: ");
			pwd = sc.next();
			
			String data = "!@#$%^&*(),./-+";
			boolean isFlag = false;
			//특수문자가 하나라도 있으면 true리턴하게 하기.
			for(int i=0; i<pwd.length(); i++) {
				char p = pwd.charAt(i);
				for(int j=0; j<data.length(); j++) {
					char d = data.charAt(j);
					isFlag = true;
					break;
				}
				if(isFlag == true) {
					break;
				}
			}
			if(isFlag == true && pwd.length() >= 8) {
				break;
			}
			System.out.println("암호는 8글자 이상이고 특수문자를 포함해야 합니다.");
			System.out.println("가능한 특수문자 : !@#$%^&*(),./-+");
		} while(true);
		
		do {
			System.out.println("Input email: ");
			email = sc.next();
			
			int idx = email.indexOf("@");
			String []data = {".com", "co.kr"};
			boolean flag = false;
			for(String end: data) {
				if(email.endsWith(end)) {
					flag = true;
					break;
				}
			}
			if(idx >= 2 && flag == true) {
				break;
			}
			System.out.println("올바른 이메일 형식이 아닙니다.");
		} while(true);
		
		System.out.println("---------");
		System.out.println("*** 가입정보는 다음과 같습니다. ***");
		System.out.println("ID: "+id);
		System.out.println("PW: "+pwd);
		System.out.println("e-mail: "+ email);
	}

}
