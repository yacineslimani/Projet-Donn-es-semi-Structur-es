package fr.uvsq;

import java.io.IOException;
import java.sql.SQLException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;




public class Main {

	public static void main(String[] args) throws SQLException, SAXException, IOException, TransformerException, ParserConfigurationException {

		
//		MusicbrainzLoadData musicbrainzLoadData = new MusicbrainzLoadData();
//		musicbrainzLoadData.getAlbumByAuthor("metallica");
		
		
		

//		MusicbrainzDOMTransform musicbrainzDOMTransform = new MusicbrainzDOMTransform();
//		musicbrainzDOMTransform.transformAlbum();

				XMLtoDB xmlDb = new XMLtoDB();
				xmlDb.insertInAlbum("DOMAlbumResult.xml");



	}
}
