package fr.uvsq;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;



public class XMLtoDB {
	public XMLtoDB() {
		
	}	
	
	public void insertInSong ( String xmlFile) throws SQLException{
		Connection connexion = null;
		Statement stmt = null;
		try {
			connexion = ConnexionBD.getConnect();
			stmt = connexion.createStatement();
			int res = stmt.executeUpdate("LOAD XML LOCAL INFILE \"src/main/resources/xmlFile/"+ xmlFile +"\" INTO TABLE music.Song ROWS IDENTIFIED BY '<song>'");			
			System.out.println("Statut de l'execution ====> "+ res);
					
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (connexion != null){
				connexion.close();
			}
			if (stmt != null){
				stmt.close();
			}
		}
	}
	
	public void insertInAlbum ( String xmlFile) throws SQLException{
		Connection connexion = null;
		Statement stmt = null;
		try {
			connexion = ConnexionBD.getConnect();
			stmt = connexion.createStatement();
			int res = stmt.executeUpdate("LOAD XML LOCAL INFILE \"src/main/resources/xmlFile/"+ xmlFile +"\" INTO TABLE music.Album ROWS IDENTIFIED BY '<album>'");			
			System.out.println("Statut de l'execution ====> "+ res);
					
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (connexion != null){
				connexion.close();
			}
			if (stmt != null){
				stmt.close();
			}
		}
	}
	
	
	
	
}
