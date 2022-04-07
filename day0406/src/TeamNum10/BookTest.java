package TeamNum10;

abstract class Book {
	protected String number;
	protected String title;
	protected String author;
	protected int latedays;
	//setter n getter
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getLatedays() {
		return latedays;
	}
	public void setLatedays(int latedays) {
		this.latedays = latedays;
	}
	//constructor
	public Book(String number, String title, String author) {
		super();
		this.number = number;
		this.title = title;
		this.author = author;
	}
	//equals()재정의, 관리번호동일시 동일 책 간주.
	public boolean equals(String number) {
		if(number == this.number) {
			return true;
		} else {
			return false;
		}
	}
	//abstract getLateFees(연체일수);
public abstract int getLateFees(int days);

}
class Novel extends Book{
	int latefee = 300;
	
	public Novel(String number, String title, String author, int latedays) {
		super(number, title, author);
		this.latedays = latedays;
	}

	@Override
	public int getLateFees(int days) {
		return latedays*latefee;
	}
	//연체일수당 300원.
}
class Poet extends Book{
	int latefee = 200;
	int latedays;
	
	public Poet(String number, String title, String author, int latedays) {
		super(number, title, author);
		this.latedays = latedays;
	}

	@Override
	public int getLateFees(int latedays) {
		return latedays*latefee;
	}
	
	//연체일수당 200원.
}
class ScienceFiction extends Book{
	int latefee = 600;
	int latedays;
	//연체일수당 600원.

	public ScienceFiction(String number, String title, String author, int latedays) {
		super(number, title, author);
		this.latedays = latedays;
	}
	public int getLateFees(int days) {
		return latedays*latefee;
	}
}
public class BookTest {

	public static void main(String[] args) {
		//Book book = new Book("N0100", "BookTitle", "Who?");
		Novel novel = new Novel("N0101", "NovelTitle", "noone", 3);
		ScienceFiction s = new ScienceFiction("SF9900", "TitleSF", "Steven Hoking", 9);
		
		System.out.println("등록도서: " + novel.equals(novel.getNumber()));
		System.out.println("Late Fee: "+ novel.getLateFees(novel.getLatedays())+" won");
		System.out.println();
		
		System.out.println("등록도서: " + s.equals(s.getNumber()));
		System.out.println("Late Fee: "+ s.getLateFees(s.getLatedays())+" won");
	}

}
