package hw_1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class EchoSender_UDP {
	public static void main(String[] args) {
		try {
			//프로그램 실행시에 전달받는 첫번째는  데이터를 수신하는 컴퓨터의 ip주소 입니다.
			String ip = args[0];
			
			//프로그램 실행시에 전달받는 두번재는 약속한 포트번호입니다.
			int port  = Integer.parseInt(args[1]);
			
			//프로그램 실행시에 전달받는 세번째는 전달한 내용입니다.			
			String msg = args[2];
			
			//전달할 내용을 바이트로 변환합니다.
			byte[] data = msg.getBytes();
			
			//ip주소를 갖고 InetAddress객체를 생성합니다.
			InetAddress addr = InetAddress.getByName(ip);
			
			//UDP방식의 데이터 전송단위인 패킷을 생성합니다.
			DatagramPacket packet = new DatagramPacket(data, data.length, addr, port);
			
			//데이터를 전송하기 위한 데이터그램소켓 객체를 생성합니다.
			DatagramSocket socket = new DatagramSocket();
			
			//데이터를 전송합니다.
			socket.send(packet);
			
			//데이터를 전달 받는다.
			socket.receive(packet);
			
			byte[] remsg = new byte[100];
			String msg2 = new String(remsg);
			System.out.println("다시 받은 메세지:"+ msg2);
			
			//사용했던 자원을 닫아 줍니다.
			socket.close();
			
		}catch (Exception e) {
			System.out.println("예외발생: "+e.getMessage());
		}
	}
}
