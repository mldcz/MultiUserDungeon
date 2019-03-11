import src.Combattant;

public class Combat {
    private Combattant c1;
    private Combattant c2;

    public Combat(Combattant c1, Combattant c2) {
        this.c1 = c1;
        this.c2 = c2;

        //combat avec pv qui changent

        //si c1 ou c2 = monstre
        //alors combat
            //1 tour = -1 pv (aléatoirement entre le monstre et le joueur)
            //a chaque tour le joueur a le choix de continuer ou de fuir
            //combat finit si fuit ou pv d'un perso = 0
            //

        //le vainqueur gagne 1pv
        //tous les perso récupèrent leurs pv initiaux en plus de ceux gagnés

    }

}
