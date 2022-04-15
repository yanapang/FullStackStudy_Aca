package exam01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.HashMap;

//tcp 방식
public class DictionaryServer {

	public static void main(String[] args) {
		//영어단어를 key로 하고 한국어를 값으로 하는 맵 생성.
		//HashMap은 정렬 필요없는때 사용.
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("apple", "사과");
		map.put("grape", "포도");
		map.put("watermelon", "수박");
		map.put("strawberry", "딸기");
		
		try {
			//tcp 방식의 통신을 위해 서버 소켓 생성.
			ServerSocket server = new ServerSocket(9003);
			
			System.out.println("*** 서버가 가동되었습니다. ***");
			//클라이언트가 보내오는 데이터를 받기 위한 배열을 만든다.
			byte []data = new byte[100];
			
			//클라이언트의 접속을 위해 무한대기
			while(true) {
				//클라이언트의 접속을 수락.
				Socket socket = server.accept();				
				
				System.out.println("***클라이언트가 접속하였습니다.***");
				//데이터를 주고받기위한 스트림생성.
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				
				//클라이언트가 보내는 데이터를 받기 위해 무한루프
				while(true) {
					//클라이언트가 보낸 데이터를 배열(이름:데이터)에 담음.
					is.read(data);
					
					//받아온 데이터가 담긴 배열을 갖고 문자열을 만든다.
					String eng = new String(data).trim();
					
					//수신된 문자열이 q!이면 종료.
					if (eng.equals("q!")) {break;}
					
					//영어사전이 담긴 map으로 부터 영어단어를 키로하는 한국어를 뽑아온다.
					String kor = map.get(eng);
					
					//-----사전에 등록되어 있지 않은 단어라면 "없음"이라고 저장.
					if(kor == null) { kor = "없음"; }
					
					//뽑아온 한국어를 클라이언트로 내 보낸다.
					os.write(kor.getBytes());
					
					System.out.println(eng+"에 대한 번역 "+kor+"를 전송하였습니다.");
					//다음데이터 수신을 위해 배열을 비워준다.
					Arrays.fill(data, (byte)0);
				}
				System.out.println("***클라이언트와 연결이 끊어 졌습니다..***");
			}
		}catch (Exception e) {
			System.out.println("예외발생: "+e.getMessage());
		}
	}

}
