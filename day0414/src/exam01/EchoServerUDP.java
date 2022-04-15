package exam01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Arrays;

public class EchoServerUDP {

	public static void main(String[] args) {
		try {
			//UDP��Ŀ��� �����͸� �ְ� �ޱ� ���� �����ͱ׷� ������ �̿��Ѵ�.
			DatagramSocket socket = new DatagramSocket(9002);
			
			//�����͸� ���� �迭�� �����.
			byte []data = new byte[100];
			
			//UDP ��Ŀ��� �����͸� �ְ�޴� ������ �����ͱ׷� ��Ŷ����.
			DatagramPacket packet = new DatagramPacket(data, data.length);
			
			
			
			//��� �����Ѵ�.
			while(true) {
				//UDP��Ŀ��� �����͸� �ְ� �޴� ����� �����ִ� �����ͱ׷� ���ϰ�ü�� ����
				//�����͸� �޴´�.
				socket.receive(packet);
				//���⼭�� �״�� �������⸸ �ϸ�ǹǷ� ��Ʈ������ �ٲ��ʿ����
				//������ �״�� ������
				socket.send(packet);
				
				//������ ���ڿ��� q!�̸� ����
				String msg = (new String(data)).trim();
				if(msg.equals("q!")) { break;}
				
				System.out.println("Ŭ���̾�Ʈ�� ���� ���ŵ� ������: "+msg);
				//100����Ʈ�� ���Ƿ� ������ ���� �� �־� trim ���
				
				
				//���������ͼ����� ���� �迭�� ����ش�.
				Arrays.fill(data, (byte)0);
			}
			//����ߴ� �ڿ��� �ݾ���.
			socket.close();
			
		}catch (Exception e) {
			System.out.println("���ܹ߻�: "+e.getMessage());
		}

	}

}
