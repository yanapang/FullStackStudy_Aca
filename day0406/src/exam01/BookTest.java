
package exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class BookTest {
	
	public static Scanner sc; //입력을 계속 받아야 함으로 static 처리.
	 
	public static void printMenu() {
		System.out.println("===========================================");
		System.out.println("1. 책 등록");
		System.out.println("2. 책 검색");
		System.out.println("3. 모든 책 출력");
		System.out.println("4. 종료");
		System.out.println("===========================================");
		System.out.print("번호를 입력하시오: ");
	}
	
	public static void main(String[] args) {
		//Book []bookList = new Book[100];
		sc = new Scanner(System.in); //scanner 생성
		
		//도서의 정보를 담을 리스트 생성; Book 클래스 생성해 ArrayList에 담음.
		ArrayList<Book> list = new ArrayList<Book>();
		int menu;
		//메뉴를 입력하기 위한 변수를 선언.
		
		
		//종료를 위한 메뉴 4를 입력하지 않는 한 계속 실행. 
		while(true) {
			printMenu(); //메뉴 출력 
			menu = sc.nextInt(); //메뉴 입력 
			if(menu == 4) {// 입력한 메뉴가 4 이면 반복문 탈출 
				break;
			}
			switch(menu) { //선택한 메뉴에 따라 이동.
				//각 메소드로 이동시, list를 입력변수로 받음.
				case 1:insertBook(list);break; //도서 등록 메소드 호출 
				case 2:searchBook(list);break; //도서 검색 메소드 호출 
				case 3:printBook(list);break; //모든 도서 정보 출력 메소드 호출 
			}
		}
		System.out.println("*** 프로그램을 종료하였습니다. *** ");
	}

	public static void insertBook(ArrayList<Book> list) {
		String title;
		int score;
		
		System.out.print("제목:");
		title = sc.next();
		System.out.print("평점:");
		score = sc.nextInt();
		//도서이름과 평점을 멤버변수로 갖는Book 객체 생성 
		Book book = new Book(title, score);
		//생성한 Book 을 리스트에 담는다.
		list.add(book); 
		System.out.println("도서의 평점을 등록하였습니다.");
	}
		
	public static void printBook(ArrayList<Book> list) {
		// TODO Auto-generated method stub
		//for(int i=0; i<list.size(); i++) {		
		for(int i=0; i<Book.count;i++) {
			System.out.println(list.get(i));
			//리스트에 담긴 도서의 수만큼 반복하여 출력.
		}
	}

	public static void searchBook(ArrayList<Book> list) {
		// TODO Auto-generated method stub
		String title; //검색할 도서명을 입력하기 위한 변수 
		int score = -1; //검색한 도서의 평점을 저장하기 위한 변수 
		
		System.out.print("찾고자 하는 도서명을 입력==>");
		title = sc.next(); //찾을 도서명 입력받아 저장.
		
		for(int i=0; i<Book.count; i++) { 
			Book b = list.get(i); //도서를 하나씩 끄집어 내어 b에 저장.
			if(b.title.equals(title)) { //가져온 b와 입력받은 도서명이 같으면 그 평점을 변수에 저장.
				score = b.score;
			}
		}
		
		//만약 찾을 도서명이 리스트에 존재하지 않는다면 score 는 -1.
		if(score != -1) { //찾는 도서가 리스트에 있었다면 평점을 출력하라.
			System.out.println(title+"도서의 평점은 "+score+"입니다.");
		}else { //찾는 도서가 리스트에 없다면 없다고 출력. 
			System.out.println(title+"도서의 평점은 없습니다.");
		}
	}
}
