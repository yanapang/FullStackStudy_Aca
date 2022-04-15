package exam01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.HashMap;

public class DictionaryServerUDP {
	public static void main(String[] args) {
		//����ܾ key�� �ϰ� �ѱ�� ������ �ϴ� �� ����.
		//HashMap�� ���� �ʿ���¶� ���.
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("apple", "���");
		map.put("grape", "����");
		map.put("watermelon", "����");
		map.put("strawberry", "����");
		
		try {
			//UDP ����� �����͸� �ְ� ���� �����ͱ׷� ���� ��ü ����.
			DatagramSocket socket = new DatagramSocket(9004);
			
			System.out.println("*** ������ �غ�Ǿ����ϴ�. ***");
			//��Ŷ ������ �ʿ��� �迭�� �����.
			byte []data = new byte[100];
			
			//UDP ����� ������ ���� ������ ��Ŷ ����.
			DatagramPacket packet = new DatagramPacket(data, data.length);
			
			//������ ������ ������ ���� ��Ŷ ������ ����.
			DatagramPacket rePacket = null;
			
			//Ŭ���̾�Ʈ�κ��� ���� �����͸� ��� �ޱ� ���� ���ѷ����� ����.
			while(true) {
				//Ŭ���̾�Ʈ�κ��� �����͸� �޴´�.
				socket.receive(packet);
				
				//���ŵ� �����Ͱ� ��� �迭�� ���� ���ڿ� ����.
				String eng = new String(data).trim();
				
				System.out.println("���ŵ� ������: "+ eng);
				
				//���� ���ŵ� ���ڿ��� q!�̶�� �����Ѵ�. map���� ���� ����.
				if(eng.equals("q!")) {break;}
				
				//eng�� key�� �Ͽ� �ʿ��� kor ��ȯ
				String kor = map.get(eng);
				
				//���� ������ ��ϵ� �ܾ �ƴ϶�� "����"����. 
				//map�� ���� ������ null��ȯ�̹Ƿ� if�� ���ǽ��� kor==null��.
				if(kor == null) {kor="����";}
				
				//�������� ���� ��Ŷ�� ���� �����.
				
				//�����͸� ������ ���� ������ �ּҸ� ������ ��Ŷ���� ���� �޾ƿ´�.
				InetAddress reAddr = packet.getAddress();
				
				//�����͸� ������ ���� �������� port��ȣ�� �޾ƿ´�.
				int rePort = packet.getPort();
				
				rePacket = new DatagramPacket(kor.getBytes(), 
						kor.getBytes().length,
						reAddr, rePort);
				
				//������ ��Ŷ�� Ŭ���̾�Ʈ���� ������.
				socket.send(rePacket);
				
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
