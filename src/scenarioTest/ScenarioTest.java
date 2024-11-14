package scenarioTest;

import personnages.Gaulois;
import produits.Poisson;
import produits.Sanglier;
import villagegaulois.Etal;

public class ScenarioTest {

	public static void main(String[] args) {
		
		Gaulois ordralphabetix=new Gaulois("Ordralphab�tix",9);
		Gaulois obelix=new Gaulois("Ob�lix",20);
		Gaulois asterix=new Gaulois("Ast�rix", 6);
		
		Sanglier sanglier1=new Sanglier(2000,obelix);
		Sanglier sanglier2=new Sanglier(1500,obelix);
		Sanglier sanglier3=new Sanglier(1000,asterix);
		Sanglier sanglier4=new Sanglier(500,asterix);

		Sanglier[] sangliersObelix= {sanglier1,sanglier2};
		Sanglier[] sangliersAsterix= {sanglier3,sanglier4};
		
		Poisson poisson1=new Poisson("lundi");
		Poisson[] poissons= {poisson1};
		
		Etal[] marche=new Etal[3];
		Etal<Sanglier> etalSanglier1=new Etal<>();
		Etal<Sanglier> etalSanglier2=new Etal<>();
		Etal<Poisson> etalPoisson=new Etal<>();
		marche[0]=etalSanglier1;
		marche[1]=etalSanglier2;
		marche[3]=etalPoisson;
		
		etalSanglier1.installerVendeur(obelix, sangliersObelix, 8);
		etalSanglier2.installerVendeur(asterix, sangliersAsterix, 10);
		etalPoisson.installerVendeur(ordralphabetix, poissons, 7);
		
		
	}

}
