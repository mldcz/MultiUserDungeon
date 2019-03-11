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
	//public int X;
	//public int Y = 2;
	
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

        int X = Joueur.getPositionX();
        int Y = Joueur.getPositionY();

        //utiliser les index du tableau avec X et Y 
        
        //récupérer la position
		//faire un while (tant que pas exit du lab)
        switch(tabPiece[X][Y]) {

            case (X==1 && Y==1) :
            	Joueur.setPosition = tabPiece[1][1];
                System.out.println("Vous êtes dans la salle 1. Ou aller ensuite ? N ou E ?");

                if(str=="N") {
                    X=2;
                    Y=1;

                }
                else if (str=="E") {
                    X=1;
                    Y=2;

                }

                break;

            default: System.out.println("Vous avez rentré un mauvais choix veuillez réessayer :");

        }
		switch(tabPiece[X][Y]) {

			case (X==1 && Y==2) :
				Joueur.setPosition = tabPiece[1][2];
				System.out.println("Vous êtes dans la salle 2. Ou aller ensuite ? O ou E ?");

				if(str=="0") {
					X=1;
					Y=1;

				}
				else if(str=="E") {
					X=1;
					Y=3;

				}

				break;

			default: System.out.println("Vous avez rentré un mauvais choix veuillez réessayer :");

		}
		switch(tabPiece[X][Y]) {

			case (X==1 && Y==3) :
				Joueur.setPosition = tabPiece[1][3];
				System.out.println("Vous êtes dans la salle 3. Ou aller ensuite ? O, N ou E ?");

				if(str=="O") {
					X=1;
					Y=2;

				}
				else if (str=="N") {
					X=2;
					Y=3;

				}
				else if (str=="E") {
					X=1;
					Y=4;
				}

				break;

			default: System.out.println("Vous avez rentré un mauvais choix veuillez réessayer :");

		}
		switch(tabPiece[X][Y]) {

			case (X==1 && Y==4) :
				Joueur.setPosition = tabPiece[1][4];
				System.out.println("Vous êtes dans la salle 4. Ou aller ensuite ? O, N ou E ?");

				if(str=="O") {
					X=1;
					Y=3;

				}
				else if (str=="N") {
					X=2;
					Y=4;

				}
				else if (str=="E") {
					X=1;
					Y=5;
				}

				break;

			default: System.out.println("Vous avez rentré un mauvais choix veuillez réessayer :");

		}
		switch(tabPiece[X][Y]) {

			case (X==1 && Y==5) :
				Joueur.setPosition = tabPiece[1][5];
				System.out.println("Vous êtes dans la salle 5. Ou aller ensuite ? N ou O ?");

				if(str=="N") {
					X=2;
					Y=5;

				}
				else if(str=="E") {
					X=1;
					Y=4;

				}

				break;

			default: System.out.println("Vous avez rentré un mauvais choix veuillez réessayer :");

		}
		switch(tabPiece[X][Y]) {

			case (X==2 && Y==1) :
				Joueur.setPosition = tabPiece[2][1];
				System.out.println("Vous êtes dans la salle 6. Ou aller ensuite ? N, S ou E ?");


				if(str=="N") {
					X=3;
					Y=1;

				}
				else if (str=="S") {
					X=1;
					Y=1;

				}
				else if (str=="E") {
					X=2;
					Y=2;
				}

				break;

			default: System.out.println("Vous avez rentré un mauvais choix veuillez réessayer :");

		}
		switch(tabPiece[X][Y]) {

			case (X==2 && Y==2) :
				Joueur.setPosition = tabPiece[2][2];
				System.out.println("Vous êtes dans la salle 7. Ou aller ensuite ? O ?");


				if(str=="O") {
					X=2;
					Y=1;

				}

				break;

			default: System.out.println("Vous avez rentré un mauvais choix veuillez réessayer :");

		}
		switch(tabPiece[X][Y]) {

			case (X==2 && Y==3) :
				Joueur.setPosition = tabPiece[2][3];
				System.out.println("Vous êtes dans la salle 8. Ou aller ensuite ? N, S ou E ?");


				if(str=="N") {
					X=3;
					Y=3;

				}
				else if (str=="S") {
					X=1;
					Y=3;

				}
				else if (str=="E") {
					X=2;
					Y=4;
				}

				break;

			default: System.out.println("Vous avez rentré un mauvais choix veuillez réessayer :");

		}
		switch(tabPiece[X][Y]) {

			case (X==2 && Y==4) :
				Joueur.setPosition = tabPiece[2][4];
				System.out.println("Vous êtes dans la salle 9. Ou aller ensuite ? N, S ou O ?");


				if(str=="N") {
					X=3;
					Y=4;

				}
				else if (str=="S") {
					X=1;
					Y=4;

				}
				else if (str=="O") {
					X=2;
					Y=3;
				}

				break;

			default: System.out.println("Vous avez rentré un mauvais choix veuillez réessayer :");

		}
		switch(tabPiece[X][Y]) {

			case (X==2 && Y==5) :
				Joueur.setPosition = tabPiece[2][5];
				System.out.println("Vous êtes dans la salle 10. Ou aller ensuite ? S ?");


				if(str=="S") {
					X=1;
					Y=5;

				}

				break;

			default: System.out.println("Vous avez rentré un mauvais choix veuillez réessayer :");

		}
		switch(tabPiece[X][Y]) {

			case (X==3 && Y==1) :
				Joueur.setPosition = tabPiece[3][1];
				System.out.println("Vous êtes dans la salle 11. Ou aller ensuite ? N, S ou E ?");


				if(str=="N") {
					X=4;
					Y=1;

				}
				else if (str=="S") {
					X=2;
					Y=1;

				}
				else if (str=="E") {
					X=3;
					Y=2;
				}

				break;

			default: System.out.println("Vous avez rentré un mauvais choix veuillez réessayer :");

		}
		switch(tabPiece[X][Y]) {

			case (X==3 && Y==2) :
				Joueur.setPosition = tabPiece[3][2];
				System.out.println("Vous êtes dans la salle 12. Ou aller ensuite ? N, O ou E ?");


				if(str=="N") {
					X=4;
					Y=2;

				}
				else if (str=="O") {
					X=3;
					Y=1;

				}
				else if (str=="E") {
					X=3;
					Y=3;
				}

				break;

			default: System.out.println("Vous avez rentré un mauvais choix veuillez réessayer :");

		}
		switch(tabPiece[X][Y]) {

			case (X==3 && Y==3) :
				Joueur.setPosition = tabPiece[3][3];
				System.out.println("Vous êtes dans la salle 13. Ou aller ensuite ? S ou O ?");


				if(str=="O") {
					X=3;
					Y=2;

				}
				else if (str=="S") {
					X=2;
					Y=3;

				}

				break;

			default: System.out.println("Vous avez rentré un mauvais choix veuillez réessayer :");

		}
		switch(tabPiece[X][Y]) {

			case (X==3 && Y==4) :
				Joueur.setPosition = tabPiece[3][4];
				System.out.println("Vous êtes dans la salle 14. Ou aller ensuite ? N, S ou E ?");


				if(str=="N") {
					X=4;
					Y=4;

				}
				else if (str=="S") {
					X=2;
					Y=4;

				}
				else if (str=="E") {
					X=3;
					Y=5;
				}

				break;

			default: System.out.println("Vous avez rentré un mauvais choix veuillez réessayer :");

		}
		switch(tabPiece[X][Y]) {

			case (X==3 && Y==5) :
				Joueur.setPosition = tabPiece[3][5];
				System.out.println("Vous êtes dans la salle 15. Ou aller ensuite ? N ou O ?");


				if(str=="N") {
					X=4;
					Y=5;

				}
				else if (str=="O") {
					X=3;
					Y=4;

				}

				break;

			default: System.out.println("Vous avez rentré un mauvais choix veuillez réessayer :");

		}
		switch(tabPiece[X][Y]) {

			case (X==4 && Y==1) :
				Joueur.setPosition = tabPiece[4][1];
				System.out.println("Vous êtes dans la salle 16. Ou aller ensuite ? N ou S ?");


				if(str=="N") {
					X=5;
					Y=1;

				}
				else if (str=="S") {
					X=3;
					Y=1;

				}

				break;

			default: System.out.println("Vous avez rentré un mauvais choix veuillez réessayer :");

		}
		switch(tabPiece[X][Y]) {

			case (X==4 && Y==2) :
				Joueur.setPosition = tabPiece[4][2];
				System.out.println("Vous êtes dans la salle 17. Ou aller ensuite ? S ou E ?");


				if (str=="S") {
					X=3;
					Y=2;

				}
				else if (str=="E") {
					X=4;
					Y=3;
				}

				break;

			default: System.out.println("Vous avez rentré un mauvais choix veuillez réessayer :");

		}
		switch(tabPiece[X][Y]) {

			case (X==4 && Y==3) :
				Joueur.setPosition = tabPiece[4][3];
				System.out.println("Vous êtes dans la salle 18. Ou aller ensuite ? N ou O ?");


				if(str=="N") {
					X=5;
					Y=3;

				}
				else if (str=="O") {
					X=4;
					Y=2;

				}

				break;

			default: System.out.println("Vous avez rentré un mauvais choix veuillez réessayer :");

		}
		switch(tabPiece[X][Y]) {

			case (X==4 && Y==4) :
				Joueur.setPosition = tabPiece[4][4];
				System.out.println("Vous êtes dans la salle 19. Ou aller ensuite ? N ou S ?");


				if(str=="N") {
					X=5;
					Y=4;

				}
				else if (str=="S") {
					X=3;
					Y=4;

				}

				break;

			default: System.out.println("Vous avez rentré un mauvais choix veuillez réessayer :");

		}
		switch(tabPiece[X][Y]) {

			case (X==4 && Y==5) :
				Joueur.setPosition = tabPiece[4][5];
				System.out.println("Vous êtes dans la salle 20. Ou aller ensuite ? N ou S ?");


				if(str=="N") {
					X=5;
					Y=5;

				}
				else if (str=="S") {
					X=3;
					Y=5;

				}

				break;

			default: System.out.println("Vous avez rentré un mauvais choix veuillez réessayer :");

		}
		switch(tabPiece[X][Y]) {

			case (X==5 && Y==1) :
				Joueur.setPosition = tabPiece[5][1];
				System.out.println("Vous êtes dans la salle 21. Ou aller ensuite ? S ou E ?");


				if (str=="S") {
					X=4;
					Y=1;

				}
				else if (str=="E") {
					X=5;
					Y=2;
				}

				break;

			default: System.out.println("Vous avez rentré un mauvais choix veuillez réessayer :");

		}
		switch(tabPiece[X][Y]) {

			case (X==5 && Y==2) :
				Joueur.setPosition = tabPiece[5][2];
				System.out.println("Vous êtes dans la salle 22. Ou aller ensuite ? O ?");


				if(str=="O") {
					X=5;
					Y=1;

				}

				break;

			default: System.out.println("Vous avez rentré un mauvais choix veuillez réessayer :");

		}
		switch(tabPiece[X][Y]) {

			case (X==5 && Y==3) :
				Joueur.setPosition = tabPiece[5][3];
				System.out.println("Vous êtes dans la salle 23. Ou aller ensuite ? S ou E ?");


				if (str=="S") {
					X=4;
					Y=3;

				}
				else if (str=="E") {
					X=5;
					Y=4;
				}

				break;

			default: System.out.println("Vous avez rentré un mauvais choix veuillez réessayer :");

		}
		switch(tabPiece[X][Y]) {

			case (X==5 && Y==4) :
				Joueur.setPosition = tabPiece[5][4];
				System.out.println("Vous êtes dans la salle 24. Ou aller ensuite ? O, S ou E ?");


				if(str=="O") {
					X=5;
					Y=3;

				}
				else if (str=="S") {
					X=4;
					Y=4;

				}
				else if (str=="E") {
					X=5;
					Y=5;
				}

				break;

			default: System.out.println("Vous avez rentré un mauvais choix veuillez réessayer :");

		}
		switch(tabPiece[X][Y]) {

			case (X==5 && Y==5) :
				Joueur.setPosition = tabPiece[5][5];
				System.out.println("Vous êtes dans la salle 25. Ou aller ensuite ? O ou S ?");


				if(str=="O") {
					X=5;
					Y=4;

				}
				else if (str=="S") {
					X=4;
					Y=5;

				}

				break;

			default: System.out.println("Vous avez rentré un mauvais choix veuillez réessayer :");

		}


	}



}
		
