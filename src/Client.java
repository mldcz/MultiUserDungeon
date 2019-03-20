import java.io.Serializable;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.server.Unreferenced;
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
	public void main(String[] args) throws RemoteException
	{
		ServeurPrincipal proxy;
		try 
		{
			proxy = (ServeurPrincipal) Naming.lookup("rmi://localhost:1099/ServeurPrincipal");
		
		boolean condition = false;
		boolean sortie = false;

		while (condition != true)
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
					Monstre monstre = new Monstre();
					System.out.println("Il y a un monstre dans la salle. Que voulez-vous faire ? 1 attaquer, 0 pour fuir");

					boolean choixAttaque = false;
					while (choixAttaque != true)
					{
						Scanner scanner1 = new Scanner(System.in);
						String str1 = scanner1.nextLine();
						int choix = Integer.parseInt(str1);

						if (choix == 1)
						{
							System.out.println(" "); //saut de ligne
							System.out.println("Lancement d'une attaque !");
							joueur.attaquer(monstre);
							choixAttaque = true;
						}
						else if (choix == 0)
						{
							System.out.println("Vous prenez la fuite.");
							choixAttaque = false;
						}
						else
						{
							System.out.println("Le choix n'est pas correct.");
							choixAttaque = false;
						}
					}

					entreeClavier = true;
				}
				else if (str == "S")
				{
					joueur.seDeplacer(proxy.labyrinthe,"S");
					Monstre monstre = new Monstre();
					System.out.println("Il y a un monstre dans la salle. Que voulez-vous faire ? 1 attaquer, 0 pour fuir");

					boolean choixAttaque = false;
					while (choixAttaque != true)
					{
						Scanner scanner2 = new Scanner(System.in);
						String str2 = scanner2.nextLine();
						int choix = Integer.parseInt(str2);

						if (choix == 1)
						{
							System.out.println(" "); //saut de ligne
							System.out.println("Lancement d'une attaque !");
							joueur.attaquer(monstre);
							choixAttaque = true;
						}
						else if (choix == 0)
						{
							System.out.println("Vous prenez la fuite.");
							choixAttaque = false;
						}
						else
						{
							System.out.println("Le choix n'est pas correct.");
							choixAttaque = false;
						}
					}
					entreeClavier = true;
				}
				else if (str == "O")
				{
					joueur.seDeplacer(proxy.labyrinthe,"O");
					Monstre monstre = new Monstre();
					System.out.println("Il y a un monstre dans la salle. Que voulez-vous faire ? 1 attaquer, 0 pour fuir");

					boolean choixAttaque = false;
					while (choixAttaque != true)
					{
						Scanner scanner3 = new Scanner(System.in);
						String str3 = scanner3.nextLine();
						int choix = Integer.parseInt(str3);

						if (choix == 1)
						{
							System.out.println(" "); //saut de ligne
							System.out.println("Lancement d'une attaque !");
							joueur.attaquer(monstre);
							choixAttaque = true;
						}
						else if (choix == 0)
						{
							System.out.println("Vous prenez la fuite.");
							choixAttaque = false;
						}
						else
						{
							System.out.println("Le choix n'est pas correct.");
							choixAttaque = false;
						}
					}
					entreeClavier = true;
				}
				else if (str == "E")
				{
					joueur.seDeplacer(proxy.labyrinthe, "E");
					Monstre monstre = new Monstre();
					System.out.println("Il y a un monstre dans la salle. Que voulez-vous faire ? 1 attaquer, 0 pour fuir");

					boolean choixAttaque = false;
					while (choixAttaque != true)
					{
						Scanner scanner4 = new Scanner(System.in);
						String str4 = scanner4.nextLine();
						int choix = Integer.parseInt(str4);

						if (choix == 1)
						{
							System.out.println(" "); //saut de ligne
							System.out.println("Lancement d'une attaque !");
							joueur.attaquer(monstre);
							choixAttaque = true;
						}
						else if (choix == 0)
						{
							System.out.println("Vous prenez la fuite.");
							choixAttaque = false;
						}
						else
						{
							System.out.println("Le choix n'est pas correct.");
							choixAttaque = false;
						}
					}
					entreeClavier = true;
				}
				else if (str == "EXIT")
				{
					proxy.exitLab(joueur);
					entreeClavier = false;
					sortie = false;
					break;
					
				}
				else if (str != "N" || str != "S" || str != "E" || str != "O" || str != "EXIT")
				{
					System.out.println("Ce que vous avez entre au clavier n'est pas correct.");
					System.out.println("");
				}
			}
			}
		} 
		catch (MalformedURLException | NotBoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	


	//constructor
	public Client(String pseudo) throws RemoteException
	{
		super();
		System.out.println("Veuillez entrer un mdp : ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		this.mdp = str;
		this.joueur = new Joueur(pseudo);
		System.out.println("Client, Joueur et mdp créées. ");

		
	}


	public String getPseudo() throws RemoteException { return this.pseudo;	}
	public String getMdp() throws RemoteException 	{ return this.mdp; }


	public Position position(String X, String Y) throws RemoteException
	{
		return position(X,Y);
	}



	public void unreferenced()
	{

	}
	
	public void getMessage(String s)  throws RemoteException {
		System.out.println(s);
	}



}
