import java.rmi.*;
import java.util.HashMap;
import java.util.Scanner;
	
	
public interface InterfaceServeurPrincipal extends java.rmi.Remote 
{
	public ServeurPrincipal(String s) throws RemoteException;
	public synchronized boolean creerJoueur(String) throws java.rmi.RemoteException;
	public synchronized void supprimerJoueur(Client client) throws java.rmi.RemoteException;
	public synchronized boolean interrogeDisponibilite() throws RemoteException;
	public synchronized void authentification() throws RemoteException;
	public synchronized void desinscription(Client client) throws RemoteException;
	public void exitLab(Joueur joueur) throws RemoteException;
	public String getListJoueur() throws RemoteException;
}
