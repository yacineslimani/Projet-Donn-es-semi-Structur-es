package fr.uvsq;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionBD {
	String url = "jdbc:mysql://localhost:3306/music";
	String utilisateur = "root";
	String motDePasse = "ZoBaina2";
	static Connection connect;
	static ConnexionBD conn = null; // global a toutes les instances ; créé avant l'execution du programme (Avant le premier new)
	
	

	private ConnexionBD() throws SQLException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(url, utilisateur, motDePasse);
		} catch (Exception e) {
			System.out.println("Probleme == "+ e.getMessage());
			System.out.println("pb");
		}
		System.out.println("Connexion OK");
	}

	static ConnexionBD getInstance () throws SQLException{
		if (conn == null)
			conn = new ConnexionBD();
		return conn;
	}
	
	static Connection getConnect() throws SQLException{
		conn = ConnexionBD.getInstance();
		return connect;
	}
}
