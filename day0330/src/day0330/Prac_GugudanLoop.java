package day0330;
//��ø�ݺ��� �̿��� ������ ���.
public class Prac_GugudanLoop {

	public static void main(String[] args) {
		for (int dan=2; dan<=9; dan++) {
			System.out.println(dan+"��");
			for(int j=1; j<=9; j++) {
				System.out.println(dan+"*"+j+"="+(dan*j));
			}
			System.out.println("---------");
		}

	}

}
