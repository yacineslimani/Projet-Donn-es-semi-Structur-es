package fr.uvsq;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

public class MusicbrainzLoadData {

	String url;

	public MusicbrainzLoadData() {
		super();

	}

	public void getSongsByAuthor (String artist){


		try{
			System.out.println(url);
			BufferedReader urlReader = new BufferedReader(new InputStreamReader(new URL(url).openStream()));

			


			FileWriter localFile = new FileWriter(new File("src/main/resources/xmlFile/MusicBrainz.xml"));

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
