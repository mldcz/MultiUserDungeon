public class Monstre extends Combattant {
	
	private String nomM;
	
	public Monstre (String nomM) {

		
		super();
		this.nomM = nomM;
		this.pointsVie = 5;
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
	
}
