package exam06;

class Book{
	protected String title;
	protected int page;
	protected String author;
	//-----getter and setter ----
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	//---constructor----
	public Book(String title, int page, String author) {
		super();
		this.title = title;
		this.page = page;
		this.author = author;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
class Megazine extends Book{
	private String est;

	public String getEst() {
		return est;
	}
	public void setEst(String est) {
		this.est = est;
	}
	public Megazine (String title, int page, String author, String est) {
		super(title, page, author);
		this.est = est;
	}
	public Megazine() {
		super();

	}
}

//main
//public class MagazineTest {
//	public static void main(String[] args) {
//		Megazine m1 = new Megazine("봄여름가을겨울", 50, "빅뱅", "2022-04-05");
//		
//		System.out.println(m1.getTitle()+"\t"+
//							m1.getPage() + "\t"+
//							m1.getAuthor()+ "\t"+
//							m1.getEst());
//	}
public class MagazineTest {
	public static void main(String[] args) {
		Book b = new Book("Fun Java", 600, "Min Kim");
		Megazine m = new Megazine ("Monthly Java", 300, "Ssangyong", "2022/04/05");
		
		System.out.println("Book title: "+ b.getTitle() +
					", Page no: "+ b.getPage());
		
	}

}


