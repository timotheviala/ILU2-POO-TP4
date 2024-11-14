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
	protected void decrireProduit() {
		System.out.println(nom+" pêché "+datePeche);
	}
}

