
public class Monstre extends Combattant {
	
	private String NomM;
	
	public Monstre (String NomM) {

		
		super();
		this.NomM = NomM;
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
