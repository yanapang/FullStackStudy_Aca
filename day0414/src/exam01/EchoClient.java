package exam01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class EchoClient {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("192.168.10.17",9001);
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			Scanner sc = new Scanner(System.in);
			String msg;
			byte []data = new byte[100];
			while(true) {
				System.out.print("������ ���� ���ڿ��� �Է�: ");
				msg = sc.next();
				os.write(msg.getBytes());//byte���� �迭�� �ٲ㼭 ����.
				if(msg.equals("q!")) {
					break;
				}
				is.read(data);
				String reMsg = new String(data);
				System.out.println("������ ���� �޾Ƹ� �� �޽���: "+reMsg);
				Arrays.fill(data, (byte)0);
				//�迭�� 0���� ������.
			}
				
			System.out.println("����� �����Ͽ����ϴ�.");
			is.close();
			os.close();
			socket.close();
			
		} catch(Exception e) {
			System.out.println("���ܹ߻�: "+e.getMessage());
		}

	}

}
