package exam03;
//다수의 클라이언트로 부터 입력을 받아들이는 채팅 서버 만들기.

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


//한명의 클라이언트를 상대하여 대화할 쓰레드 만듬.
class ServerThread extends Thread{
	//연결한 크라이언트와 통신할 소켓을 멤버 변수로 가짐.
	Socket socket;
	
	//데이터를 주고 받을 스트림을 멤버 변수로 가짐.
	InputStream is;
	OutputStream os;
	
	//수신된 데이터를 받을 배열을 만든다.
	byte []data = new byte[100];
	
	
	//생성시에 소켓을 전달받아서 스트림을 생성한다.
	public ServerThread(Socket socket) {
		try {
			this.socket = socket;
			is = socket.getInputStream();
			os = socket.getOutputStream();
		} catch (Exception e) {
			System.out.println("예외발생: "+e.getMessage());
		}
	}
	
	//스레드가 해야 하는 일을 run에 오버라이딩 해 작성한다.
	@Override
	public void run() {
		//나에게 수신된 데이터를 연결된 모든 클라이언트에게 내보낸다.
		//계속 귀를 열고 클라이언트가 보내오는 데이터를 받는다.
		while(true) {
			try {
				//나와 연결된 클라이언트가 보내오는 데이터를 받음.
				is.read(data);//데이터를 inputstream으로 받아와서 데이터에 저장
				
				//연결된 모든 클라이언트들 에게 방송하는 메소드 호출.
				sendAll(data);
				
				//다음 데이터 수신을 위하여 배열을 비워준다.
				Arrays.fill(data, (byte)0);
				
			} catch (Exception e) {
				System.out.println("예외발생: "+e.getMessage());
			} 
		}
	}
	
	//모든 연결된 클라이언트에게 방송하기위한 메소드 정의
	public void sendAll(byte []data) throws Exception{
		//리스트에 담긴 객체를 하나씩 뽑아오면, 연결한 클라이언트와 일대일로 상대하는 스레드 객체
		//리스트에 담긴 수 많큼 반복실행한다.
		for(ServerThread st : ChatServer.list) {
			//쓰레드 객체의 출력스트림을 통하여 데이터를 내 보낸다.
			st.os.write(data);
		}
	}
	
}


public class ChatServer {
	//연결된 클라이언트를 상대할 쓰레드 들을 모아 놓을 리스트를 만든다.
	//객체와 무관하게 사용하도록 static 선언.
	static ArrayList<ServerThread> list = new ArrayList<ServerThread>();
	
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9001);
			System.out.println("**서버가 가동되었습니다.**");
			
			while(true) {
				Socket socket = server.accept();
				System.out.println("클라이언트가 연결하였습니다.");
				System.out.println("-------------------------------");
				
				//연결한 클라이언트를 상대할 thread를 생성한다.
				ServerThread thread = new ServerThread(socket);
				
				//클라이언트와 계속하여 통신을 수행하는 쓰레드 객체를 리스트에 담는다.
				list.add(thread);
				
				//클라이언트와 계속하여 대화를 이어가도록 쓰레드를 가동시킨다.
				thread.start();	
			}
			
		} catch(Exception e) {
			System.out.println("예외발생: "+e.getMessage());
		}

	}

}
