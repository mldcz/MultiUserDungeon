public class Combattant
{
	//attributs
	private int pointsVie;
	private boolean estVictorieux;
	private Position position()


	//constructeur
	public Combattant()
	{
		this.estVictorieux = false;
		this.position() = new Position(1,1);
	}


	//accesseurs
	public Position getPosition()
	{
		return position();
	}

	public void setPointsVie (int pointsVie)
	{
		this.pointsVie = pointsVie;
	}

	public int getPointsVie()
	{
		return pointsVie;
	}

	public void setEstVictorieux (boolean resultVictoire)
	{
		this.estVictorieux = resultVictoire;
	}

	public boolean getEstVictorieux()
	{
		return estVictorieux;
	}


	//methodes
	public void attaquer(String adversaire)
	{
		System.out.println(" "); //saut de ligne
		System.out.println("Lancement d'une attaque !");

		this.estVictorieux=false;
		adversaire.setEstVictorieux(false);
		int attaque = Math.Random();


		if ( (this.pointsVie != 0) && (adversaire.getPointsVie() != 0 ))
		{
			if (attaque == 0)
			{
				this.pointsVie--;
				System.out.println(" "); //saut de ligne
				System.out.println("Vous perdez un point de vie.");
				System.out.println("Vos points de vie actuels : "+this.pointsVie); //saut de ligne
				System.out.println("Les points de vie de l'adversaire : "+ adversaire.getPointsVie()); //saut de ligne
				System.out.println(" "); //saut de ligne
			}
			else
			{
				adversaire.setPointsVie(getPointsVie()- 1);
				System.out.println(" "); //saut de ligne
				System.out.println("L'adversaire perd un point de vie.");
				System.out.println("Vos points de vie actuels : "+this.pointsVie); //saut de ligne
				System.out.println("Les points de vie de l'adversaire : "+ adversaire.getPointsVie()); //saut de ligne
				System.out.println(" "); //saut de ligne
			}
		}
		else if ( (this.pointsVie == 0) && (adversaire.getPointsVie() != 0 ))
		{
			adversaire.setEstVictorieux(true);
			System.out.println("Vous ne pouvez plus combattre, vous n'avez plus de vie !");
		}
		else if ( (this.pointsVie != 0) && (adversaire.getPointsVie() == 0 ))
		{
			estVictorieux = true;
			System.out.println("L'adversaire ne peut combattre, il n'a plus de vie !");
		}
		else( (this.pointsVie == 0) && (adversaire.getPointsVie() == 0 ))
		{

			System.out.println("Combat impossible, aucun de vous n'a de point de vie. !");
		}
	}



}
