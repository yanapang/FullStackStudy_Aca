package day0330;

public class WhileAndDoWHile {

	public static void main(String[] args) {
		int i=10;
		//ó������ ������ �������� ���� ��Ȳ�϶���
		//while���� �ݺ����� �ѹ��� �������� �ʾƿ�.
		while(i<=5) {
			System.out.println("hello");
			i++;
		}
		
		System.out.println("------------------");
		//ó������ ������ �������� �ʴ� ��Ȳ�̶�
		//��� �ݺ����� �ѹ� ����.
		int j=10;
		do {
			System.out.println("hello");
			j++;
		} while(j<=5);
	}

}
