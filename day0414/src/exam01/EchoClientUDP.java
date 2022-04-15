package exam01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Scanner;

public class EchoClientUDP {

	public static void main(String[] args) {
		try {
			
			//UDP��Ŀ����� �����͸� �ְ�޴� ������ �����ͱ׷� ��Ŷ�Դϴ�.
			//���ŵ� �����͸� ������ �ʿ��� �迭�� �����.
			byte[]data = new byte[100];
			
			//�����͸� ���� ��Ŷ�� ���鶧 �Ƿ��� InetAddress��ü�� ����.
			InetAddress addr = InetAddress.getByName("192.168.10.17");
			//��Ʈ ��ȣ�� ������ ����.
			int port = 9002;
			
			
			//UDP��Ŀ��� �����͸� �ְ�޴� �޼ҵ带 ���� �ִ� ������ �׷� ���� ����.
			DatagramSocket socket = new DatagramSocket();
			//UDP��Ŀ��� �����͸� �ְ�޴� ������ �����ͱ׷���Ŷ ���� ����.
			DatagramPacket packet = null;
		
			//������ �޾Ƹ� �ϴ� �����͸� �ޱ� ���� ��Ŷ
			DatagramPacket repacket = new DatagramPacket(data, data.length);
			
			//������ �������� �ϴ� ���ڿ��� �Է¹ޱ� ���� ������ �����Ѵ�.
			String msg;
			//Ű����κ��� �Է¹ޱ� ���� ��ĳ�ʸ� ����.
			Scanner sc = new Scanner(System.in);
			//����Ͽ� �����Ѵ�.
			while(true) {
				//Ű����κ��ͤù��� �������ڿ��� �Է��Ѵ�.
				System.out.println("������ ���� ���ڿ��� �Է�: ");
				msg = sc.next();
				
				//���� �Է��ѹ����̾Ʒ��� ������ ����.
				if (msg.equals("q!")) {
					break;
				}
				//�Է��� ���ڿ�, �������� �ּ�, ��Ʈ��ȣ�� ���� 
				//UDP ������� �����͸� ������ ���� ��Ŷ ��ü ����.
				packet = new DatagramPacket
						(msg.getBytes(), msg.getBytes().length, addr, port);
				
				//UDP������� �����͸� ������ ���� ��ü�� �����ͱ׷� ������ ���� �����͸� ������.
				socket.send(packet);
				
				//������ �޾Ƹ��ϴ� �����͸� �޴´�.
				socket.receive(repacket);
				
				System.out.println("�����κ��� �ٽ� �޾Ƹ��� ������: "+new String(data).trim());
				
				Arrays.fill(data, (byte)0);
				
			}
			//����ߴ� �ڿ��� �ݾ���.
			socket.close();
			System.out.println("***�����Ͽ����ϴ�.***");
			
		}catch (Exception e) {
			System.out.println("���ܹ߻�: "+e.getMessage());
		}

	}

}
