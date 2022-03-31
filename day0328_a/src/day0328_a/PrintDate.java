package day0328_a;

import java.util.Date;

public class PrintDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date();
		int year, month, date, hr, min, sec;
		year = today.getYear()+1900;
		month = today.getMonth()+1;
		date = today.getDate();
		hr = today.getHours();
		min = today.getMinutes();
		sec = today.getSeconds();
		
		System.out.println(year + "년 " + month +  "월 " +
		date + "일 " + hr + "시 " +
		min + "분 " + sec + "초 입니다.");
	}

}
