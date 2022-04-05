package hw2;

class Movie {
	String title;
	String director;
	int year;
	String mainChr;
	double grade;
	
	public Movie(String title, String director, int year, String mainChr, double grade) {
		super();
		this.title = title;
		this.director = director;
		this.year = year;
		this.mainChr = mainChr;
		this.grade = grade;
	}

	public String toString() {
		return "제목: " + title + "\n"+
				"감독: "+ director +"\n"+
				"연도: "+ year + "\n" +
				"주연배우: " + mainChr + "\n"+
				"평점: "+ grade;
	}
}

public class Program07 {
	public static void main(String[] args) {
		Movie m1 = new Movie("티파니에서 아침을", "블레이크 에드워즈", 1962, "오드리 헵번", 8.43);
		
		System.out.println(m1.toString());
	}
}
