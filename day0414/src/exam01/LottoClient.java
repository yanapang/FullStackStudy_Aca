package exam01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class LottoClient {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("192.168.10.17", 9000);
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			System.out.println("서버로 부터 수신받은 로또번호는 다음과 같습니다.");
			for(int i=1; i<=6; i++) {
				int n = is.read();
				System.out.println(n+" ");
				Thread.sleep(200);
			}
			is.close();
			os.close();
			socket.close();
		}catch(Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}

	}

}
