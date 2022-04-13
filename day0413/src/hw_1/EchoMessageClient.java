package hw_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

//TCP Echo Eessage Client
public class EchoMessageClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			Socket client = new Socket("192.168.219.105", 1004);
			
			BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			PrintWriter out = new PrintWriter(client.getOutputStream());
			
			while(true) {
				System.out.println("To Server: ");
				String msg = sc.nextLine();
				
				if(msg.equalsIgnoreCase("quit")) {
					out.println(msg);
					out.flush();
					break;
					
				}
				out.println(msg);
				out.flush();
				String smsg = in.readLine();
				System.out.println("서버로 부터 온 메세지: "+smsg);
				Thread.sleep(300);
			}
			in.close();
			out.close();
			client.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error Incurred: "+ e.getMessage());
		}
		
	}
}
