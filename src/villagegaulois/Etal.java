package villagegaulois;

import personnages.Gaulois;
import produits.Produit;

public class Etal <P extends Produit> {
	private Gaulois vendeur;
	private P[] produits;
	private int nbProduit;
	private int prix;


	public Gaulois getVendeur() {
		return vendeur;
	}

	public void installerVendeur(Gaulois vendeur,P[] produit,int prix) {
		this.vendeur=vendeur;
		this.prix=prix;
		this.nbProduit=produit.length;
		this.produits=produit;
	}
	
	public void occuperEtal(Gaulois vendeur, String produit, int quantite) {
		this.vendeur = vendeur;
		this.produit = produit;
		this.quantite = quantite;
		quantiteDebutMarche = quantite;
		etalOccupe = true;
	}

	@Override
	public int contientProduit(String produit,int quantiteSouhaitee) {
		int quantiteAVendre=0;
		if(nbProduit!=0 && this.produits[0].getNom().equals(produit)) {
			
			//arrêtez ici
			
		}
	}

	public int acheterProduit(int quantiteAcheter) {
		if (quantite == 0) {
			quantiteAcheter = 0;
		}
		if (quantiteAcheter > quantite) {
			quantiteAcheter = quantite;
		}
		if (etalOccupe) {
			quantite -= quantiteAcheter;
		}
		return quantiteAcheter;
	}

	public void libererEtal() {
		etalOccupe = false;
	}

	/**
	 * 
	 * @return donneesVente est un tableau de chaine contenant [0] : un boolean
	 *         indiquant si l'étal est occupé [1] : nom du vendeur [2] : produit
	 *         vendu [2] : quantité de produit à vendre au début du marché [4] :
	 *         quantité de produit vendu
	 */
	public String[] etatEtal() {
		String[] donneesVente = new String[5];
		donneesVente[0] = String.valueOf(etalOccupe);
		if (etalOccupe) {
			donneesVente[1] = vendeur.getNom();
			donneesVente[2] = produit;
			donneesVente[3] = String.valueOf(quantiteDebutMarche);
			donneesVente[4] = String.valueOf(quantiteDebutMarche - quantite);
		}
		return donneesVente;
	}
}
