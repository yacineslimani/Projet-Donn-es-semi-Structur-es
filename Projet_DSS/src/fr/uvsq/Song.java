package fr.uvsq;

public class Song {
	String author;
	String duration;
	String album;
	
	public Song(String author, String duration, String album) {
		super();
		this.author = author;
		this.duration = duration;
		this.album = album;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}
	
	
}
