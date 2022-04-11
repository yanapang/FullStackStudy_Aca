
package exam01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//NotePad 자신이 메뉴에 대한 이벤처리 클래스가 되도록 합니다.
class NotePad extends JFrame implements ActionListener{
	
	//메모장의 글자를 입력하는 부분을 위한 텍스트에리어를 맴버변수로 선언해요
	JTextArea jta;
	
	public NotePad() {
		//텍스트에리어를 생성하니다.
		jta = new JTextArea(10, 80);
		
		//텍스트에리어에 스크롤를 생성하기 위한 스크롤팬을 생성합니다.
		JScrollPane jsp = new JScrollPane(jta);
		
		//프레임에 스크롤팬을 담아요
		add(jsp);
		
		
		//메뉴바를 생성합니다.
		JMenuBar jmb = new JMenuBar();
		
		//주메뉴 "파일"을 생성합니다.
		JMenu mn_file = new JMenu("파일");
		
		//"파일"에 대한 부메뉴   "새파일,열기,저장하기"를 생성합니다.
		JMenuItem file_new = new JMenuItem("새파일");
		JMenuItem file_open = new JMenuItem("열기");
		JMenuItem file_save = new JMenuItem("저장");
		
		//각각의 부메뉴들에 이벤트를 등록합니다.
		file_new.addActionListener(this);
		file_open.addActionListener(this);
		file_save.addActionListener(this);
		
		//부메뉴 "새파일,열기,저장하기"를 주메뉴 "파일"에 담아요
		mn_file.add(file_new);
		mn_file.add(file_open);
		mn_file.add(file_save);
		
		//메뉴바에 주메뉴을 "파일"을 담아요
		jmb.add(mn_file);

		//메뉴바를 프레임에 설정합니다.
		setJMenuBar(jmb);
		
		//창의 크기를 설정
		setSize(400, 300);
		
		//창을 화면에 보여주도록 설정
		setVisible(true);
		
		//창을 닫으면 프로그램을 종료하도록 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	// 메뉴가 눌러졌을때에 이메소드가 동작합니다.
	// 어떤 메뉴가 눌러졌는지의 정보를 매개변수인 ActionEvent e이 전달받습니다.
	@Override
	public void actionPerformed(ActionEvent e) {
		//눌러진 메뉴의 글자를 변수에 저장합니다.
		String cmd = e.getActionCommand();
		if(cmd.equals("새파일")) {
			
			//텍스트에리어를 지워줍니다.
			jta.setText("");
			
		}else if(cmd.equals("열기")) {
			//hello.txt파일의 내용을 읽어 들여 텍스트에리어에 출력합니다.
			
			//파일입출력을 위한 생성자와 메소드들은 예외를 안고 있어 예외처리를 합니다.
			try {
				//문자단위의 파일입력을 위한 객체를 생성합니다.
				FileReader fr = new FileReader("c:/temp/hello.txt");
				
				//파일의 내용을 읽어와서 모두 저장할 문자열 변수를 선언합니다.
				String str = "";
				
				//한 글자씩 읽어올 변수를 선언합니다.
				int ch;
				
				while(true) {
					
					//파일로 부터 한 글자씩 읽어 들입니다.
					ch = fr.read();
					
					//파일의 끝에 도달하면 반복문을 탈출합니다.
					if(ch == -1) {
						break;
					}

					//파일로 읽어 읽어들인 문자의 정수값을 문자로 변환합니다.
					char data = (char)ch;
					
					//한글자씩 읽어 글자를 str에 누적합니다.
					str = str + data;
					
				}
				
				//파일로 모두 읽어온 문자열이 누적된 str의 내용을 텍스트에리어 출력합니다.
				jta.setText(str);
				
				//사용이 끝난 파일을 닫아 줍니다.
				fr.close();
				
			}catch (Exception ex) {
				System.out.println("예외발생:"+ex.getMessage());
			}
			
			
		}else if(cmd.equals("저장")) {
			
			//현재 텍스트에리어의 내용을 파일로 출력합니다.
			
			try {
			
				//문자단위로 파일로 출력하기 위한 FileWriter객체를 생성합니다.
				FileWriter fr = new FileWriter("c:/temp/hello.txt");
				
				//텍스트에리어의 내용을 모두 파일로 출력합니다.
				fr.write(jta.getText());
				
				//파일의 사용이 끝났으면 파일을 닫아 줍니다.
				fr.close();
				
				System.out.println("파일을 생성하였습니다.");
				
			}catch (Exception ex) {
				System.out.println("예외발생:"+ex.getMessage());
			}
		}
	}
}

public class NotePadTest {
	public static void main(String[] args) {
		//노트패드 객체를 생성합니다.
		new NotePad();

	}

}
