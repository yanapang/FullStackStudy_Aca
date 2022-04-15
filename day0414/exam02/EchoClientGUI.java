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
	//대화내용을 입력할 텍스트 필드를 멤버변수로 선언한다.
	JTextField jtf;
	
	//서버가 메아리한 대화내용을 계속 누적해 보여주기 위한 텍스트에리어를 멤버 변수로 선언.
	JTextArea jta;
	
	//socket 멤버변수로 만든다.
	Socket socket;
	
	//데이터를 주고받을 스트림을 멤버변수로 선언.
	InputStream is;
	OutputStream os;
	
	public EchoClientGUI() {
		
		try {
			//서버에 통신 요청.
			socket = new Socket("192.168.10.17", 9001);
			
		
			//데이터를 주고 받을 스트림을 생성.
			is = socket.getInputStream();
			os = socket.getOutputStream();
			
		}catch (Exception e) {
			System.out.println("예외발생: "+e.getMessage());
		}	
		
		//멤버 변수들을 생성.
		jtf = new JTextField(50);
		jta = new JTextArea(80,50);
		
		//텍스트에리어를 스크롤바위에 올림.
		JScrollPane jsp = new JScrollPane(jta);
		
		//"전송"을 위한 버튼을 만든다.
		JButton btnSend = new JButton("전송");
		
		//버튼에 이벤트를 등록한다. 이벤트 담당자 this.
		btnSend.addActionListener(this);
		
		//텍스트필드와 버튼을 담을 패널 생성.
		JPanel p = new JPanel();
		
		//패널에 텍스트필드를 담는다.
		p.add(jtf);
		//패널에 버튼을 담는다.
		p.add(btnSend);
		
		//프레임의 가운데에 텍스트에리어를 감싸고 있는 스크롤 팬을 담는다.
		add(jsp, BorderLayout.CENTER);
		
		//프레임의 아래쪽에 텍스트필드와 버튼이 담은 패널을 담는다.
		add(p, BorderLayout.SOUTH);
		
		//프레임의 크기를 정한다.
		setSize(700,400);
		
		//프레임을 화면에 출력
		setVisible(true);
		
		//'X'단추 누르면 프로그램 종료.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		//서버로부터 수신되는 데이터를 계속하여 받기 위한 클래스를 쓰레드로 구현한다.
		class ClientThread extends Thread {
			public void run(){
				
				//서버로 부터 수신되는 데이터를 받기위한 배열을 만든다.
				byte []data = new byte[100];
				
				//계속 실행
				while(true) {
					//인풋 스트링을 통해 서버로부터 수신되는 데이터를 받는다.
					try {
						//인풋 스트림을 통해 수신된 데이터를 받는다.
						is.read(data);
						
						//수신된 데이터를 문자열로 만든다.
						String reMsg = new String(data);
						
						//문자열을 대화내용을 누적할 텍스트에리어에 추가한다.
						jta.append(reMsg+"\n");
						
					
					} catch (IOException e) {
						System.out.println("예외발생: "+e.getMessage());
					}
				}//end while
			}//end run
		}//end Thread
		
		//서버로부터 수신되는 데이터를 계속하여 받는 클라이언트쓰레드 객체를 생성한다.
		//여러 클라이언트로들이 함께 메세지를 받아야 하므로 Thread, run 사용.
		Thread t = new ClientThread();
		
		t.start();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//버튼을 눌렀을때 작동하는 것.
		//텍스트 필드에 쓰여진 글자를 가져온다.
		String msg = jtf.getText();
		
		try {
			//출력 스트림을 통해 데이터를 서버로 보낸다.
			//데이터를 보낼때 문자열을 바이트의 배열로 변환하여 보낸다.
			os.write(msg.getBytes());
			
			//만약 입력 문자열이 "q!"이면 프로그램을 종료한다.
			if(msg.equals("q!")) {
				System.exit(0);
				//반복문 탈출이 아니므로 시스템 종료를 통해 프로그램을 끝낸다.
			}
			
		} catch (IOException ex) {
			System.out.println("예외발생: "+ex.getMessage());
		}

	}
	public static void main(String[] args) {
		new EchoClientGUI();
	}
}
