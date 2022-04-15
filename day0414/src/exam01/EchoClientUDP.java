package exam01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Scanner;

public class EchoClientUDP {

	public static void main(String[] args) {
		try {
			
			//UDP방식에서는 데이터를 주고받는 단위가 데이터그램 패킷입니다.
			//수신된 데이터를 받을때 필요한 배열을 만든다.
			byte[]data = new byte[100];
			
			//데이터를 보낼 패킷을 만들때 피료한 InetAddress객체를 생성.
			InetAddress addr = InetAddress.getByName("192.168.10.17");
			//포트 번호를 변수에 저장.
			int port = 9002;
			
			
			//UDP방식에서 데이터를 주고받는 메소드를 갖고 있는 데이터 그램 소켓 생성.
			DatagramSocket socket = new DatagramSocket();
			//UDP방식에서 데이터를 주고받는 단위인 데이터그램패킷 변수 선언.
			DatagramPacket packet = null;
		
			//서버가 메아리 하는 데이터를 받기 위한 패킷
			DatagramPacket repacket = new DatagramPacket(data, data.length);
			
			//서버로 보내고자 하는 문자열을 입력받기 위한 변수를 선언한다.
			String msg;
			//키보드로부터 입력받기 위해 스캐너를 생성.
			Scanner sc = new Scanner(System.in);
			//계속하여 동작한다.
			while(true) {
				//키보드로부터ㅓ버로 보낼문자열을 입력한다.
				System.out.println("서버로 보낼 문자열을 입력: ");
				msg = sc.next();
				
				//만약 입력한문자이아래와 같으면 종료.
				if (msg.equals("q!")) {
					break;
				}
				//입력한 문자열, 목적지의 주소, 포트번호를 갖고 
				//UDP 방식으로 데이터를 보내기 위해 패킷 객체 생성.
				packet = new DatagramPacket
						(msg.getBytes(), msg.getBytes().length, addr, port);
				
				//UDP방식으로 데이터를 보내기 위한 객체인 데이터그래 소켓을 통해 데이터를 보낸다.
				socket.send(packet);
				
				//서버가 메아리하는 데이터를 받는다.
				socket.receive(repacket);
				
				System.out.println("서버로부터 다시 메아리된 데이터: "+new String(data).trim());
				
				Arrays.fill(data, (byte)0);
				
			}
			//사용했던 자원을 닫아줌.
			socket.close();
			System.out.println("***종료하였습니다.***");
			
		}catch (Exception e) {
			System.out.println("예외발생: "+e.getMessage());
		}

	}

}
