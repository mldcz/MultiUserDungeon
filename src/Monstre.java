public class Monstre extends Combattant {
	
	private String nomM = "Monstre";
	
	public Monstre ()
	{
		super();
		super.pointsVie = 5;
	}

	public void setNomM (String nomMonstre) {this.nomM = nomM;	}

	public String getNomM() {	return nomM;}
}
