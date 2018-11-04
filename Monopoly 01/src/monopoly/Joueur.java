package monopoly;

public class Joueur {
	private String nom;
	private int solde;
	private Pion pion;
	
	public void crediter(int somme) {
		solde += somme;
	}
	
	public void debiter(int somme) {
		solde -= somme;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getSolde() {
		return solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}

	public Pion getPion() {
		return pion;
	}

	public void setPion(Pion pion) {
		this.pion = pion;
	}

	@Override
	public String toString() {
		return "Joueur [nom=" + nom + ", solde=" + solde + "]";
	}

}
