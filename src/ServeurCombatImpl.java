import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

import Combattant;

public class ServerCombatImpl  extends UnicastRemoteObject implements ServerCombatInterface{

    private Combattant c1;
    private Combattant c2;

    public ServerFightImpl() throws RemoteException {
        super();
    }

    public void initialisationCombat(Combattant c1, Combattant c1)  throws RemoteException {
        this.c1 = c1;
        this.c2 = c2;
    }

    public Combattant turn() throws RemoteException{
        return new Combat(c1, c2).start();
    }
}
