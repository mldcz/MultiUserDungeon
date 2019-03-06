import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
public class Labyrinthe {
	
	//colonnes et lignes du labyrinthe 
	public int X;
	public int Y = 2;
	
	//tableau des cases du labyrinthe 
	String tabPiece[][];
		
	
	//creation des pieces du labyrinthe O,N,E,S repr�sentent les possibilit�s de d�placement, M indique la pr�sence d'un monstre, T est le tr�sor
	public void generationPiece(String tabPiece[][]){
		
		tabPiece[1][1]="N,E";
		tabPiece[1][2]="O,E";
		tabPiece[1][3]="O,N,E";
		tabPiece[1][4]="O,N,E";
		tabPiece[1][5]="O,N";
		tabPiece[2][1]="N,E,S";
		tabPiece[2][2]="O";
		tabPiece[2][3]="N,E,S";
		tabPiece[2][4]="O,N,S";
		tabPiece[2][5]="S";
		tabPiece[3][1]="O,E,S";
		tabPiece[3][2]="O,N,E";
		tabPiece[3][3]="O,S";
		tabPiece[3][4]="N,E,S";
		tabPiece[3][5]="O,N";
		tabPiece[4][1]="N,S";
		tabPiece[4][2]="E,S";
		tabPiece[4][3]="O,N";
		tabPiece[4][4]="N,S";
		tabPiece[4][5]="N,S";
		tabPiece[5][1]="E,S";
		tabPiece[5][2]="O,M";
		tabPiece[5][3]="E,S";
		tabPiece[5][4]="O,E,S";
		tabPiece[5][5]="O,S";
		
	}

    public void seDeplacer () {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

		X = Joueur.getPositionX();
        Y = Joueur.getPositionY();

        //récupérer la position
		//faire un while (tant que pas exit du lab)
        switch(tabPiece[X][Y]) {

            case (X==1 & Y==1) :
            	Joueur.setPosition = tabPiece[1][1]
                System.out.println("Vous êtes dans la salle 1. Ou aller ensuite ? N ou E ?");

                if(str=="N") {
                    X=2;
                    Y=1;

                }
                if(str=="E") {
                    X=1;
                    Y=2;

                }

                break;

            default: System.out.println("Vous avez rentré un mauvais choix veuillez réessayer :");

        }
    }

}
		
