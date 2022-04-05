package exam09;

public class BoxTest {

	public static void main(String[] args) {
		Box b1 = new Box();
		Box b2 = new Box(20, 30, 50);
		b1.calcVolume();
		b2.calcVolume();
		
		System.out.println("가로: "+b1.getWidth()+" 세로: "+b1.getHeight()+" 높이: "+b1.getLength());
		System.out.println("체적: "+b1.getVolume());
		
		System.out.println("가로: "+b2.getWidth()+" 세로: "+b2.getHeight()+" 높이: "+b2.getLength());
		System.out.println("체적: "+b2.getVolume());
	}

}
