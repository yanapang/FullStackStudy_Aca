package teamProgramming;
import java.io.InputStream;
import java.io.OutputStream;
//클라이언트로부터 텍스트를 받아서, 전부 대문자로 만들어 다시 보내는 프로그램.
//여러 클라이언트 처리, Thread 사용한다.
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

class ServerThread extends Thread{
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
	
	@Override
	public void run() {
		while(true) {
			try {
				byte []data = new byte[100];
				
				is.read(data);
				String msg = new String(data);
				System.out.println("클라이언트가 전송한 텍스트: "+ msg);

				String toUpper = msg.toUpperCase();
				os.write(toUpper.getBytes());
				System.out.println("클라이언트로 보낸 텍스트: "+ toUpper);
				
				//배열을 비워준다.
				Arrays.fill(data, (byte)0);
				
			} catch (Exception e) {
				System.out.println("예외발생: "+e.getMessage());
			} 
		}
	}
	
}

public class UpperCaseServer {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9001);
			System.out.println("**서버 프로그램입니다.**");
			
			while(true) {
				Socket socket = server.accept();
				System.out.println("연결되었습니다.");
				
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				
				//연결한 클라이언트를 상대할 thread를 생성한다.
				ServerThread thread = new ServerThread(socket);
				
				//클라이언트와 계속하여 대화를 이어가도록 쓰레드를 가동시킨다.
				thread.start();	
				
			}
			
		} catch (Exception e) {
			System.out.println("예외발생: "+e.getMessage());
		}

	}

}
