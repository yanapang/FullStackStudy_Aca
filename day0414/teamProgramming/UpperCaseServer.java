package teamProgramming;
import java.io.InputStream;
import java.io.OutputStream;
//Ŭ���̾�Ʈ�κ��� �ؽ�Ʈ�� �޾Ƽ�, ���� �빮�ڷ� ����� �ٽ� ������ ���α׷�.
//���� Ŭ���̾�Ʈ ó��, Thread ����Ѵ�.
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

class ServerThread extends Thread{
	Socket socket;
	
	//�����͸� �ְ� ���� ��Ʈ���� ��� ������ ����.
	InputStream is;
	OutputStream os;
	
	//���ŵ� �����͸� ���� �迭�� �����.
	byte []data = new byte[100];
	
	//�����ÿ� ������ ���޹޾Ƽ� ��Ʈ���� �����Ѵ�.
	public ServerThread(Socket socket) {
		try {
			this.socket = socket;
			is = socket.getInputStream();
			os = socket.getOutputStream();
		} catch (Exception e) {
			System.out.println("���ܹ߻�: "+e.getMessage());
		}
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				byte []data = new byte[100];
				
				is.read(data);
				String msg = new String(data);
				System.out.println("Ŭ���̾�Ʈ�� ������ �ؽ�Ʈ: "+ msg);

				String toUpper = msg.toUpperCase();
				os.write(toUpper.getBytes());
				System.out.println("Ŭ���̾�Ʈ�� ���� �ؽ�Ʈ: "+ toUpper);
				
				//�迭�� ����ش�.
				Arrays.fill(data, (byte)0);
				
			} catch (Exception e) {
				System.out.println("���ܹ߻�: "+e.getMessage());
			} 
		}
	}
	
}

public class UpperCaseServer {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9001);
			System.out.println("**���� ���α׷��Դϴ�.**");
			
			while(true) {
				Socket socket = server.accept();
				System.out.println("����Ǿ����ϴ�.");
				
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				
				//������ Ŭ���̾�Ʈ�� ����� thread�� �����Ѵ�.
				ServerThread thread = new ServerThread(socket);
				
				//Ŭ���̾�Ʈ�� ����Ͽ� ��ȭ�� �̾���� �����带 ������Ų��.
				thread.start();	
				
			}
			
		} catch (Exception e) {
			System.out.println("���ܹ߻�: "+e.getMessage());
		}

	}

}
