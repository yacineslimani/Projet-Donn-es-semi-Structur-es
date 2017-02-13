package fr.uvsq;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

public class LastFMLoadData {
	String url;

	public LastFMLoadData() {
		super();

	}

	public void getSongsByAuthor (String artist){
//		this.url= "http://musicbrainz.org/ws/2/recording/?query=artist:"+artist+"&limit=5";
		this.url= "http://ws.audioscrobbler.com/2.0/?method=user.getfriends&user=rj&api_key=adbf8a7edee529a5fea225961411ab69&limit=5";
		

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
