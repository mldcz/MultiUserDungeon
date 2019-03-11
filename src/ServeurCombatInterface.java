import java.rmi.Remote;
import java.rmi.RemoteException;

import src.Combattant;

public interface ServerCombatInterface extends Remote {
    void initialisationCombat(PCombattant c1, Combattant c1) throws RemoteException;
    Combattant turn() throws RemoteException;
}
