package hw_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//TCP Echo Message Server
public class EchoMessage {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(1004);
			
			//클라이언트 접속이 되면 소켓을 리턴받아 저장함.
			Socket clientSocket = server.accept();
			
			//읽어들이기 문자단위.
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			//내보내기 문자단위 
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream());
			
			System.out.println("***Client가 접속하였습니다***");
			
			
			while(true) {
				String msg = in.readLine();
				if(msg.equalsIgnoreCase("quit")) {
					System.out.println("프로그램 종료!");
					break;
				}
				System.out.println("Received from Client: "+msg);
				out.write(msg + "\n");
				Thread.sleep(300);
				System.out.println("message sent back!");
				out.flush();
				
			}
			in.close();
			out.close();
			clientSocket.close();
			server.close();
			
		} catch (Exception e) {
			System.out.println("Error Incurred: "+ e.getMessage());
		}
		

	}

}
