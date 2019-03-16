import java.rmi.Remote;
import java.rmi.RemoteException;



public interface InterfaceServeurMessagerie {

	//void rejoindreChat(String string, Piece p) throws RemoteException;  
    void quitterChat(Piece p) throws RemoteException;  
    void sendMessage (Piece p, Client c, String s) throws RemoteException; 
	
}
