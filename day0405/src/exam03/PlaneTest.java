package exam03;

public class PlaneTest {

	public static void main(String[] args) {
		//System.out.println("만들어진 비행기의 수: "+ Plane.getPlanes());
		
		Plane p1 = new Plane();
		
		System.out.println("만들어진 비행기의 수: "+ Plane.getPlanes());
		
		Plane p2 = new Plane("AirBus", "A380", 500);
		
		System.out.println("만들어진 비행기의 수: "+ Plane.getPlanes());
		
		System.out.println(p1.getCompany()+", "+p1.getModel()+", "+p1.getCapacity());
		System.out.println(p2.getCompany()+", "+p2.getModel()+", "+p2.getCapacity());
		
		p1.setCompany("보잉");
		p1.setModel("Boing747");
		p1.setCapacity(300);
		
		System.out.println("---------------------");
		System.out.println(p1.getCompany()+", "+p1.getModel()+", "+p1.getCapacity());
		System.out.println(p2.getCompany()+", "+p2.getModel()+", "+p2.getCapacity());
		
		System.out.println("만들어진 비행기의 수: "+ Plane.getPlanes());

	}

}
