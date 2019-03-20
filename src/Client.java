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
		ServeurPrincipal proxy = (ServeurPrincipal) Naming.lookup("rmi://localhost:1099/ServeurPrincipal");
		Client client = new Client();
		proxy.creerJoueur();

	}
	
	//constructor
	public Client(String pseudo)
	{
		super();

		System.out.println("Veuillez entrer un mdp : ");
		scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		this.mdp = str;

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
