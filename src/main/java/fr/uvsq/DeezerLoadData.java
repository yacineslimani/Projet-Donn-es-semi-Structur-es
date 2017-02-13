package fr.uvsq;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class DeezerLoadData {
	String url;

	public DeezerLoadData() {
		super();

	}

	public void getSongsByAuthor (String author) throws TransformerException{
//		this.url= "http://api.deezer.com/search/track/?q="+author+"&output=xml";
		this.url= "http://api.deezer.com/search?q=artist:\""+author+"\"&output=xml";

		try{
			System.out.println(url);
			BufferedReader urlReader = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
			FileWriter localFile = new FileWriter(new File("src/main/resources/xmlFile/deezerSongs.xml"));

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
		
	
		TransformerFactory tFactory = TransformerFactory.newInstance();
	    Transformer transformer = tFactory.newTransformer(new StreamSource("src/main/resources/xmlFile/deezerSongs.xsl"));
	    transformer.transform(new StreamSource("src/main/resources/xmlFile/deezerSongs.xml"), new StreamResult("src/main/resources/xmlFile/deezerSongsRes.xml"));
        		
	}
	
	public void getAlbumsByAuthor (String author) throws TransformerException{
//		this.url= "http://api.deezer.com/search/album/?q=" + author +"&output=xml&artist="+author;
		this.url= "http://api.deezer.com/search/album/?q=artist:\""+ author +"\"&output=xml";
		

		try{
			System.out.println(url);
			BufferedReader urlReader = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
			FileWriter localFile = new FileWriter(new File("src/main/resources/xmlFile/deezerAlbums.xml"));

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
		
	
		TransformerFactory tFactory = TransformerFactory.newInstance();
	    Transformer transformer = tFactory.newTransformer(new StreamSource("src/main/resources/xmlFile/deezerAlbums.xsl"));
	    transformer.transform(new StreamSource("src/main/resources/xmlFile/deezerAlbums.xml"), new StreamResult("src/main/resources/xmlFile/deezerAlbumsRes.xml"));
        		
	}
	
	public void getInfoForSongTitle (String title) throws TransformerException{
//		this.url= "http://api.deezer.com/search/track/?q=" + title + "&output=xml";
		this.url= "http://api.deezer.com/search?q=track:\""+title+"\"&output=xml";
		
		

		try{
			System.out.println(url);
			BufferedReader urlReader = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
			FileWriter localFile = new FileWriter(new File("src/main/resources/xmlFile/deezerInfosSong.xml"));

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
	
		TransformerFactory tFactory = TransformerFactory.newInstance();
	    Transformer transformer = tFactory.newTransformer(new StreamSource("src/main/resources/xmlFile/deezerSongs.xsl"));
	    transformer.transform(new StreamSource("src/main/resources/xmlFile/deezerInfosSong.xml"), new StreamResult("src/main/resources/xmlFile/deezerInfosRes.xml"));
        		
	}
}
