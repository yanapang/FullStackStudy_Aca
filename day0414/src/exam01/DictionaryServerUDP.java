package exam01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.HashMap;

public class DictionaryServerUDP {
	public static void main(String[] args) {
		//영어단어를 key로 하고 한국어를 값으로 하는 맵 생성.
		//HashMap은 정렬 필요없는때 사용.
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("apple", "사과");
		map.put("grape", "포도");
		map.put("watermelon", "수박");
		map.put("strawberry", "딸기");
		
		try {
			//UDP 방식의 데이터를 주고 받을 데이터그램 소켓 객체 생성.
			DatagramSocket socket = new DatagramSocket(9004);
			
			System.out.println("*** 서버가 준비되었습니다. ***");
			//패킷 생성에 필요한 배열을 만든다.
			byte []data = new byte[100];
			
			//UDP 방식의 데이터 전송 단위인 패킷 생성.
			DatagramPacket packet = new DatagramPacket(data, data.length);
			
			//번역된 데이터 전송을 위한 패킷 변수를 선언.
			DatagramPacket rePacket = null;
			
			//클라이언트로부터 오는 데이터를 계속 받기 위해 무한루프를 구현.
			while(true) {
				//클라이언트로부터 데이터를 받는다.
				socket.receive(packet);
				
				//수신된 데이터가 담긴 배열을 갖고 문자열 생성.
				String eng = new String(data).trim();
				
				System.out.println("수신된 데이터: "+ eng);
				
				//만약 수신된 문자열이 q!이라면 종료한다. map까지 가기 전에.
				if(eng.equals("q!")) {break;}
				
				//eng를 key로 하여 맵에서 kor 반환
				String kor = map.get(eng);
				
				//만약 사전에 등록된 단어가 아니라면 "없음"저장. 
				//map은 값이 없으면 null반환이므로 if절 조건식이 kor==null임.
				if(kor == null) {kor="없음";}
				
				//내보내기 위한 패킷을 따로 만든다.
				
				//데이터를 보내기 위한 목적지 주소를 수신한 패킷으로 부터 받아온다.
				InetAddress reAddr = packet.getAddress();
				
				//데이터를 보내기 위한 목적지의 port번호도 받아온다.
				int rePort = packet.getPort();
				
				rePacket = new DatagramPacket(kor.getBytes(), 
						kor.getBytes().length,
						reAddr, rePort);
				
				//번역된 패킷을 클라이언트에게 보낸다.
				socket.send(rePacket);
				
				//다음데이터 수신을 위해 배열을 비워준다.
				Arrays.fill(data, (byte)0);
			}
			socket.close();
			System.out.println("*** 종료하였습니다. ***");
			
		} catch (Exception e) {
			System.out.println("예외발생: "+e.getMessage());
		}

	}

}
