package fr.uvsq;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {

	public static void main(String[] args) {
		
		try{
			  BufferedReader urlReader = new BufferedReader(new InputStreamReader(new URL("http://musicbrainz.org/ws/2/recording/?query=artist:aznavour").openStream()));
			  FileWriter localFile = new FileWriter(new File("fichier.xml"));
			  
			  System.out.println("Telechargement términé");
			  
			  String s;
	 
			  while((s = urlReader.readLine()) != null){
			     localFile.write(s);
			  }
			  urlReader.close();
			  localFile.close();
			}
			catch(Exception e){
			  System.out.println("Erreur : " + e);
			}
	}

}
