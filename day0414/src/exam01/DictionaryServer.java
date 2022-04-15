package exam01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.HashMap;

//tcp ���
public class DictionaryServer {

	public static void main(String[] args) {
		//����ܾ key�� �ϰ� �ѱ�� ������ �ϴ� �� ����.
		//HashMap�� ���� �ʿ���¶� ���.
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("apple", "���");
		map.put("grape", "����");
		map.put("watermelon", "����");
		map.put("strawberry", "����");
		
		try {
			//tcp ����� ����� ���� ���� ���� ����.
			ServerSocket server = new ServerSocket(9003);
			
			System.out.println("*** ������ �����Ǿ����ϴ�. ***");
			//Ŭ���̾�Ʈ�� �������� �����͸� �ޱ� ���� �迭�� �����.
			byte []data = new byte[100];
			
			//Ŭ���̾�Ʈ�� ������ ���� ���Ѵ��
			while(true) {
				//Ŭ���̾�Ʈ�� ������ ����.
				Socket socket = server.accept();				
				
				System.out.println("***Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.***");
				//�����͸� �ְ�ޱ����� ��Ʈ������.
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				
				//Ŭ���̾�Ʈ�� ������ �����͸� �ޱ� ���� ���ѷ���
				while(true) {
					//Ŭ���̾�Ʈ�� ���� �����͸� �迭(�̸�:������)�� ����.
					is.read(data);
					
					//�޾ƿ� �����Ͱ� ��� �迭�� ���� ���ڿ��� �����.
					String eng = new String(data).trim();
					
					//���ŵ� ���ڿ��� q!�̸� ����.
					if (eng.equals("q!")) {break;}
					
					//��������� ��� map���� ���� ����ܾ Ű���ϴ� �ѱ�� �̾ƿ´�.
					String kor = map.get(eng);
					
					//-----������ ��ϵǾ� ���� ���� �ܾ��� "����"�̶�� ����.
					if(kor == null) { kor = "����"; }
					
					//�̾ƿ� �ѱ�� Ŭ���̾�Ʈ�� �� ������.
					os.write(kor.getBytes());
					
					System.out.println(eng+"�� ���� ���� "+kor+"�� �����Ͽ����ϴ�.");
					//���������� ������ ���� �迭�� ����ش�.
					Arrays.fill(data, (byte)0);
				}
				System.out.println("***Ŭ���̾�Ʈ�� ������ ���� �����ϴ�..***");
			}
		}catch (Exception e) {
			System.out.println("���ܹ߻�: "+e.getMessage());
		}
	}

}
