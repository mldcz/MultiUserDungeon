/**
 * 
 */

/**
 * @author mdachez
 *
 */


import java.rmi.*;
import java.util.HashMap;
	
	
public interface InterfaceServeurPrincipal extends java.rmi.Remote 
{
	//public String getInformations() throws java.rmi.RemoteException;
	public void creerJoueur(String pseudo) throws java.rmi.RemoteException;
	public void supprimerJoueur(Joueur joueur) throws java.rmi.RemoteException;
	public String affichageAuthentification() throws java.rmi.RemoteException;
	//public void verification() throws java.rmi.RemoteException;
	public boolean interrogeDisponibilite() throws java.rmi.RemoteException;
	public void authentification() throws java.rmi.RemoteException;
	// public String recupererInformations() throws java.rmi.RemoteException;
	public void desinscription() throws java.rmi.RemoteException;
	//public String ToString() throws java.rmi.RemoteException;
	public void creationLab() throws java.rmi.RemoteException;
	public void changerPiece() throws java.rmi.RemoteException;
	public boolean isLabFini() throws java.rmi.RemoteException;
	public boolean exitLab() throws java.rmi.RemoteException;
	public String getListJoueur()throws java.rmi.RemoteException;
	
	
	
	
}
