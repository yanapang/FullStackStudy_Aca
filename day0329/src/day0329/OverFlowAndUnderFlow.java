package day0329;

public class OverFlowAndUnderFlow {

	public static void main(String[] args) {
		byte a = 127;
		a = (byte)(a+1); //�⺻�� int�� ��� �� ����, ������ byte�� ��ȯ�� ����.
		System.out.println(a);
		//byte�� ǥ�������� ���� �Ѿ� overflow �Ǿ� -128�� ���.
		//cycleó�� �����.
		
		byte b = -128;
		b = (byte)(b-1);
		System.out.println(b);
		//underflow�Ǿ� 127�� ���.
	}

}
