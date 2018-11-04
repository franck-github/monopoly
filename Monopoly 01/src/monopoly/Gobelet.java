package monopoly;

public class Gobelet {
	private De des[] = {new De(),new De()};

	public int getValeur() {
		return des[0].getValeur() + des[1].getValeur();
	}
	
	public int lancer() {
		return des[0].lancer() + des[1].lancer();
	}

}
