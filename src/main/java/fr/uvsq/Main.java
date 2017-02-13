package fr.uvsq;

import java.sql.SQLException;




public class Main {

	public static void main(String[] args) throws SQLException {
		
		MusicbrainzLoadData musicbrainzLoadData = new MusicbrainzLoadData();
		musicbrainzLoadData.getSongsByAuthor("metallica");
		
		XMLtoDB xmlDb = new XMLtoDB();
		xmlDb.insertInSong("test.xml");
		
		

	}
}
