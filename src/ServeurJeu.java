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

	public static ArrayList<Joueur> joueurs = new ArrayList<Joueur>();
	
	
	public static void main (String args[]) {
		
		//� remplir avec les bonnes infos de connexion 
		try {
			Registry reg = LocateRegistry.createRegistry(1010);
            //Naming.rebind("rmi://127.0.0.1:1099/server", reg);
            ServeurJeu JS = new ServeurJeu();
            //MsgServer MS = new MsgServer(MS);
            reg.rebind("rmi://127.0.0.78:1010/server", JS);       
            System.out.println("Server started ! ");
            
			
			
		}catch(Exception e) {
			System.out.println("Catch SJ main : "+ e);
		}
	}
	
	
	
	public boolean isLabFini() throws RemoteException{
		//position[][] a creer, on teste la position du joueur 
		
		//si position change alors : 
		
		if(position[][]==[4][4]) {
			System.out.println("Bravo, vous avez trouv� le tr�sor et termin� le labyrinthe !");
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	public int exitLab() throws RemoteException{
	
		if(isLabFini()==true) {
			
			//modifier la position du joueur � position[1][1]
		}
		
		return 0;
	}
	
	
	public static String getListeJoueurs() throws RemoteException{
		
		Joueur getListe = joueurs.get(joueurs.size()); 
		
		return getListeJoueurs();
	}
	
	
	
}
