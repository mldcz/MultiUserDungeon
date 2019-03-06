public class Joueur extends Combattant {


	private String nomJ;
	
	public Joueur (String nomJ) {
		super();
		this.nomJ = nomJ;
		this.pointsVie = 10;
	}
	
	public void setPointsVie(int pointsVie) {
		return super.setPointsVie(pointsVie);
	}

	public void setNomJ(String nomJ) {
		return this.nomJ = nomJ;
	}

	public int getPointsVie() {
		return super.getPointsVie();
	}
	public String getNomJ() {
		return this.nomJ;
	}

	public void seDeplacer () {
		
	}
	public void prendreLaFuite () {
		
	}
	
}
