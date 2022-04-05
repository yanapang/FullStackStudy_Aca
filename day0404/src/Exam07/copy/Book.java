package Exam07.copy;

public class Book {
	private String title;
	private String author;
	
	
	//---생성자 만들기 ---
	public Book() {
		title = "default T";
		author = "default A";
	}
	public Book(String t, String a) {
		title = t;
		author = a;
	}
	
	//매개변수 하나만 갖는경우 불가 

	
	//setter
	public void setTitle(String t) {
		title = t;
	}
	public void setAuthor(String a) {
		author = a;
		
	}
	
	//getter
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
}
