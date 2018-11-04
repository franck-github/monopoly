package monopoly;

public abstract class Case {
	private String nom;
	private Case suivante;
	
	public abstract void passer(Joueur joueur);
	public abstract void arreter(Joueur joueur);
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public Case getSuivante() {
		return suivante;
	}
	public void setSuivante(Case suivante) {
		this.suivante = suivante;
	}

}
