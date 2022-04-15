package exam01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

import javax.imageio.spi.IIOServiceProvider;

public class DictionaryClient {

	public static void main(String[] args) {
		try {
			//�������� ��� ��û
			Socket socket = new Socket("192.168.10.17", 9003);
			
			//�����͸� �ְ�ޱ����� ��Ʈ������.
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			//�Է��� �ޱ����� scanner ����
			Scanner sc = new Scanner(System.in);
			
			//����ܾ �Է¹ޱ� ���� ������ ����.
			String eng;
			
			//������ ������ �迭�� �޾ƿ� �����ϱ� ���� ����.
			byte []data = new byte[100];
			
			//��� ����
			while(true) {
				
				System.out.println("����ܾ �Է��ϼ���: ");
				eng = sc.next();
				
				//String���� ����� ����ܾ ����Ʈ������ ��ȯ�� �� 
				//outpuStream�� ���� ����.
				os.write(eng.getBytes());
				
				//���� �Է¹��� ����ܾ q!�̸� ����.
				if(eng.equals("q!")) {break;}
				
				//������ ������ �����͸� �޾ƿ´�.
				is.read(data);
				
				//�޾ƿ� �����Ͱ� �ִ� �迭�� ������ ���ڿ��� �����.
				String kor = new String(data);
				
				//ȭ�鿡 ���
				System.out.println("�����κ��� ���ŵ� �������: "+kor);
				
				//���������� ������ ���� �迭 �����.
				Arrays.fill(data, (byte)0);
			}
			
		}catch (Exception e) {
			System.out.println("���ܹ߻�: "+e.getMessage());
		}

	}

}
