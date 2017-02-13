package fr.uvsq;



import fr.uvsq.beans.Album;
import fr.uvsq.dao.AlbumDAOImpl;

public class Main {

	public static void main(String[] args) {
		
		MusicbrainzLoadData musicbrainzLoadData = new MusicbrainzLoadData();
		musicbrainzLoadData.getSongsByAuthor("metallica");
		
		AlbumDAOImpl albumDAOImpl = new AlbumDAOImpl();
		Album album = new Album();
		album.setAuthor("aznavour");
		album.setTitle("la mamma");
		albumDAOImpl.insert(album);
	}
}
