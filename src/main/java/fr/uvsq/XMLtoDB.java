package fr.uvsq;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;



public class XMLtoDB {
	public XMLtoDB() throws SQLException{
		Connection connexion = null;
		Statement stmt = null;
		try {
			connexion = ConnexionBD.getConnect();
//			Session session = HibernateUtil.getSessionFactory().openSession();
//			session.createSQLQuery("LOAD XML LOCAL INFILE \"src/test.xml\" INTO TABLE XMLtoDB.mytable ROWS IDENTIFIED BY '<plugin>'");
			stmt = connexion.createStatement();
			int res = stmt.executeUpdate("LOAD XML LOCAL INFILE \"src/test.xml\" INTO TABLE XMLtoDB.mytable ROWS IDENTIFIED BY '<plugin>'");			
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
