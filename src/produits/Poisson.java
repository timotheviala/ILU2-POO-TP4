package produits;

import produits.Produit;

public class Poisson extends Produit {
	private String datePeche;
	private String nom="poisson";
	
	public Poisson(String datePeche) {
		super("poisson","piece");
		this.datePeche = datePeche;
	}
	
	@Override
	public String decrireProduit() {
		return nom+" p�ch� "+datePeche;
	}
	
	@Override
	public int calculerPrix(int prix) {
		return prix;
	}
}

