public class Joueur extends Combattant {


	private String nomJ;
	private Position position;
	
	public Joueur (String nomJ)
	{
		super();
		this.nomJ = nomJ;
		this.pointsVie = 10;
		this.position = new Position (this.nomJ, 1,1)
	}

	public int getPointsVie()
	{
		return super.getPointsVie();
	}
	public void setPointsVie(int pointsVie)
    {
		return super.setPointsVie(pointsVie);
	}

	public String getNomJ()
	{
		return this.nomJ;
	}
	public void setNomJ(String nomJ)
    {
		return this.nomJ = nomJ;
	}

	public Position getPosition(){return this.position};
	public void setPosition(int i, int j){this.position.setPositionX(i); this.position.setPositionY(j);}


	public void prendreLaFuite ()
    {
		//to be implemented --> faire appel a exitLab dans le serveur ? ou est-ce la partie "serveur" du joueur dont parlait Tessi� ?
        // cad va notifier serveur et executer lui m�me l'action --> a voir (peut-etre juste kick du serveur)
	}


	public void seDeplacer (Labyrinthe labyrinthe)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		int X = this.getPositionX();
		int Y = this.getPositionY();

		//utiliser les index du tableau avec X et Y

		//récupérer la position
		//faire un while (tant que pas exit du lab)
		switch(tabPiece[X][Y])
		{

			case (X==1 && Y==1) :
				Joueur.setPosition = tabPiece[1][1];
				System.out.println("Vous etes dans la salle 1. Ou aller ensuite ? N ou E ?");

				if(str=="N")
				{
					this.setPositionX(2);
					this.setPositionY(1);

				}
				else if (str=="E")
				{
					this.setPositionX(1);
					this.setPositionY(2);

				}

				break;

			case (X==1 && Y==2) :
				Joueur.setPosition = tabPiece[1][2];
				System.out.println("Vous etes dans la salle 2. Ou aller ensuite ? O ou E ?");

				if(str=="0") {
					this.setPositionX(1);
					this.setPositionY(1);

				}
				else if(str=="E") {
					this.setPositionX(1);
					this.setPositionY(3);

				}

				break;

			case (X==1 && Y==3) :
				Joueur.setPosition = tabPiece[1][3];
				System.out.println("Vous êtes dans la salle 3. Ou aller ensuite ? O, N ou E ?");

				if(str=="O") {
					this.setPositionX(1);
					this.setPositionY(2);

				}
				else if (str=="N") {
					this.setPositionX(2);
					this.setPositionY(3);

				}
				else if (str=="E") {
					this.setPositionX(1);
					this.setPositionY(4);
				}

				break;

			case (X==1 && Y==4) :
				Joueur.setPosition = tabPiece[1][4];
				System.out.println("Vous êtes dans la salle 4. Ou aller ensuite ? O, N ou E ?");

				if(str=="O") {
					this.setPositionX(1);
					this.setPositionY(3);

				}
				else if (str=="N") {
					this.setPositionX(2);
					this.setPositionY(4);

				}
				else if (str=="E") {
					this.setPositionX(1);
					this.setPositionY(5);
				}

				break;

			case (X==1 && Y==5) :
				Joueur.setPosition = tabPiece[1][5];
				System.out.println("Vous êtes dans la salle 5. Ou aller ensuite ? N ou O ?");

				if(str=="N") {
					this.setPositionX(2);
					this.setPositionY(5);

				}
				else if(str=="E") {
					this.setPositionX(1);
					this.setPositionY(4);

				}

				break;

			case (X==2 && Y==1) :
				Joueur.setPosition = tabPiece[2][1];
				System.out.println("Vous êtes dans la salle 6. Ou aller ensuite ? N, S ou E ?");


				if(str=="N") {
					this.setPositionX(3);
					this.setPositionY(1);

				}
				else if (str=="S") {
					this.setPositionX(1);
					this.setPositionY(1);

				}
				else if (str=="E") {
					this.setPositionX(2);
					this.setPositionY(2);
				}

				break;

			case (X==2 && Y==2) :
				Joueur.setPosition = tabPiece[2][2];
				System.out.println("Vous êtes dans la salle 7. Ou aller ensuite ? O ?");


				if(str=="O") {
					this.setPositionX(2);
					this.setPositionY(1);

				}

				break;

			case (X==2 && Y==3) :
				Joueur.setPosition = tabPiece[2][3];
				System.out.println("Vous êtes dans la salle 8. Ou aller ensuite ? N, S ou E ?");


				if(str=="N") {
					this.setPositionX(3);
					this.setPositionY(3);

				}
				else if (str=="S") {
					this.setPositionX(1);
					this.setPositionY(3);

				}
				else if (str=="E") {
					this.setPositionX(2);
					this.setPositionY(4);
				}

				break;

			case (X==2 && Y==4) :
				Joueur.setPosition = tabPiece[2][4];
				System.out.println("Vous êtes dans la salle 9. Ou aller ensuite ? N, S ou O ?");


				if(str=="N") {
					this.setPositionX(3);
					this.setPositionY(4);

				}
				else if (str=="S") {
					this.setPositionX(1);
					this.setPositionY(4);

				}
				else if (str=="O") {
					this.setPositionX(2);
					this.setPositionY(3);
				}

				break;

			case (X==2 && Y==5) :
				Joueur.setPosition = tabPiece[2][5];
				System.out.println("Vous êtes dans la salle 10. Ou aller ensuite ? S ?");


				if(str=="S") {
					this.setPositionX(1);
					this.setPositionY(5);

				}

				break;

			case (X==3 && Y==1) :
				Joueur.setPosition = tabPiece[3][1];
				System.out.println("Vous êtes dans la salle 11. Ou aller ensuite ? N, S ou E ?");


				if(str=="N") {
					this.setPositionX(4);
					this.setPositionY(1);

				}
				else if (str=="S") {
					this.setPositionX(2);
					this.setPositionY(1);

				}
				else if (str=="E") {
					this.setPositionX(3);
					this.setPositionY(2);
				}

				break;

			case (X==3 && Y==2) :
				Joueur.setPosition = tabPiece[3][2];
				System.out.println("Vous êtes dans la salle 12. Ou aller ensuite ? N, O ou E ?");


				if(str=="N") {
					this.setPositionX(4);
					this.setPositionY(2);

				}
				else if (str=="O") {
					this.setPositionX(3);
					this.setPositionY(1);

				}
				else if (str=="E") {
					this.setPositionX(3);
					this.setPositionY(3);
				}

				break;

			case (X==3 && Y==3) :
				Joueur.setPosition = tabPiece[3][3];
				System.out.println("Vous êtes dans la salle 13. Ou aller ensuite ? S ou O ?");


				if(str=="O") {
					this.setPositionX(3);
					this.setPositionY(2);

				}
				else if (str=="S") {
					this.setPositionX(2);
					this.setPositionY(3);

				}

				break;

			case (X==3 && Y==4) :
				Joueur.setPosition = tabPiece[3][4];
				System.out.println("Vous êtes dans la salle 14. Ou aller ensuite ? N, S ou E ?");


				if(str=="N") {
					this.setPositionX(4);
					this.setPositionY(4);

				}
				else if (str=="S") {
					this.setPositionX(2);
					this.setPositionY(4);

				}
				else if (str=="E") {
					this.setPositionX(3);
					this.setPositionY(5);
				}

				break;

			case (X==3 && Y==5) :
				Joueur.setPosition = tabPiece[3][5];
				System.out.println("Vous êtes dans la salle 15. Ou aller ensuite ? N ou O ?");


				if(str=="N") {
					this.setPositionX(4);
					this.setPositionY(5);

				}
				else if (str=="O") {
					this.setPositionX(3);
					this.setPositionY(4);

				}

				break;

			case (X==4 && Y==1) :
				Joueur.setPosition = tabPiece[4][1];
				System.out.println("Vous êtes dans la salle 16. Ou aller ensuite ? N ou S ?");


				if(str=="N") {
					this.setPositionX(5);
					this.setPositionY(1);

				}
				else if (str=="S") {
					this.setPositionX(3);
					this.setPositionY(1);

				}

				break;

			case (X==4 && Y==2) :
				Joueur.setPosition = tabPiece[4][2];
				System.out.println("Vous êtes dans la salle 17. Ou aller ensuite ? S ou E ?");


				if (str=="S") {
					this.setPositionX(3);
					this.setPositionY(2);

				}
				else if (str=="E") {
					this.setPositionX(4);
					this.setPositionY(3);
				}

				break;

			case (X==4 && Y==3) :
				Joueur.setPosition = tabPiece[4][3];
				System.out.println("Vous êtes dans la salle 18. Ou aller ensuite ? N ou O ?");


				if(str=="N") {
					this.setPositionX(5);
					this.setPositionY(3);

				}
				else if (str=="O") {
					this.setPositionX(4);
					this.setPositionY(2);

				}

				break;

			case (X==4 && Y==4) :
				Joueur.setPosition = tabPiece[4][4];
				System.out.println("Vous êtes dans la salle 19. Ou aller ensuite ? N ou S ?");


				if(str=="N") {
					this.setPositionX(5);
					this.setPositionY(4);

				}
				else if (str=="S") {
					this.setPositionX(3);
					this.setPositionY(4);

				}

				break;

			case (X==4 && Y==5) :
				Joueur.setPosition = tabPiece[4][5];
				System.out.println("Vous êtes dans la salle 20. Ou aller ensuite ? N ou S ?");


				if(str=="N") {
					this.setPositionX(5);
					this.setPositionY(5);

				}
				else if (str=="S") {
					this.setPositionX(3);
					this.setPositionY(5);

				}

				break;

			case (X==5 && Y==1) :
				Joueur.setPosition = tabPiece[5][1];
				System.out.println("Vous êtes dans la salle 21. Ou aller ensuite ? S ou E ?");


				if (str=="S") {
					this.setPositionX(4);
					this.setPositionY(1);

				}
				else if (str=="E") {
					this.setPositionX(5);
					this.setPositionY(2);
				}

				break;

			case (X==5 && Y==2) :
				Joueur.setPosition = tabPiece[5][2];
				System.out.println("Vous êtes dans la salle 22. Ou aller ensuite ? O ?");


				if(str=="O") {
					this.setPositionX(5);
					this.setPositionY(1);

				}

				break;

			case (X==5 && Y==3) :
				Joueur.setPosition = tabPiece[5][3];
				System.out.println("Vous êtes dans la salle 23. Ou aller ensuite ? S ou E ?");


				if (str=="S") {
					this.setPositionX(4);
					this.setPositionY(3);

				}
				else if (str=="E") {
					this.setPositionX(5);
					this.setPositionY(4);
				}

				break;

			case (X==5 && Y==4) :
				Joueur.setPosition = tabPiece[5][4];
				System.out.println("Vous êtes dans la salle 24. Ou aller ensuite ? O, S ou E ?");


				if(str=="O") {
					this.setPositionX(5);
					this.setPositionY(3);

				}
				else if (str=="S") {
					this.setPositionX(4);
					this.setPositionY(4);

				}
				else if (str=="E") {
					this.setPositionX(5);
					this.setPositionY(5);
				}

				break;

			case (X==5 && Y==5) :
				Joueur.setPosition = tabPiece[5][5];
				System.out.println("Vous êtes dans la salle 25. Ou aller ensuite ? O ou S ?");


				if(str=="O") {
					this.setPositionX(5);
					this.setPositionY(4);

				}
				else if (str=="S") {
					this.setPositionX(4);
					this.setPositionY(5);

				}

				break;

			default: System.out.println("Vous avez rentré un mauvais choix veuillez réessayer :");

		}


	}
}
