package exam02;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class EchoServer {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9001);
			System.out.println("**서버가 가동되었습니다.**");
			
			while(true) {
				Socket socket = server.accept();
				System.out.println("클라이언트가 연결하였습니다.");
				System.out.println("-------------------------------");
				
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				
				byte []data = new byte[100]; //메시지를 받을 배열.
				while(true) {
					is.read(data);//메시지를 받음.
					String msg = new String(data);//메시지르 스트링으로 변환
					if(msg.trim().equals("q!")) {
						break;
					}
					os.write(data);
					System.out.println("클라이언트로 수신된 데이터 "+msg+" 다시 메아리 하였습니다.");
					//is.read(data)로 받은걸 그대로내보냄.
					//메아리
					Arrays.fill(data, (byte)0);
					//배열을 0으로 지워줌.
				}
				System.out.println("클라이언트와 연결을 종료하였습니다.");
				System.out.println("--------------------------------");
				is.close();
				os.close();
				socket.close();
			}
		} catch(Exception e) {
			System.out.println("예외발생: "+e.getMessage());
		}

	}

}
