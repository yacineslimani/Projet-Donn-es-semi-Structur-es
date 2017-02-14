package fr.uvsq;

import java.rmi.RemoteException;
import java.util.ArrayList;

import org.apache.axis2.AxisFault;

import antlr.collections.List;
import fr.uvsq.MainStub.GetAlbumsByAuthor;
import fr.uvsq.MainStub.GetAlbumsByAuthorResponse;
import fr.uvsq.MainStub.GetInfoForSongTitle;
import fr.uvsq.MainStub.GetInfoForSongTitleResponse;
import fr.uvsq.MainStub.GetSongsByAuthor;
import fr.uvsq.MainStub.GetSongsByAuthorResponse;

public class App {

	public static void main(String[] args) throws RemoteException, MainTransformerExceptionException, MainParserConfigurationExceptionException, MainSQLExceptionException, MainSAXExceptionException, MainIOExceptionException {
		// TODO Auto-generated method stub
		
		
		MainStub mainStub = new MainStub();
		
		GetAlbumsByAuthor getAlbumsByAuthor = new GetAlbumsByAuthor();
		getAlbumsByAuthor.setAuthor("eminem");
		GetAlbumsByAuthorResponse albumRes = mainStub.getAlbumsByAuthor(getAlbumsByAuthor);
		
		for(int i=1;i<albumRes.get_return().length;i++){
			System.out.println("Album Resultat : "+albumRes.get_return()[i]);
		}
		System.out.println("-------------------------------------------------\n\n\n");
		
		GetSongsByAuthor getSongsByAuthor = new GetSongsByAuthor();
		getSongsByAuthor.setAuthor("aznavour");
		GetSongsByAuthorResponse songRes = mainStub.getSongsByAuthor(getSongsByAuthor);
		
		for(int i=1;i<songRes.get_return().length;i++){
			System.out.println("Song Resultat : "+ songRes.get_return()[i]);
		}
		
		System.out.println("-------------------------------------------------\n\n\n");
		
		GetInfoForSongTitle getInfoForSongTitle = new GetInfoForSongTitle();
		getInfoForSongTitle.setTitle("aznavour");
		GetInfoForSongTitleResponse infoRes = mainStub.getInfoForSongTitle(getInfoForSongTitle);
		
		for(int i=1;i<infoRes.get_return().length;i++){
			System.out.println("Info Song : ");
			System.out.println("\t Album : "+ infoRes.get_return()[i].getAlbum());
			System.out.println("\t Author : "+ infoRes.get_return()[i].getAuthor());
			System.out.println("\t Duration : "+ infoRes.get_return()[i].getDuration());
		}
		

	}

}
