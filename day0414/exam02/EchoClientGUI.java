package exam02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EchoClientGUI extends JFrame implements ActionListener {
	//��ȭ������ �Է��� �ؽ�Ʈ �ʵ带 ��������� �����Ѵ�.
	JTextField jtf;
	
	//������ �޾Ƹ��� ��ȭ������ ��� ������ �����ֱ� ���� �ؽ�Ʈ����� ��� ������ ����.
	JTextArea jta;
	
	//socket ��������� �����.
	Socket socket;
	
	//�����͸� �ְ���� ��Ʈ���� ��������� ����.
	InputStream is;
	OutputStream os;
	
	public EchoClientGUI() {
		
		try {
			//������ ��� ��û.
			socket = new Socket("192.168.10.17", 9001);
			
		
			//�����͸� �ְ� ���� ��Ʈ���� ����.
			is = socket.getInputStream();
			os = socket.getOutputStream();
			
		}catch (Exception e) {
			System.out.println("���ܹ߻�: "+e.getMessage());
		}	
		
		//��� �������� ����.
		jtf = new JTextField(50);
		jta = new JTextArea(80,50);
		
		//�ؽ�Ʈ����� ��ũ�ѹ����� �ø�.
		JScrollPane jsp = new JScrollPane(jta);
		
		//"����"�� ���� ��ư�� �����.
		JButton btnSend = new JButton("����");
		
		//��ư�� �̺�Ʈ�� ����Ѵ�. �̺�Ʈ ����� this.
		btnSend.addActionListener(this);
		
		//�ؽ�Ʈ�ʵ�� ��ư�� ���� �г� ����.
		JPanel p = new JPanel();
		
		//�гο� �ؽ�Ʈ�ʵ带 ��´�.
		p.add(jtf);
		//�гο� ��ư�� ��´�.
		p.add(btnSend);
		
		//�������� ����� �ؽ�Ʈ����� ���ΰ� �ִ� ��ũ�� ���� ��´�.
		add(jsp, BorderLayout.CENTER);
		
		//�������� �Ʒ��ʿ� �ؽ�Ʈ�ʵ�� ��ư�� ���� �г��� ��´�.
		add(p, BorderLayout.SOUTH);
		
		//�������� ũ�⸦ ���Ѵ�.
		setSize(700,400);
		
		//�������� ȭ�鿡 ���
		setVisible(true);
		
		//'X'���� ������ ���α׷� ����.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		//�����κ��� ���ŵǴ� �����͸� ����Ͽ� �ޱ� ���� Ŭ������ ������� �����Ѵ�.
		class ClientThread extends Thread {
			public void run(){
				
				//������ ���� ���ŵǴ� �����͸� �ޱ����� �迭�� �����.
				byte []data = new byte[100];
				
				//��� ����
				while(true) {
					//��ǲ ��Ʈ���� ���� �����κ��� ���ŵǴ� �����͸� �޴´�.
					try {
						//��ǲ ��Ʈ���� ���� ���ŵ� �����͸� �޴´�.
						is.read(data);
						
						//���ŵ� �����͸� ���ڿ��� �����.
						String reMsg = new String(data);
						
						//���ڿ��� ��ȭ������ ������ �ؽ�Ʈ����� �߰��Ѵ�.
						jta.append(reMsg+"\n");
						
					
					} catch (IOException e) {
						System.out.println("���ܹ߻�: "+e.getMessage());
					}
				}//end while
			}//end run
		}//end Thread
		
		//�����κ��� ���ŵǴ� �����͸� ����Ͽ� �޴� Ŭ���̾�Ʈ������ ��ü�� �����Ѵ�.
		//���� Ŭ���̾�Ʈ�ε��� �Բ� �޼����� �޾ƾ� �ϹǷ� Thread, run ���.
		Thread t = new ClientThread();
		
		t.start();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//��ư�� �������� �۵��ϴ� ��.
		//�ؽ�Ʈ �ʵ忡 ������ ���ڸ� �����´�.
		String msg = jtf.getText();
		
		try {
			//��� ��Ʈ���� ���� �����͸� ������ ������.
			//�����͸� ������ ���ڿ��� ����Ʈ�� �迭�� ��ȯ�Ͽ� ������.
			os.write(msg.getBytes());
			
			//���� �Է� ���ڿ��� "q!"�̸� ���α׷��� �����Ѵ�.
			if(msg.equals("q!")) {
				System.exit(0);
				//�ݺ��� Ż���� �ƴϹǷ� �ý��� ���Ḧ ���� ���α׷��� ������.
			}
			
		} catch (IOException ex) {
			System.out.println("���ܹ߻�: "+ex.getMessage());
		}

	}
	public static void main(String[] args) {
		new EchoClientGUI();
	}
}
