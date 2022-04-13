package teamProgram;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class LottoClient {

	public static void main(String[] args) {
		try {
			
			Socket client = new Socket("192.168.219.105", 1000);
			
			InputStream is = client.getInputStream();
			OutputStream os = client.getOutputStream();
			
			//6. 데이터를 주고 받음.
			for(int i=1; i<=6; i++) {
				int n = is.read();
				System.out.println("서버로부터 수신된 데이터: "+n);
				Thread.sleep(200);
			}
			
			System.out.println("수신완료.");
			
			is.close();
			os.close();
			client.close();
			
		} catch (Exception e) {
			System.out.println("예외발생: "+e.getMessage());
		}
	}

}
