package fr.uvsq;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class MusicbrainzDOMTransform {


	public void transformSong() throws SAXException, IOException, TransformerException{

		try {

			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			
			final Document documentBD= builder.newDocument();
			final Element songs = documentBD.createElement("songs");
			
			DocumentBuilderFactory factory2 = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder2 = factory2.newDocumentBuilder();
			Document document = builder2.parse("src/main/resources/xmlFile/MusicBrainzSong.xml");
			
			final Element racine = document.getDocumentElement();
			NodeList AllRecording = racine.getElementsByTagName("recording");
			
			for (int i = 0; i<AllRecording.getLength(); i++) {
				final Element song = documentBD.createElement("song");
				if(AllRecording.item(i).getNodeType() == Node.ELEMENT_NODE){
					
					final Element title = documentBD.createElement("title");
					final Element duration = documentBD.createElement("duration");
					final Element author = documentBD.createElement("author");
					final Element album = documentBD.createElement("album");
					
					Element recording = (Element)AllRecording.item(i);
					
					Element title2 = (Element)recording.getElementsByTagName("title").item(0);
					Element duration2 = (Element)recording.getElementsByTagName("length").item(0);
					Element artist = (Element)recording.getElementsByTagName("artist").item(0);
					Element artistName = (Element)recording.getElementsByTagName("name").item(0);
					Element release = (Element)recording.getElementsByTagName("release").item(0);
					Element releaseName = (Element)release.getElementsByTagName("title").item(0);
					
					author.setTextContent(artistName.getTextContent());
					System.out.println(artistName.getTextContent());
					System.out.println(releaseName.getTextContent());
					
					
					title.setTextContent(title2.getTextContent());
					duration.setTextContent(duration2.getTextContent());
					album.setTextContent(releaseName.getTextContent());
					
					song.appendChild(title);
					song.appendChild(duration);
					song.appendChild(author);
					song.appendChild(album);
					songs.appendChild(song);
					
					System.out.println(title.getTextContent());
				}
				
			}
			
			documentBD.appendChild(songs);
			
			final TransformerFactory transformerFactory = TransformerFactory.newInstance();
			final Transformer transformer = transformerFactory.newTransformer();
			final DOMSource source = new DOMSource(documentBD);
			final StreamResult sortie = new StreamResult(new File("src/main/resources/xmlFile/DOMSongResult.xml"));

			//prologue
			transformer.setOutputProperty(OutputKeys.VERSION, "1.0");
			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");            

			//formatage
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

			//sortie
			transformer.transform(source, sortie); 
			



		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}
	
	
	public void transformAlbum() throws  SAXException, IOException, ParserConfigurationException, TransformerException{
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		final Document documentBD= builder.newDocument();
		final Element albums = documentBD.createElement("albums");
		
		DocumentBuilderFactory factory2 = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder2 = factory2.newDocumentBuilder();
		Document document = builder2.parse("src/main/resources/xmlFile/MusicBrainzAlbum.xml");
		
		final Element racine = document.getDocumentElement();
		NodeList AllRelease = racine.getElementsByTagName("release");
		
		for (int i = 0; i<AllRelease.getLength(); i++) {
			final Element album = documentBD.createElement("album");
			if(AllRelease.item(i).getNodeType() == Node.ELEMENT_NODE){
				
				Element release = (Element)AllRelease.item(i);
				
				final Element title = documentBD.createElement("title");
				final Element author = documentBD.createElement("author");
				
				Element title2 = (Element)release.getElementsByTagName("title").item(0);
				Element artistName = (Element)release.getElementsByTagName("name").item(0);
				
				title.setTextContent(title2.getTextContent());
				author.setTextContent(artistName.getTextContent());
				
				album.appendChild(author);
				album.appendChild(title);
				albums.appendChild(album);
				System.out.println(title2.getTextContent());
				
				
			}
		}
		
		documentBD.appendChild(albums);
		
		final TransformerFactory transformerFactory = TransformerFactory.newInstance();
		final Transformer transformer = transformerFactory.newTransformer();
		final DOMSource source = new DOMSource(documentBD);
		final StreamResult sortie = new StreamResult(new File("src/main/resources/xmlFile/DOMAlbumResult.xml"));

		//prologue
		transformer.setOutputProperty(OutputKeys.VERSION, "1.0");
		transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");            

		//formatage
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

		//sortie
		transformer.transform(source, sortie); 
		
		
		
		
		
	}

}
