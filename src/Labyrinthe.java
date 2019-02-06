
import java.awt.Point;
import java.util.Arrays;

public class Labyrinthe {
	
	//colonnes et lignes du labyrinthe 
	public int lignes=5;
	public int colonnes=5;
	
	//tableau des cases du labyrinthe 
	String tabPiece[][];
	
	//position initiale 
	private Point init = new Point(1,1);
	
	
	
	//creation des pieces du labyrinthe O,N,E,S représentent les possibilités de déplacement, M indique la présence d'un monstre, T est le trésor
	public void generationPiece(String tabPiece[][]){
		
		tabPiece[1][1]="N,E";
		tabPiece[1][2]="O,E";
		tabPiece[1][3]="O,N,E,M";
		tabPiece[1][4]="O,N,E";
		tabPiece[1][5]="O,N,M";
		tabPiece[2][1]="N,E,S";
		tabPiece[2][2]="O,M";
		tabPiece[2][3]="N,E,S";
		tabPiece[2][4]="O,N,S,M";
		tabPiece[2][5]="S,M";
		tabPiece[3][1]="O,E,S";
		tabPiece[3][2]="O,N,E,M";
		tabPiece[3][3]="O,S,M";
		tabPiece[3][4]="N,E,S";
		tabPiece[3][5]="O,N,M";
		tabPiece[4][1]="N,S,M";
		tabPiece[4][2]="E,S";
		tabPiece[4][3]="O,N,M";
		tabPiece[4][4]="N,S,T";
		tabPiece[4][5]="N,S,M";
		tabPiece[5][1]="E,S";
		tabPiece[5][2]="O,M";
		tabPiece[5][3]="E,S";
		tabPiece[5][4]="O,E,S,M";
		tabPiece[5][5]="O,S,M";

	
	}	
	
}
		
