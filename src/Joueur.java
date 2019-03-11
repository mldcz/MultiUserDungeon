public class Joueur extends Combattant {


	private String nomJ;
	
	public Joueur (String nomJ) {
		super();
		this.nomJ = nomJ;
		this.pointsVie = 10;
	}
	
	public void setPointsVie(int pointsVie)
    {
		return super.setPointsVie(pointsVie);
	}


	public void setNomJ(String nomJ)
    {
		return this.nomJ = nomJ;
	}


	public int getPointsVie()
    {
		return super.getPointsVie();
	}


	public String getNomJ()
    {
		return this.nomJ;
	}


	public void prendreLaFuite ()
    {
		//to be implemented --> faire appel a exitLab dans le serveur ? ou est-ce la partie "serveur" du joueur dont parlait Tessié ?
        // cad va notifier serveur et executer lui même l'action --> a voir (peut-etre juste kick du serveur)
	}
	
}
