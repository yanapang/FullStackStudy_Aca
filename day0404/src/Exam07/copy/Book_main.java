package Exam07.copy;

public class Book_main {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		Book b2 = new Book("재미있는 자바", "김민혁");
		
		System.out.println("Title of the book: " +b1.getTitle()+"Author of the book: " + b1.getAuthor());
		System.out.println("Title of the book: " +b2.getTitle()+"Author of the book: " + b2.getAuthor());

	}

}
