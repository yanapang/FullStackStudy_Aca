package day0329;

public class CharacterTest {

	public static void main(String[] args) {
		char a = 'ȫ';
		String b = "ȫ�浿";
		String c = "ȫ";
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//char d = "ȫ"; char�� " "������� ���� ��.
		//String e = 'ȫ'; String�� ' ' ������� ����.
		
		String data = "hello";
		char first = data.charAt(0);
		System.out.println(first);
	}

}
