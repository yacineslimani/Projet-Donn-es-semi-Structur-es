package fr.uvsq;

import java.sql.SQLException;
import java.util.List;

import javax.xml.transform.TransformerException;

public class Main {
	
	DataBaseOperation dbo = new DataBaseOperation();
	DeezerLoadData deezer = new DeezerLoadData();
	MusicbrainzLoadData musicBrainz = new MusicbrainzLoadData();
	
//	public static void main(String[] args) throws SQLException, TransformerException {
//		Main main = new Main();
//		List<String> songs = main.getSongsByAuthor("eminem");		
//		for (String song : songs){
//			System.out.println("Title = "+ song);
//		}
//				
//		List<String> albums = main.getAlbumsByAuthor("abba");				
//		for (String album : albums){
//			System.out.println("Title alb = "+ album);
//		}
//		
//		List<Song> songsInfo = main.getInfoForSongTitle("baba");
//		for (Song song : songsInfo){
//			System.out.println("Title = "+ song.getAuthor());
//		}		
//	}
	
	//test
	
	public List<String> getSongsByAuthor (String author) throws SQLException, TransformerException{
		List <String> songs = dbo.selectSongsByAuthor(author);
		
		System.out.println("TAILLE SONGS == "+songs.size());
		
		if (songs.size() == 0){
			deezer.getSongsByAuthor(author);
			musicBrainz.getSongsByAuthor(author);						
		}
		
		songs = dbo.selectSongsByAuthor(author);		
		return songs;
	}
	
	public List<String> getAlbumsByAuthor (String author) throws SQLException, TransformerException{
		List <String> albums = dbo.selectAlbumsByAuthor(author);
		System.out.println("TAILLE ALBUM INITIALE = "+ albums.size());
		
		if (albums.size() == 0){
			deezer.getAlbumsByAuthor(author);
			musicBrainz.getAlbumByAuthor(author);						
		}		
		albums = dbo.selectAlbumsByAuthor(author);		
		return albums;
	}
	
	public List<Song> getInfoForSongTitle (String title) throws SQLException, TransformerException{
		List <Song> songs = dbo.selectInfoForSongTitle(title);
		if (songs.size() == 0){
			deezer.getInfoForSongTitle(title);
//			musicBrainz.getInfoForSongTitle(title);						
		}		
		songs = dbo.selectInfoForSongTitle(title);		
		return songs;
	}

}
