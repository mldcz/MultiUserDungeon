public class Joueur extends Combattant {


	private String nomJ;
	private Position position;
	
	public Joueur (String nomJ) {
		super();
		this.nomJ = nomJ;
		this.pointsVie = 10;
		this.position = new Position (this.nomJ, 1,1)
	}

	public int getPointsVie()
	{
		return super.getPointsVie();
	}
	public void setPointsVie(int pointsVie)
    {
		return super.setPointsVie(pointsVie);
	}

	public String getNomJ()
	{
		return this.nomJ;
	}
	public void setNomJ(String nomJ)
    {
		return this.nomJ = nomJ;
	}

	public Position getPosition(){return this.position};
	public void setPosition(int i, int j){this.position.setPositionX(i); this.position.setPositionY(j);}


	public void prendreLaFuite ()
    {
		//to be implemented --> faire appel a exitLab dans le serveur ? ou est-ce la partie "serveur" du joueur dont parlait Tessi� ?
        // cad va notifier serveur et executer lui m�me l'action --> a voir (peut-etre juste kick du serveur)
	}
	
}
