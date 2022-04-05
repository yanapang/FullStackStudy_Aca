package Exam03;

public class Book_main {

	public static void main(String[] args) {
		Book one = new Book();
		
		one.setTitle("Great Java");
		one.setAuthor("bob");
		
		System.out.println("Title of the book: " + one.getTitle());
		System.out.println("Author of the book: " + one.getAuthor());

	}

}
