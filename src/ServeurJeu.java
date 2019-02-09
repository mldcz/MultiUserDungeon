import java.util.ArrayList;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class ServeurJeu extends UnicastRemoteObject implements JServeurInterface{

	public static ArrayList<String> joueurs = new ArrayList<String>();
	
	
	public static void main (String args[]) {
		
		//à remplir avec les bonnes infos de connexion 
		try {
			Registry reg = LocateRegistry.createRegistry(1010);
            //Naming.rebind("rmi://127.0.0.1:1099/server", reg);
            ServeurJeu JS = new ServeurJeu();
            //MsgServer MS = new MsgServer(MS);
            reg.rebind("rmi://127.0.0.78:1010/server", JS);       
            System.out.println("Server started ! ");
            JS.CreationLab();  
			
			
		}catch(Exception e) {
			System.out.println("Catch SJ main : "+ e);
		}
	}
	
	//utile si on a un labyrinthe en dur ? 
	public void CreationLab() throws RemoteException{
		
		
		
	}
	
	//utile si on a un labyrinthe en dur ? 
	public int changePiece() throws RemoteException{
		
		return 0;
	}
	
	
	public int isLabFini() throws RemoteException{
		//position[][] à créer, on teste la position du joueur 
		if(position[][]==[4][4]) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	
	
	public int exitLab() throws RemoteException{
	
		return 0;
	}
	
	
	public static String getListeJoueurs() throws RemoteException{
		
		String getListe = joueurs.get(joueurs.size()); 
		
		return getListe;
	}
	
	
	
}
