package day0330;

public class WhileTest {
	public static void main(String[] args) {
		int i = 1;
		
//1)		while(i<=3) {
//		System.out.println("hello");
//		i++;
//	}
		
		
		
//2)		//boolean flag = true;
		//while(flag) or  while(true) �ǳ� ���̾�� �Ҷ� ���.
		
		/*
		 * boolean flag = true;
		while(flag) {
			if (i>3) { //while ������ ������ ����
				break;// �� ��Ȳ�� ������ while�� Ż��.
			}
			System.out.println("hello");
			i++;
		}
		System.out.println("����");
		System.out.println("i:"+i);
		*/
		
//3)
		boolean flag = false;
		while(!flag) {
			System.out.println("hello");
			i++;
			if (i>3) {
				flag = true;
			}
		}
		System.out.println("����");
		System.out.println("i:"+i);
	}

}
