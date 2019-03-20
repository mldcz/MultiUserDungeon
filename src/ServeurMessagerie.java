import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

public class ServeurMessagerie {

	public static void main(String args[]) throws RemoteException, AlreadyBoundException {

		try {

			Registry reg = null;
			reg = LocateRegistry.createRegistry(1010);
			Naming.rebind("serverMessagerie", new ServeurMessagerie());
			System.out.println("Serveur demarre !");
			
		} catch (RemoteException e) {
			System.out.println("Erreur lors du lancement du serveur");
		}

	}

	
	private ArrayList<Piece> pieces;
	
	
	public void quitterChat(Piece p) throws RemoteException {
		pieces.remove(p);
}
	
	public void envoiMessage(Piece p, Client c,String s) throws RemoteException {
		
		ArrayList<Client> clients = listeClientsPiece(p);
		System.out.println("CLIENTS : " + clients); 
		for (int i = 0; i < clients.size(); i++) {
			clients.get(i).getMessage(s);
		}
			
		
}
	
}