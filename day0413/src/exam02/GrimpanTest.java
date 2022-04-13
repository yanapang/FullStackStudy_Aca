package exam02;

//프레임을 만들어서 메뉴를 만들기.
//메뉴를 눌러서 사각형, 원, 선 골라가며 다른거 그릴 수 있게 하기.

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


//하나의 그래픽 정보를표현하기 위한 클래스를 만든다.
//객체단위로 출력을 하기위한 클래스는 직렬화 되어야 한다. Serializable 사용.
class GraphicInfo implements Serializable{
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int drawType; //그래픽 종류에 대한 정보.
	private Color drawColor;
	
	public GraphicInfo(int x1, int y1, int x2, int y2, int drawType, Color drawColor2) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.drawType = drawType;
		this.drawColor = drawColor2;
	}
	@Override
	public String toString() {
		return "GraphicInfo [x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + ", drawType=" + drawType
				+ ", drawColor=" + drawColor + "]";
	}
	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getY1() {
		return y1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	public int getX2() {
		return x2;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public int getY2() {
		return y2;
	}
	public void setY2(int y2) {
		this.y2 = y2;
	}
	public int getDrawType() {
		return drawType;
	}
	public void setDrawType(int drawType) {
		this.drawType = drawType;
	}
	public Color getDrawColor() {
		return drawColor;
	}
	public void setDrawColor(Color drawColor) {
		this.drawColor = drawColor;
	}
	
	
}

//그래픽을 표현하기 위하여 JPanel을 상속한 클래스를 만들어 주고 
//또, 마우스 이벤트 처리를 위하여 MouseListener를 구현합니다.
class GrimpanPanel extends JPanel implements MouseListener{
	
	//그려진 그래픽 정보를 담기 위한 리스트를 만든다.
	ArrayList<GraphicInfo> list;
	//선,원,사각형을 그릴지 위한 변수..0:선,1:원,2:사각형
	int drawType;
	
	//색상을 위한 변수를 선언.
	Color drawColor;
	
	int x1, y1, x2, y2;
	//마우스가 눌러진 시작점, 끝점을 저장하기 위한 변수를 선언합니다.
	//생성자에서 마우스이벤트를 등록합니다.
	public GrimpanPanel() {
		
		//그려진 그래픽의 정보를 담기 위한 리스트를 생성.
		list = new ArrayList<GraphicInfo>();
		//패널에 마우스 이벤트를 등록합니다.
		addMouseListener(this);
	}
	
	//패널을 다시그려줄 필요가 있을때에 paintComponent가 자동으로 동작합니다.
	//paintComponent를 오버라이딩 하여 그래픽을 표현 해 줍니다.ㄴ
	@Override
	protected void paintComponent(Graphics g) {		
		
		//리스트에 담긴 그래픽의 정보 만큼 그려주기.
		for(GraphicInfo info: list) {
			int width = info.getX2() - info.getX1();
			int height = info.getY2() - info.getY1();
			int x = info.getX1();
			int y = info.getY1();
			
			if(info.getX2()<info.getX1()) {
				x = info.getX2();
				width = info.getX1()-info.getX2();
			}
			if(info.getY2()<info.getY1()) {
				y = info.getY2();
				height = info.getY1()-info.getY2();
			}
			
			g.setColor(info.getDrawColor());
			
			switch(info.getDrawType()) {
			case 0: g.drawLine(info.getX1(), info.getY1(), info.getX2(), info.getY2());break;
			case 1: g.drawOval(x, y, width, height);break;
			case 2: g.drawRect(x, y, width, height);break;
			}
		}

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	//마우스가 눌러졌을때의 x,y좌표를 그래픽을 시작점으로 저장합니다.
	@Override
	public void mousePressed(MouseEvent e) {
		x1 = e.getX();
		y1 = e.getY();
		
	}
	//마우스가 떼어졌을때의 x,y좌표를 그래픽의 끝점으로 저장합니다.
	@Override
	public void mouseReleased(MouseEvent e) {
		x2 = e.getX();
		y2 = e.getY();
		
		//현재 완성된 그래픽의 정보를 리스트에 담는다.
		list.add(new GraphicInfo(x1,y1,x2,y2,drawType,drawColor));
		
		//그래픽이 완성되었을때 그래픽을 다시 그려달라고 요청합니다.
		//"다시 그려주세요"라고 요청합니다.
		repaint();   //paintComponent()가 동작합니다.
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}
}

class Grimpan extends JFrame implements ActionListener{
	
	//다양한 색상을 선택하기 위한 다이얼로그를 멤버변수로 선언
	JColorChooser jcc;
	
	//저장하고, 열기를 할때 파일을 선택하기 위한 다이얼로그를 멤버변수로 선언.
	JFileChooser jfc;
	
	
	//그림판 패널을 맴버로 선언합니다.
	GrimpanPanel gp;
	public Grimpan() {
		jfc = new JFileChooser("c:/temp");
		jcc = new JColorChooser();
		
		gp = new GrimpanPanel();
		add(gp);
		
		//메뉴바 
		JMenuBar jmb = new JMenuBar();
		//주메뉴
		JMenu mn_file = new JMenu("파일");
		//부메뉴
		JMenuItem file_new = new JMenuItem("새파일");
		JMenuItem file_open = new JMenuItem("열기");
		JMenuItem file_save = new JMenuItem("저장");
		JMenuItem file_exit = new JMenuItem("종료");
		
		file_new.addActionListener(this);
		file_open.addActionListener(this);
		file_save.addActionListener(this);
		file_exit.addActionListener(this);
		
		mn_file.add(file_new);
		mn_file.add(file_open);
		mn_file.add(file_save);
		mn_file.add(file_exit);
		
	
		JMenu mn_draw = new JMenu("그리기도구");
		JMenuItem draw_line = new JMenuItem("선");
		JMenuItem draw_rect = new JMenuItem("사각형");
		JMenuItem draw_oval = new JMenuItem("원");
		
		draw_line.addActionListener(this);
		draw_rect.addActionListener(this);
		draw_oval.addActionListener(this);
		
		mn_draw.add(draw_line);
		mn_draw.add(draw_rect);		
		mn_draw.add(draw_oval);
		
		JMenu mn_color = new JMenu("그리기 색상");
		JMenuItem color_black = new JMenuItem("검정");
		JMenuItem color_red = new JMenuItem("빨강");
		JMenuItem color_blue = new JMenuItem("파랑");
		JMenuItem color_green = new JMenuItem("초록");
		JMenuItem color_other = new JMenuItem("다른 색상...");
		
		color_black.addActionListener(this);
		color_red.addActionListener(this);
		color_blue.addActionListener(this);
		color_green.addActionListener(this);
		color_other.addActionListener(this);
		
		mn_color.add(color_black);
		mn_color.add(color_red);
		mn_color.add(color_blue);
		mn_color.add(color_green);
		mn_color.add(color_other);
		
		setJMenuBar(jmb);
		
		jmb.add(mn_file);
		jmb.add(mn_draw);
		jmb.add(mn_color);
		
		setJMenuBar(jmb);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd.equals("선")) {
			gp.drawType=0;
		} else if(cmd.equals("원")) {
			gp.drawType=1;
		} else if (cmd.equals("사각형")) {
			gp.drawType=2;
		} else if(cmd.equals("빨강")) {
			gp.drawColor = Color.red;
		} else if(cmd.equals("검정")) {
			gp.drawColor = Color.black;
		} else if(cmd.equals("초록")) {
			gp.drawColor = Color.green;
		} else if (cmd.equals("파랑")) {
			gp.drawColor = Color.blue;
		} else if (cmd.equals("다른 색상...")) {
			gp.drawColor = jcc.showDialog(this,"색상을 선택하세요", Color.red);
		} else if (cmd.equals("새파일")) {
			//패널의 리스트를 비우고
			//다시 그려달라고 요청한다.
			
		} else if (cmd.equals("열기")) {
			//파일로 리스트를 저장함. 읽을때에도 객체 단위로 읽어와야함. 
			try {
				int re = jfc.showOpenDialog(this);
				if(re == 0) {
					File file = jfc.getSelectedFile();
					//객체단위로 읽기 위한 ObjectInputStream객체 생성.
					ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
					
					//파일로부터 객체를 읽어들여 그림판 패널의 리스트에 담는다.
					gp.list = (ArrayList<GraphicInfo>)ois.readObject();
					//readObject()를 하면 가장 최상위인 object를 불러옴.
					//이 프로그램에서 사용하기 위해서는 타입캐스팅 필요.
					
					//그림판 패널에게 리스트에 담긴 것 만큼 다시 그려달라고 요청.
					gp.repaint();
				}
			}catch(Exception ex) {
				System.out.println("예외발생: "+ex.getMessage());
			}
		} else if (cmd.equals("저장")) {
			//저장해야할 것? list => gp.list 저장
			//문자단위의 입출력 제일조상: reader, writer
			//바이트 단위의 입출력 <- outputstream, inputstream
			
			//ObjectOutputStream, ObjectInputStream.
			
			try {
				int re = jfc.showSaveDialog(this);
				if(re == 0) {//ok
					File file = jfc.getSelectedFile();
					//객체 단위로 파일 출력을 위한 ObjecOutputStream 객체를 생성.
					ObjectOutputStream oos = 
							new ObjectOutputStream(new FileOutputStream(file));
					
					//그래픽의 정보가 담겨있는 리스트를 파일로 출력;
					oos.writeObject(gp.list);
					
					//파일의 사용이 끝나면 닫아준다.
					oos.close();
					
					JOptionPane.showMessageDialog(this, "저장하였습니다.");
				}
			}catch(Exception ex) {
				System.out.println("예외발생:"+ex.getMessage());
			}
			
			
		} else if (cmd.equals("종료")) {
			//정말 종료하는지 물어보고 종료하기.
			int re = JOptionPane.showConfirmDialog(this, "정말로 종료할까요?");
			System.out.println(re);
			//예:0
			//아니오:1
			//취소:2
			if(re ==0) {
				System.exit(0);
			}
		}
	}
}

public class GrimpanTest {
	public static void main(String[] args) {
		new Grimpan();
	}
}