public class Joueur extends Combattant {
	
	public String getNomJ() {
		return nomJ;
	}

	public void setNomJ(String nomJ) {
		this.nomJ = nomJ;
	}
	private String nomJ;
	
	public Joueur (String nomJ) {
		super();
		this.nomJ = nomJ;
		this.pointsVie = 10;
	}
	
	public void setPointsVie(int pointsVie) {
		super.setPointsVie(pointsVie);
	}

	public int getPointsVie() {
		return super.getPointsVie();
	}

	public void getPosition() {
		super.getPosition();
	}

	public void seDeplacer () {
		
	}
	public void prendreLaFuite () {
		
	}
	
}
