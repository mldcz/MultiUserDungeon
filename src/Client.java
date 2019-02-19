import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author mdachez
 *
 */
public class Client extends UnicastRemoteObject implements InterfaceClient, Serializable
{
	/**
	 * @param args
	 */
	public Joueur player;
	public String pseudo;
	public String mdp;
	
	//main
	public static void main(String[] args)
	{
	      InterfaceServeurJeu rmi;
	      
	
	//constructor
	public Client()
	{
		System.out.println("Veuillez entre un pseudo : ");
		Scanner scanner = new Scanner(System.in);
		this.pseudo = scanner.toString();
		System.out.println("Veuillez entrer un mdp : ");
		scanner = new Scanner(System.in);
		this.mdp = scanner.toString();
		this.player = new Joueur(pseudo);
		
	}


	public String getPseudo() throws RemoteException
	{

		return null;
	}


	public void seConnecter() throws RemoteException
	{

		
	}


	public void enregistrer() throws RemoteException
	{

	}


	public String getInformations() throws RemoteException 
	{

		return null;
	}


	public void saisieLoginMDP() throws RemoteException 
	{

		
	}

	public String donnePosition() throws RemoteException
	{
		return null;
	}


	



}
