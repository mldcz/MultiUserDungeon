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
	
	HashMap <String, Client> hmClientsLab;
	ArrayList <Client> hmClientsStockes;
	Joueur joueur;
	Labyrinthe labyrinthe;
	
	//main
	public static void main()
	{
		try 
		{
			ServeurPrincipal serveurPrincipal = new ServeurPrincipal();
			serveurPrincipal.creationLab();
			System.out.println("Serveur démarré !");
		} 
		catch (RemoteException e) 
		{
			System.out.println("Erreur lors du lancement du serveur");
		}
	}
	
	//Constructor
	public ServeurPrincipal() throws RemoteException
	{
		super();
		hmClientsLab = new HashMap<String, Client>();
		hmClientsStockes = new ArrayList<Client>();
		
	}
	
	public synchronized void creerJoueur(String pseudo) throws RemoteException
	{
		boolean condition = false;
		
		while (condition!= true)
		{
			System.out.println("Veuillez donner un pseudo pour votre jouer :");
			
			Scanner scanner = new Scanner(System.in);
			
			if (hmClientsStockes.contains(scanner.toString()))
			{
				System.out.println("Pseudo déjà pris.");
			}
			else
			{
				hmClientsLab.Add(pseudo, new Client(pseudo));
				hmClientsStockes.Add(new Client(pseudo));
				System.out.println("Bienvenue " + pseudo + " !");
				condition = true;
			}
		}
	
		
	}
	
	
	public synchronized void supprimerJoueur(Client client) throws RemoteException 
	{
		if (hmClientsLab.containsValue(client))
		{
			hmClientsLab.remove(client);
		}
	}

	
	public synchronized String affichageAuthentification() throws RemoteException 
	{
		
		System.out.println();
		if (joueur.)
		return ;
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
		System.out.println("Création du labyrinthe ok ! ");
		
	}


	public void changerPiece() throws RemoteException 
	{
		
	}

	public boolean isLabFini() throws RemoteException 
	{
		if (this.labyrinthe.tabPiece.toString() == "N,S,T" && joueur.getPosition() == 44)
		{
			System.out.println("Vous avez trouvé le trésor !");
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
