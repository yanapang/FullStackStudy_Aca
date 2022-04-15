package teamProgramming;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class UpperCaseClient {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("192.168.10.17",9001);
			
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			Scanner sc = new Scanner(System.in);
			byte []data = new byte[100];
			String msg;

			while(true) {
				System.out.print("서버로 보낼 문자열을 입력: ");
				msg = sc.next();
				os.write(msg.getBytes());//byte형의 배열로 바꿔서 보냄.
				if(msg.equals("q!")) {
					break;
				}
				is.read(data);
				String reMsg = new String(data);
				System.out.println("서버에서 전송된 텍스트: "+reMsg);
				Arrays.fill(data, (byte)0);
				//배열을 0으로 지워줌.
			}
				
			System.out.println("통신을 종료하였습니다.");
			is.close();
			os.close();
			socket.close();
			
		} catch (Exception e) {
			System.out.println("예외발생: "+e.getMessage());
		}

	}

}
