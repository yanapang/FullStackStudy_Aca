package hw_1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class EchoReceiver_UDP {
	public static void main(String[] args) {
		try {
			// 데이터를 주고받기위한 소켓객체 생성
			DatagramSocket socket = new DatagramSocket(9001);
			
			//데이터를 계속 받기위해 무기한 대기상태
			while(true) {
				//수신된 데이터를 받기 위한 패켓생성
				byte[] data = new byte[100];
				DatagramPacket packet = new DatagramPacket(data, data.length);
				socket.receive(packet);
				
				String msg = new String(data);
				System.out.println("Sender로부터 받은 메세지: "+msg);
				
				socket.send(packet);
				
			}//while

		}catch (Exception e) {
			System.out.println("예외발생: "+e.getMessage());
		}//catch
	}//main

}
