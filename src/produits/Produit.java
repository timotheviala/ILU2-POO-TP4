package produits;

public abstract class Produit implements IProduit {
	private String nom;
	private String unite;
	
	protected Produit(String nom, String unite) {
		super();
		this.nom = nom;
		this.unite = unite;
	}

	@Override
	public String getNom() {
		return nom;
	}
	
	protected abstract void decrireProduit();
}

