package hw2;

class Date {
	private int year, month, date;

	//생성자
	public Date(int year, int month, int date) {
		super();
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	public String mItoS(){
			if (month == 1) return "January"; 
			else if (month == 2) return "Feburary"; 
			else if (month ==3) return "March";
			else if (month ==4) return "April";
			else if (month ==5) return "May";
			else if (month ==6) return "June";
			else if (month ==7) return "July";
			else if (month ==8) return "August";
			else if (month ==9) return "September"; 
			else if (month ==10)return "October"; 
			else if (month ==11)return "November";
			else return "December";
	}
	//method
	public String print1() {
		return year+"."+month+"."+date;
	}
	
	public String print2() {
		return mItoS() + " " + date + ", " +year;
	}
	
}

public class Program06 {
	public static void main(String[] args) {
		Date d1 = new Date(2022, 04, 04);
		Date d2 = new Date(2012, 07, 12);
		
		System.out.println(d1.print1());
		System.out.println(d1.print2());
		
		System.out.println();
		
		System.out.println(d2.print1());
		System.out.println(d2.print2());
		
		
	}
}
