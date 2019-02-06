
import java.awt.Point;
import java.util.Arrays;

public class Labyrinthe {
	
	//colonnes et lignes du labyrinthe 
	public int lignes=5;
	public int colonnes=5;
	
	//tableau des cases du labyrinthe 
	private tabPiece[][] Map = new tabPiece[lignes][colonnes];
	
	//position initiale 
	private Point init = new Point(1,1);
	
	
	//creation du labyrinthe cerné de murs 
	public void generationLabyrinthe(int lignes, int colonnes){
		
		Map = new tab[lignes][colonnes];
	
	
		for (int i = 0; i < Map.length; i++) {
			for (int j = 0; j < Map[i].length; j++) {
				if (i == 0 || j == 0 || i == Map.length - 1
						|| j == Map[i].length - 1)
					Map[i][j] = tabPiece.MUR;
				else
					Map[i][j] = tabPiece.POSITION;}
			}
		}
		
	}
	
	
	//creation des pieces du labyrinthe O,N,E,S représentent les possibilités de déplacement, M indique la présence d'un monstre, T est le trésor
	public void generationPiece(tabPiece[][] Map){
		
		tab[1][1]="N,E";
		tab[1][2]="O,E";
		tab[1][3]="O,N,E,M";
		tab[1][4]="O,N,E";
		tab[1][5]="O,N,M";
		tab[2][1]="N,E,S";
		tab[2][2]="O,M";
		tab[2][3]="N,E,S";
		tab[2][4]="O,N,S,M";
		tab[2][5]="S,M";
		tab[3][1]="O,E,S";
		tab[3][2]="O,N,E,M";
		tab[3][3]="O,S,M";
		tab[3][4]="N,E,S";
		tab[3][5]="O,N,M";
		tab[4][1]="N,S,M";
		tab[4][2]="E,S";
		tab[4][3]="O,N,M";
		tab[4][4]="N,S,T";
		tab[4][5]="N,S,M";
		tab[5][1]="E,S";
		tab[5][2]="O,M";
		tab[5][3]="E,S";
		tab[5][4]="O,E,S,M";
		tab[5][5]="O,S,M";

	
	}	
		
}	