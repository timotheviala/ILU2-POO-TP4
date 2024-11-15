package produits;

import personnages.Gaulois;

public class Sanglier extends Produit{
	private int poids;
	Gaulois chasseur;
	private String nom="sanglier";
	
	public Sanglier(int poids,Gaulois chasseur) {
		super("sanglier", "kg");
		this.chasseur=chasseur;
		this.poids = poids;
	}

	@Override
	public String decrireProduit() {
		return nom+" de "+poids+" kg chass� par "+chasseur.getNom();
	}
	
	@Override
	public int calculerPrix(int prix) {
		return prix;
	}
	
}