package exam01;

public class Book {
	String title;
	int score;
	static int count; // 모든 도서의 수를 저장하기 위한 클래스 변수 
	public Book(String title, int score) {
		super();
		this.title = title;
		this.score = score;
		count++;
	}
	public Book() {
		super();
		count++;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", score=" + score + "]";
	}
	
}
