package exam09;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//창 만들기
import javax.swing.JFrame;

//MouseLister implements
public class MyFrame extends JFrame implements MouseListener{
	public MyFrame(String title) {
		super(title);
		setSize(400,300);//창 사이즈 설
		setVisible(true);//창 보여주게 설정.
		addMouseListener(this); //마우스 이벤트를 들어주게 해야 함.
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse Clicked!");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Mouse Pressed!");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Mouse Released!");
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse Entered!");
	}
	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse Exited!");
	}
}
