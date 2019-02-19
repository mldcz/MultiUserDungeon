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
	public String getPseudo() throws java.rmi.RemoteException;
	public void seConnecter() throws java.rmi.RemoteException;
	public void enregistrer() throws java.rmi.RemoteException;
	public String getInformations() throws java.rmi.RemoteException;
	public void saisieLoginMDP() throws java.rmi.RemoteException;
	public String donnePosition() throws java.rmi.RemoteException;
}
