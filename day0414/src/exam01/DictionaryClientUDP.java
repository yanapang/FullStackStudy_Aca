package exam01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Scanner;

public class DictionaryClientUDP {

	public static void main(String[] args) {
		try {
			//UDP����� �����͸� �ְ���� �����ͱ׷� ���� ��ü ����.
			DatagramSocket socket = new DatagramSocket();
			
			System.out.println("*** Ŭ���̾�Ʈ�� �غ�Ǿ����ϴ�. ***");
			
			//Ű���� �Է��� ���� ��ĳ�� ��ü�� ����.
			Scanner sc = new Scanner(System.in);
			
			//����ڷκ��� ����ܾ� �Է��� ���� ������ ����.
			String eng;
			
			//�����κ��� �����Ǿ� ���ŵ� �ѱ�� �����ϱ� ���� ���� ����.
			String kor;
			
			//UDP����� ������ ���۴����� �����ͱ׷� ��Ŷ ������ �����Ѵ�.
			DatagramPacket packet = null;
			
			//���ŵ� �����͸� �����ϱ� ���� �迭�� ����.
			byte []data  = new byte[100];

			//�����κ��� ���ŵ� �ѱ��� ���������͸� �ޱ� ���� ��Ŷ�� ����.
			DatagramPacket rePacket = new DatagramPacket(data, data.length);
			
			//��Ŷ ������ �ʿ��� InetAddress
			InetAddress addr = InetAddress.getByName("192.168.10.17");
			//��Ŷ ������ �ʿ��� port
			int port = 9004;
			
			
			//��� �ݺ��Ͽ� ����.
			while(true) {
				System.out.print("������ ����ܾ �Է��ϼ���: ");
				eng = sc.next();
				
				//�Է¹��� ����ܾ��, ������ �ּ�, ��Ʈ��ȣ�� ����
				//UDP����� ������ ���۴����� ��Ŷ ����.
				packet = new DatagramPacket(eng.getBytes(), 
						eng.getBytes().length, addr, port);
				
				socket.send(packet);
				
				//����, �Է��� ����ܾ "q!"�̸� ����.
				if(eng.equals("q!")) {break;}
				
				//�����κ��� ������ �ѱ�� �����Ѵ�.
				socket.receive(rePacket);
				
				//���ŵ� �����Ͱ� ��� �迭�� ���� ���ڿ��� �����Ѵ�.
				kor = new String(data);
				
				System.out.println("�����κ��� �����Ͽ� ������ ������:"+kor);

				//���������� ������ ���� �迭�� ����ش�.
				Arrays.fill(data, (byte)0);
			}
			
			socket.close();
			System.out.println("*** �����Ͽ����ϴ�. ***");
			
		} catch (Exception e) {
			System.out.println("���ܹ߻�: "+e.getMessage());
		}


	}

}
