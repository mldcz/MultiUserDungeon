/**
 * 
 */

/**
 * @author mdachez
 *
 */


import java.rmi.*;


public interface InterfaceClient extends java.rmi.Remote 
{
	//public String getPseudo() throws java.rmi.RemoteException;
	//public void seConnecter() throws java.rmi.RemoteException;
	//public void enregistrer() throws java.rmi.RemoteException;
	//public String getMDP() throws java.rmi.RemoteException;
	//public void saisieLoginMDP() throws java.rmi.RemoteException;
	Position position(String X, String Y) throws java.rmi.RemoteException;

}
