package review03;

import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

class GrimpanPanel extends JPanel implements MouseListener{
	String color;
	int x1,y1,x2,y2,x,y;
	
	public GrimpanPanel() {
		addMouseListener(this);
	}

	public void paintComponent(Graphics g) {
		g.drawRect(x1, y1, x, y);
		g.drawOval(x1, y1, x, y);
		g.drawLine(x1, y1, x2, y2);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		x1 = e.getX();
		y1 = e.getY();
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		x2 = e.getX();
		y2 = e.getY();
		x=x2-x1;
		y=y2-y1;
		
		repaint();
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

class Grimpan extends JFrame{
	GrimpanPanel gp;
	public Grimpan() {
		gp = new GrimpanPanel();
		add(gp);
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


public class DrawingTest {
	public void PrintMenu() {
		System.out.println("--------------------");
		System.out.println("1.draw line \t 2. draw Circle \t 3. draw Rectangle");
		System.out.print("What do you want to draw?");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = Integer.parseInt(sc.next());
		new Grimpan();
		if(menu==1) {
			
		}
		

	}

}
