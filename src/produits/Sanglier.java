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
	protected void decrireProduit() {
		System.out.println(nom+" de "+poids+" kg chassé par "+chasseur.getNom());
	}
	
	
}