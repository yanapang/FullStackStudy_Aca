package exam01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

import javax.imageio.spi.IIOServiceProvider;

public class DictionaryClient {

	public static void main(String[] args) {
		try {
			//서버에게 통신 요청
			Socket socket = new Socket("192.168.10.17", 9003);
			
			//데이터를 주고받기위한 스트림생성.
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			//입력을 받기위한 scanner 생성
			Scanner sc = new Scanner(System.in);
			
			//영어단어를 입력받기 위한 변수를 선언.
			String eng;
			
			//서버가 보내온 배열을 받아와 저장하기 위한 변수.
			byte []data = new byte[100];
			
			//계속 실행
			while(true) {
				
				System.out.println("영어단어를 입력하세요: ");
				eng = sc.next();
				
				//String으로 저장된 영어단어를 바이트형으로 변환한 후 
				//outpuStream을 통해 보냄.
				os.write(eng.getBytes());
				
				//만약 입력받은 영어단어가 q!이면 종료.
				if(eng.equals("q!")) {break;}
				
				//서버가 번역한 데이터를 받아온다.
				is.read(data);
				
				//받아온 데이터가 있는 배열을 가지고 문자열을 만든다.
				String kor = new String(data);
				
				//화면에 출력
				System.out.println("서버로부터 수신된 번역결과: "+kor);
				
				//다음데이터 수신을 위해 배열 비워줌.
				Arrays.fill(data, (byte)0);
			}
			
		}catch (Exception e) {
			System.out.println("예외발생: "+e.getMessage());
		}

	}

}
