package exam13;

public class CellPhone {
	private String model;
	private String company;
	private String color;
	private boolean power;
	private boolean camera;
	
	//전원을 켜는 메소드 
	public void powerOn() {
		power = true;
	}
	//전원을 끄는 메소드 
	public void powerOff() {
		power = false;
	}
	
	
	//getter and setter
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public boolean isCamera() {
		return camera;
	}
	public void setCamera(boolean camera) {
		this.camera = camera;
	}
	
	//생성자 
	public CellPhone(String model, String company, String color, boolean power, boolean camera) {
		super();
		this.model = model;
		this.company = company;
		this.color = color;
		this.power = power;
		this.camera = camera;
	}
	public CellPhone() {
		this("iphone13", "Apple", "Pink", true, true);
	}
	
	
}
