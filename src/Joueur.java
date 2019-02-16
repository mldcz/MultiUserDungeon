public class Joueur extends Combattant {
	
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
