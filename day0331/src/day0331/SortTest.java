package day0331;

public class SortTest {

	public static void main(String[] args) {
		int []data= {15,24,10,18,44,42};
		
		//����: ���� ũ�� ������� ��ġ�ϴ� ��.
		//��������: ���� ������ ������� ���� ��.
		//��������: ���� ū�� ������� ���� ��.
		
		for (int i=0; i<data.length; i++) { //i��° ���� �״���, j��° ���� ��
			for(int j=i+1; j<data.length; j++) {
				if (data[j]<data[i]) { //j���� �� ������ i�� j�� �ٲٱ�.
					int temp = data[i];
					data[i]=data[j];
					data[j]=temp;
				} 
			}
		}//���� �ݺ���
		
		//��� �ݺ���
		for (int i=0; i<data.length; i++) {
			System.out.print(data[i]+" ");
		}
	}
	

}
