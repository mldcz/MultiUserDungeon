import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class Client extends UnicastRemoteObject implements InterfaceClient, Serializable, Unreferenced
{
	/**
	 * @param args
	 */

	//test

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
		super();
		System.out.println("Veuillez entre un pseudo : ");
		Scanner scanner = new Scanner(System.in);
		this.pseudo = scanner.toString();
		System.out.println("Veuillez entrer un mdp : ");
		scanner = new Scanner(System.in);
		this.mdp = scanner.toString();
		this.player = new Joueur(pseudo);

		
	}


	public String getPseudo() throws RemoteException { return this.pseudo;	}
	public String getMdp() throws RemoteException 	{ return this.mdp; }


	public Position position(String X, String Y) throws RemoteException
	{
		return position;
	}



	public void unreferenced()
	{

	}
	
	public void getMessage(String s)  throws RemoteException {
		System.out.println(s);
	}



}
