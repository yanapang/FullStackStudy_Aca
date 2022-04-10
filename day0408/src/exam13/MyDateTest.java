package exam13;

import java.util.Scanner;
import java.util.StringTokenizer;

class IllegalArgumentException extends Exception {
	public IllegalArgumentException(String msg) {
		super(msg);
	}
}

class MyDate {
	int year;
	int month;
	int date;
	
	public MyDate(String data) throws IllegalArgumentException {
		if(data==null) {
			throw new IllegalArgumentException("날짜데이터가 없습니다.");
		}
		
		StringTokenizer st = new StringTokenizer(data,"/");
		year=Integer.parseInt(st.nextToken());
		month=Integer.parseInt(st.nextToken());
		date=Integer.parseInt(st.nextToken());
	}

	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDate() {
		return date;
	}
}

public class MyDateTest {

	public static void main(String[] args) {
		try {
		String data = "2022/04/08";
		MyDate md = new MyDate(data);
		System.out.println("연도: "+md.getYear());
		System.out.println("월: "+md.getMonth());
		System.out.println("일: "+md.getDate());
		} catch(Exception e) {
			System.out.println("예외발생: "+e.getMessage());
		}
	}

}
