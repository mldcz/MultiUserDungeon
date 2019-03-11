import java.rmi.Remote;
import java.rmi.RemoteException;

import src.Combattant;

public interface ServerCombatInterface extends Remote {
    void initialisationCombat(Combattant c1, Combattant c2) throws RemoteException;
    Combattant turn() throws RemoteException;
}
