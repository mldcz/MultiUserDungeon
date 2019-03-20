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

	public Joueur joueur;
	public String pseudo;
	public String mdp;
	
	//main
	public static void main(String[] args)
	{
		ServeurPrincipal proxy = (ServeurPrincipal) Naming.lookup("rmi://localhost:1099/ServeurPrincipal");
		boolean condition = false;
		boolean sortie = false;

		(while condition != true)
		{
			System.out.println("Veuillez donner un pseudo pour votre jouer :");
			Scanner scanner = new Scanner(System.in);
			String str = scanner.nextLine();
			this.pseudo = str;
			condition = proxy.creerJoueur(this.pseudo);
		}

		while (sortie != true)
		{
			boolean entreeClavier = true;

			while (entreeClavier != false)
			{
                System.out.println("Vous etes dans la piece :" + joueur.getPosition());
                System.out.println("");
            	System.out.println("Taper N pour aller au Nord, S pour aller au Sud, E pour aller a l'Est, O pour aller à l'Ouest ou EXIT pour quitter le labyrinthe.");

				Scanner scanner = new Scanner(System.in);
				String str = scanner.nextLine();
				str = str.toUpperCase();
				if (str == "N")
				{
					joueur.seDeplacer(proxy.labyrinthe,"N");
					entreeClavier = true;
				}
				else if (str == "S")
				{
					joueur.seDeplacer(proxy.labyrinthe,"N");
					entreeClavier = true;
				}
				else if (str == "O")
				{
					joueur.seDeplacer(proxy.labyrinthe,"N");
					entreeClavier = true;
				}
				else if (str == "E")
				{
					joueur.seDeplacer(proxy.labyrinthe, "N");
					entreeClavier = true;
				}
				else if (str == "EXIT")
				{
					proxy.exitLab(joueur);
					entreeClavier = false;
					exit(0);
				}
				else if (str != "N" || str != "S" || str != "E" || str != "O" || str != "EXIT)
				{
					System.out.println("Ce que vous avez entré au clavier n'est pas correct.");
					System.out.println("");
				}

			}

		}
	
	//constructor
	public Client(String pseudo)
	{
		super();
		System.out.println("Veuillez entrer un mdp : ");
		scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		this.mdp = str;
		this.joueur = new Joueur(pseudo);
		System.out.println("Client, Joueur et mdp créées. ");

		
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
