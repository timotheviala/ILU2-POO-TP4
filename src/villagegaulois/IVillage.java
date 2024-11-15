package villagegaulois;

import personnages.Gaulois;
import produits.Produit;

public interface IVillage {
	public <P extends Produit> boolean installerVendeur(IEtal<P> etal, Gaulois vendeur, P[] produit, int prix);

	public void acheterProduit(String produit, int quantiteSouhaitee);
	
	public void afficherVillage();
}
