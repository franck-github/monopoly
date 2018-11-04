package monopoly;

public class Pion {
	private String nom;
	private Joueur joueur;
	private Case position;
	
	public Pion(String nom) {
		this.nom = nom;
	}
	
	public Pion(String nom, Joueur joueur) {
		this.nom = nom;
		this.joueur = joueur;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Joueur getJoueur() {
		return joueur;
	}
	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}


	public Case getPosition() {
		return position;
	}


	public void setPosition(Case position) {
		this.position = position;
	}

}
