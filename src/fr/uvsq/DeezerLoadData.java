package fr.uvsq;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class DeezerLoadData {
	String url;	
	DataBaseOperation dbo = new DataBaseOperation();

	public DeezerLoadData() {
		super();

	}

	public void getSongsByAuthor (String author) throws TransformerException, SQLException{
//		this.url= "http://api.deezer.com/search/track/?q="+author+"&output=xml";
		this.url= "http://api.deezer.com/search?q=artist:\""+author+"\"&output=xml";

		try{
			System.out.println(url);
			BufferedReader urlReader = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
			FileWriter localFile = new FileWriter(new File("WebContent/resources/xmlFile/deezerSongs.xml"));

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
	    Transformer transformer = tFactory.newTransformer(new StreamSource("WebContent/resources/xslFiles/deezerSongs.xsl"));
	    transformer.transform(new StreamSource("WebContent/resources/xmlFile/deezerSongs.xml"), new StreamResult("WebContent/resources/xmlFile/deezerSongsRes.xml"));
		
	    dbo.insertInSong("deezerSongsRes.xml");
	}
	
	public void getAlbumsByAuthor (String author) throws TransformerException, SQLException{
//		this.url= "http://api.deezer.com/search/album/?q=" + author +"&output=xml&artist="+author;
		this.url= "http://api.deezer.com/search/album/?q=artist:\""+ author +"\"&output=xml";
		

		try{
			System.out.println(url);
			BufferedReader urlReader = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
			FileWriter localFile = new FileWriter(new File("WebContent/resources/xmlFile/deezerAlbums.xml"));

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
	    Transformer transformer = tFactory.newTransformer(new StreamSource("WebContent/resources/xslFiles/deezerAlbums.xsl"));
	    transformer.transform(new StreamSource("WebContent/resources/xmlFile/deezerAlbums.xml"), new StreamResult("WebContent/resources/xmlFile/deezerAlbumsRes.xml"));
		
	    dbo.insertInAlbum("deezerAlbumsRes.xml");
	}
	
	public void getInfoForSongTitle (String title) throws TransformerException, SQLException{
//		this.url= "http://api.deezer.com/search/track/?q=" + title + "&output=xml";
		this.url= "http://api.deezer.com/search?q=track:\""+title+"\"&output=xml";
		
		

		try{
			System.out.println(url);
			BufferedReader urlReader = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
			FileWriter localFile = new FileWriter(new File("WebContent/resources/xmlFile/deezerInfosSong.xml"));

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
	    Transformer transformer = tFactory.newTransformer(new StreamSource("WebContent/resources/xslFiles/deezerSongs.xsl"));
	    transformer.transform(new StreamSource("WebContent/resources/xmlFile/deezerInfosSong.xml"), new StreamResult("WebContent/resources/xmlFile/deezerInfosRes.xml"));
		
	    dbo.insertInSong("deezerInfosRes.xml");
	}
}
