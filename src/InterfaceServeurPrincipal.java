import java.rmi.*;
import java.util.HashMap;
import java.util.Scanner;
	
	
public interface InterfaceServeurPrincipal extends java.rmi.Remote 
{
	public void creerJoueur(String id, String pseudo) throws java.rmi.RemoteException;
	public void supprimerJoueur(Joueur joueur) osition(String id);
	public String affichageAuthentification() throws throws java.rmi.RemoteException;
	public boolean interrogeDisponibilite() throws java.rmi.RemoteException;
	//public void creationLab() throws java.rmi.RemoteException;
	public void changerPiece() throws java.rmi.RemoteException;
	public boolean isLabFini() throws java.rmi.RemoteException;
	public boolean exitLab() throws java.rmi.RemoteException;
	public String getListJoueur()throws java.rmi.RemoteException;
	//public void generationPiece(String tabPiece[][]) throws RemoteException;
	//public void authentification() throws java.rmi.RemoteException;
	// public String recupererInformations() throws java.rmi.RemoteException;
	//public void desinscription() throws java.rmi.RemoteException;
	//public String ToString() throws java.rmi.RemoteException;
	// public Position position() throws java.rmi.RemoteException;
	//public void verification() throws java.rmi.RemoteException;
	//public String getInformations() throws java.rmi.RemoteException;
}
