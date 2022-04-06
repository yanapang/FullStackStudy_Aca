package exam11;

class Box {
	double width;
	double length;
	double height;
	
	public Box(double width, double length, double height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}

	public boolean equals(Object o) { //Object를 매개 변수로 받아야 오버라이딩. 
		boolean flag = false;
		
		Box b = (Box)o;//비교 대상인 b2를 box로 캐스팅.
		if (width==b.width && length==b.length && height ==b.height) {
			flag = true;
		}
		return flag;
	}
	
	public void pro(Box r) {
		System.out.println(width);
		System.out.println(r.width);
	}
	
}

public class EqualsTest02 {

	public static void main(String[] args) {
		Box b1 = new Box(10,20,30);
		Box b2 = new Box(10,20,30);
		
		b1.pro(b2);//b1의 width
		//Box 클래스에 equals메소드를 재정의 해야한다.
		
		if(b1.equals(b2)) { //같은 메모리 바라보는지.
			System.out.println("같아요.");
		} else {
			System.out.println("달라요.");
		}

	}

}
