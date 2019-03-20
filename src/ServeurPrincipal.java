import java.rmi.RemoteException;

import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class ServeurPrincipal extends UnicastRemoteObject implements InterfaceServeurPrincipal
{
	
	/**
	 * @param args
	 */
	
	private HashMap <String, Client> hmClientsLab;
    private Joueur joueur;
    private Labyrinthe labyrinthe;
	private String name;
	//main
	public static void main()
	{
		try
		{
			//Démarre le rmiregistry
			LocateRegistry.createRegistry(1099);
			ServeurPrincipal obj = new ServeurPrincipal("ServeurPrincipal");
			Naming.rebind("ServeurPrincipal", obj);
			System.out.println("ServeurPrincipal déclaré auprès du service de nom.");

		}
		catch (RemoteException e) 
		{
			System.out.println("Erreur lors du lancement du serveur");
		}
	}
	
	//Constructor
	public ServeurPrincipal(String s) throws RemoteException
	{
		super();
		this.name = s;
		hmClientsLab = new HashMap<String, Client>();
		hmClientsStockes = new ArrayList<Client>();
		this.labyrinthe = new Labyrinthe();

		
	}


	public synchronized void creerJoueur() throws RemoteException
	{
		boolean condition = false;
		
		while (condition!= true)
		{
			System.out.println("Veuillez donner un pseudo pour votre jouer :");
			
			Scanner scanner = new Scanner(System.in);
			String str = scanner.nextLine();
			this.pseudo = str;
			
			if (hmClientsStockes.contains(scanner.toString()))
			{
				System.out.println("Pseudo deja pris.");
			}
			else
			{
				hmClientsLab.put(pseudo, new Client(pseudo));
				System.out.println("Bienvenue " + pseudo + " !");
				condition = true;
			}
		}
	}
	
	
	public synchronized void supprimerJoueur(Client client) throws RemoteException 
	{
		if (hmClientsLab.containsValue(client))
		{
			for (Map.Entry<String,String> e : hmClientsLab.entrySet())
			{
				if (e.getValue() == client )
				{
					hmClientsLab.Remove(e.getKey(), e.getValue());
				}
			}
		}
	}

	


	public synchronized boolean interrogeDisponibilite() throws RemoteException 
	{
		return false;
	}

	public synchronized void authentification() throws RemoteException 
	{
		
	}

	public synchronized String recupererInformations() throws RemoteException
	{
		return null;
	}

	public synchronized void desinscription(Client client) throws RemoteException 
    {
		hmClientsLab.remove(joueur., new Client(pseudo));
		hmClientsStockes.Add(new Client(pseudo));
	}


	public synchronized void creationLab() 
	{
		this.labyrinthe = new Labyrinthe();
		this.labyrinthe.generationPiece();
		System.out.println("Creation du labyrinthe ok ! ");
		
	}


	public void changerPiece() throws RemoteException 
	{
		
	}

	public boolean isLabFini() throws RemoteException 
	{
		if (this.labyrinthe.tabPiece.toString() == "N,S,T" && joueur.getPosition() == 44)
		{
			System.out.println("Vous avez trouve le tresor !");
			return true;
		}
		else
		{
			return false;
		}
		
	}


	public void exitLab(Joueur joueur) throws RemoteException 
	{
		if (hmClientsLab.containsKey(joueur))
		{
			hmClientsLab.remove(joueur);
		}
	}

	public String getListJoueur() throws RemoteException 
	{
		return hmClientsLab.toString();
	}

}








