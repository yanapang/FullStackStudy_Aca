package hw_team;

public class Rocket {
	//field
	private int x,y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//생성자 
	public Rocket() {
		x=0;
		y=0;
	}
	public Rocket(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void moveUp() {
		y += 1;
	}
	
	//메소드 
	public String toString() {
		return "---로켓의 현재 좌표--"+"\n"+"x: "+x+"\t"+"y: "+ y;
	}
	
}
