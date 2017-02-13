package fr.uvsq;




public class Main {

	public static void main(String[] args) {
		
//		MusicbrainzLoadData musicbrainzLoadData = new MusicbrainzLoadData();
		LastFMLoadData lfdd = new LastFMLoadData();
		lfdd.getSongsByAuthor("");
		
//		musicbrainzLoadData.getSongsByAuthor("metallica");
		
//		AlbumDAOImpl albumDAOImpl = new AlbumDAOImpl();
//		Album album = new Album();
//		album.setAuthor("aznavour");
//		album.setTitle("la mamma");
//		albumDAOImpl.insert(album);
	}
}
