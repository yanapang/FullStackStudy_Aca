package exam13;

public class CellPhoneTest {

	public static void main(String[] args) {
		CellPhone c1 = new CellPhone();
		CellPhone c2 = new CellPhone("Galaxy s22", "Samsung", "Black", false, true);
		
		
		c2.powerOn();
		
		System.out.println("모델명: "+ c1.getModel() +"\t"+
							"제조회사: " + c1.getCompany()+ "\t"+
							"색상: "+c1.getColor()+ "\t"+
							"전원: "+c1.isPower()+ "\t"+
							"카메라: "+c1.isCamera());
		
		System.out.println("모델명: "+ c2.getModel() +"\t"+
							"제조회사: " + c2.getCompany()+ "\t"+
							"색상: "+c2.getColor()+ "\t"+
							"전원: "+c2.isPower()+ "\t"+
							"카메라: "+c2.isCamera());
	}

}
