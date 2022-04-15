package exam01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Arrays;

public class EchoServerUDP {

	public static void main(String[] args) {
		try {
			//UDP방식에서 데이터를 주고 받기 위해 데이터그램 소켓을 이용한다.
			DatagramSocket socket = new DatagramSocket(9002);
			
			//데이터를 담을 배열을 만든다.
			byte []data = new byte[100];
			
			//UDP 방식에서 데이터를 주고받는 단위인 데이터그램 패킷생성.
			DatagramPacket packet = new DatagramPacket(data, data.length);
			
			
			
			//계속 동작한다.
			while(true) {
				//UDP방식에서 데이터를 주고 받는 기능을 갖고있는 데이터그램 소켓객체를 통해
				//데이터를 받는다.
				socket.receive(packet);
				//여기서는 그대로 내보내기만 하면되므로 스트링으로 바꿀필요없이
				//받은걸 그대로 내보냄
				socket.send(packet);
				
				//수신한 문자열이 q!이면 종료
				String msg = (new String(data)).trim();
				if(msg.equals("q!")) { break;}
				
				System.out.println("클라이언트로 부터 수신된 데이터: "+msg);
				//100바이트씩 오므로 공백이 있을 수 있어 trim 사용
				
				
				//다음데이터수신을 위해 배열을 비워준다.
				Arrays.fill(data, (byte)0);
			}
			//사용했던 자원을 닫아줌.
			socket.close();
			
		}catch (Exception e) {
			System.out.println("예외발생: "+e.getMessage());
		}

	}

}
