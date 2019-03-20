public class Joueur extends Combattant {


	private String nomJ;
	private Position position;
	
	public Joueur (String nomJ)
	{
		super();
		this.nomJ = nomJ;
		this.pointsVie = 10;
		this.position = new Position (1,1);
	}

	public int getPointsVie()
	{
		return super.getPointsVie();
	}
	public void setPointsVie(int pointsVie)
    {
		super.setPointsVie(pointsVie);
	}

	public String getNomJ()
	{
		return this.nomJ;
	}
	public void setNomJ(String nomJ)
    {
		this.nomJ = nomJ;
	}

	public Position getPosition(){return this.position;}
	public void setPosition(int i, int j){this.position.setPositionX(i); this.position.setPositionY(j);}


	public void seDeplacer (Labyrinthe labyrinthe, String direction)
	{
		int X = this.position.getPositionX();
		int Y = this.position.getPositionY();

		//utiliser les index du tableau avec X et Y

		//récupérer la position
		//faire un while (tant que pas exit du lab)
		switch(labyrinthe.tabPiece[X][Y])
		{

			case (X==1 && Y==1) :
				this.position.setPositionX(X);
				this.position.setPositionY(Y);
				System.out.println("Vous etes dans la salle 1. Ou aller ensuite ? N ou E ?");

				if(direction=="N")
				{
					this.position.setPositionX(2);
					this.position.setPositionY(1);

				}
				else if (direction=="E")
				{
					this.position.setPositionX(1);
					this.position.setPositionY(2);

				}

				break;

			case (X==1 && Y==2) :
				this.position.setPositionX(X);
				this.position.setPositionY(Y);
				System.out.println("Vous etes dans la salle 2. Ou aller ensuite ? O ou E ?");

				if(direction=="0") {
					this.position.setPositionX(1);
					this.position.setPositionY(1);

				}
				else if(direction=="E") {
					this.position.setPositionX(1);
					this.position.setPositionY(3);

				}

				break;

			case (X==1 && Y==3) :
				this.position.setPositionX(X);
				this.position.setPositionY(Y);
				System.out.println("Vous êtes dans la salle 3. Ou aller ensuite ? O, N ou E ?");

				if(direction=="O") {
					this.position.setPositionX(1);
					this.position.setPositionY(2);

				}
				else if (direction=="N") {
					this.position.setPositionX(2);
					this.position.setPositionY(3);

				}
				else if (direction=="E") {
					this.position.setPositionX(1);
					this.position.setPositionY(4);
				}

				break;

			case (X==1 && Y==4) :
				this.position.setPositionX(X);
				this.position.setPositionY(Y);
				System.out.println("Vous êtes dans la salle 4. Ou aller ensuite ? O, N ou E ?");

				if(direction=="O") {
					this.position.setPositionX(1);
					this.position.setPositionY(3);

				}
				else if (direction=="N") {
					this.position.setPositionX(2);
					this.position.setPositionY(4);

				}
				else if (direction=="E") {
					this.position.setPositionX(1);
					this.position.setPositionY(5);
				}

				break;

			case (X==1 && Y==5) :
				this.position.setPositionX(X);
				this.position.setPositionY(Y);
				System.out.println("Vous êtes dans la salle 5. Ou aller ensuite ? N ou O ?");

				if(direction=="N") {
					this.position.setPositionX(2);
					this.position.setPositionY(5);

				}
				else if(direction=="E") {
					this.position.setPositionX(1);
					this.position.setPositionY(4);

				}

				break;

			case (X==2 && Y==1) :
				this.position.setPositionX(X);
				this.position.setPositionY(Y);
				System.out.println("Vous êtes dans la salle 6. Ou aller ensuite ? N, S ou E ?");


				if(direction=="N") {
					this.position.setPositionX(3);
					this.position.setPositionY(1);

				}
				else if (direction=="S") {
					this.position.setPositionX(1);
					this.position.setPositionY(1);

				}
				else if (direction=="E") {
					this.position.setPositionX(2);
					this.position.setPositionY(2);
				}

				break;

			case (X==2 && Y==2) :
				this.position.setPositionX(X);
				this.position.setPositionY(Y);
				System.out.println("Vous êtes dans la salle 7. Ou aller ensuite ? O ?");


				if(direction=="O") {
					this.position.setPositionX(2);
					this.position.setPositionY(1);

				}

				break;

			case (X==2 && Y==3) :
				this.position.setPositionX(X);
				this.position.setPositionY(Y);
				System.out.println("Vous êtes dans la salle 8. Ou aller ensuite ? N, S ou E ?");


				if(direction=="N") {
					this.position.setPositionX(3);
					this.position.setPositionY(3);

				}
				else if (direction=="S") {
					this.position.setPositionX(1);
					this.position.setPositionY(3);

				}
				else if (direction=="E") {
					this.position.setPositionX(2);
					this.position.setPositionY(4);
				}

				break;

			case (X==2 && Y==4) :
				this.position.setPositionX(X);
				this.position.setPositionY(Y);
				System.out.println("Vous êtes dans la salle 9. Ou aller ensuite ? N, S ou O ?");


				if(direction=="N") {
					this.position.setPositionX(3);
					this.position.setPositionY(4);

				}
				else if (direction=="S") {
					this.position.setPositionX(1);
					this.position.setPositionY(4);

				}
				else if (direction=="O") {
					this.position.setPositionX(2);
					this.position.setPositionY(3);
				}

				break;

			case (X==2 && Y==5) :
				this.position.setPositionX(X);
				this.position.setPositionY(Y);
				System.out.println("Vous êtes dans la salle 10. Ou aller ensuite ? S ?");


				if(direction=="S") {
					this.position.setPositionX(1);
					this.position.setPositionY(5);

				}

				break;

			case (X==3 && Y==1) :
				this.position.setPositionX(X);
				this.position.setPositionY(Y);
				System.out.println("Vous êtes dans la salle 11. Ou aller ensuite ? N, S ou E ?");


				if(direction=="N") {
					this.position.setPositionX(4);
					this.position.setPositionY(1);

				}
				else if (direction=="S") {
					this.position.setPositionX(2);
					this.position.setPositionY(1);

				}
				else if (direction=="E") {
					this.position.setPositionX(3);
					this.position.setPositionY(2);
				}

				break;

			case (X==3 && Y==2) :
				this.position.setPositionX(X);
				this.position.setPositionY(Y);
				System.out.println("Vous êtes dans la salle 12. Ou aller ensuite ? N, O ou E ?");


				if(direction=="N") {
					this.position.setPositionX(4);
					this.position.setPositionY(2);

				}
				else if (direction=="O") {
					this.position.setPositionX(3);
					this.position.setPositionY(1);

				}
				else if (direction=="E") {
					this.position.setPositionX(3);
					this.position.setPositionY(3);
				}

				break;

			case (X==3 && Y==3) :
				this.position.setPositionX(X);
				this.position.setPositionY(Y);
				System.out.println("Vous êtes dans la salle 13. Ou aller ensuite ? S ou O ?");


				if(direction=="O") {
					this.position.setPositionX(3);
					this.position.setPositionY(2);

				}
				else if (direction=="S") {
					this.position.setPositionX(2);
					this.position.setPositionY(3);

				}

				break;

			case (X==3 && Y==4) :
				this.position.setPositionX(X);
				this.position.setPositionY(Y);
				System.out.println("Vous êtes dans la salle 14. Ou aller ensuite ? N, S ou E ?");


				if(direction=="N") {
					this.position.setPositionX(4);
					this.position.setPositionY(4);

				}
				else if (direction=="S") {
					this.position.setPositionX(2);
					this.position.setPositionY(4);

				}
				else if (str=="E") {
					this.position.setPositionX(3);
					this.position.setPositionY(5);
				}

				break;

			case (X==3 && Y==5) :
				this.position.setPositionX(X);
				this.position.setPositionY(Y);
				System.out.println("Vous êtes dans la salle 15. Ou aller ensuite ? N ou O ?");


				if(direction=="N") {
					this.position.setPositionX(4);
					this.position.setPositionY(5);

				}
				else if (direction=="O") {
					this.position.setPositionX(3);
					this.position.setPositionY(4);

				}

				break;

			case (X==4 && Y==1) :
				this.position.setPositionX(X);
				this.position.setPositionY(Y);
				System.out.println("Vous êtes dans la salle 16. Ou aller ensuite ? N ou S ?");


				if(direction=="N") {
					this.position.setPositionX(5);
					this.position.setPositionY(1);

				}
				else if (direction=="S") {
					this.position.setPositionX(3);
					this.position.setPositionY(1);

				}

				break;

			case (X==4 && Y==2) :
				this.position.setPositionX(X);
				this.position.setPositionY(Y);
				System.out.println("Vous êtes dans la salle 17. Ou aller ensuite ? S ou E ?");


				if (direction=="S") {
					this.position.setPositionX(3);
					this.position.setPositionY(2);

				}
				else if (direction=="E") {
					this.position.setPositionX(4);
					this.position.setPositionY(3);
				}

				break;

			case (X==4 && Y==3) :
				this.position.setPositionX(X);
				this.position.setPositionY(Y);
				System.out.println("Vous êtes dans la salle 18. Ou aller ensuite ? N ou O ?");


				if(direction=="N") {
					this.position.setPositionX(5);
					this.position.setPositionY(3);

				}
				else if (direction=="O") {
					this.position.setPositionX(4);
					this.position.setPositionY(2);

				}

				break;

			case (X==4 && Y==4) :
				this.position.setPositionX(X);
				this.position.setPositionY(Y);
				System.out.println("Vous êtes dans la salle 19. Ou aller ensuite ? N ou S ?");


				if(direction=="N") {
					this.position.setPositionX(5);
					this.position.setPositionY(4);

				}
				else if (direction=="S") {
					this.position.setPositionX(3);
					this.position.setPositionY(4);

				}

				break;

			case (X==4 && Y==5) :
				this.position.setPositionX(X);
				this.position.setPositionY(Y);
				System.out.println("Vous êtes dans la salle 20. Ou aller ensuite ? N ou S ?");


				if(direction=="N") {
					this.position.setPositionX(5);
					this.position.setPositionY(5);

				}
				else if (direction=="S") {
					this.position.setPositionX(3);
					this.position.setPositionY(5);

				}

				break;

			case (X==5 && Y==1) :
				this.position.setPositionX(X);
				this.position.setPositionY(Y);
				System.out.println("Vous êtes dans la salle 21. Ou aller ensuite ? S ou E ?");


				if (direction=="S") {
					this.position.setPositionX(4);
					this.position.setPositionY(1);

				}
				else if (direction=="E") {
					this.position.setPositionX(5);
					this.position.setPositionY(2);
				}

				break;

			case (X==5 && Y==2) :
				this.position.setPositionX(X);
				this.position.setPositionY(Y);
				System.out.println("Vous êtes dans la salle 22. Ou aller ensuite ? O ?");


				if(direction=="O") {
					this.position.setPositionX(5);
					this.position.setPositionY(1);

				}

				break;

			case (X==5 && Y==3) :
				this.position.setPositionX(X);
				this.position.setPositionY(Y);
				System.out.println("Vous êtes dans la salle 23. Ou aller ensuite ? S ou E ?");


				if (direction=="S") {
					this.position.setPositionX(4);
					this.position.setPositionY(3);

				}
				else if (direction=="E") {
					this.position.setPositionX(5);
					this.position.setPositionY(4);
				}

				break;

			case (X==5 && Y==4) :
				this.position.setPositionX(X);
				this.position.setPositionY(Y);
				System.out.println("Vous êtes dans la salle 24. Ou aller ensuite ? O, S ou E ?");


				if(direction=="O") {
					this.position.setPositionX(5);
					this.position.setPositionY(3);

				}
				else if (direction=="S") {
					this.position.setPositionX(4);
					this.position.setPositionY(4);

				}
				else if (direction=="E") {
					this.position.setPositionX(5);
					this.position.setPositionY(5);
				}

				break;

			case (X==5 && Y==5) :
				this.position.setPositionX(X);
				this.position.setPositionY(Y);
				System.out.println("Vous êtes dans la salle 25. Ou aller ensuite ? O ou S ?");


				if(direction=="O") {
					this.position.setPositionX(5);
					this.position.setPositionY(4);

				}
				else if (direction=="S") {
					this.position.setPositionX(4);
					this.position.setPositionY(5);

				}

				break;

			default: System.out.println("Vous avez rentré un mauvais choix veuillez réessayer :");

		}


	}
}
