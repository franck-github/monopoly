package monopoly;

public class Neutre extends Case {

	@Override
	public void passer(Joueur joueur) {
		System.out.println(joueur.getNom()+" passe au dessus de la case "+this.getNom());
	}

	@Override
	public void arreter(Joueur joueur) {
		System.out.println(joueur.getNom()+" s'arrête sur la case "+this.getNom());
	}

}
