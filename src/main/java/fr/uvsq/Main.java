package fr.uvsq;

import java.sql.SQLException;

import javax.xml.transform.TransformerException;




public class Main {

	public static void main(String[] args) throws SQLException, TransformerException {
		

		MusicbrainzLoadData musicbrainzLoadData = new MusicbrainzLoadData();
		musicbrainzLoadData.getSongsByAuthor("metallica");
		
		DeezerLoadData lfdd = new DeezerLoadData();
		lfdd.getSongsByAuthor("eminem");		
//		lfdd.getAlbumsByAuthor("eminem");
//		lfdd.getInfoForSongTitle("bla");			
		

		XMLtoDB xmlDb = new XMLtoDB();
		xmlDb.insertInSong("deezerSongsRes.xml");
//		xmlDb.insertInAlbum("deezerAlbumsRes.xml");
//		xmlDb.insertInSong("deezerInfosRes.xml");
		

	}

}
