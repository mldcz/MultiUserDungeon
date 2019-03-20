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
	
	private HashMap <int, Client> hmClientsLab;
    private Joueur joueur;
    public Labyrinthe labyrinthe;
	private String name;
	private int i = 1;
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
		hmClientsLab = new HashMap<int, Client>();
		hmClientsStockes = new ArrayList<Client>();
		this.labyrinthe = new Labyrinthe();
		this.labyrinthe.generationPiece();
	}

	public synchronized boolean creerJoueur() throws RemoteException
	{
		f (hmClientsStockes.contains(str))
		{
			System.out.println("Pseudo deja pris.");
			return false
		}
		else
		{
			Client client = new Client(pseudo);
			hmClientsLab.put(i,client);
			System.out.println("Bienvenue " + pseudo + " !");
			i++;
			return true;
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

	public synchronized void getPositionJoueur(Joeur)




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
		System.out.println("Au revoir !");
	}

	public String getListJoueur() throws RemoteException 
	{
		return hmClientsLab.toString();
	}

}








