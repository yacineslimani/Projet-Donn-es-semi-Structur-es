package fr.uvsq;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class DataBaseOperation {
	public DataBaseOperation() {
		
	}	
	
	public void insertInSong ( String xmlFile) throws SQLException{
		Connection connexion = null;
		Statement stmt = null;
		try {
			connexion = ConnexionBD.getConnect();
			stmt = connexion.createStatement();
			int res = stmt.executeUpdate("LOAD XML LOCAL INFILE \"WebContent/resources/xmlFile/"+ xmlFile +"\" INTO TABLE music.Song ROWS IDENTIFIED BY '<song>'");			
			System.out.println("Statut de l'execution ====> "+ res);
					
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
	}
	
	
	
	public void insertInAlbum ( String xmlFile) throws SQLException{
		Connection connexion = null;
		Statement stmt = null;
		try {
			connexion = ConnexionBD.getConnect();
			stmt = connexion.createStatement();
			int res = stmt.executeUpdate("LOAD XML LOCAL INFILE \"WebContent/resources/xmlFile/"+ xmlFile +"\" INTO TABLE music.Album ROWS IDENTIFIED BY '<album>'");			
			System.out.println("Statut de l'execution ====> "+ res);
					
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
	}
	
	public List<String> selectSongsByAuthor (String author) throws SQLException{
		Connection connexion = null;
		PreparedStatement pstmt = null;
		List<String> songs = new ArrayList<String>();
		try {
			connexion = ConnexionBD.getConnect();
			pstmt = connexion.prepareStatement("SELECT title FROM Song WHERE author LIKE '%" + author + "%' ");
			ResultSet rs =  pstmt.executeQuery();
			int i = 0;
			while(rs.next()){				 
				songs.add(rs.getString("title"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return songs;
	}
	
	public List<String> selectAlbumsByAuthor (String author) throws SQLException{
		Connection connexion = null;
		PreparedStatement pstmt = null;
		List<String> albums = new ArrayList<String>();
		try {
			connexion = ConnexionBD.getConnect();
			pstmt = connexion.prepareStatement("SELECT title FROM Album WHERE author LIKE '%" + author + "%'");
			ResultSet rs = pstmt.executeQuery();
			
			int i = 0;
			while(rs.next()){
				albums.add(rs.getString("title"));
				System.out.println("RESSSS == "+ i );
				i++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		System.out.println("TAILLE ALBUM ORIGINE == "+ albums.size());
		
		return albums;
	}
	
	public List<Song> selectInfoForSongTitle (String title) throws SQLException{
		Connection connexion = null;
		PreparedStatement pstmt = null;
		List<Song> songs = new ArrayList<Song>();
		try {
			connexion = ConnexionBD.getConnect();
			pstmt = connexion.prepareStatement("SELECT author, duration, album FROM music.Song WHERE title LIKE '%"+title+"%'");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				songs.add(new Song(rs.getString("author"), rs.getString("duration"),rs.getString("album")));
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return songs;
	}
	
	
	
}
