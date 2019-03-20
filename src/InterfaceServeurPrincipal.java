import java.rmi.*;
import java.util.HashMap;
import java.util.Scanner;
	
	
public interface InterfaceServeurPrincipal extends java.rmi.Remote 
{
	public boolean creerJoueur(String s) throws java.rmi.RemoteException;
	public void supprimerJoueur(Client client) throws java.rmi.RemoteException;
	public void authentification() throws RemoteException;
	public void desinscription(Client client) throws RemoteException;
	public void exitLab(Joueur joueur) throws RemoteException;
	public String getListJoueur() throws RemoteException;
}
