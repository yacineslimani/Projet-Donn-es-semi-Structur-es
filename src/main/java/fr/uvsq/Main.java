package fr.uvsq;

import java.sql.SQLException;




public class Main {

	public static void main(String[] args) throws SQLException {
		
//		MusicbrainzLoadData musicbrainzLoadData = new MusicbrainzLoadData();
//		LastFMLoadData lfdd = new LastFMLoadData();
//		lfdd.getSongsByAuthor("");
		
		XMLtoDB xmlDb = new XMLtoDB();
		xmlDb.insertInSong("test.xml");
		
//		musicbrainzLoadData.getSongsByAuthor("metallica");
		
//		AlbumDAOImpl albumDAOImpl = new AlbumDAOImpl();
//		Album album = new Album();
//		album.setAuthor("aznavour");
//		album.setTitle("la mamma");
//		albumDAOImpl.insert(album);
	}
	
	
	
	

}
