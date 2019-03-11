/**
 *
 */
public class Combattant {
	
	protected int pointsVie;
	private int positionX;
	private int positionY;
	private boolean estVictorieux;
	
	
	public boolean attaquer (String NomJ) {
		
	}
	public void setPointsVie (int pointsVie) {
		this.pointsVie = pointsVie;
	}
	public int getPointsVie() {
		return pointsVie;
	}
	public void getPositionX() {
		return this.positionX;
	}
	public void getPositionY() {
		return this.positionY;
	}

	public int setPositionX(int pos) {
		return this.positionX = pos;
	}

	public int setPositionY(int pos){
		return this.positionY = pos;
	}

}
