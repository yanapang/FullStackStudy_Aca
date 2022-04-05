package hw_team3;

public class Song {
	private String title;
	private String artist;
	private int length;
	
	//getter and setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	//
	public Song(String title, String artist, int length) {
		super();
		this.title = title;
		this.artist = artist;
		this.length = length;
	}
	public Song(String title, String artist) {
		this(title, artist, 0);
	}
	public Song(String title) {
		this(title, "default", 0);
	}
	public Song() {
		this("default","default", 0);
	}
	@Override
	public String toString() {
		return "곡 제목 =" + title + ", 가수 =" + artist + ", "
				+ "곡의 길이 =" + length +"초";
	}
	
	
	
}
