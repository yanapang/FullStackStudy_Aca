package review02;

import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

class GrimpanPanel extends JPanel implements MouseListener{
	
	int x1,y1,x2,y2,x,y;
	
	
	public GrimpanPanel() {
		addMouseListener(this);
	}



	protected void paintComponent(Graphics g) {
		g.drawRect(x1, y1, x, y);
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


public class DrawSquare {

	public static void main(String[] args) {
		new Grimpan();

	}

}
