package teamProgram;
//TCP방식으로 	Lotto번호 제공하는 시스템.

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Random;

public class LottoSystem {
	
	public static void main(String[] args) {
		Random r = new Random();
		
		
		try {
			ServerSocket server = new ServerSocket(1000);
			
			while(true) {
				Socket socket = server.accept();
				System.out.println("***client accessed***");
				
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				
				for(int i=1; i<=6; ) {
					int n = r.nextInt(45)+1;
					
					HashSet<Integer> set = new HashSet<Integer>();
					
					if (set.contains(n)) {
						continue;
					}
					set.add(n);
					i++;
					
					System.out.println("로또번호 생성: "+n);
					
					os.write(n);
					Thread.sleep(200);
				
				}
				System.out.println("프로그램 완료.");
				
				is.close();
				os.close();
				socket.close();
			}
			
		}catch (Exception e) {
			System.out.println("예외발생: "+e.getMessage());
		}
	}
}
