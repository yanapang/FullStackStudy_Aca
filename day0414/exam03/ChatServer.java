package exam03;
//�ټ��� Ŭ���̾�Ʈ�� ���� �Է��� �޾Ƶ��̴� ä�� ���� �����.

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


//�Ѹ��� Ŭ���̾�Ʈ�� ����Ͽ� ��ȭ�� ������ ����.
class ServerThread extends Thread{
	//������ ũ���̾�Ʈ�� ����� ������ ��� ������ ����.
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
	
	//�����尡 �ؾ� �ϴ� ���� run�� �������̵� �� �ۼ��Ѵ�.
	@Override
	public void run() {
		//������ ���ŵ� �����͸� ����� ��� Ŭ���̾�Ʈ���� ��������.
		//��� �͸� ���� Ŭ���̾�Ʈ�� �������� �����͸� �޴´�.
		while(true) {
			try {
				//���� ����� Ŭ���̾�Ʈ�� �������� �����͸� ����.
				is.read(data);//�����͸� inputstream���� �޾ƿͼ� �����Ϳ� ����
				
				//����� ��� Ŭ���̾�Ʈ�� ���� ����ϴ� �޼ҵ� ȣ��.
				sendAll(data);
				
				//���� ������ ������ ���Ͽ� �迭�� ����ش�.
				Arrays.fill(data, (byte)0);
				
			} catch (Exception e) {
				System.out.println("���ܹ߻�: "+e.getMessage());
			} 
		}
	}
	
	//��� ����� Ŭ���̾�Ʈ���� ����ϱ����� �޼ҵ� ����
	public void sendAll(byte []data) throws Exception{
		//����Ʈ�� ��� ��ü�� �ϳ��� �̾ƿ���, ������ Ŭ���̾�Ʈ�� �ϴ��Ϸ� ����ϴ� ������ ��ü
		//����Ʈ�� ��� �� ��ŭ �ݺ������Ѵ�.
		for(ServerThread st : ChatServer.list) {
			//������ ��ü�� ��½�Ʈ���� ���Ͽ� �����͸� �� ������.
			st.os.write(data);
		}
	}
	
}


public class ChatServer {
	//����� Ŭ���̾�Ʈ�� ����� ������ ���� ��� ���� ����Ʈ�� �����.
	//��ü�� �����ϰ� ����ϵ��� static ����.
	static ArrayList<ServerThread> list = new ArrayList<ServerThread>();
	
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9001);
			System.out.println("**������ �����Ǿ����ϴ�.**");
			
			while(true) {
				Socket socket = server.accept();
				System.out.println("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.");
				System.out.println("-------------------------------");
				
				//������ Ŭ���̾�Ʈ�� ����� thread�� �����Ѵ�.
				ServerThread thread = new ServerThread(socket);
				
				//Ŭ���̾�Ʈ�� ����Ͽ� ����� �����ϴ� ������ ��ü�� ����Ʈ�� ��´�.
				list.add(thread);
				
				//Ŭ���̾�Ʈ�� ����Ͽ� ��ȭ�� �̾���� �����带 ������Ų��.
				thread.start();	
			}
			
		} catch(Exception e) {
			System.out.println("���ܹ߻�: "+e.getMessage());
		}

	}

}
